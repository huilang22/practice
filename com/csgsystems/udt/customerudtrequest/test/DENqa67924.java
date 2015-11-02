package com.csgsystems.udt.customerudtrequest.test;

import com.csgsystems.udt.*;
import com.csgsystems.udt.xlate.*;
import com.csgsystems.udt.xlate.hashmap.*;
import com.csgsystems.udt.customerudtrequest.*;
import com.csgsystems.udt.customerudtrequest.session.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.aruba.connection.Connection;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.aruba.connection.ConnectionFactory;
import com.csgsystems.bali.connection.ApiMappings;
import java.util.*;


public class DENqa67924 {
    public static void main(String[] args) {
        DENqa67924 test = new DENqa67924();
        test.runTest();
    }

    public void runTest() {
        try {
            HashMapUdtTranslator xlator = new HashMapUdtTranslator();
            CustomerUdtRequest rootRequest = new CustomerUdtRequest();
            rootRequest.setEnforceSubRequestRelationship(false);
            AccountRequest accountReq = new AccountRequest("AccountGet", AccountRequestMethod.ACCOUNT_GET);
            AccountObjectKeyData accountKey = new AccountObjectKeyData();
            System.err.println("Searching for account with internal id = 1786");
            accountKey.setAccountInternalId(new Integer(1786));
            accountReq.setAccountObjectKeyData(accountKey);
            rootRequest.addAccountRequest(accountReq);
            ServiceRequest serviceReq = new ServiceRequest("ServiceGet", ServiceRequestMethod.SERVICE_GET);
            //rootRequest.addServiceRequest(serviceReq);
            HashMapOutput output = (HashMapOutput)xlator.translate(rootRequest);
            output.debug(System.err);
            Connection connection = ConnectionFactory.instance().createConnection(BSDMSettings.getDefault());
            BSDMSessionContext context = BSDMSessionContext.getDefaultContext();
            context.setServerId(new Integer(3));
            HashMap map = connection.call(context, ApiMappings.getCallName("CustomerUdtRequest"), output.getHashMap());
            HashMapInput input = new HashMapInput();
            input.setHashMap(map);
            input.debug(System.err);
            rootRequest = (CustomerUdtRequest)xlator.translate(input, rootRequest);
            AccountXIDObjectData data = accountReq.getAccountXIDObjectData();
            System.err.println("Account status date = "+data.getAccountStatusDt());
            Object o = accountReq.getAccountEDObjectDataList();
            if (o != null) {
              System.out.println("ED not null");
              AccountEDObjectData[] edata = ((AccountEDObjectDataList)o).getArray();
              System.out.println("ED Data=" + edata);
              if (edata != null) {
                 System.out.println("ED data Length:" + edata.length);
                 for (int i=0; i < edata.length; i++) {
                    System.out.println("AcccountEDData[" + i + "]: " + edata[i].getParamName() + " " + 
                        edata[i].getParamValue());
                 }
              } else {
                System.out.println("Null array List");
              }
            }
            System.out.println("ED Object Type:" + o.getClass().getName());
            System.out.println("New ED Object:" + accountReq.getAccountObjectExtendedData());
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
