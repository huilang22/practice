package com.csgsystems.udt.customerudtrequest.test;

import java.math.BigInteger;
import java.util.Date;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.bp.data.AccountXIDObjectData;
import com.csgsystems.om.data.ItemObjectData;
import com.csgsystems.om.data.OrderObjectData;
import com.csgsystems.om.data.ServiceOrderObjectBaseData;
import com.csgsystems.udt.InputRequest;
import com.csgsystems.udt.customerudtrequest.AccountRequest;
import com.csgsystems.udt.customerudtrequest.AccountRequestMethod;
import com.csgsystems.udt.customerudtrequest.AccountRequestRelationship;
import com.csgsystems.udt.customerudtrequest.CustomerUdtRequest;
import com.csgsystems.udt.customerudtrequest.ItemRequest;
import com.csgsystems.udt.customerudtrequest.ItemRequestMethod;
import com.csgsystems.udt.customerudtrequest.OrderRequest;
import com.csgsystems.udt.customerudtrequest.OrderRequestMethod;
import com.csgsystems.udt.customerudtrequest.OrderRequestRelationship;
import com.csgsystems.udt.customerudtrequest.ServiceOrderRequest;
import com.csgsystems.udt.customerudtrequest.ServiceOrderRequestMethod;
import com.csgsystems.udt.customerudtrequest.ServiceOrderRequestRelationship;
import com.csgsystems.udt.customerudtrequest.session.CustomerUdtRequestBean;

public class DENqa68275 {
    public static void main(String[] args) {
        DENqa68275 test = new DENqa68275();
        test.runTest();
    }

