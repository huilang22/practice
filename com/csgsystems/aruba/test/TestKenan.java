package com.csgsystems.aruba.test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.csgsystems.bali.connection.ApiMappings;
import com.csgsystems.aruba.connection.Connection;
import com.csgsystems.aruba.connection.ConnectionFactory;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.aruba.connection.BSDMSessionContext;

public class TestKenan
{

  public static void main(String[] argv) throws Exception
  {

    byte[] b1 = new byte[0];
    byte[] b2 = new byte[0];

    System.out.println("ARE ARRAY's equal: " + (b1.equals(b2)));

    ConnectionFactory factory = new ConnectionFactory();

    Connection ck = factory.createConnection(BSDMSettings.getDefault ());

    Object[] list = new Object[2];
    list[0] = null;
    list[1] = null;

    Map m = new HashMap();
    m.put("Hello", "World");
    m.put("aFloat", new Double(1234.5678));
    m.put("anInt", new Integer(-37));
    m.put("aList", list);
    m.put("anInvalid", null);
    m.put("aBoolean", new Boolean(true));

    m = ck.call(BSDMSessionContext.getDefaultContext (), ApiMappings.getCallName ("V_Ping"), m);

    System.out.println(m);

    Object[] trace = ck.getTraceResults();
    System.out.println(Arrays.asList(trace));

    if (!m.get("Hello").equals("World"))
    {
      throw (new Exception("Should have returned same data"));
    }

    try
    {
      ck.call(BSDMSessionContext.getDefaultContext (), ApiMappings.getCallName ("AccountFind"), m);
    }
    catch (ServiceException e)
    {
      if (!e.getName().equals("exc_NOTFOUND"))
      {
        throw (e);
      }

      System.out.println("PROPERLY CAUGHT EXCEPTION :-)");
      e.printStackTrace();
    }

    if (ck.getTraceResults() != null)
    {
      throw (new Exception("Should not have returned TraceResults"));
    }

    System.out.println("SUCCESS!!");
  }
}
