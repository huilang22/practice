import os, popen2, select
from LTEStatusData import *
import re, copy
from NewWCDMAStatusDataFetch import DataPreserve 

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
#        return ["4g MR_dummy"]
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
        data = LTEStatusData()
        rows = output.split('\n')
        rawData = []
	rows.pop()
        for row in rows:
            row = ',' + row #Add for the checkbox value
            rawData.append(row.split(','))
        data.setRawData(rawData)
       
        return data
