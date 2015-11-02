package com.csgsystems.aruba.test;
import java.util.HashMap;
import java.util.Map;

import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.aruba.connection.Connection;
import com.csgsystems.aruba.connection.ConnectionFactory;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.bali.connection.ApiMappings;

public class TestRequest
{

  public static void main(String[] argv) throws Exception
  {
    ConnectionFactory factory = new ConnectionFactory();
    Connection ck = factory.createConnection(BSDMSettings.getDefault ());

    Map m = new HashMap();
    Map n = new HashMap();
    Map o = new HashMap();
    Map aa = new HashMap();
    Map[] subs = new HashMap[1];

    subs[0] = new HashMap();
    
    o.put("BillLname", "Smith");
    o.put("BillFname", "Antowain");
    o.put("BillAddress1", "82 Smith Dr.");
    o.put("BillCity", "North Quincy");
    o.put("BillState", "MA");
    o.put("BillPeriod", "M03");
    o.put("BillZip", "02169");
    o.put("AccountCategory", new Integer(1));
    o.put("MktCode", new Integer(1));
    o.put("MsgGrpId", new Integer(1));
    o.put("InsertGrpId", new Integer(1));
    o.put("ServiceCenterType", new Integer(1));
    o.put("ServiceCenterId", new Integer(1));
    o.put("RateClassDefault", new Integer(1));
    o.put("BillDispMeth", new Integer(1));
    o.put("BillFmtOpt", new Integer(1));
    o.put("PayMethod", new Integer(1));
    o.put("CollectionIndicator", new Integer(0));

    n.put("Account", o);
    n.put("ReasonCode", new Integer(1));
    
    aa.put("ReasonCode", new Integer(1));

    subs[0].put("AccountActivate", aa);
    subs[0].put("#NAME", "SelfRequest");

    m.put("AccountCreatePending", n);
    m.put("SubRequest", subs);

    try
    {
      ck.call(ApiMappings.getCallName("AccountRequest"), m);
    }
    catch (ServiceException e)
    {
      e.printStackTrace();
    }

    System.out.println("SUCCESS!!");
  }
}
