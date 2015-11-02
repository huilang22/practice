package com.csgsystems.aruba.test;
import org.apache.xerces.parsers.DOMParser;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;

import com.csgsystems.aruba.connection.XmlConnection;
import com.csgsystems.aruba.connection.BSDMSettings;

public class TestXml
{

  public static void main(String[] argv) throws Exception
  {
    byte[] ba;

    System.loadLibrary("tti_tuxedo");

    DOMParser p = new DOMParser();
    p.parse(argv[0]);
    Document doc = p.getDocument();

    OutputFormat format = new OutputFormat();
    format.setIndent(2);
    XMLSerializer printer = new XMLSerializer(format);
    printer.setOutputByteStream(System.out);
    printer.serialize(doc);

    XmlConnection connection = new XmlConnection(BSDMSettings.getDefault ());
    doc = connection.call(doc);

    printer.serialize(doc);

    System.out.println("SUCCESS!!");
  }
}
