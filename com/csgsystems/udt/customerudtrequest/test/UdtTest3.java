package com.csgsystems.udt.customerudtrequest.test;

import com.csgsystems.udt.*;
import com.csgsystems.udt.xlate.*;
import com.csgsystems.udt.xlate.hashmap.*;
import com.csgsystems.udt.customerudtrequest.*;
import com.csgsystems.udt.customerudtrequest.session.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.aruba.filter.*;
import com.csgsystems.aruba.connection.Connection;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.aruba.connection.ConnectionFactory;
import com.csgsystems.bali.connection.ApiMappings;
import java.util.*;


public class UdtTest3 {
    public static void main(String[] args) {
        UdtTest3 test = new UdtTest3();
        test.runTest();
    }

    public void runTest() {
        try {
            HashMapUdtTranslator xlator = new HashMapUdtTranslator();
            CustomerUdtRequest rootRequest = new CustomerUdtRequest();
            AccountRequest accountReq = new AccountRequest("AccountGet", AccountRequestMethod.ACCOUNT_GET);
            AccountObjectKeyData accountKey = new AccountObjectKeyData();
            accountKey.setAccountInternalId(new Integer(5305));
            accountReq.setAccountObjectKeyData(accountKey);
            rootRequest.addAccountRequest(accountReq);
            ServiceRequest serviceReq = new ServiceRequest("ServiceFind", ServiceRequestMethod.SERVICE_FIND);
            ServiceObjectBaseFilter servFilt = new ServiceObjectBaseFilter();
            servFilt.setFetch(true);
            serviceReq.setServiceObjectBaseFilter(servFilt);
            accountReq.addSubRequest(serviceReq, AccountRequestRelationship.ACCOUNT__SERVICE__REF);
            HashMapOutput output = (HashMapOutput)xlator.translate(rootRequest);
            output.debug(System.err);
            Connection connection = ConnectionFactory.instance().createConnection(BSDMSettings.getDefault());
            HashMap map = connection.call(BSDMSessionContext.getDefaultContext(), ApiMappings.getCallName("CustomerUdtRequest"), output.getHashMap());
            HashMapInput input = new HashMapInput();
            input.setHashMap(map);
            input.debug(System.err);
            rootRequest = (CustomerUdtRequest)xlator.translate(input, rootRequest);
            AccountXIDObjectData data = accountReq.getAccountXIDObjectData();
            System.err.println("Account status date = "+data.getAccountStatusDt());
            ServiceObjectBaseDataList dataList = serviceReq.getServiceObjectBaseDataList();
            System.err.println("Number of total service records was = "+dataList.getTotalCount());
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