    public void runTest() {
        try {
            Date rightNow = new Date();

            CustomerUdtRequest rootRequest = new CustomerUdtRequest();

            // Set up 1st request step - AccountCreate

            AccountXIDObjectData account = new AccountXIDObjectData();
            account.setAccountCategory     (new Integer(1));
            account.setAccountExternalId   (new String("CustomerUdt" + rightNow.toString().replace(' ', '.')));
            account.setBillAddress1        (new String("18710 E. Test St."));
            account.setBillCity            (new String("Denver"));
            account.setBillCompany         (new String("CSG"));
            account.setBillDispMeth        (new Integer(1));
            account.setBillFmtOpt          (new Integer(1));
            account.setBillFname           (new String("Derek"));
            account.setBillLname           (new String("Hoover"));
            account.setBillPeriod          (new String("M01"));
            account.setBillState           (new String("CO"));
            account.setBillZip             (new String("80015"));
            account.setCollectionIndicator (new Integer(0));
            account.setCustPhone1          (new String("(303) 617-4342"));
            account.setCustPhone2          (new String("(303) 200-3578"));
            account.setDateActive          (rightNow);
            account.setInsertGrpId         (new Integer(1));
            account.setMktCode             (new Integer(1));
            account.setMsgGrpId            (new Integer(1));
            //account.setPayMethod           (new Integer(1));
            account.setRateClassDefault    (new Integer(1));

            AccountRequest accountReq = new AccountRequest("Req-1", AccountRequestMethod.ACCOUNT_CREATE);
            accountReq.setAccountXIDObjectData(account);

            rootRequest.addAccountRequest(accountReq);

            // Set up 2nd request step - OrderCreate, with input from the 1st request step.

            OrderObjectData order = new OrderObjectData();
            order.setCompleteDt            (rightNow);
            order.setContactCompany        (new String("CSG"));
            order.setContactFname          (new String("Derek"));
            order.setContactLname          (new String("Hoover"));
            order.setContactPhone1         (new String("(303) 200-3578"));
            order.setContactPhone2         (new String("(303) 617-4342"));
            order.setContactTitle          (new String("Mr."));
            order.setCreateDt              (rightNow);
            order.setIsLocked              (new Boolean(true));
            order.setOrderNumber           (new String("ORD-NO-1"));
            order.setOrderStatusId         (new Integer(10));
            order.setSalesChannelId        (new Integer(1));
            order.setGenerateWorkflow      (new Boolean(false));

            OrderRequest orderReq = new OrderRequest("Req-2", OrderRequestMethod.ORDER_CREATE);
            orderReq.addInputRequest(new InputRequest("Req-1", AccountRequestRelationship.ACCOUNT__ORDER__REF));
            orderReq.setOrderObjectData(order);

            rootRequest.addOrderRequest(orderReq);

            // Set up 3rd request step - ServiceOrderCreate, with input from the 1st and 2nd request steps.

            ServiceOrderObjectBaseData srvOrder = new ServiceOrderObjectBaseData();
            srvOrder.setServiceOrderTypeId (new Integer(10));
            srvOrder.setOrderStatusId      (new Integer(10));
            srvOrder.setIsServiceLevel     (new Boolean(false));

            ServiceOrderRequest serviceOrderReq = new ServiceOrderRequest("Req-3", ServiceOrderRequestMethod.SERVICE_ORDER_CREATE);
            serviceOrderReq.addInputRequest(new InputRequest("Req-1", AccountRequestRelationship.ACCOUNT__SERVICE_ORDER__REF));
            serviceOrderReq.addInputRequest(new InputRequest("Req-2", OrderRequestRelationship.ORDER__SERVICE_ORDER__REF));
            serviceOrderReq.setServiceOrderObjectBaseData(srvOrder);

            rootRequest.addServiceOrderRequest(serviceOrderReq);

            // Set up 4th request step - ItemCreate, with input from the 1st and 2nd request steps.

            ItemObjectData item = new ItemObjectData();
            item.setMemberInstId2          (new Integer(0));
            item.setMemberType             (new Integer(100));
            item.setItemActionId           (new Integer(10));
            item.setViewId                 (new BigInteger("0"));

            ItemRequest itemReq = new ItemRequest("Req-4", ItemRequestMethod.ITEM_CREATE);
            itemReq.addInputRequest(new InputRequest("Req-1", AccountRequestRelationship.ACCOUNT__ITEM__REF));
            itemReq.addInputRequest(new InputRequest("Req-3", ServiceOrderRequestRelationship.SERVICE_ORDER__ITEM__REF));
            itemReq.setItemObjectData(item);

            rootRequest.addItemRequest(itemReq);

            // Process the CustomerUdt request.

            CustomerUdtRequestBean processor = new CustomerUdtRequestBean(BSDMSettings.getDefault());
            rootRequest = processor.process(BSDMSessionContext.getDefaultContext(), rootRequest);

            // Decode output.

            account = accountReq.getAccountXIDObjectData();
            System.err.println("Account Info");
            System.err.println("------------");
            System.err.println("Account Ext Id:      "+account.getAccountExternalId());
            System.err.println("Account Int Id:      "+account.getAccountInternalId());
            System.err.println("First Name:          "+account.getBillFname());
            System.err.println("Last Name:           "+account.getBillFname());
            System.err.println();

            order = orderReq.getOrderObjectData();
            System.err.println("Order Info");
            System.err.println("----------");
            System.err.println("Order Id:            "+order.getOrderId());
            System.err.println("Account Int Id:      "+order.getAccountInternalId());
            System.err.println("Contact First Name:  "+order.getContactFname());
            System.err.println("Contact Last Name:   "+order.getContactLname());

            srvOrder = serviceOrderReq.getServiceOrderObjectBaseData();
            System.err.println("Service Order Info");
            System.err.println("------------------");
            System.err.println("Service Order Id:    "+srvOrder.getServiceOrderId());
            System.err.println("Order Id:            "+srvOrder.getOrderId());
            System.err.println("Account Int Id:      "+srvOrder.getAccountInternalId());
            System.err.println("Service Order Type:  "+srvOrder.getServiceOrderTypeId());

            item = itemReq.getItemObjectData();
            System.err.println("Item Info");
            System.err.println("---------");
            System.err.println("Item Id:             "+item.getItemId());
            System.err.println("Service Order Id:    "+item.getServiceOrderId());
            System.err.println("Member Inst Id:      "+item.getMemberInstId());
            System.err.println("Member Inst Id2:     "+item.getMemberInstId2());
            System.err.println("Member Type:         "+item.getMemberType());

        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
