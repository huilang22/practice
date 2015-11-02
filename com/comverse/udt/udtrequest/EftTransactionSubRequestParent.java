/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionSubRequestParent.java
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
 * Abstract base class for all EftTransaction related UdtSubRequestParents
 *
 */
public abstract class EftTransactionSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountEftTransactionInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_EftTransaction_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceEftTransactionInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_EftTransaction_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountEftTransactionInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_EftTransaction_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on EftTransactionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EftTransactionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EftTransactionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EftTransactionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addEftTransactionAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "EftTransaction_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addEftTransactionAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "EftTransaction_Account_Ref");
    }
/**
 *
 * Adds a EftTransactionRequest sub request
 * @param subRequest EftTransactionRequest
 *
 */
    public void addEftTransactionOrigEftTransactionSubRequest(EftTransactionRequest subRequest) {
      addSubRequest(subRequest, "EftTransaction_OrigEftTransaction_Ref");
    }
/**
 *
 * Adds a EftTransactionRequest sub request
 * @param subRequest EftTransactionRequest
 *
 */
    public void addEftTransactionOrigEftTransactionSubRequest(EftTransactionSubRequestParent subRequest) {
      addSubRequest(subRequest, "EftTransaction_OrigEftTransaction_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addEftTransactionInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "EftTransaction_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addEftTransactionInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "EftTransaction_Invoice_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addEftTransactionOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "EftTransaction_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addEftTransactionOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "EftTransaction_OrderedAccount_Ref");
    }

/**
 *
 * Constructor for EftTransactionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EftTransactionSubRequestParent(String id, String method) {
    super(id, "EftTransaction", method);
  }
}
