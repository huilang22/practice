/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceOrder related UdtSubRequestParents
 *
 */
public abstract class ServiceOrderSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountServiceOrderInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_ServiceOrder_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemServiceOrderInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_ServiceOrder_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderSubRequestParent as an InputRequest
 * @param inputRequest OrderSubRequestParent to add as InputRequest
 *
 */
    public void addOrderServiceOrderInputRequest(OrderSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Order_ServiceOrder_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountServiceOrderInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_ServiceOrder_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceServiceOrderInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_ServiceOrder_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceServiceOrderInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_ServiceOrder_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ServiceOrderRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceOrderSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceOrderSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addServiceOrderAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "ServiceOrder_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addServiceOrderAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceOrder_Account_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addServiceOrderItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "ServiceOrder_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addServiceOrderItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceOrder_Item_Ref");
    }
/**
 *
 * Adds a OrderRequest sub request
 * @param subRequest OrderRequest
 *
 */
    public void addServiceOrderOrderSubRequest(OrderRequest subRequest) {
      addSubRequest(subRequest, "ServiceOrder_Order_Ref");
    }
/**
 *
 * Adds a OrderRequest sub request
 * @param subRequest OrderRequest
 *
 */
    public void addServiceOrderOrderSubRequest(OrderSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceOrder_Order_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addServiceOrderOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "ServiceOrder_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addServiceOrderOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceOrder_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addServiceOrderOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "ServiceOrder_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addServiceOrderOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceOrder_OrderedService_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addServiceOrderServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "ServiceOrder_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addServiceOrderServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "ServiceOrder_Service_Ref");
    }

/**
 *
 * Constructor for ServiceOrderSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceOrderSubRequestParent(String id, String method) {
    super(id, "ServiceOrder", method);
  }
}
