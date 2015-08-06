#!/usr/bin/env python
# ArubaFMLMarshal.py -- Aruba FML serialization
# $Id: ArubaFML.py,v 1.1 2002/12/09 17:30:00 wcox Exp $
#

from StringIO import StringIO
from terrapin.shieldware.Marshal import *
from ArubaDatatype import datatype
from mx import DateTime
from types import *
import string

class ArubaFMLMarshaler (ShieldWareMarshaler):

    def m_DateTime (self, object, userTag = ''):
        self.m_string (object.strftime ('%Y-%m-%d %H:%M:%S'),
                       'dateTime')

    def m_dict (self, object, userTag = ''):
        if object.has_key ('#NAME'):
            userTag = object['#NAME']
            lengthD = 1
        else:
            lengthD = 0
        self._pack_int (7)
        self._pack_string (userTag)
        keys = object.keys ()
        self._pack_int (len (keys) - lengthD)
        for key in keys:
            if key != '#NAME':
                self._marshal (key)
                self._marshal (object[key])
        
    def m_instance (self, object):
        if hasattr (object, 'datatype'):
            userTag = object.datatype
        else:
            userTag = ''
        if hasattr (object, 'value'):
            v = object.value
            t = type (v)
            if userTag == 'boolean':
                if string.upper (v[0]) == 'T':
                    v = 1
                else:
                    v = 0
                t = type (v)
            if t == types.LongType: meth = 'm_long'
            else: meth = "m_" + t.__name__
            return getattr (self, meth) (v, userTag)
        raise TypeError, "Can't marshall type " + str (type (object)) + \
              " object " + `object `

    def m_NoneType (self, object, userTag = ''):
        """ Python 2.2 was kind enough to change the type name of 'None'
        """
        return self.m_None (object, userTag)

class ArubaFMLUnmarshaler (ShieldWareUnmarshaler):

    def __init__ (self, stream, datatype = None):
        ShieldWareUnmarshaler.__init__ (self, stream, datatype)

    def um_str (self, usertype):
        s = ShieldWareUnmarshaler.um_str (self, '')
        if usertype != 'dateTime':
            return s
        year   = int (s[ 0: 4])
        month  = int (s[ 5: 7])
        day    = int (s[ 8:10])
        hour   = int (s[11:13])
        minute = int (s[14:16])
        second = int (s[17:19])
        value = DateTime.DateTime (year, month, day,
                                   hour, minute, second)
        return value

    def um_int (self, usertype):
        i = self._unpack_int ()
        if usertype != 'boolean':
            return i
        if i == 0:
            return self.datatype (usertype, 'false')
        return self.datatype (usertype, 'true')

    def um_dict (self, usertype):
        length = self._unpack_int ()
        i = 0
        d = {}
        while i < length:
            key = self._unmarshal ()
            value = self._unmarshal ()
            d[key] = value
            i = i + 1
        if usertype != '':
            d['#NAME'] = usertype
        return d

    def um_None (self, usertype):
        return None

# Shorthands (credits to and most copied from pickle.py)

def dump (object, file):
    ArubaFMLMarshaler (file).dump (object)

def dumps (object):
    file = StringIO ()
    ArubaFMLMarshaler (file).dump (object)
    return str (file.getvalue ())

def loads (str):
    file = StringIO (str)
    o = ArubaFMLUnmarshaler (file, datatype).load ()
    file.close ()
    return o

def load (file):
    o = ArubaFMLUnmarshaler (file, datatype).load ()
    return o

if __name__ == '__main__':
    runtests(load, loads, dump, dumps)

#------------------------Emacs setup for Python mode--------------------------
# Local Variables:
# mode: Python
# End:
