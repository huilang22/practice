#!/usr/bin/env python
# ArubaTuxAdmin.py -- Tuxedo/FML connection
# $Id: ArubaTuxAdmin.py,v 1.1 2002/12/09 17:30:00 wcox Exp $
#

import ArubaCallNameMap
from ArubaFML import *
from ArubaTuxFML import *
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

class ArubaTuxAdminException (Exception):
    """Error occurring when call Tuxedo TMIB."""
    pass

class ArubaTuxAdmin (ArubaTuxFML):
    def pollservice (self, servicename):
        shortname = ArubaCallNameMap.getCallName (servicename)
        self.fml = tuxedo.Fml32 ()
        self.fml.Fchg ("TA_OPERATION", 0, "GET")
        self.fml.Fchg ("TA_CLASS", 0, "T_SVCGRP")
        self.fml.Fchg ("TA_SERVICENAME", 0, shortname)
        self._log_message_and_fml ("BEFORE POLL-SERVICE:")
        self.fml = tuxedo.tpcall (".TMIB", self.fml)
        self._log_message_and_fml ("AFTER POLL-SERVICE:")
        self.servergroup = []
        self.rqaddr = []
        self.serverid = []
        self.occur = self.fml.Fget ("TA_OCCURS", 0)
        if self.occur <= 0:
            raise ArubaTuxAdminException, "Class : " + self.__class__.__name__ + " : Service " + servicename + " not found!!"
        for i in range(0,self.occur):
            self.servergroup.append (self.fml.Fget("TA_SRVGRP", i))
            self.rqaddr.append (self.fml.Fget("TA_RQADDR", i))
            self.serverid.append (self.fml.Fget("TA_SRVID", i))

    def pollwsl (self):
        self.fml = tuxedo.Fml32 ()
        self.fml.Fchg ("TA_OPERATION", 0, "GET")
        self.fml.Fchg ("TA_CLASS", 0, "T_WSL")
        self._log_message_and_fml ("BEFORE POLL-SERVICE:")
        self.fml = tuxedo.tpcall (".TMIB", self.fml)
        self._log_message_and_fml ("AFTER POLL-SERVICE:")
        self.fml.Ffprint (sys.stdout)
    
    def displayservice (self, servicename):
        self.pollservice (servicename)
        self.fml.Ffprint (sys.stdout)
        
    def suspendservice (self, servicename):
        self.pollservice (servicename)
        shortname = ArubaCallNameMap.getCallName (servicename)
        for i in range(0,self.occur):
            self.fml = tuxedo.Fml32 ()
            self.fml.Fchg ("TA_OPERATION", 0, "SET")
            self.fml.Fchg ("TA_CLASS", 0, "T_SVCGRP")
            self.fml.Fchg ("TA_SERVICENAME", 0, shortname)
            self.fml.Fchg ("TA_SRVGRP", 0, self.servergroup[i])
            self.fml.Fchg ("TA_RQADDR", 0, self.rqaddr[i])
            self.fml.Fchg ("TA_SRVID", 0, self.serverid[i])
            self.fml.Fchg ("TA_STATE", 0, "SUS")
            self._log_message_and_fml ("BEFORE SUSPEND-SERVICE,%d:",i)
            self.fml = tuxedo.tpcall (".TMIB", self.fml)
            self._log_message_and_fml ("AFTER SUSPEND-SERVICE,%d:",i)
        
    def removeservice (self, servicename):
        self.pollservice (servicename)
        shortname = ArubaCallNameMap.getCallName (servicename)
        for i in range(0,self.occur):
            self.fml = tuxedo.Fml32 ()
            self.fml.Fchg ("TA_OPERATION", 0, "SET")
            self.fml.Fchg ("TA_CLASS", 0, "T_SVCGRP")
            self.fml.Fchg ("TA_SERVICENAME", 0, shortname)
            self.fml.Fchg ("TA_SRVGRP", 0, self.servergroup[i])
            self.fml.Fchg ("TA_RQADDR", 0, self.rqaddr[i])
            self.fml.Fchg ("TA_SRVID", 0, self.serverid[i])
            self.fml.Fchg ("TA_STATE", 0, "INA")
            self._log_message_and_fml ("BEFORE REMOVE-SERVICE,%d:",i)
            self.fml = tuxedo.tpcall (".TMIB", self.fml)
            self._log_message_and_fml ("AFTER REMOVE-SERVICE,%d:",i)
    
    def resumeservice (self, servicename):
        self.pollservice (servicename)
        shortname = ArubaCallNameMap.getCallName (servicename)
        for i in range(0,self.occur):
            self.fml = tuxedo.Fml32 ()
            self.fml.Fchg ("TA_OPERATION", 0, "SET")
            self.fml.Fchg ("TA_CLASS", 0, "T_SVCGRP")
            self.fml.Fchg ("TA_SERVICENAME", 0, shortname)
            self.fml.Fchg ("TA_SRVGRP", 0, self.servergroup[i])
            self.fml.Fchg ("TA_RQADDR", 0, self.rqaddr[i])
            self.fml.Fchg ("TA_SRVID", 0, self.serverid[i])
            self.fml.Fchg ("TA_STATE", 0, "ACT")
            self._log_message_and_fml ("BEFORE ACTIVATE-SERVICE,%d:",i)
            self.fml = tuxedo.tpcall (".TMIB", self.fml)
            self._log_message_and_fml ("AFTER ACTIVATE-SERVICE,%d:",i)

    def pollserver (self, servername):
        self.fml = tuxedo.Fml32 ()
        self.fml.Fchg ("TA_OPERATION", 0, "GET")
        self.fml.Fchg ("TA_CLASS", 0, "T_SERVER")
        self.fml.Fchg ("TA_SERVERNAME", 0, servername)
        self._log_message_and_fml ("BEFORE POLL-SERVER:")
        self.fml = tuxedo.tpcall (".TMIB", self.fml)
        self._log_message_and_fml ("AFTER POLL-SERVER:")
        self.servergroup = []
        self.serverid = []
        self.occur = self.fml.Fget ("TA_OCCURS", 0)
        if self.occur <= 0:
            raise ArubaTuxAdminException, "Class : " + self.__class__.__name__ + " : Server " + servername + " not found!!"
        for i in range(0,self.occur):
            self.servergroup.append (self.fml.Fget("TA_SRVGRP", i))
            self.serverid.append (self.fml.Fget("TA_SRVID", i))

    def displayserver (self, servername):
        self.pollserver (servername)
        self.fml.Ffprint (sys.stdout)
        
    def stopserver (self, servername):
        self.pollserver (servername)
        for i in range(0,self.occur):
            self.fml = tuxedo.Fml32 ()
            self.fml.Fchg ("TA_OPERATION", 0, "SET")
            self.fml.Fchg ("TA_CLASS", 0, "T_SERVER")
            self.fml.Fchg ("TA_SRVGRP", 0, self.servergroup[i])
            self.fml.Fchg ("TA_SRVID", 0, self.serverid[i])
            self.fml.Fchg ("TA_STATE", 0, "INA")
            self._log_message_and_fml ("BEFORE REMOVE-SERVER,%d:",i)
            self.fml = tuxedo.tpcall (".TMIB", self.fml)
            self._log_message_and_fml ("AFTER REMOVE-SERVER,%d:",i)

    def activateserver (self, servername):
        self.pollserver (servername)
        for i in range(0,self.occur):
            self.fml = tuxedo.Fml32 ()
            self.fml.Fchg ("TA_OPERATION", 0, "SET")
            self.fml.Fchg ("TA_CLASS", 0, "T_SERVER")
            self.fml.Fchg ("TA_SRVGRP", 0, self.servergroup[i])
            self.fml.Fchg ("TA_SRVID", 0, self.serverid[i])
            self.fml.Fchg ("TA_STATE", 0, "ACT")
            self._log_message_and_fml ("BEFORE ACTIVATE-SERVER,%d:",i)
            self.fml = tuxedo.tpcall (".TMIB", self.fml)
            self._log_message_and_fml ("AFTER ACTIVATE-SERVER,%d:",i)

    def displayallserverbybaseserverid (self):
        self.fml = tuxedo.Fml32 ()
        self.fml.Fchg ("TA_OPERATION", 0, "GET")
        self.fml.Fchg ("TA_CLASS", 0, "T_SERVER")
        self._log_message_and_fml ("BEFORE POLL-ALL-SERVERS:")
        self.fml = tuxedo.tpcall (".TMIB", self.fml)
        self._log_message_and_fml ("AFTER POLL-ALL-SERVERS:")
        self.baseserverid = []
        self.serversequence = []
        self.serverstate = []
        self.servername = []
        self.occur = self.fml.Fget ("TA_OCCURS", 0)
        if self.occur <= 0:
            raise ArubaTuxAdminException, "Class : " + self.__class__.__name__ + " : failed to retrieve MIB information!!"
        for i in range(0,self.occur):
            self.baseserverid.append (self.fml.Fget("TA_BASESRVID", i))
            self.serversequence.append (self.fml.Fget("TA_SEQUENCE", i))
            self.serverstate.append (self.fml.Fget("TA_STATE", i))
            self.servername.append (self.fml.Fget("TA_SERVERNAME", i))
        self.configuredserverstate = {}
        self.configuredservername = {}
        for i in range(0,self.occur):
            if self.baseserverid[i]<100 or self.baseserverid[i]>30000:
                continue
            if not self.configuredservername.has_key(self.baseserverid[i]):
                self.configuredserverstate[self.baseserverid[i]] = self.serverstate[i]
                self.configuredservername[self.baseserverid[i]] = self.servername[i]
                continue
            if self.baseserverstate=='ACTIVE':
                self.configuredserverstate[self.baseserverid[i]] = self.serverstate[i]
        for i in self.configuredserverstate.keys():
            print i, "\t", self.configuredserverstate[i], "\t", self.configuredservername[i]

    def displayallserverbyserversequence (self):
        self.fml = tuxedo.Fml32 ()
        self.fml.Fchg ("TA_OPERATION", 0, "GET")
        self.fml.Fchg ("TA_CLASS", 0, "T_SERVER")
        self._log_message_and_fml ("BEFORE POLL-ALL-SERVERS:")
        self.fml = tuxedo.tpcall (".TMIB", self.fml)
        self._log_message_and_fml ("AFTER POLL-ALL-SERVERS:")
        self.baseserverid = []
        self.serversequence = []
        self.serverstate = []
        self.servername = []
        self.occur = self.fml.Fget ("TA_OCCURS", 0)
        if self.occur <= 0:
            raise ArubaTuxAdminException, "Class : " + self.__class__.__name__ + " : failed to retrieve MIB information!!"
        for i in range(0,self.occur):
            self.baseserverid.append (self.fml.Fget("TA_BASESRVID", i))
            self.serversequence.append (self.fml.Fget("TA_SEQUENCE", i))
            self.serverstate.append (self.fml.Fget("TA_STATE", i))
            self.servername.append (self.fml.Fget("TA_SERVERNAME", i))
        self.configuredserverstate = {}
        self.configuredservername = {}
        for i in range(0,self.occur):
            if self.serversequence[i]==0:
                continue
            if not self.configuredservername.has_key(self.serversequence[i]):
                self.configuredserverstate[self.serversequence[i]] = self.serverstate[i]
                self.configuredservername[self.serversequence[i]] = self.servername[i]
                continue
            if self.baseserverstate=='ACTIVE':
                self.configuredserverstate[self.serversequence[i]] = self.serverstate[i]
        for i in self.configuredserverstate.keys():
            print i, "\t", self.configuredserverstate[i], "\t", self.configuredservername[i]

    def displaysystemservers (self):
        self.fml = tuxedo.Fml32 ()
        self.fml.Fchg ("TA_OPERATION", 0, "GET")
        self.fml.Fchg ("TA_CLASS", 0, "T_SERVER")
        self._log_message_and_fml ("BEFORE POLL-ALL-SERVERS:")
        self.fml = tuxedo.tpcall (".TMIB", self.fml)
        self._log_message_and_fml ("AFTER POLL-ALL-SERVERS:")
        self.baseserverid = []
        self.serversequence = []
        self.serverstate = []
        self.servergroup = []
        self.servername = []

        self.servergroupno = []
        self.serverid = []
        self.occur = self.fml.Fget ("TA_OCCURS", 0)
        if self.occur <= 0:
            raise ArubaTuxAdminException, "Class : " + self.__class__.__name__ + " : failed to retrieve MIB information!!"
        for i in range(0,self.occur):
            self.baseserverid.append (self.fml.Fget("TA_BASESRVID", i))
            self.serversequence.append (self.fml.Fget("TA_SEQUENCE", i))
            self.serverstate.append (self.fml.Fget("TA_STATE", i))
            self.servername.append (self.fml.Fget("TA_SERVERNAME", i))
            self.servergroup.append (self.fml.Fget("TA_SRVGRP", i))

            self.servergroupno.append (self.fml.Fget("TA_GRPNO", i))
            self.serverid.append (self.fml.Fget("TA_SRVID", i))

        for i in range(0,self.occur):
	    if self.serversequence[i] > 0:
		continue
            print "[", self.baseserverid[i], "]\t[", self.serversequence[i], "]\t[",  self.servergroupno[i], "]\t[", self.serverid[i], "]\t[", self.servergroup[i], "]\t[", self.servername[i], "]"

    def displayservers (self):
        self.fml = tuxedo.Fml32 ()
        self.fml.Fchg ("TA_OPERATION", 0, "GET")
        self.fml.Fchg ("TA_CLASS", 0, "T_SERVER")
        self._log_message_and_fml ("BEFORE POLL-ALL-SERVERS:")
        self.fml = tuxedo.tpcall (".TMIB", self.fml)
        self._log_message_and_fml ("AFTER POLL-ALL-SERVERS:")
        self.baseserverid = []
        self.serversequence = []
        self.serverstate = []
        self.servergroup = []
        self.servername = []

        self.servergroupno = []
        self.serverid = []
        self.occur = self.fml.Fget ("TA_OCCURS", 0)
        if self.occur <= 0:
            raise ArubaTuxAdminException, "Class : " + self.__class__.__name__ + " : failed to retrieve MIB information!!"
        for i in range(0,self.occur):
            self.baseserverid.append (self.fml.Fget("TA_BASESRVID", i))
            self.serversequence.append (self.fml.Fget("TA_SEQUENCE", i))
            self.serverstate.append (self.fml.Fget("TA_STATE", i))
            self.servername.append (self.fml.Fget("TA_SERVERNAME", i))
            self.servergroup.append (self.fml.Fget("TA_SRVGRP", i))

            self.servergroupno.append (self.fml.Fget("TA_GRPNO", i))
            self.serverid.append (self.fml.Fget("TA_SRVID", i))

        for i in range(0,self.occur):
            print "[", self.baseserverid[i], "]\t[", self.serversequence[i], "]\t[",  self.servergroupno[i], "]\t[", self.serverid[i], "]\t[", self.serverstate[i], "]\t[", self.servergroup[i], "]\t[", self.servername[i], "]"

    def __init__ (self, options = None):
        ArubaTuxFML.__init__ (self,options)
                
#------------------------Emacs setup for Python mode--------------------------
# Local Variables:
# mode: Python
# End:
