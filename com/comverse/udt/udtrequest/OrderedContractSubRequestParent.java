/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractSubRequestParent.java
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
 * Abstract base class for all OrderedContract related UdtSubRequestParents
 *
 */
public abstract class OrderedContractSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderedContractInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountHqContractSubRequestParent as an InputRequest
 * @param inputRequest AccountHqContractSubRequestParent to add as InputRequest
 *
 */
    public void addAccountHqContractOrderedContractInputRequest(AccountHqContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "AccountHqContract_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentElementSubRequestParent as an InputRequest
 * @param inputRequest ComponentElementSubRequestParent to add as InputRequest
 *
 */
    public void addComponentElementOrderedContractInputRequest(ComponentElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ComponentElement_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ContractUnitCreditSubRequestParent as an InputRequest
 * @param inputRequest ContractUnitCreditSubRequestParent to add as InputRequest
 *
 */
    public void addContractUnitCreditOrderedContractInputRequest(ContractUnitCreditSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ContractUnitCredit_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemOrderedContractInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcOrderedContractInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOrderedContractInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcOrderedContractInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductOrderedContractInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceOrderedContractInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OverrideDiscountRateSubRequestParent as an InputRequest
 * @param inputRequest OverrideDiscountRateSubRequestParent to add as InputRequest
 *
 */
    public void addOverrideDiscountRateOrderedContractInputRequest(OverrideDiscountRateSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OverrideDiscountRate_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OverrideUsageCreditRateSubRequestParent as an InputRequest
 * @param inputRequest OverrideUsageCreditRateSubRequestParent to add as InputRequest
 *
 */
    public void addOverrideUsageCreditRateOrderedContractInputRequest(OverrideUsageCreditRateSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OverrideUsageCreditRate_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductOrderedContractInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_OrderedContract_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderedContractInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_OrderedContract_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OrderedContractRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedContractRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedContractSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedContractSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedContractAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedContractAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedContractOwningAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_Owning_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedContractOwningAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_Owning_Account_Ref");
    }
/**
 *
 * Adds a AccountHqContractRequest sub request
 * @param subRequest AccountHqContractRequest
 *
 */
    public void addOrderedContractAccountHqContractSubRequest(AccountHqContractRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_AccountHqContract_Ref");
    }
/**
 *
 * Adds a AccountHqContractRequest sub request
 * @param subRequest AccountHqContractRequest
 *
 */
    public void addOrderedContractAccountHqContractSubRequest(AccountHqContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_AccountHqContract_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addOrderedContractComponentElementSubRequest(ComponentElementRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_ComponentElement_Ref");
    }
/**
 *
 * Adds a ComponentElementRequest sub request
 * @param subRequest ComponentElementRequest
 *
 */
    public void addOrderedContractComponentElementSubRequest(ComponentElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_ComponentElement_Ref");
    }
/**
 *
 * Adds a ContractUnitCreditRequest sub request
 * @param subRequest ContractUnitCreditRequest
 *
 */
    public void addOrderedContractContractUnitCreditSubRequest(ContractUnitCreditRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_ContractUnitCredit_Ref");
    }
/**
 *
 * Adds a ContractUnitCreditRequest sub request
 * @param subRequest ContractUnitCreditRequest
 *
 */
    public void addOrderedContractContractUnitCreditSubRequest(ContractUnitCreditSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_ContractUnitCredit_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedContractItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedContractItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_Item_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedContractNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedContractNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_Nrc_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedContractOwningOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_Owning_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedContractOwningOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_Owning_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedContractOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedContractOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedContractOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedContractOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedContractOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedContractOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_OrderedService_Ref");
    }
/**
 *
 * Adds a OverrideDiscountRateRequest sub request
 * @param subRequest OverrideDiscountRateRequest
 *
 */
    public void addOrderedContractOverrideDiscountRateSubRequest(OverrideDiscountRateRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_OverrideDiscountRate_Ref");
    }
/**
 *
 * Adds a OverrideDiscountRateRequest sub request
 * @param subRequest OverrideDiscountRateRequest
 *
 */
    public void addOrderedContractOverrideDiscountRateSubRequest(OverrideDiscountRateSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_OverrideDiscountRate_Ref");
    }
/**
 *
 * Adds a OverrideUsageCreditRateRequest sub request
 * @param subRequest OverrideUsageCreditRateRequest
 *
 */
    public void addOrderedContractOverrideUsageCreditRateSubRequest(OverrideUsageCreditRateRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_OverrideUsageCreditRate_Ref");
    }
/**
 *
 * Adds a OverrideUsageCreditRateRequest sub request
 * @param subRequest OverrideUsageCreditRateRequest
 *
 */
    public void addOrderedContractOverrideUsageCreditRateSubRequest(OverrideUsageCreditRateSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_OverrideUsageCreditRate_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedContractProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedContractProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_Product_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedContractServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedContract_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedContractServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedContract_Service_Ref");
    }

/**
 *
 * Constructor for OrderedContractSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedContractSubRequestParent(String id, String method) {
    super(id, "OrderedContract", method);
  }
}
