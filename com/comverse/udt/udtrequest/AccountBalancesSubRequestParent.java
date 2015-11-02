/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesSubRequestParent.java
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
 * Abstract base class for all AccountBalances related UdtSubRequestParents
 *
 */
public abstract class AccountBalancesSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountAccountBalancesInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_AccountBalances_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemAccountBalancesInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_AccountBalances_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcAccountBalancesInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_AccountBalances_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OpenItemIdMapSubRequestParent as an InputRequest
 * @param inputRequest OpenItemIdMapSubRequestParent to add as InputRequest
 *
 */
    public void addOpenItemIdMapAccountBalancesInputRequest(OpenItemIdMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OpenItemIdMap_AccountBalances_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountAccountBalancesInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_AccountBalances_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcAccountBalancesInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_AccountBalances_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductAccountBalancesInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_AccountBalances_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentSubRequestParent as an InputRequest
 * @param inputRequest PaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentAccountBalancesInputRequest(PaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Payment_AccountBalances_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PrepaymentSubRequestParent as an InputRequest
 * @param inputRequest PrepaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPrepaymentAccountBalancesInputRequest(PrepaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Prepayment_AccountBalances_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductAccountBalancesInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_AccountBalances_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on AccountBalancesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountBalancesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountBalancesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountBalancesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountBalancesAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountBalancesAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_Account_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addAccountBalancesItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addAccountBalancesItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_Item_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addAccountBalancesNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addAccountBalancesNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_Nrc_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addAccountBalancesOpenItemIdMapSubRequest(OpenItemIdMapRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addAccountBalancesOpenItemIdMapSubRequest(OpenItemIdMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addAccountBalancesOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addAccountBalancesOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addAccountBalancesOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addAccountBalancesOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addAccountBalancesOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addAccountBalancesOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_OrderedProduct_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addAccountBalancesPaymentSubRequest(PaymentRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_Payment_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addAccountBalancesPaymentSubRequest(PaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_Payment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addAccountBalancesPrepaymentSubRequest(PrepaymentRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_Prepayment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addAccountBalancesPrepaymentSubRequest(PrepaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_Prepayment_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addAccountBalancesProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "AccountBalances_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addAccountBalancesProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "AccountBalances_Product_Ref");
    }

/**
 *
 * Constructor for AccountBalancesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountBalancesSubRequestParent(String id, String method) {
    super(id, "AccountBalances", method);
  }
}
