import os, popen2, select
from LTEStatusData import *
import re

##def makeNonBlocking(fd): 
##    fl = fcntl.fcntl(fd, FCNTL.F_GETFL) 
##    try: 
##        fcntl.fcntl(fd, FCNTL.F_SETFL, fl | FCNTL.O_NDELAY) 
##    except AttributeError: 
##        fcntl.fcntl(fd, FCNTL.F_SETFL, fl | FCNTL.FNDELAY) 

class LTEStatusDataFetch:
    # according to : http://code.activestate.com/recipes/52296/
    def getCommandOutput(self, command):
        child = popen2.Popen3(command, 1) # capture stdout and stderr from command
        child.tochild.close()             # don't need to talk to child
        outfile = child.fromchild 
        outfd = outfile.fileno()
        errfile = child.childerr
        errfd = errfile.fileno()
        #makeNonBlocking(outfd)            # don't deadlock!
        #makeNonBlocking(errfd)
        outdata = errdata = ''
        outeof = erreof = 0
        while 1:
            ready = select.select([outfd,errfd],[],[]) # wait for input
            if outfd in ready[0]:
                outchunk = outfile.read()
                if outchunk == '': outeof = 1
                outdata = outdata + outchunk
            if errfd in ready[0]:
                errchunk = errfile.read()
                if errchunk == '': erreof = 1
                errdata = errdata + errchunk
            if outeof and erreof: break
            select.select([],[],[],.1) # give a little time for buffers to fill
        err = child.wait()
        if err != 0: 
            return "ErRor" + errdata
        return outdata

    # for launch AlarmMonitor, not wait cmd executing
    def runCMD(self, command):
        child = popen2.Popen3(command, 1) # capture stdout and stderr from command
        child.tochild.close()             # don't need to talk to child

    def launchAlarmMonitor(self, gid):
        cmd = "LTEStatusDataFetch.pl -t launchAM " + " " + gid
        #print cmd;
        self.runCMD(cmd)
        return "Success"
        
    def getMrname(self, lnbts_gid_arr):
        cmd = "LTEStatusDataFetch.pl -t mrname " + " ".join(lnbts_gid_arr)
        output = self.getCommandOutput(cmd)
        # if the command execute failed?
        p = re.compile('^ErRor')
        m = p.match(output)
        if m:
            #print 'match:', m.group()
            return output;
        
        #print outputa
        mr_arr = output.split(',')
        if ( (len(mr_arr) > 0) and len(mr_arr[len(mr_arr)-1])==0):
            mr_arr.pop()  # remove the last one
        return mr_arr
        

    """
    """
    def getTopyInfo(self, type, lnbts_gid_arr):
        cmd = "LTEStatusDataFetch.pl -t " + type + " " + " ".join(lnbts_gid_arr)
        #print cmd
        output = self.getCommandOutput(cmd)
        # if the command execute failed?
        p = re.compile('^ErRor')
        m = p.match(output)
        if m:
            #print 'match:', m.group()
            return output;
        #print output
        return self.parseOutput(output)

    def parseOutput(self, output):
        # 
        # format gid,dn,name,ver,operational_state,admini_state,conn_state,alarm_count_critial,alarm_count_maijor,ip_addr
        lines = output.split('\n')
        #print lines
        data = LTEStatusData();
        for one_line in lines:
            items = one_line.split(',');
            #print items
            if( 15 == len(items) ):
                # the last element is empty
                node = data.createNode(items[0])
                node.set_property("OCID", items[12]);  # this must set BEFORE setDN, so that we can use optimized setDN
                                                       # (in LTEStatusData.py)
                node.setDN(items[1])
                node.setName(items[2])
                node.setVersion(items[3])
                node.setOperational(items[4])
                node.setAdministrative(items[5])
                node.setConnection(items[6])
                if (len(items[7])>0) and (int(items[7]) > 0) :
                    node.appendAlarm(1,items[7])
                if (len(items[8])>0) and (int(items[8]) > 0) :
                    node.appendAlarm(2,items[8])
                if (len(items[9])>0) and (int(items[9]) > 0) :
                    node.appendAlarm(3,items[9])
                node.setIP(items[10])
                node.set_property("COSTATE", items[11]); 
                node.set_property("SYSTEM_ID", items[13]);
#                print "DEBUG:"+node.get_property("SYSTEM_ID")
                data.addNode(node)
        return data


if __name__ == "__main__":
##    tt = LTEStatusDataFetch();
##    tt.launchAlarmMonitor('511985000000004017');
##    tt.launchAlarmMonitor('511985000000004019');
##
    tt = LTEStatusDataFetch();
    data = tt.getTopyInfo('lnbts', ['511345000000000891']);
    content = data.getTableContent();
    for row in content:
        print(row);
##    tt = LTEStatusDataFetch();
##    data = tt.getTopyInfo('mr', ['511345000000004942','511345000000005001']);
##    content = data.getTableContent();
##    for row in content:
##        print(row);

##    tt = LTEStatusDataFetch();
##    data = tt.getMrname(['511345000000004942','511345000000005001']);
##    for name in data:
##        print "one mr:" + name
