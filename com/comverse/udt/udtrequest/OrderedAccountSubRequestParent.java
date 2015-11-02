/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountSubRequestParent.java
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
 * Abstract base class for all OrderedAccount related UdtSubRequestParents
 *
 */
public abstract class OrderedAccountSubRequestParent extends UdtSubRequestParent {

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
 * Adds SelfRequest based on OrderedAccountRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedAccountRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedAccountSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedAccountSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountAccountChildSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Account_Child_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountAccountChildSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Account_Child_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountAccountParentSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Account_Parent_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountAccountParentSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Account_Parent_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountChildSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Child");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountChildSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Child");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountParentSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Parent");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedAccountParentSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Parent");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addOrderedAccountAccountBalancesSubRequest(AccountBalancesRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_AccountBalances_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addOrderedAccountAccountBalancesSubRequest(AccountBalancesSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_AccountBalances_Ref");
    }
/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addOrderedAccountAccountCodeGroupSubRequest(AccountCodeGroupRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_AccountCodeGroup_Ref");
    }
/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addOrderedAccountAccountCodeGroupSubRequest(AccountCodeGroupSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_AccountCodeGroup_Ref");
    }
/**
 *
 * Adds a AccountHqContractRequest sub request
 * @param subRequest AccountHqContractRequest
 *
 */
    public void addOrderedAccountAccountHqContractSubRequest(AccountHqContractRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_AccountHqContract_Ref");
    }
/**
 *
 * Adds a AccountHqContractRequest sub request
 * @param subRequest AccountHqContractRequest
 *
 */
    public void addOrderedAccountAccountHqContractSubRequest(AccountHqContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_AccountHqContract_Ref");
    }
/**
 *
 * Adds a AccountIdRequest sub request
 * @param subRequest AccountIdRequest
 *
 */
    public void addOrderedAccountAccountIdSubRequest(AccountIdRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_AccountId_Ref");
    }
/**
 *
 * Adds a AccountIdRequest sub request
 * @param subRequest AccountIdRequest
 *
 */
    public void addOrderedAccountAccountIdSubRequest(AccountIdSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_AccountId_Ref");
    }
/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addOrderedAccountCollectableSubRequest(CollectableRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Collectable_Ref");
    }
/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addOrderedAccountCollectableSubRequest(CollectableSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Collectable_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addOrderedAccountComponentSubRequest(ComponentRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Component_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addOrderedAccountComponentSubRequest(ComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Component_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addOrderedAccountCorridorSubRequest(CorridorRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Corridor_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addOrderedAccountCorridorSubRequest(CorridorSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Corridor_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addOrderedAccountOwnedCorridorSubRequest(CorridorRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Owned_Corridor_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addOrderedAccountOwnedCorridorSubRequest(CorridorSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Owned_Corridor_Ref");
    }
/**
 *
 * Adds a CreditCardRequest sub request
 * @param subRequest CreditCardRequest
 *
 */
    public void addOrderedAccountCreditCardSubRequest(CreditCardRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_CreditCard_Ref");
    }
/**
 *
 * Adds a CreditCardRequest sub request
 * @param subRequest CreditCardRequest
 *
 */
    public void addOrderedAccountCreditCardSubRequest(CreditCardSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_CreditCard_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOrderedAccountCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOrderedAccountCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_CustomerContract_Ref");
    }
/**
 *
 * Adds a DepositRequest sub request
 * @param subRequest DepositRequest
 *
 */
    public void addOrderedAccountDepositSubRequest(DepositRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Deposit_Ref");
    }
/**
 *
 * Adds a DepositRequest sub request
 * @param subRequest DepositRequest
 *
 */
    public void addOrderedAccountDepositSubRequest(DepositSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Deposit_Ref");
    }
/**
 *
 * Adds a EftTransactionRequest sub request
 * @param subRequest EftTransactionRequest
 *
 */
    public void addOrderedAccountEftTransactionSubRequest(EftTransactionRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_EftTransaction_Ref");
    }
/**
 *
 * Adds a EftTransactionRequest sub request
 * @param subRequest EftTransactionRequest
 *
 */
    public void addOrderedAccountEftTransactionSubRequest(EftTransactionSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_EftTransaction_Ref");
    }
/**
 *
 * Adds a InterimBillRequest sub request
 * @param subRequest InterimBillRequest
 *
 */
    public void addOrderedAccountInterimBillSubRequest(InterimBillRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_InterimBill_Ref");
    }
/**
 *
 * Adds a InterimBillRequest sub request
 * @param subRequest InterimBillRequest
 *
 */
    public void addOrderedAccountInterimBillSubRequest(InterimBillSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_InterimBill_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedAccountInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedAccountInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedAccountReservedInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Reserved_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedAccountReservedInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Reserved_InvElement_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addOrderedAccountInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addOrderedAccountInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Invoice_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedAccountItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedAccountItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Item_Ref");
    }
/**
 *
 * Adds a NoteRequest sub request
 * @param subRequest NoteRequest
 *
 */
    public void addOrderedAccountNoteSubRequest(NoteRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Note_Ref");
    }
/**
 *
 * Adds a NoteRequest sub request
 * @param subRequest NoteRequest
 *
 */
    public void addOrderedAccountNoteSubRequest(NoteSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Note_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedAccountNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedAccountNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Nrc_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addOrderedAccountOpenItemIdMapBalanceAccountSubRequest(OpenItemIdMapRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OpenItemIdMap_Balance_Account_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addOrderedAccountOpenItemIdMapBalanceAccountSubRequest(OpenItemIdMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OpenItemIdMap_Balance_Account_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addOrderedAccountOpenItemIdMapSubRequest(OpenItemIdMapRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addOrderedAccountOpenItemIdMapSubRequest(OpenItemIdMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OrderRequest sub request
 * @param subRequest OrderRequest
 *
 */
    public void addOrderedAccountOrderSubRequest(OrderRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Order_Ref");
    }
/**
 *
 * Adds a OrderRequest sub request
 * @param subRequest OrderRequest
 *
 */
    public void addOrderedAccountOrderSubRequest(OrderSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Order_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedAccountOrderedAccountChildSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedAccount_Child_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedAccountOrderedAccountChildSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedAccount_Child_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedAccountOrderedAccountParentSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedAccount_Parent_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedAccountOrderedAccountParentSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedAccount_Parent_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addOrderedAccountOrderedAccountBalanceSubRequest(OrderedAccountBalanceRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addOrderedAccountOrderedAccountBalanceSubRequest(OrderedAccountBalanceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addOrderedAccountOrderedComponentSubRequest(OrderedComponentRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addOrderedAccountOrderedComponentSubRequest(OrderedComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOrderedAccountOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOrderedAccountOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedAccountOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedAccountOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedAccountReservedOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Reserved_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedAccountReservedOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Reserved_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedAccountOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedAccountOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addOrderedAccountOrderedPackageSubRequest(OrderedPackageRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addOrderedAccountOrderedPackageSubRequest(OrderedPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedAccountOrderedProductBillingSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedProduct_Billing_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedAccountOrderedProductBillingSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedProduct_Billing_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedAccountOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedAccountOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedAccountOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedAccountOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_OrderedService_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addOrderedAccountPaymentSubRequest(PaymentRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Payment_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addOrderedAccountPaymentSubRequest(PaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Payment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addOrderedAccountPrepaymentSubRequest(PrepaymentRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Prepayment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addOrderedAccountPrepaymentSubRequest(PrepaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Prepayment_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedAccountProductBillingSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Product_Billing_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedAccountProductBillingSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Product_Billing_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedAccountProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedAccountProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Product_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addOrderedAccountProductPackageSubRequest(ProductPackageRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_ProductPackage_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addOrderedAccountProductPackageSubRequest(ProductPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_ProductPackage_Ref");
    }
/**
 *
 * Adds a RefundRequest sub request
 * @param subRequest RefundRequest
 *
 */
    public void addOrderedAccountRefundSubRequest(RefundRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Refund_Ref");
    }
/**
 *
 * Adds a RefundRequest sub request
 * @param subRequest RefundRequest
 *
 */
    public void addOrderedAccountRefundSubRequest(RefundSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Refund_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedAccountServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedAccountServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_Service_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addOrderedAccountServiceOrderSubRequest(ServiceOrderRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_ServiceOrder_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addOrderedAccountServiceOrderSubRequest(ServiceOrderSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_ServiceOrder_Ref");
    }
/**
 *
 * Adds a TaxExemptionRequest sub request
 * @param subRequest TaxExemptionRequest
 *
 */
    public void addOrderedAccountTaxExemptionSubRequest(TaxExemptionRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_TaxExemption_Ref");
    }
/**
 *
 * Adds a TaxExemptionRequest sub request
 * @param subRequest TaxExemptionRequest
 *
 */
    public void addOrderedAccountTaxExemptionSubRequest(TaxExemptionSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_TaxExemption_Ref");
    }
/**
 *
 * Adds a UnbilledUsageRequest sub request
 * @param subRequest UnbilledUsageRequest
 *
 */
    public void addOrderedAccountUnbilledUsageSubRequest(UnbilledUsageRequest subRequest) {
      addSubRequest(subRequest, "OrderedAccount_UnbilledUsage_Ref");
    }
/**
 *
 * Adds a UnbilledUsageRequest sub request
 * @param subRequest UnbilledUsageRequest
 *
 */
    public void addOrderedAccountUnbilledUsageSubRequest(UnbilledUsageSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedAccount_UnbilledUsage_Ref");
    }

/**
 *
 * Constructor for OrderedAccountSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedAccountSubRequestParent(String id, String method) {
    super(id, "OrderedAccount", method);
  }
}
