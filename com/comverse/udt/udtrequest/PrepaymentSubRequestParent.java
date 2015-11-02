/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentSubRequestParent.java
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
 * Abstract base class for all Prepayment related UdtSubRequestParents
 *
 */
public abstract class PrepaymentSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountPrepaymentInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Prepayment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountBalancesSubRequestParent as an InputRequest
 * @param inputRequest AccountBalancesSubRequestParent to add as InputRequest
 *
 */
    public void addAccountBalancesPrepaymentInputRequest(AccountBalancesSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountBalances_Prepayment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoicePrepaymentInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_Prepayment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountPrepaymentInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Prepayment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountBalanceSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountBalanceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountBalancePrepaymentInputRequest(OrderedAccountBalanceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccountBalance_Prepayment_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PrepaymentDistributionSubRequestParent as an InputRequest
 * @param inputRequest PrepaymentDistributionSubRequestParent to add as InputRequest
 *
 */
    public void addPrepaymentDistributionPrepaymentInputRequest(PrepaymentDistributionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "PrepaymentDistribution_Prepayment_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on PrepaymentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PrepaymentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PrepaymentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PrepaymentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addPrepaymentAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Prepayment_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addPrepaymentAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Prepayment_Account_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addPrepaymentAccountBalancesSubRequest(AccountBalancesRequest subRequest) {
      addSubRequest(subRequest, "Prepayment_AccountBalances_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addPrepaymentAccountBalancesSubRequest(AccountBalancesSubRequestParent subRequest) {
      addSubRequest(subRequest, "Prepayment_AccountBalances_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addPrepaymentInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "Prepayment_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addPrepaymentInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Prepayment_Invoice_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addPrepaymentOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Prepayment_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addPrepaymentOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Prepayment_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addPrepaymentOrderedAccountBalanceSubRequest(OrderedAccountBalanceRequest subRequest) {
      addSubRequest(subRequest, "Prepayment_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addPrepaymentOrderedAccountBalanceSubRequest(OrderedAccountBalanceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Prepayment_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a PrepaymentDistributionRequest sub request
 * @param subRequest PrepaymentDistributionRequest
 *
 */
    public void addPrepaymentPrepaymentDistributionSubRequest(PrepaymentDistributionRequest subRequest) {
      addSubRequest(subRequest, "Prepayment_PrepaymentDistribution_Ref");
    }
/**
 *
 * Adds a PrepaymentDistributionRequest sub request
 * @param subRequest PrepaymentDistributionRequest
 *
 */
    public void addPrepaymentPrepaymentDistributionSubRequest(PrepaymentDistributionSubRequestParent subRequest) {
      addSubRequest(subRequest, "Prepayment_PrepaymentDistribution_Ref");
    }

/**
 *
 * Constructor for PrepaymentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PrepaymentSubRequestParent(String id, String method) {
    super(id, "Prepayment", method);
  }
}
