""" -*- python -*-
    $Id: ArubaDatatype.py,v 1.1 2002/12/09 17:30:02 wcox Exp $

"""
from mx import DateTime

class ArubaDatatype:
    """ a class for holding special ARUBA XML datatypes """
    
    def __eq__ (self, other):
        return ((self.datatype == other.datatype) and
                (self.value == other.value))

def datatype (datatype, value = ""):
    if datatype == 'dateTime':
        #YYYY-MM-DD HH:MI:SS
        #0000000000111111111
        #0123456789012345678
        year   = int (value[ 0: 4])
        month  = int (value[ 5: 7])
        day    = int (value[ 8:10])
        hour   = int (value[11:13])
        minute = int (value[14:16])
        second = int (value[17:19])
        return DateTime.DateTime (year, month, day, hour, minute, second)
    
    item = ArubaDatatype ()
    item.datatype = datatype
    item.value = value
    return item

