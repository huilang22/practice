""" -*- python -*-
    $Id: ArubaXML.py,v 1.1 2002/12/09 17:30:02 wcox Exp $

"""

from StringIO import StringIO
from ScarabMarshal import *
from ArubaDatatype import datatype
from xml.sax import saxlib, saxexts
from xml.sax.drivers.drv_xmlproc_val import SAX_XPValParser
from types import *
from mx import DateTime
import string
import base64
import re
#from encodings import utf_8, iso8859_1, unicode_internal
#from codecs import StreamReaderWriter


class myErrorHandler (saxlib.ErrorHandler):
    def error(self, exception):
        raise exception

    def fatalError(self, exception):
        raise exception

    def warning(self, exception):
        raise exception


    
# just constants
DICT = "dict"
ARRAY = "array"
CHAR = "char"


_entities_re = re.compile("""[&<>'"]""")
_entity_replacements = {
    '&' : '&amp;',
    '<' : '&lt;',
    '>' : '&gt;',
    "'" : '&apos;',
    '"' : '&quot;' }

def _entity_replace(matchobj):
    return _entity_replacements[matchobj.group()]

class ArubaXMLMarshaler (Marshaler):

    def __init__(self, stream):
        theStream = stream
        self.written_stream_header = 0
        self.written_namespaces = 0
	self.write = theStream.write
        self.flush = theStream.flush
        
    def m_init(self, dict):
        self.write('<?xml version="1.0"?>')

    def persistent_id(self, object):
        return None

    def m_reference(self, object, dict):
        """ already done """

    def m_None(self, object, dict):
        """ already done """

    def m_int(self, object, dict):
        self.write(str(object))

    def m_long(self, object, dict):
        self.write(str(object))

    def m_float(self, object, dict):
        self.write(str(object))

    def m_complex(self, object, dict):
        self.write(str(object))

    def m_string(self, object, dict):
        new_string = re.sub(_entities_re, _entity_replace, object)
        self.write(new_string)    

    def m_list(self, object, dict):
	n = len(object)
        for k in range(n):
            m = object[k]
            _type = self._type(m)
            tagName = 'aruba:ListItem'
            if (type (m) == DictionaryType) and (m.has_key ('#NAME')):
                tagName = m['#NAME']
            self.write('<' + tagName + _type + '>')
            self._marshal(object[k], dict)
            self.write('</' + tagName + '>')

    def m_tuple(self, object, dict):
        n = len(object)
        for k in range(n):
            m = object[k]
            _type = self._type(m)
            tagName = 'aruba:ListItem'
            if (type (m) == DictionaryType) and (m.has_key ('#NAME')):
                tagName = m['#NAME']
            self.write('<' + tagName + _type + '>')
            self._marshal(m, dict)
            self.write('</' + tagName + '>')

    def m_dictionary(self, object, dict):
        
        """ Changed by Wayne to sort the keys if #ORDER does not exist

            Changed by Lane Stevens to add support for the #ORDER
            reserved-work key.  All attributes will be treated as optional
            by this routine.  If the #ORDER attribute exists, then only
            those attributes will be included in the output XML buffer.
            Any attribute that is specified in the #ORDER list of
            attributes but doesn't exist in the set of keys represented by
            the dictionary will be ignored.  Any key that exists but is
            not specified in the #ORDER list will be ignored.  #ORDER is
            an optional attribute.  This routine will process the
            attributes as before if no #ORDER list is supplied.
        """
        # FIXME missing ref ids
        items = []
        if object.has_key('#ORDER'):
            orderSpec = object['#ORDER']
        else:
            orderSpec = object.keys ()
            orderSpec.sort ()

        for k in orderSpec:
            if (not k == '#NAME') and (object.has_key (k)):
                items.append ((k, object[k]))
        
        n = len(items)
	for k in range(n):
	    key, value = items[k]
            type = self._type(value)
            if self.written_namespaces == 1:
                self.write('<' + key + type + '>')
            else:
                self.write('<' + key + \
                    ' xmlns:xsi="xmlSchema" xmlns:csg="CSG" xmlns:aruba="ARUBA">')
                self.written_namespaces = 1
	    self._marshal(value, dict)
            self.write('</' + key + '>')

    def m_dict(self, object, dict):
        
        """ Changed by Wayne to sort the keys if #ORDER does not exist

            Changed by Lane Stevens to add support for the #ORDER
            reserved-work key.  All attributes will be treated as optional
            by this routine.  If the #ORDER attribute exists, then only
            those attributes will be included in the output XML buffer.
            Any attribute that is specified in the #ORDER list of
            attributes but doesn't exist in the set of keys represented by
            the dictionary will be ignored.  Any key that exists but is
            not specified in the #ORDER list will be ignored.  #ORDER is
            an optional attribute.  This routine will process the
            attributes as before if no #ORDER list is supplied.
        """
        # FIXME missing ref ids
        items = []
        if object.has_key('#ORDER'):
            orderSpec = object['#ORDER']
        else:
            orderSpec = object.keys ()
            orderSpec.sort ()

        for k in orderSpec:
            if (not k == '#NAME') and (object.has_key (k)):
                items.append ((k, object[k]))
        
        n = len(items)
	for k in range(n):
	    key, value = items[k]
            type = self._type(value)
            if self.written_namespaces == 1:
                self.write('<' + key + type + '>')
            else:
                self.write('<' + key + \
                    ' xmlns:xsi="xmlSchema" xmlns:csg="CSG" xmlns:aruba="ARUBA">')
                self.written_namespaces = 1
	    self._marshal(value, dict)
            self.write('</' + key + '>')

    def m_DateTime (self, object, dict):
        self.write (object.strftime ('%Y-%m-%d %H:%M:%S'))
        return

    
    def m_instance(self, object, dict):
        # ArubaDatatype is a placeholder for a special datatype            
        if object.__class__.__name__ == 'ArubaDatatype':
            if object.datatype == 'binary':
                self.write (base64.encodestring (object.value))
                return
            new_string = re.sub(_entities_re, _entity_replace, object.value)
            self.write(new_string)
            return

        # FIXME missing ref ids
        cls = object.__class__
	module = whichmodule(cls)
	name = cls.__name__
	try:
	    getstate = object.__getstate__
	except AttributeError:
	    stuff = object.__dict__
        else:
	    stuff = getstate()
	items = stuff.items()
	n = len(items)
	for k in range(n):
	    key, value = items[k]
            type = self._type(value)
            self.write('<' + key + type + '>')
	    self._marshal(value, dict)
            self.write('</' + key + '>')

    def _type(self, object):
        t = type(object)
        if (t == ListType) or (t == TupleType):
            return ' e-dtype="list"'
        elif t == NoneType:
            return ' xsi:null="1"'
        elif t == StringType:
            return ' e-dtype="string"'
        elif t == IntType:
            return ' e-dtype="int"'
        elif t == FloatType:
            return ' e-dtype="float"'
        elif t == DictionaryType:
            return ''
        elif t == DateTime.DateTimeType:
            return ' e-dtype="dateTime"'
        elif ((t == InstanceType)
              and (object.__class__.__name__ == "ArubaDatatype")):
            if object.datatype == 'binary':
                return ' e-dtype="bin.base64"'
            return ' e-dtype="' + object.datatype + '"'

        raise TypeError, "Can't marshall type " + str(t) + \
                         " object " + `object`

