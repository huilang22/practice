/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderSubRequestParent.java
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
 * Abstract base class for all Order related UdtSubRequestParents
 *
 */
public abstract class OrderSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Order_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOrderInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Order_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceOrderSubRequestParent as an InputRequest
 * @param inputRequest ServiceOrderSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderOrderInputRequest(ServiceOrderSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ServiceOrder_Order_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OrderRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Order_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Order_Account_Ref");
    }
/**
 *
 * Adds a OrderRequest sub request
 * @param subRequest OrderRequest
 *
 */
    public void addOrderOrderSubRequest(OrderRequest subRequest) {
      addSubRequest(subRequest, "Order_Order_Ref");
    }
/**
 *
 * Adds a OrderRequest sub request
 * @param subRequest OrderRequest
 *
 */
    public void addOrderOrderSubRequest(OrderSubRequestParent subRequest) {
      addSubRequest(subRequest, "Order_Order_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Order_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Order_OrderedAccount_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addOrderServiceOrderSubRequest(ServiceOrderRequest subRequest) {
      addSubRequest(subRequest, "Order_ServiceOrder_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addOrderServiceOrderSubRequest(ServiceOrderSubRequestParent subRequest) {
      addSubRequest(subRequest, "Order_ServiceOrder_Ref");
    }

/**
 *
 * Constructor for OrderSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderSubRequestParent(String id, String method) {
    super(id, "Order", method);
  }
}
