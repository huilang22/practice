/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountBalanceSubRequestParent.java
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
 * Abstract base class for all OrderedAccountBalance related UdtSubRequestParents
 *
 */
public abstract class OrderedAccountBalanceSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderedAccountBalanceInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemOrderedAccountBalanceInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcOrderedAccountBalanceInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OpenItemIdMapSubRequestParent as an InputRequest
 * @param inputRequest OpenItemIdMapSubRequestParent to add as InputRequest
 *
 */
    public void addOpenItemIdMapOrderedAccountBalanceInputRequest(OpenItemIdMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OpenItemIdMap_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOrderedAccountBalanceInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcOrderedAccountBalanceInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductOrderedAccountBalanceInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentSubRequestParent as an InputRequest
 * @param inputRequest PaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentOrderedAccountBalanceInputRequest(PaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Payment_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PrepaymentSubRequestParent as an InputRequest
 * @param inputRequest PrepaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPrepaymentOrderedAccountBalanceInputRequest(PrepaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Prepayment_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductOrderedAccountBalanceInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_OrderedAccountBalance_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OrderedAccountBalanceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedAccountBalanceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedAccountBalanceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedAccountBalanceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountBalanceAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountBalanceAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Account_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedAccountBalanceItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedAccountBalanceItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Item_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedAccountBalanceNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedAccountBalanceNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Nrc_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addOrderedAccountBalanceOpenItemIdMapSubRequest(OpenItemIdMapRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addOrderedAccountBalanceOpenItemIdMapSubRequest(OpenItemIdMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedAccountBalanceOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedAccountBalanceOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedAccountBalanceOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedAccountBalanceOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedAccountBalanceOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedAccountBalanceOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_OrderedProduct_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addOrderedAccountBalancePaymentSubRequest(PaymentRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Payment_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addOrderedAccountBalancePaymentSubRequest(PaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Payment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addOrderedAccountBalancePrepaymentSubRequest(PrepaymentRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Prepayment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addOrderedAccountBalancePrepaymentSubRequest(PrepaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Prepayment_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedAccountBalanceProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedAccountBalanceProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccountBalance_Product_Ref");
    }

/**
 *
 * Constructor for OrderedAccountBalanceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedAccountBalanceSubRequestParent(String id, String method) {
    super(id, "OrderedAccountBalance", method);
  }
}
