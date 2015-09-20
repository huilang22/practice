
import DBOperations
from PmDataInsertionWithMfList import *
from variables_PmDataInsertionWithMf import *
import time
import sqlalchemy 
import traceback
import SSHLibrary
import xml.dom.minidom
from Sapro import *
from robot.utils.asserts import *
import sys


class PmDataInsertionWithMf:
    ROBOT_LIBRARY_SCOPE = 'TEST SUITE'

        
    def setUp(self, OES_HOST, OES_USERNAME, OES_PASSWORD):
        self._oesHost = str(OES_HOST)
        self._oesUser = str(OES_USERNAME)
        self._oesPasswd = str(OES_PASSWORD)
        self.dbUser = DB_USER_NAME
        self.dbPasswd = DB_PASS_WORD               

        print self._oesHost

        self.libOperation = SSHLibrary.SSHLibrary()     
        self.libOperation.open_connection(self._oesHost)
        self.libOperation.login(self._oesUser, self._oesPasswd)
 
        self.oesDBOperation = DBOperations.DBOperations(self._oesHost,self.dbUser,self.dbPasswd)       
        #create object
        self.libOperation.put_file(localOcosFileCreate, libOcosFilePath)
        print "*INFO* create object by OCos file"

        if (self.libOperation.execute_command(r'test -d /home/omc/tempForOmes && echo $?') != str(0)) and (self.libOperation.execute_command(r'test -d /home/omc/tempForScript && echo $?') != str(0)):
            if self.libOperation.execute_command(r'cd /home/omc && mkdir tempForOmes tempForScript') != '':
                fail("creating temp dir failed")
        else:
            fail("tempForOmes or tempForScript dir is already exist, cannot be created again")
        #put script to Lab and run it
        self.libOperation.put_file(localPath + scriptName, "/home/omc/tempForScript/", "0777")
        self.libOperation.start_command(r'cd /home/omc/tempForScript && ./' + scriptName)
        #get script result from ps command for tearDown
        self._results = self.libOperation.execute_command(r'ps -ef | grep -i ' + scriptName)
        print "*INFO* started script"
        
        self.sapro = Sapro()
        self.sapro.open_ssh_connection()
        self.sapro.start_map(saproMap)
        print "*INFO* start TA case seccfully"
                    
    def tearDown(self):
        
        # delete content in DB created by OMeS file which can't be deleted automatically when destroying object
#        print "delete content in DB created by OMeS file.................................."
#        sqlCom = "DELETE FROM " + self._tablename + " WHERE network_element_co_gid=" + str(self.g_id)
############delete object by ocos!!!!!!!!!!!!!!!!!!!!!!!
        self.sapro.stop_map(saproMap)
        self.oesDBOperation.closeDBConnection()
        self.libOperation.close_connection()
        
    def testMfState(self):
        '''Check whether PM and TA mediations are started, if not, fail '''
        # check whether PM mediation is started
        if self.libOperation.execute_command(r'test -d ' + MfStatePath + PmAdaptation + ' && echo $?') == str(0):
            if self.libOperation.execute_command(r'cd ' + MfStatePath + PmAdaptation + ' && grep Started state.xml') != '':
                pass
            else:
                fail(PmAdaptation + " is not started")
        else:
            fail(PmAdaptation + " is not started")

        
    def convertStartTime(self, startTime):
        '''convert startTime to the right format in DB'''
        
#        dom = xml.dom.minidom.parse(file)
#        root = dom.documentElement
#        startTimeList = root.getElementsByTagName('PMSetup')
#        startTime = startTimeList[0].getAttribute('startTime')

        startTimeInDB = startTime[8:10] + r'/' + startTime[5:7] + r'/' + startTime[2:4] + ' ' + startTime[11:13] + ':' + startTime[14:16] + ':' + startTime[17:19] + '.000000'

        return startTimeInDB
    
    def getOmes(self):
        
        print "*DEBUG* wait to get Omes file"
        self._fileList = []
        n = 0
        tableNum = len(tableNameList)
        while len(self._fileList) != tableNum:
            time.sleep(60)
            self._fileList = self.libOperation.execute_command(r'cd /home/omc/tempForOmes && ls omes_mainHost_'+IP+'*').split()
            n += 1
            if n == 15:
                fail("can't get OMes files.................")
                
        needWait = False 
        i = 0          
        while needWait == False & i<tableNum:
            for j in range(tableNum):
                if self.libOperation.execute_command('cd /home/omc/tempForOmes && grep '+counterLists[j].keys()[0]+' *') != '':
                    i += 1
                else:
                    needWait = True
                    break
            if needWait == True:
                break
        if needWait == True:
            self.libOperation.execute_command('cd /home/omc/tempForOmes/ && rm -rf *')
            print "*INFO* wait to get the next time's Omes file"
            self._fileList = []
            n = 0
            while len(self._fileList) != tableNum:
                time.sleep(60)
                self._fileList = self.libOperation.execute_command(r'cd /home/omc/tempForOmes && ls omes_mainHost_' + IP + '_*').split()
                n += 1
                if n == 15:
                    fail("can't get OMes files")
