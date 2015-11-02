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


public class UdtTest2 {
    public static void main(String[] args) {
        UdtTest2 test = new UdtTest2();
        test.runTest();
    }

    public void runTest() {
        try {
            CustomerUdtRequest rootRequest = new CustomerUdtRequest();
            AccountRequest accountReq = new AccountRequest("AccountGet", AccountRequestMethod.ACCOUNT_GET);
            AccountObjectKeyData accountKey = new AccountObjectKeyData();
            System.err.println("Searching for account with internal id = 5305");
            accountKey.setAccountInternalId(new Integer(5305));
            accountReq.setAccountObjectKeyData(accountKey);
            rootRequest.addAccountRequest(accountReq);
            ServiceRequest serviceReq = new ServiceRequest("ServiceGet", ServiceRequestMethod.SERVICE_GET);
            //rootRequest.addServiceRequest(serviceReq);
            CustomerUdtRequestBean processor = new CustomerUdtRequestBean(BSDMSettings.getDefault());
            rootRequest = processor.process(BSDMSessionContext.getDefaultContext(), rootRequest);
            AccountXIDObjectData data = accountReq.getAccountXIDObjectData();
            System.err.println("Account status date = "+data.getAccountStatusDt());
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