class ArubaXMLUnmarshaler(Unmarshaler, saxlib.DocumentHandler):

    def __init__(self, stream, validating = 0):
        self.memo = {}
        self.stream = stream
        self.validating = validating
        
    def um_init(self):
        self.parse_value_stack = [ {} ]
        self.parse_utype_stack = [ DICT ]
        self.parse_type_stack = [ ]

        if self.validating:
            self.parser = SAX_XPValParser()
        else:
            self.parser = saxexts.make_parser()
        self.parser.setDocumentHandler(self)
        self.parser.setErrorHandler(myErrorHandler())


        lines = []
        stream = self.stream
        # FIXME SAX parsers should support this on streams
        line = stream.readline()
        while (line != "\f\n") and (line != ""):
            lines.append(line)
            line = stream.readline()
        if len(lines) == 0:
            raise EOFError
        self.stream = StringIO(string.join(lines, ''))

    def um_finish(self):
        self.parser.close()
        delattr(self, 'stream')

    def _unmarshal(self):
        self.parse_depth = 1
        self.parser.parseFile(self.stream)
        o = self.parse_value_stack[0]
        delattr(self, 'parse_value_stack')
        return o

    def startElement(self, name, attrs):
        isList = 0
        
        self.parse_depth = self.parse_depth + 1
        self.chars = ""

        xsi_type = None
        if (attrs.has_key('xsi:null')
              and attrs['xsi:null'] == '1'):
            xsi_type = "None"
        elif attrs.has_key('e-dtype'):
            if attrs['e-dtype'] == 'list':
                isList = 1
            else:
                xsi_type = attrs['e-dtype']
        self.parse_type_stack.append(xsi_type)

        if attrs.has_key('csg:type'):
            isList = 1

        if isList:                        
            self.parse_utype_stack.append (ARRAY)
            self.parse_value_stack.append ( [ ] )
        elif xsi_type == None:
            self.parse_utype_stack.append (DICT)
            self.parse_value_stack.append ( { } )
        else:
            self.parse_utype_stack.append (CHAR)

    def endElement(self, name):
        theName = str (name)
        xsi_type = self.parse_type_stack.pop()
        utype = self.parse_utype_stack.pop()
        if utype is CHAR:
            if xsi_type == "string":
                value = self.chars
            elif xsi_type == "int":
                value = int(self.chars)
            elif xsi_type == "float":
                value = float(self.chars)
            elif xsi_type == "None":
                value = None
            elif xsi_type == "dateTime":
                #YYYY-MM-DD HH:MI:SS
                #0000000000111111111
                #0123456789012345678
                theString = self.chars
                year   = int (theString[ 0: 4])
                month  = int (theString[ 5: 7])
                day    = int (theString[ 8:10])
                hour   = int (theString[11:13])
                minute = int (theString[14:16])
                second = int (theString[17:19])
                value = DateTime.DateTime (year, month, day,
                                           hour, minute, second)
            elif xsi_type == "bin.base64":
                value = datatype ('binary', base64.decodestring (self.chars))
            else:
                value = datatype(xsi_type, self.chars)
        else:
            value = self.parse_value_stack.pop()

        if self.parse_utype_stack[-1] is DICT:
            if self.parse_value_stack[-1].has_key(theName):
                temp = self.parse_value_stack[-1][theName]
                if type(temp) == ListType:
                    temp.append(value)
                else:
                    self.parse_value_stack[-1][theName] = [ temp, value ]
            else:        
                self.parse_value_stack[-1][theName] = value
        else:
            if (not theName == 'aruba:ListItem') and \
               (type (value) == DictionaryType):
                value['#NAME'] = theName
            self.parse_value_stack[-1].append(value)

        self.parse_depth = self.parse_depth - 1
        if self.parse_depth == 0:
            self.parser.setDocumentHandler(self.parentDocumentHandler)

    def characters(self, ch, start, length):
        self.chars = self.chars + str (ch[start:start + length])
        
    def fatalError(self, exc):
        raise exc

    def warning(self, exc):
        raise exc

