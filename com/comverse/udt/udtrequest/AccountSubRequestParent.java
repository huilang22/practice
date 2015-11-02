/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSubRequestParent.java
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
 * Abstract base class for all Account related UdtSubRequestParents
 *
 */
public abstract class AccountSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountBalancesSubRequestParent as an InputRequest
 * @param inputRequest AccountBalancesSubRequestParent to add as InputRequest
 *
 */
    public void addAccountBalancesAccountInputRequest(AccountBalancesSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountBalances_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountBonusPointTransactionSubRequestParent as an InputRequest
 * @param inputRequest AccountBonusPointTransactionSubRequestParent to add as InputRequest
 *
 */
    public void addAccountBonusPointTransactionAccountInputRequest(AccountBonusPointTransactionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountBonusPointTransaction_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountCodeGroupSubRequestParent as an InputRequest
 * @param inputRequest AccountCodeGroupSubRequestParent to add as InputRequest
 *
 */
    public void addAccountCodeGroupAccountInputRequest(AccountCodeGroupSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountCodeGroup_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountHqContractSubRequestParent as an InputRequest
 * @param inputRequest AccountHqContractSubRequestParent to add as InputRequest
 *
 */
    public void addAccountHqContractAccountInputRequest(AccountHqContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountHqContract_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountIdSubRequestParent as an InputRequest
 * @param inputRequest AccountIdSubRequestParent to add as InputRequest
 *
 */
    public void addAccountIdAccountInputRequest(AccountIdSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountId_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CollectableSubRequestParent as an InputRequest
 * @param inputRequest CollectableSubRequestParent to add as InputRequest
 *
 */
    public void addCollectableAccountInputRequest(CollectableSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Collectable_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentSubRequestParent as an InputRequest
 * @param inputRequest ComponentSubRequestParent to add as InputRequest
 *
 */
    public void addComponentAccountInputRequest(ComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Component_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CorridorSubRequestParent as an InputRequest
 * @param inputRequest CorridorSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorAccountInputRequest(CorridorSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Corridor_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CorridorSubRequestParent as an InputRequest
 * @param inputRequest CorridorSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorOwningAccountInputRequest(CorridorSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Corridor_Owning_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CreditCardSubRequestParent as an InputRequest
 * @param inputRequest CreditCardSubRequestParent to add as InputRequest
 *
 */
    public void addCreditCardAccountInputRequest(CreditCardSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CreditCard_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractAccountInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractOwningAccountInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_Owning_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerServiceCenterSubRequestParent as an InputRequest
 * @param inputRequest CustomerServiceCenterSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerServiceCenterAccountInputRequest(CustomerServiceCenterSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerServiceCenter_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  DepositSubRequestParent as an InputRequest
 * @param inputRequest DepositSubRequestParent to add as InputRequest
 *
 */
    public void addDepositAccountInputRequest(DepositSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Deposit_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  EftTransactionSubRequestParent as an InputRequest
 * @param inputRequest EftTransactionSubRequestParent to add as InputRequest
 *
 */
    public void addEftTransactionAccountInputRequest(EftTransactionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "EftTransaction_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InterimBillSubRequestParent as an InputRequest
 * @param inputRequest InterimBillSubRequestParent to add as InputRequest
 *
 */
    public void addInterimBillAccountInputRequest(InterimBillSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InterimBill_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementAccountInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementReservingAccountInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_Reserving_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvoiceSubRequestParent as an InputRequest
 * @param inputRequest InvoiceSubRequestParent to add as InputRequest
 *
 */
    public void addInvoiceAccountInputRequest(InvoiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Invoice_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemAccountInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcAccountInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OpenItemIdMapSubRequestParent as an InputRequest
 * @param inputRequest OpenItemIdMapSubRequestParent to add as InputRequest
 *
 */
    public void addOpenItemIdMapAccountInputRequest(OpenItemIdMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OpenItemIdMap_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OpenItemIdMapSubRequestParent as an InputRequest
 * @param inputRequest OpenItemIdMapSubRequestParent to add as InputRequest
 *
 */
    public void addOpenItemIdMapBalanceAccountInputRequest(OpenItemIdMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OpenItemIdMap_Balance_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderSubRequestParent as an InputRequest
 * @param inputRequest OrderSubRequestParent to add as InputRequest
 *
 */
    public void addOrderAccountInputRequest(OrderSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Order_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountAccountChildInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Account_Child_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountAccountParentInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Account_Parent_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountChildInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Child");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountParentInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Parent");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountBalanceSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountBalanceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountBalanceAccountInputRequest(OrderedAccountBalanceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccountBalance_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedComponentSubRequestParent as an InputRequest
 * @param inputRequest OrderedComponentSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedComponentAccountInputRequest(OrderedComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedComponent_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractAccountInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractOwningAccountInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_Owning_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addInvElementAccountInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryReservingAccountInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_Reserving_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcAccountInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedPackageSubRequestParent as an InputRequest
 * @param inputRequest OrderedPackageSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedPackageAccountInputRequest(OrderedPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedPackage_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductAccountInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductBillToAccountInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_BillTo_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceAccountInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PaymentSubRequestParent as an InputRequest
 * @param inputRequest PaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPaymentAccountInputRequest(PaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Payment_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  PrepaymentSubRequestParent as an InputRequest
 * @param inputRequest PrepaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPrepaymentAccountInputRequest(PrepaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Prepayment_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductAccountInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductBillToAccountInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_BillTo_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductPackageSubRequestParent as an InputRequest
 * @param inputRequest ProductPackageSubRequestParent to add as InputRequest
 *
 */
    public void addProductPackageAccountInputRequest(ProductPackageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ProductPackage_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  RefundSubRequestParent as an InputRequest
 * @param inputRequest RefundSubRequestParent to add as InputRequest
 *
 */
    public void addRefundAccountInputRequest(RefundSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Refund_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceAccountInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceOrderSubRequestParent as an InputRequest
 * @param inputRequest ServiceOrderSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderAccountInputRequest(ServiceOrderSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ServiceOrder_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  TaxExemptionSubRequestParent as an InputRequest
 * @param inputRequest TaxExemptionSubRequestParent to add as InputRequest
 *
 */
    public void addTaxExemptionAccountInputRequest(TaxExemptionSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "TaxExemption_Account_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  UnbilledUsageSubRequestParent as an InputRequest
 * @param inputRequest UnbilledUsageSubRequestParent to add as InputRequest
 *
 */
    public void addUnbilledUsageAccountInputRequest(UnbilledUsageSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "UnbilledUsage_Account_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on AccountRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AccountSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AccountSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountChildSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Account_Child");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountChildSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Child");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountParentSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Account_Parent");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addAccountParentSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Parent");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addAccountAccountBalancesSubRequest(AccountBalancesRequest subRequest) {
      addSubRequest(subRequest, "Account_AccountBalances_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addAccountAccountBalancesSubRequest(AccountBalancesSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_AccountBalances_Ref");
    }
/**
 *
 * Adds a AccountBonusPointTransactionRequest sub request
 * @param subRequest AccountBonusPointTransactionRequest
 *
 */
    public void addAccountAccountBonusPointTransactionSubRequest(AccountBonusPointTransactionRequest subRequest) {
      addSubRequest(subRequest, "Account_AccountBonusPointTransaction_Ref");
    }
/**
 *
 * Adds a AccountBonusPointTransactionRequest sub request
 * @param subRequest AccountBonusPointTransactionRequest
 *
 */
    public void addAccountAccountBonusPointTransactionSubRequest(AccountBonusPointTransactionSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_AccountBonusPointTransaction_Ref");
    }
/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addAccountAccountCodeGroupSubRequest(AccountCodeGroupRequest subRequest) {
      addSubRequest(subRequest, "Account_AccountCodeGroup_Ref");
    }
/**
 *
 * Adds a AccountCodeGroupRequest sub request
 * @param subRequest AccountCodeGroupRequest
 *
 */
    public void addAccountAccountCodeGroupSubRequest(AccountCodeGroupSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_AccountCodeGroup_Ref");
    }
/**
 *
 * Adds a AccountHqContractRequest sub request
 * @param subRequest AccountHqContractRequest
 *
 */
    public void addAccountAccountHqContractSubRequest(AccountHqContractRequest subRequest) {
      addSubRequest(subRequest, "Account_AccountHqContract_Ref");
    }
/**
 *
 * Adds a AccountHqContractRequest sub request
 * @param subRequest AccountHqContractRequest
 *
 */
    public void addAccountAccountHqContractSubRequest(AccountHqContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_AccountHqContract_Ref");
    }
/**
 *
 * Adds a AccountIdRequest sub request
 * @param subRequest AccountIdRequest
 *
 */
    public void addAccountAccountIdSubRequest(AccountIdRequest subRequest) {
      addSubRequest(subRequest, "Account_AccountId_Ref");
    }
/**
 *
 * Adds a AccountIdRequest sub request
 * @param subRequest AccountIdRequest
 *
 */
    public void addAccountAccountIdSubRequest(AccountIdSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_AccountId_Ref");
    }
/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addAccountCollectableSubRequest(CollectableRequest subRequest) {
      addSubRequest(subRequest, "Account_Collectable_Ref");
    }
/**
 *
 * Adds a CollectableRequest sub request
 * @param subRequest CollectableRequest
 *
 */
    public void addAccountCollectableSubRequest(CollectableSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Collectable_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addAccountComponentSubRequest(ComponentRequest subRequest) {
      addSubRequest(subRequest, "Account_Component_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addAccountComponentSubRequest(ComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Component_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addAccountCorridorSubRequest(CorridorRequest subRequest) {
      addSubRequest(subRequest, "Account_Corridor_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addAccountCorridorSubRequest(CorridorSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Corridor_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addAccountOwnedCorridorSubRequest(CorridorRequest subRequest) {
      addSubRequest(subRequest, "Account_Owned_Corridor_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addAccountOwnedCorridorSubRequest(CorridorSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Owned_Corridor_Ref");
    }
/**
 *
 * Adds a CreditCardRequest sub request
 * @param subRequest CreditCardRequest
 *
 */
    public void addAccountCreditCardSubRequest(CreditCardRequest subRequest) {
      addSubRequest(subRequest, "Account_CreditCard_Ref");
    }
/**
 *
 * Adds a CreditCardRequest sub request
 * @param subRequest CreditCardRequest
 *
 */
    public void addAccountCreditCardSubRequest(CreditCardSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_CreditCard_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addAccountCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "Account_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addAccountCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerServiceCenterRequest sub request
 * @param subRequest CustomerServiceCenterRequest
 *
 */
    public void addAccountCustomerServiceCenterSubRequest(CustomerServiceCenterRequest subRequest) {
      addSubRequest(subRequest, "Account_CustomerServiceCenter_Ref");
    }
/**
 *
 * Adds a CustomerServiceCenterRequest sub request
 * @param subRequest CustomerServiceCenterRequest
 *
 */
    public void addAccountCustomerServiceCenterSubRequest(CustomerServiceCenterSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_CustomerServiceCenter_Ref");
    }
/**
 *
 * Adds a DepositRequest sub request
 * @param subRequest DepositRequest
 *
 */
    public void addAccountDepositSubRequest(DepositRequest subRequest) {
      addSubRequest(subRequest, "Account_Deposit_Ref");
    }
/**
 *
 * Adds a DepositRequest sub request
 * @param subRequest DepositRequest
 *
 */
    public void addAccountDepositSubRequest(DepositSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Deposit_Ref");
    }
/**
 *
 * Adds a EftTransactionRequest sub request
 * @param subRequest EftTransactionRequest
 *
 */
    public void addAccountEftTransactionSubRequest(EftTransactionRequest subRequest) {
      addSubRequest(subRequest, "Account_EftTransaction_Ref");
    }
/**
 *
 * Adds a EftTransactionRequest sub request
 * @param subRequest EftTransactionRequest
 *
 */
    public void addAccountEftTransactionSubRequest(EftTransactionSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_EftTransaction_Ref");
    }
/**
 *
 * Adds a InterimBillRequest sub request
 * @param subRequest InterimBillRequest
 *
 */
    public void addAccountInterimBillSubRequest(InterimBillRequest subRequest) {
      addSubRequest(subRequest, "Account_InterimBill_Ref");
    }
/**
 *
 * Adds a InterimBillRequest sub request
 * @param subRequest InterimBillRequest
 *
 */
    public void addAccountInterimBillSubRequest(InterimBillSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_InterimBill_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addAccountInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "Account_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addAccountInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addAccountReservedInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "Account_Reserved_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addAccountReservedInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Reserved_InvElement_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addAccountInvoiceSubRequest(InvoiceRequest subRequest) {
      addSubRequest(subRequest, "Account_Invoice_Ref");
    }
/**
 *
 * Adds a InvoiceRequest sub request
 * @param subRequest InvoiceRequest
 *
 */
    public void addAccountInvoiceSubRequest(InvoiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Invoice_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addAccountItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "Account_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addAccountItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Item_Ref");
    }
/**
 *
 * Adds a NoteRequest sub request
 * @param subRequest NoteRequest
 *
 */
    public void addAccountNoteSubRequest(NoteRequest subRequest) {
      addSubRequest(subRequest, "Account_Note_Ref");
    }
/**
 *
 * Adds a NoteRequest sub request
 * @param subRequest NoteRequest
 *
 */
    public void addAccountNoteSubRequest(NoteSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Note_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addAccountNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "Account_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addAccountNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Nrc_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addAccountOpenItemIdMapBalanceAccountSubRequest(OpenItemIdMapRequest subRequest) {
      addSubRequest(subRequest, "Account_OpenItemIdMap_Balance_Account_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addAccountOpenItemIdMapBalanceAccountSubRequest(OpenItemIdMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OpenItemIdMap_Balance_Account_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addAccountOpenItemIdMapSubRequest(OpenItemIdMapRequest subRequest) {
      addSubRequest(subRequest, "Account_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addAccountOpenItemIdMapSubRequest(OpenItemIdMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OrderRequest sub request
 * @param subRequest OrderRequest
 *
 */
    public void addAccountOrderSubRequest(OrderRequest subRequest) {
      addSubRequest(subRequest, "Account_Order_Ref");
    }
/**
 *
 * Adds a OrderRequest sub request
 * @param subRequest OrderRequest
 *
 */
    public void addAccountOrderSubRequest(OrderSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Order_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addAccountOrderedAccountChildSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedAccount_Child");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addAccountOrderedAccountChildSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedAccount_Child");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addAccountOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addAccountOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addAccountOrderedAccountBalanceSubRequest(OrderedAccountBalanceRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addAccountOrderedAccountBalanceSubRequest(OrderedAccountBalanceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addAccountOrderedComponentSubRequest(OrderedComponentRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addAccountOrderedComponentSubRequest(OrderedComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addAccountOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addAccountOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addAccountOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addAccountOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addAccountReservedOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "Account_Reserved_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addAccountReservedOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Reserved_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addAccountOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addAccountOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addAccountOrderedPackageSubRequest(OrderedPackageRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedPackageRequest sub request
 * @param subRequest OrderedPackageRequest
 *
 */
    public void addAccountOrderedPackageSubRequest(OrderedPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedPackage_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addAccountOrderedProductBillingSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedProduct_Billing_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addAccountOrderedProductBillingSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedProduct_Billing_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addAccountOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addAccountOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addAccountOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "Account_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addAccountOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_OrderedService_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addAccountPaymentSubRequest(PaymentRequest subRequest) {
      addSubRequest(subRequest, "Account_Payment_Ref");
    }
/**
 *
 * Adds a PaymentRequest sub request
 * @param subRequest PaymentRequest
 *
 */
    public void addAccountPaymentSubRequest(PaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Payment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addAccountPrepaymentSubRequest(PrepaymentRequest subRequest) {
      addSubRequest(subRequest, "Account_Prepayment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addAccountPrepaymentSubRequest(PrepaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Prepayment_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addAccountProductBillingSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "Account_Product_Billing_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addAccountProductBillingSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Product_Billing_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addAccountProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "Account_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addAccountProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Product_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addAccountProductPackageSubRequest(ProductPackageRequest subRequest) {
      addSubRequest(subRequest, "Account_ProductPackage_Ref");
    }
/**
 *
 * Adds a ProductPackageRequest sub request
 * @param subRequest ProductPackageRequest
 *
 */
    public void addAccountProductPackageSubRequest(ProductPackageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_ProductPackage_Ref");
    }
/**
 *
 * Adds a RefundRequest sub request
 * @param subRequest RefundRequest
 *
 */
    public void addAccountRefundSubRequest(RefundRequest subRequest) {
      addSubRequest(subRequest, "Account_Refund_Ref");
    }
/**
 *
 * Adds a RefundRequest sub request
 * @param subRequest RefundRequest
 *
 */
    public void addAccountRefundSubRequest(RefundSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Refund_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addAccountServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "Account_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addAccountServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_Service_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addAccountServiceOrderSubRequest(ServiceOrderRequest subRequest) {
      addSubRequest(subRequest, "Account_ServiceOrder_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addAccountServiceOrderSubRequest(ServiceOrderSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_ServiceOrder_Ref");
    }
/**
 *
 * Adds a TaxExemptionRequest sub request
 * @param subRequest TaxExemptionRequest
 *
 */
    public void addAccountTaxExemptionSubRequest(TaxExemptionRequest subRequest) {
      addSubRequest(subRequest, "Account_TaxExemption_Ref");
    }
/**
 *
 * Adds a TaxExemptionRequest sub request
 * @param subRequest TaxExemptionRequest
 *
 */
    public void addAccountTaxExemptionSubRequest(TaxExemptionSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_TaxExemption_Ref");
    }
/**
 *
 * Adds a UnbilledUsageRequest sub request
 * @param subRequest UnbilledUsageRequest
 *
 */
    public void addAccountUnbilledUsageSubRequest(UnbilledUsageRequest subRequest) {
      addSubRequest(subRequest, "Account_UnbilledUsage_Ref");
    }
/**
 *
 * Adds a UnbilledUsageRequest sub request
 * @param subRequest UnbilledUsageRequest
 *
 */
    public void addAccountUnbilledUsageSubRequest(UnbilledUsageSubRequestParent subRequest) {
      addSubRequest(subRequest, "Account_UnbilledUsage_Ref");
    }

/**
 *
 * Constructor for AccountSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AccountSubRequestParent(String id, String method) {
    super(id, "Account", method);
  }
}
