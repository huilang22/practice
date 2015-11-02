/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillSubRequestParent.java
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
 * Abstract base class for all InterimBill related UdtSubRequestParents
 *
 */
public abstract class InterimBillSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountInterimBillInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_InterimBill_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceInterimBillInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_InterimBill_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountInterimBillInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_InterimBill_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on InterimBillRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InterimBillRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InterimBillSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InterimBillSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addInterimBillAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "InterimBill_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addInterimBillAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "InterimBill_Account_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addInterimBillInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "InterimBill_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addInterimBillInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "InterimBill_Invoice_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addInterimBillOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "InterimBill_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addInterimBillOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "InterimBill_OrderedAccount_Ref");
    }

/**
 *
 * Constructor for InterimBillSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InterimBillSubRequestParent(String id, String method) {
    super(id, "InterimBill", method);
  }
}
