/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OrderedAccount related UdtRequests
 *
 */

public abstract class OrderedAccountRequest extends UdtRequest {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderedAccountChildInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OrderedAccount_Child");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderedAccountInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountBalancesSubRequestParent as an InputRequest
 * @param inputRequest AccountBalancesSubRequestParent to add as InputRequest
 *
 */
    public void addAccountBalancesOrderedAccountInputRequest(AccountBalancesSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountBalances_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountCodeGroupSubRequestParent as an InputRequest
 * @param inputRequest AccountCodeGroupSubRequestParent to add as InputRequest
 *
 */
    public void addAccountCodeGroupOrderedAccountInputRequest(AccountCodeGroupSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountCodeGroup_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountHqContractSubRequestParent as an InputRequest
 * @param inputRequest AccountHqContractSubRequestParent to add as InputRequest
 *
 */
    public void addAccountHqContractOrderedAccountInputRequest(AccountHqContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountHqContract_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountIdSubRequestParent as an InputRequest
 * @param inputRequest AccountIdSubRequestParent to add as InputRequest
 *
 */
    public void addAccountIdOrderedAccountInputRequest(AccountIdSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountId_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CollectableSubRequestParent as an InputRequest
 * @param inputRequest CollectableSubRequestParent to add as InputRequest
 *
 */
    public void addCollectableOrderedAccountInputRequest(CollectableSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Collectable_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentSubRequestParent as an InputRequest
 * @param inputRequest ComponentSubRequestParent to add as InputRequest
 *
 */
    public void addComponentOrderedAccountInputRequest(ComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Component_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CorridorSubRequestParent as an InputRequest
 * @param inputRequest CorridorSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorOrderedAccountInputRequest(CorridorSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Corridor_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CorridorSubRequestParent as an InputRequest
 * @param inputRequest CorridorSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorOwningOrderedAccountInputRequest(CorridorSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Corridor_Owning_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CreditCardSubRequestParent as an InputRequest
 * @param inputRequest CreditCardSubRequestParent to add as InputRequest
 *
 */
    public void addCreditCardOrderedAccountInputRequest(CreditCardSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CreditCard_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractOrderedAccountInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractOwningOrderedAccountInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_Owning_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  DepositSubRequestParent as an InputRequest
 * @param inputRequest DepositSubRequestParent to add as InputRequest
 *
 */
    public void addDepositOrderedAccountInputRequest(DepositSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Deposit_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  EftTransactionSubRequestParent as an InputRequest
 * @param inputRequest EftTransactionSubRequestParent to add as InputRequest
 *
 */
    public void addEftTransactionOrderedAccountInputRequest(EftTransactionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "EftTransaction_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InterimBillSubRequestParent as an InputRequest
 * @param inputRequest InterimBillSubRequestParent to add as InputRequest
 *
 */
    public void addInterimBillOrderedAccountInputRequest(InterimBillSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InterimBill_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementOrderedAccountInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementReservingOrderedAccountInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_Reserving_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceOrderedAccountInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemOrderedAccountInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcOrderedAccountInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OpenItemIdMapSubRequestParent as an InputRequest
 * @param inputRequest OpenItemIdMapSubRequestParent to add as InputRequest
 *
 */
    public void addOpenItemIdMapBalanceOrderedAccountInputRequest(OpenItemIdMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OpenItemIdMap_Balance_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OpenItemIdMapSubRequestParent as an InputRequest
 * @param inputRequest OpenItemIdMapSubRequestParent to add as InputRequest
 *
 */
    public void addOpenItemIdMapOrderedAccountInputRequest(OpenItemIdMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OpenItemIdMap_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderSubRequestParent as an InputRequest
 * @param inputRequest OrderSubRequestParent to add as InputRequest
 *
 */
    public void addOrderOrderedAccountInputRequest(OrderSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Order_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountBalanceSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountBalanceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountBalanceOrderedAccountInputRequest(OrderedAccountBalanceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccountBalance_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedComponentSubRequestParent as an InputRequest
 * @param inputRequest OrderedComponentSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedComponentOrderedAccountInputRequest(OrderedComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedComponent_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractOwningOrderedAccountInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_Owning_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryOrderedAccountInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryReservingOrderedAccountInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_Reserving_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcOrderedAccountInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedPackageSubRequestParent as an InputRequest
 * @param inputRequest OrderedPackageSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedPackageOrderedAccountInputRequest(OrderedPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedPackage_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductBillToOrderedAccountInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_BillTo_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductOrderedAccountInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceOrderedAccountInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentSubRequestParent as an InputRequest
 * @param inputRequest PaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentOrderedAccountInputRequest(PaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Payment_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PrepaymentSubRequestParent as an InputRequest
 * @param inputRequest PrepaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPrepaymentOrderedAccountInputRequest(PrepaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Prepayment_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductBillToOrderedAccountInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_BillTo_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductOrderedAccountInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductPackageSubRequestParent as an InputRequest
 * @param inputRequest ProductPackageSubRequestParent to add as InputRequest
 *
 */
    public void addProductPackageOrderedAccountInputRequest(ProductPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ProductPackage_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  RefundSubRequestParent as an InputRequest
 * @param inputRequest RefundSubRequestParent to add as InputRequest
 *
 */
    public void addRefundOrderedAccountInputRequest(RefundSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Refund_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderedAccountInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceOrderSubRequestParent as an InputRequest
 * @param inputRequest ServiceOrderSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderOrderedAccountInputRequest(ServiceOrderSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ServiceOrder_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  TaxExemptionSubRequestParent as an InputRequest
 * @param inputRequest TaxExemptionSubRequestParent to add as InputRequest
 *
 */
    public void addTaxExemptionOrderedAccountInputRequest(TaxExemptionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "TaxExemption_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  UnbilledUsageSubRequestParent as an InputRequest
 * @param inputRequest UnbilledUsageSubRequestParent to add as InputRequest
 *
 */
    public void addUnbilledUsageOrderedAccountInputRequest(UnbilledUsageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "UnbilledUsage_OrderedAccount_Ref");
      irList.add(inReq);
    }
/**
 *
 * Constructor for OrderedAccountRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public OrderedAccountRequest(String id, String method) {
    super(id, "OrderedAccount", method);
  }
}