# Shorthands (credits to and most copied from pickle.py)

def dump (object, file):
    ArubaXMLMarshaler (file).dump (object)

def dumps (object):
    file = StringIO()
    ArubaXMLMarshaler (file).dump (object)
    return str (file.getvalue ())

def loads (str, dtd = None):
    if dtd == None:
        validating = 0
        xmlDoc = str
    else:
        validating = 1
        header, xml = string.split (str, '>', 1)
        header, definition = string.split (dtd, '>', 1)
        xmlDoc =  "<?xml version='1.0' ?>" + \
                  '<!DOCTYPE Request [\n' + \
                  definition + '\n]>\n' + xml

    file = StringIO (xmlDoc)

    try:
        o = ArubaXMLUnmarshaler (file, validating).load ()
    except saxlib.SAXParseException, e:
        linenum = e.getLineNumber () - 1
        start = linenum - 5
        if start < 0:
            start = 0
        finish = linenum + 5
        
        file = StringIO (xmlDoc)
        lines = file.readlines ()

        if finish >= len (lines):
            finish = len (lines) - 1
        data = '\n'
        while start < finish:
            if start == linenum:
                data = data + '* ' + lines[start]
            else:
                data = data + '  ' + lines[start]

            start = start + 1
            
        data = data + '\n' + e.getMessage()
        
        raise saxlib.SAXParseException (data, e.getException(), e._locator)
    return o

if __name__ == '__main__':
    runtests(load, loads, dump, dumps)