#        for name in self._fileList:
#            self.libOperation.get_file('/home/omc/tempForOmes/'+name, localPath)
        print "*INFO* get all the Omes files related with each table in DB"
        
    def checkData(self):  
        
###########need to check whether the logic is right######################################
        flag == False
        num = len(self._fileList)
        for i in range(num):
            for j in range(num):
                flag = compOmesAndDbData(self._fileList[i], counterLists[j], tableNameList[j], DNLists[j])
                if flag == True:
                    trueCount += 1
                    break
            if trueCount == num:
                break
        if trueCount != num:
            fail("Omes and DB data are not the same")
            
    def compOmesAndDbData(self, fileName, counterListName, tableName, DNList):

        com1 = 'cd /home/omc/tempForOmes && grep -o -E "[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}\.[0-9]*\+[0-9]{2}:[0-9]{2}" ' + fileName + ' |head -n 1'
        timeInOmes = self.libOperation.execute_command(com1)
        
        print timeInOmes
        DbStartTime = self.convertStartTime(timeInOmes)
        print DbStartTime
        #com2 = "select co_gid from " + objectTableName + " where co_dn = "

        flag = True
        for DN in DNList:
            com2 = "select * from " + tableName + \
            " where network_element_co_gid  = (select co_gid from mof.mof_common_objects where co_dn = \'"+DN+"\')"+\
            " and start_Time = \'"+DbStartTime+"\'"   
            
            print com2
            result = self.oesDBOperation.doSQLStatement(com2).fetchone()
            print result
            for counterName in counterListName:
                #counterName = counter_value.keys()[0]
                if str(result[counterName]) != counterListName[counterName]:
                    print "*FAIL* counter: " + counterName + " with "+DN+ " is not right"
                    flag = False 
        return flag
        
    #For local python run
if __name__ == "__main__": 
        test = PmDataInsertionWithMf()
        try:
            test.setUp(OES_HOST, OES_USERNAME, OES_PASSWORD)

            
            test.compOmesAndDbData('omes_mainHost_10.8.172.214_e2e.xml', counterList1, 'adcc76_pmb.physicalport',DNList1)
        finally:
            test.tearDown()             
            
                     
#            print com2 + "'"+DN+"'"
#            gid = str(self.oesDBOperation.doSQLStatement(com2 + "'"+DN+"'").fetchone()[0])
#            print gid
#            gidList.append(gid)
#            
#        com3 = "select count(*) from " + tableName + " where start_time = " + DbStartTime
#        com4 = "select * from " + tableName + " where start_time = " + DbStartTime
#        recordNum = self.oesDBOperation.doSQLStatement(com3)
#        flag = True
#        if recordNum == len(DNList):
#            result = self.oesDBOperation.doSQLStatement(com4)
#            for row in result:
#                if gidList.count(row[co_gid]) == 1:
#                    for counter_value in counterListName:
#                        counterName = counter_value.keys()[0]
#                        if str(row[counterName]) != counter_value[counterName]:
#                            print "*FAIL* counter: " + counterName + " is not right"
#                            flag = False
#                else:
#                    flag = False
#            return flag
#        else:
#            return False


#    def startSapro(self):       
#        # start sapro
#        self.libOperation.switch_connection(self._saproConneID)
#        self.libOperation.login("root", "install")
#        
#        ########################need to check whether started sapro!!!!!!!!!!!!!!!!
#        self.libOperation.execute_command('/opt/sapro/bin/sapcnsl -p 2100 -m /opt/sapro/map/' + saproMapName + ' -c start 2>&1')
#        print "*INFO* Sapro started"
#        
#    def stopSapro(self):
#        ########################need to check whether stopped sapro!!!!!!!!!!!!!!!!
#        self.libOperation.switch_connection(self._saproConneID)
#        self.libOperation.execute_command('/opt/sapro/bin/sapcnsl -p 2100 -m /opt/sapro/map/' + saproMapName + ' -c stop 2>&1')
#        print "*INFO* Sapro stopped"            
       
        
        
        