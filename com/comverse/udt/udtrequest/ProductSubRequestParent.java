/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductSubRequestParent.java
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
 * Abstract base class for all Product related UdtSubRequestParents
 *
 */
public abstract class ProductSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountProductBillingInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Product_Billing_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountProductInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountBalancesSubRequestParent as an InputRequest
 * @param inputRequest AccountBalancesSubRequestParent to add as InputRequest
 *
 */
    public void addAccountBalancesProductInputRequest(AccountBalancesSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountBalances_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentElementSubRequestParent as an InputRequest
 * @param inputRequest ComponentElementSubRequestParent to add as InputRequest
 *
 */
    public void addComponentElementProductInputRequest(ComponentElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ComponentElement_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractProductInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementProductInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemProductInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountProductBillingInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Product_Billing_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountProductInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountBalanceSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountBalanceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountBalanceProductInputRequest(OrderedAccountBalanceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccountBalance_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractProductInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryProductInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceProductInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductRateKeySubRequestParent as an InputRequest
 * @param inputRequest ProductRateKeySubRequestParent to add as InputRequest
 *
 */
    public void addProductRateKeyProductInputRequest(ProductRateKeySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ProductRateKey_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductRateOverrideSubRequestParent as an InputRequest
 * @param inputRequest ProductRateOverrideSubRequestParent to add as InputRequest
 *
 */
    public void addProductRateOverrideProductInputRequest(ProductRateOverrideSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ProductRateOverride_Product_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceProductInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_Product_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ProductRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addProductAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Product_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addProductAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addProductBillToAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Product_BillTo_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addProductBillToAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_BillTo_Account_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addProductAccountBalancesSubRequest(AccountBalancesRequest subRequest) {
      addSubRequest(subRequest, "Product_AccountBalances_Ref");
    }
/**
 *
 * Adds a AccountBalancesRequest sub request
 * @param subRequest AccountBalancesRequest
 *
 */
    public void addProductAccountBalancesSubRequest(AccountBalancesSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_AccountBalances_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addProductComponentElementSubRequest(ComponentElementRequest subRequest) {
      addSubRequest(subRequest, "Product_ComponentElement_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addProductComponentElementSubRequest(ComponentElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_ComponentElement_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addProductCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "Product_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addProductCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_CustomerContract_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addProductInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "Product_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addProductInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_InvElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addProductItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "Product_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addProductItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_Item_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addProductBillToOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Product_BillTo_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addProductBillToOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_BillTo_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addProductOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Product_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addProductOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addProductOrderedAccountBalanceSubRequest(OrderedAccountBalanceRequest subRequest) {
      addSubRequest(subRequest, "Product_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedAccountBalanceRequest sub request
 * @param subRequest OrderedAccountBalanceRequest
 *
 */
    public void addProductOrderedAccountBalanceSubRequest(OrderedAccountBalanceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_OrderedAccountBalance_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addProductOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "Product_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addProductOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addProductOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "Product_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addProductOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addProductOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "Product_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addProductOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_OrderedService_Ref");
    }
/**
 *
 * Adds a ProductRateKeyRequest sub request
 * @param subRequest ProductRateKeyRequest
 *
 */
    public void addProductProductRateKeySubRequest(ProductRateKeyRequest subRequest) {
      addSubRequest(subRequest, "Product_ProductRateKey_Ref");
    }
/**
 *
 * Adds a ProductRateKeyRequest sub request
 * @param subRequest ProductRateKeyRequest
 *
 */
    public void addProductProductRateKeySubRequest(ProductRateKeySubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_ProductRateKey_Ref");
    }
/**
 *
 * Adds a ProductRateOverrideRequest sub request
 * @param subRequest ProductRateOverrideRequest
 *
 */
    public void addProductProductRateOverrideSubRequest(ProductRateOverrideRequest subRequest) {
      addSubRequest(subRequest, "Product_ProductRateOverride_Ref");
    }
/**
 *
 * Adds a ProductRateOverrideRequest sub request
 * @param subRequest ProductRateOverrideRequest
 *
 */
    public void addProductProductRateOverrideSubRequest(ProductRateOverrideSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_ProductRateOverride_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addProductServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "Product_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addProductServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "Product_Service_Ref");
    }

/**
 *
 * Constructor for ProductSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductSubRequestParent(String id, String method) {
    super(id, "Product", method);
  }
}
