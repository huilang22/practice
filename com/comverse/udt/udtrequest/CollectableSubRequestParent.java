/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectableSubRequestParent.java
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
 * Abstract base class for all Collectable related UdtSubRequestParents
 *
 */
public abstract class CollectableSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountCollectableInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Collectable_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  BalanceLineItemSubRequestParent as an InputRequest
 * @param inputRequest BalanceLineItemSubRequestParent to add as InputRequest
 *
 */
    public void addBalanceLineItemCollectableInputRequest(BalanceLineItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "BalanceLineItem_Collectable_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  EventQueueSubRequestParent as an InputRequest
 * @param inputRequest EventQueueSubRequestParent to add as InputRequest
 *
 */
    public void addEventQueueCollectableInputRequest(EventQueueSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "EventQueue_Collectable_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceCollectableInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_Collectable_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountCollectableInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Collectable_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on CollectableRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CollectableRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CollectableSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CollectableSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addCollectableAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Collectable_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addCollectableAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Collectable_Account_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addCollectableBalanceLineItemSubRequest(BalanceLineItemRequest subRequest) {
      addSubRequest(subRequest, "Collectable_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a BalanceLineItemRequest sub request
 * @param subRequest BalanceLineItemRequest
 *
 */
    public void addCollectableBalanceLineItemSubRequest(BalanceLineItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "Collectable_BalanceLineItem_Ref");
    }
/**
 *
 * Adds a EventQueueRequest sub request
 * @param subRequest EventQueueRequest
 *
 */
    public void addCollectableEventQueueSubRequest(EventQueueRequest subRequest) {
      addSubRequest(subRequest, "Collectable_EventQueue_Ref");
    }
/**
 *
 * Adds a EventQueueRequest sub request
 * @param subRequest EventQueueRequest
 *
 */
    public void addCollectableEventQueueSubRequest(EventQueueSubRequestParent subRequest) {
      addSubRequest(subRequest, "Collectable_EventQueue_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addCollectableInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "Collectable_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addCollectableInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Collectable_Invoice_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addCollectableOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Collectable_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addCollectableOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Collectable_OrderedAccount_Ref");
    }

/**
 *
 * Constructor for CollectableSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CollectableSubRequestParent(String id, String method) {
    super(id, "Collectable", method);
  }
}
