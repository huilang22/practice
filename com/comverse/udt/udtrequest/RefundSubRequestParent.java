/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundSubRequestParent.java
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
 * Abstract base class for all Refund related UdtSubRequestParents
 *
 */
public abstract class RefundSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountRefundInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Refund_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ContactSubRequestParent as an InputRequest
 * @param inputRequest ContactSubRequestParent to add as InputRequest
 *
 */
    public void addContactRefundInputRequest(ContactSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Contact_Refund_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountRefundInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Refund_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on RefundRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RefundRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RefundSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RefundSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addRefundAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Refund_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addRefundAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Refund_Account_Ref");
    }
/**
 *
 * Adds a ContactRequest sub request
 * @param subRequest ContactRequest
 *
 */
    public void addRefundContactSubRequest(ContactRequest subRequest) {
      addSubRequest(subRequest, "Refund_Contact_Ref");
    }
/**
 *
 * Adds a ContactRequest sub request
 * @param subRequest ContactRequest
 *
 */
    public void addRefundContactSubRequest(ContactSubRequestParent subRequest) {
      addSubRequest(subRequest, "Refund_Contact_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addRefundOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Refund_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addRefundOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Refund_OrderedAccount_Ref");
    }

/**
 *
 * Constructor for RefundSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RefundSubRequestParent(String id, String method) {
    super(id, "Refund", method);
  }
}
