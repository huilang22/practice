/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractSubRequestParent.java
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
 * Abstract base class for all CustomerContract related UdtSubRequestParents
 *
 */
public abstract class CustomerContractSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountCustomerContractInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountHqContractSubRequestParent as an InputRequest
 * @param inputRequest AccountHqContractSubRequestParent to add as InputRequest
 *
 */
    public void addAccountHqContractCustomerContractInputRequest(AccountHqContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountHqContract_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentElementSubRequestParent as an InputRequest
 * @param inputRequest ComponentElementSubRequestParent to add as InputRequest
 *
 */
    public void addComponentElementCustomerContractInputRequest(ComponentElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ComponentElement_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ContractUnitCreditSubRequestParent as an InputRequest
 * @param inputRequest ContractUnitCreditSubRequestParent to add as InputRequest
 *
 */
    public void addContractUnitCreditCustomerContractInputRequest(ContractUnitCreditSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ContractUnitCredit_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemCustomerContractInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcCustomerContractInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountCustomerContractInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcCustomerContractInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductCustomerContractInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceCustomerContractInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OverrideDiscountRateSubRequestParent as an InputRequest
 * @param inputRequest OverrideDiscountRateSubRequestParent to add as InputRequest
 *
 */
    public void addOverrideDiscountRateCustomerContractInputRequest(OverrideDiscountRateSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OverrideDiscountRate_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OverrideUsageCreditRateSubRequestParent as an InputRequest
 * @param inputRequest OverrideUsageCreditRateSubRequestParent to add as InputRequest
 *
 */
    public void addOverrideUsageCreditRateCustomerContractInputRequest(OverrideUsageCreditRateSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OverrideUsageCreditRate_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductCustomerContractInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_CustomerContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceCustomerContractInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_CustomerContract_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on CustomerContractRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerContractRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CustomerContractSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerContractSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addCustomerContractAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addCustomerContractAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addCustomerContractOwningAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_Owning_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addCustomerContractOwningAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_Owning_Account_Ref");
    }
/**
 *
 * Adds a AccountHqContractRequest sub request
 * @param subRequest AccountHqContractRequest
 *
 */
    public void addCustomerContractAccountHqContractSubRequest(AccountHqContractRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_AccountHqContract_Ref");
    }
/**
 *
 * Adds a AccountHqContractRequest sub request
 * @param subRequest AccountHqContractRequest
 *
 */
    public void addCustomerContractAccountHqContractSubRequest(AccountHqContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_AccountHqContract_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addCustomerContractComponentElementSubRequest(ComponentElementRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_ComponentElement_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addCustomerContractComponentElementSubRequest(ComponentElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_ComponentElement_Ref");
    }
/**
 *
 * Adds a ContractUnitCreditRequest sub request
 * @param subRequest ContractUnitCreditRequest
 *
 */
    public void addCustomerContractContractUnitCreditSubRequest(ContractUnitCreditRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_ContractUnitCredit_Ref");
    }
/**
 *
 * Adds a ContractUnitCreditRequest sub request
 * @param subRequest ContractUnitCreditRequest
 *
 */
    public void addCustomerContractContractUnitCreditSubRequest(ContractUnitCreditSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_ContractUnitCredit_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addCustomerContractItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addCustomerContractItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_Item_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addCustomerContractNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addCustomerContractNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_Nrc_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addCustomerContractOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addCustomerContractOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addCustomerContractOwningOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_Owning_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addCustomerContractOwningOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_Owning_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addCustomerContractOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addCustomerContractOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addCustomerContractOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addCustomerContractOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addCustomerContractOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addCustomerContractOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_OrderedService_Ref");
    }
/**
 *
 * Adds a OverrideDiscountRateRequest sub request
 * @param subRequest OverrideDiscountRateRequest
 *
 */
    public void addCustomerContractOverrideDiscountRateSubRequest(OverrideDiscountRateRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_OverrideDiscountRate_Ref");
    }
/**
 *
 * Adds a OverrideDiscountRateRequest sub request
 * @param subRequest OverrideDiscountRateRequest
 *
 */
    public void addCustomerContractOverrideDiscountRateSubRequest(OverrideDiscountRateSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_OverrideDiscountRate_Ref");
    }
/**
 *
 * Adds a OverrideUsageCreditRateRequest sub request
 * @param subRequest OverrideUsageCreditRateRequest
 *
 */
    public void addCustomerContractOverrideUsageCreditRateSubRequest(OverrideUsageCreditRateRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_OverrideUsageCreditRate_Ref");
    }
/**
 *
 * Adds a OverrideUsageCreditRateRequest sub request
 * @param subRequest OverrideUsageCreditRateRequest
 *
 */
    public void addCustomerContractOverrideUsageCreditRateSubRequest(OverrideUsageCreditRateSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_OverrideUsageCreditRate_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addCustomerContractProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addCustomerContractProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_Product_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addCustomerContractServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "CustomerContract_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addCustomerContractServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerContract_Service_Ref");
    }

/**
 *
 * Constructor for CustomerContractSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CustomerContractSubRequestParent(String id, String method) {
    super(id, "CustomerContract", method);
  }
}
