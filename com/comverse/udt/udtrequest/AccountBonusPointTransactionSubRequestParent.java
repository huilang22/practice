/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionSubRequestParent.java
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
 * Abstract base class for all AccountBonusPointTransaction related UdtSubRequestParents
 *
 */
public abstract class AccountBonusPointTransactionSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountAccountBonusPointTransactionInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_AccountBonusPointTransaction_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceAccountBonusPointTransactionInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_AccountBonusPointTransaction_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on AccountBonusPointTransactionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountBonusPointTransactionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountBonusPointTransactionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountBonusPointTransactionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountBonusPointTransactionAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "AccountBonusPointTransaction_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountBonusPointTransactionAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBonusPointTransaction_Account_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addAccountBonusPointTransactionInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "AccountBonusPointTransaction_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addAccountBonusPointTransactionInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBonusPointTransaction_Invoice_Ref");
    }

/**
 *
 * Constructor for AccountBonusPointTransactionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountBonusPointTransactionSubRequestParent(String id, String method) {
    super(id, "AccountBonusPointTransaction", method);
  }
}
