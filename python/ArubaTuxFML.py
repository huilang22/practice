#!/usr/bin/env python
# ArubaTuxFML.py -- Tuxedo/FML connection
# $Id: ArubaTuxFML.py,v 1.1 2002/12/09 17:30:00 wcox Exp $
#

import ArubaCallNameMap
from ArubaFML import *
from ArubaDatatype import datatype
from ArubaErrors import RemoteError
import types
import os
import sys
import string
import tuxedo
from array import array
from pprint import pprint
from CSGUtils import *

class ArubaTuxFML:
    def _state2FML (self):
        if self.AccountServer != None:
            self.fml.Fchg ("AccountServer", 0, self.AccountServer)
        else:
            self.fml.Fchg ("AccountServer", 0, -1)
        if self.CallCorrelation != None:
            self.fml.Fchg ("CallCorrelation", 0, self.CallCorrelation)
        if self.ExternalTransactionXref != None:
            self.fml.Fchg ("ExternalTransactionXref",
                           0,
                           self.ExternalTransactionXref)
        if self.ApplicationName != None:
            self.fml.Fchg ("ApplicationName", 0, self.ApplicationName)
        if self.OperatorName != None:
            self.fml.Fchg ("OperatorName", 0, self.OperatorName)
        if self.ExecutionTrace != None:
            """ Correct ExecutionTrace flag (could be boolean) """
            if type (self.ExecutionTrace) == types.InstanceType:
                v = self.ExecutionTrace.value
                if string.upper (v[0]) == 'T':
                    self.ExecutionTrace = 1
                else:
                    self.ExecutionTrace = 0
            self.fml.Fchg ("ExecutionTrace", 0, self.ExecutionTrace)
        else:
            try:
                self.fml.Fdel ("ExecutionTrace", 0)
            except tuxedo.FmlError, error:
                pass

        if self.DebugFlag != None:
            """ Correct Debug flag (could be boolean) """
            if type (self.DebugFlag) == types.InstanceType:
                v = self.DebugFlag.value
                if string.upper (v[0]) == 'T':
                    self.DebugFlag = 1
                else:
                    self.DebugFlag = 0
            self.fml.Fchg ("DebugFlag", 0, self.DebugFlag)
        else:
            try:
                self.fml.Fdel ("DebugFlag", 0)
            except tuxedo.FmlError, error:
                pass

        if self.BlockSize != None:
            self.fml.Fchg ("BlockSize", 0, self.BlockSize)
        if self.MaxCount != None:
            self.fml.Fchg ("MaxCount", 0, self.MaxCount)
        if self.LogLevel != None:
            self.fml.Fchg ("LogLevel", 0, self.LogLevel)
    
    def _FML2state (self):
        try:
            self.AccountServer = self.fml.Fget ("AccountServer", 0)
        except tuxedo.FmlError, error:
            pass
        try:
            self.CallCorrelation = self.fml.Fget ("CallCorrelation", 0)
            self.fml.Fdel ("CallCorrelation", 0)
        except tuxedo.FmlError, error:
            pass
        try:
            self.TraceResults = self.fml.Fget ("TraceResults", 0)
            self.fml.Fdel ("TraceResults", 0)
            if type (self.TraceResults) == ArrayType:
                self.TraceResults = self.TraceResults.tostring ()
            self.TraceResults = loads (self.TraceResults)
        except tuxedo.FmlError, error:
            pass

    def __init__ (self, options = None):
        self.debug = 0
        self.ExecutionTrace = None
        self.DebugFlag = None
        self.TraceResults = None
        self.dtd = None
        self.AccountServer = None
        self.ApplicationName = sys.argv[0]
        try:
            self.OperatorName = os.getlogin ()
        except:
            self.OperatorName = None
        self.CallCorrelation = None
        self.ExternalTransactionXref = None
        self.BlockSize = None
        self.MaxCount = None
        self.LogLevel = None
        self.tpinit = { 'passwd'  : 'guest',
                        'usrname' : 'arborsv',
                        'data'    : 'WTNOMWJtUTJXRTFVZFdSUE5nPT0=',
                        'cltname' : '',
                      }
        self.fml = tuxedo.Fml32 ()
        if os.environ.has_key ('K_LOG_DIR'):
            self.logfilename = os.environ['K_LOG_DIR'] \
                               + '/arubafml.dbg'
        else:
            self.logfilename = 'arubafml.dbg'
        if options != None:
            if type (options) == types.InstanceType:
                options = options.__dict__

            for key in options.keys ():
                print "Setting:", key, "to", options[key]
                if key == 'SystemPassword':
                    self.tpinit['passwd'] = options[key]
                    continue
                if key == 'TrustedUser':
                    self.tpinit['usrname'] = options[key]
                    continue
                if key == 'TrustedPassword':
                    self.tpinit['data'] = options[key]
                    continue
                if key == 'ClientName':
                    self.tpinit['cltname'] = options[key]
                    continue
                setattr (self, key, options[key])
        
        try:
           tuxedo.tpinit (self.tpinit)
        except:
           self.tpinit ['data'] = 'WTNOblZHVXZMelZvT1hoeFp3PT0='
           tuxedo.tpinit (self.tpinit)

    def call (self, method, args):
        self.t_meth = method
        self.t_start = os.times ()[4]
        self.s_start = os.times ()[4]
        input = dumps (args)
        self.s_end = os.times ()[4]
        self.f_start = os.times ()[4]
        self._state2FML ()
        self.TraceResults = None
        self.fml.Fchg ("sw_CallData", 0, array ('B', input))
        self.f_end = os.times ()[4]
        if self.debug & 0x01:
            self._log_message_and_fml ("%s, %s REQUEST FML:", method,ArubaCallNameMap.getCallName (method) )
        try:
            remoteE = 0
            self.c_start = os.times ()[4]
            self.fml = tuxedo.tpcall (ArubaCallNameMap.getCallName (method),
                                      self.fml)
            self.c_end = os.times ()[4]
            if self.debug & 0x01:
                self._log_message_and_fml ("%s RESULT FML:", method)
        except tuxedo.TuxApplicationError, error:
            self.c_end = os.times ()[4]
            self.fml = error[0]['data']
            self._log_message_and_fml ("%s EXCEPTION FML:", method)
        try:
            reply = self.fml.Fget ("sw_CallException", 0)
            self.fml.Fdel ("sw_CallException", 0)
            remoteE = 1
        except tuxedo.FmlError, error:
            reply = self.fml.Fget ("sw_CallData", 0)
        self.p_start = os.times ()[4]
        if type (reply) == ArrayType:
            reply = reply.tostring ()
        d = loads (reply)
        self.p_end = os.times ()[4]
        self._FML2state ()
        if self.debug & 0x02:
            self._log_message ("Parsed result of : %s is:\n%s",
                               method,
                               str (d))
        self.t_end = os.times ()[4]
        if remoteE == 1:
            raise RemoteError ({ 'RemoteException' : d })
        return d

    def _log_message (self, format, *args):
        if self.debug != 0:
            logFile = open (self.logfilename, "a")
            logFile.write (format % args)
            logFile.write ("\n")
            logFile.close ()

    def _log_message_and_fml (self, format, *args):
        if self.debug != 0:
            logFile = open (self.logfilename, "a")
            logFile.write (format % args)
            logFile.write ("\n")
            self.fml.Ffprint (logFile)
            logFile.write ("\n")
            logFile.close ()

    def tpbegin (self, timeout = 0, flags = 0):
        tuxedo.tpbegin (timeout, flags)

    def tpcommit (self, flags = 0):
        tuxedo.tpcommit (flags)
        
    def tpabort (self, flags = 0):
        tuxedo.tpabort (flags)

    def perf (self):
        req_serialize = self.s_end - self.s_start
        req_fml = self.f_end - self.f_start
        req_call = self.c_end - self.c_start
        resp_deserialize = self.p_end - self.p_start
        total = self.t_end - self.t_start
        return (req_serialize, req_fml, req_call, resp_deserialize, total)

    def pperf (self):
        t = self.perf ()
        print ("  Serialize: %f\n" + \
               "        FML: %f\n" + \
               "       Call: %f\n" + \
               "Deserialize: %f\n" + \
               "      Total: %f\n") % t

    def fperf (self, file):
        t = self.perf ()
        ts = "%f,%f,%f,%f,%f\n" % t
        file.write ("%s:%s" % (self.t_meth, ts))

    def __getattr__ (self, attr):
        forwarder = Method (self, attr)
        self.__dict__[attr] = forwarder
        return forwarder
    
class Method:
    """Represents a method on the remote object.

    Overloads the function call method to look like a function."""

    def __init__ (self, connection, method):
        """
        connection  the connection instance the
                    method will use
        method      the method to call on the remote object"""

        self._connection_ = connection
        self._method_ = method

    def __call__ (self, args):
        """This method enables calling instances as if they were
        functions. It will perform a remote procedure call on the
        server object the agent is connected to."""

        result = self._connection_.call (self._method_, args)

        return result

#------------------------Emacs setup for Python mode--------------------------
# Local Variables:
# mode: Python
# End:
