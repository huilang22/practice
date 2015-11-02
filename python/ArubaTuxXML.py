""" -*- python -*-
    $Id: ArubaTuxXML.py,v 1.1 2002/12/09 17:30:02 wcox Exp $

"""

import ArubaXML
import ArubaCONNECT
from ArubaDatatype import datatype
from ArubaErrors import ArubaConnectionError, RemoteError
import types
import os
import sys
import tuxedo
from array import array
from pprint import pprint
from CSGUtils import *

class ArubaTuxXML:
    def _formatOutgoing(self, method, args):
        d = { 'Request' : { '#ORDER' : [ 'Header',
                                         method ],  
                            'Header' : { '#ORDER' : [ 'AccountServer',
                                                      'ApplicationName',
                                                      'OperatorName',
                                                      'CallCorrelation',
                                                      'ExternalTransactionXref',
                                                      'ExecutionTrace',
                                                      'DebugFlag',
                                                      'BlockSize',
                                                      'MaxCount',
                                                      'LogLevel',
                                                    ],
                                       },
                            method : args,
                          },
            }
        if self.AccountServer != None:
            d['Request']['Header']['AccountServer'] = self.AccountServer
        else:
            d['Request']['Header']['AccountServer'] = -1
        if self.CallCorrelation != None:
            d['Request']['Header']['CallCorrelation'] = self.CallCorrelation
        if self.ExternalTransactionXref != None:
            d['Request']['Header']['ExternalTransactionXref'] \
             = self.ExternalTransactionXref
        if self.ApplicationName != None:
            d['Request']['Header']['ApplicationName'] = self.ApplicationName
        if self.OperatorName != None:
            d['Request']['Header']['OperatorName'] = self.OperatorName
        if self.ExecutionTrace != None:
            d['Request']['Header']['ExecutionTrace'] = self.ExecutionTrace
        if self.DebugFlag != None:
            d['Request']['Header']['DebugFlag'] = self.DebugFlag
        if self.BlockSize != None:
            d['Request']['Header']['BlockSize'] = self.BlockSize
        if self.MaxCount != None:
            d['Request']['Header']['MaxCount'] = self.MaxCount
        if self.LogLevel != None:
            d['Request']['Header']['LogLevel'] = self.LogLevel
        return d
    
    def _parseIncoming (self, d):
        if (not d.has_key ('Request')):
            pprint (d)
            raise ArubaConnectionError, "XML result missing 'Request' element"
        self.CallCorrelation = None
        self.AccountServer = None
        body = d['Request']
        if body.has_key ('Header'):
            if type (body['Header']) == types.DictionaryType:
                header = body['Header']
            else:
                header = {}
            del body['Header']
        else:
            header = {}
        if header.has_key ('AccountServer'):
            self.AccountServer = header['AccountServer']
        if header.has_key ('CallCorrelation'):
            self.CallCorrelation = header['CallCorrelation']
        if header.has_key ('TraceResults'):
            self.TraceResults = header['TraceResults']
        bodykeys = body.keys ()
        if len(bodykeys) != 1:
            raise ArubaConnectionError, "XML result does not have 1 response"
        bodykey = bodykeys[0]
        if bodykey == 'Exception':
            raise RemoteError ({ 'RemoteException' : body[bodykey] })
        return body[bodykey]

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
                        'data'    : 'WTNOblZHVXZMelZvT1hoeFp3PT0=',
                      }
        
        if options != None:
            if type (options) == types.InstanceType:
                options = options.__dict__

            for key in options.keys ():
                setattr (self, key, options[key])
                if key == 'SystemPassword':
                    self.tpinit['passwd'] = options[key]
                    continue
                if key == 'TrustedUser':
                    self.tpinit['usrname'] = options[key]
                    continue
                if key == 'TrustedPassword':
                    self.tpinit['data'] = options[key]
                    continue
        if os.environ.has_key ('ARUBA_DTD'):
            f = open (os.environ['ARUBA_DTD'], 'r')
            self.dtd = f.read ()
        if os.environ.has_key ('ARUBA_LOG_LEVEL'):
            self.debug = int (os.environ['ARUBA_LOG_LEVEL'])
        tuxedo.tpinit (self.tpinit)
                
    def call (self, method, args):
        self.t_meth = method
        self.t_start = os.times ()[4]
        self.f_start = os.times ()[4]
        msg = self._formatOutgoing (method, args)
        dtd = self.dtd
        self.TraceResults = None
        service = 'ArubaXml'
        self.f_end = os.times ()[4]
        self.s_start = os.times ()[4]
        input = ArubaXML.dumps (msg)
        self.s_end = os.times ()[4]
        try:
            if self.debug & 0x01:
                self._log_message ("Call: %s with:\n%s", service, str (input))
            self.c_start = os.times ()[4]
            replyStr = tuxedo.tpcall (service, input)
            self.c_end = os.times ()[4]
            if self.debug & 0x01:
                self._log_message ("Result of: %s is:\n%s",
                                   service,
                                   str (replyStr))
        except tuxedo.TuxApplicationError, error:
            self.c_end = os.times ()[4]
            replyStr = error[0]['data']
            self._log_message ("%s EXCEPTION:\n%s",
                               service,
                               str (replyStr))
        self.d_start = os.times ()[4]
        d = ArubaXML.loads (replyStr, dtd)
        self.d_end = os.times ()[4]
        if self.debug & 0x02:
            self._log_message ("Parsed result of : %s is:\n%s", service,
                               str (d))
        self.p_start = os.times ()[4]
        d = self._parseIncoming (d)
        self.p_end = os.times ()[4]
        self.t_end = os.times ()[4]
        return d

    def _log_message (self, format, *args):
        logFile = open ("arubaxml.dbg", "a")
        logFile.write (format % args)
        logFile.write ("\n")
        logFile.close ()

    def tpbegin (self, timeout = 0, flags = 0):
        tuxedo.tpbegin (timeout, flags)

    def tpcommit (self, flags = 0):
        tuxedo.tpcommit (flags)
        
    def perf (self):
        req_fmt = self.f_end - self.f_start
        req_serialize = self.s_end - self.s_start
        req_call = self.c_end - self.c_start
        resp_deserialize = self.d_end - self.d_start
        total = self.t_end - self.t_start
        return (req_fmt,
                req_serialize,
                req_call,
                resp_deserialize,
                total)

    def pperf (self):
        t = self.perf ()
        print ("     Format: %f\n" + \
               "  Serialize: %f\n" + \
               "       Call: %f\n" + \
               "Deserialize: %f\n" + \
               "      Total: %f\n") % t

    def fperf (self, file):
        t = self.perf ()
        ts = "%f,%f,%f,%f,%f\n" % t
        file.write ("%s:%s" % (self.t_meth, ts))

    def __getattr__ (self, attr):
        forwarder = ArubaCONNECT.Method (self, attr)
        self.__dict__[attr] = forwarder
        return forwarder
