/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementSubRequestParent.java
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
 * Abstract base class for all InvElement related UdtSubRequestParents
 *
 */
public abstract class InvElementSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountInvElementInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountReservedInvElementInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Reserved_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerIdEquipMapSubRequestParent as an InputRequest
 * @param inputRequest CustomerIdEquipMapSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerIdEquipMapInvElementInputRequest(CustomerIdEquipMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerIdEquipMap_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemInvElementInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcInvElementInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountInvElementInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountReservedInvElementInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Reserved_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedCiemSubRequestParent as an InputRequest
 * @param inputRequest OrderedCiemSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedCiemInvElementInputRequest(OrderedCiemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedCiem_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcInvElementInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductInvElementInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceInvElementInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductInvElementInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceInvElementInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_InvElement_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  VanityCodeChargeMapSubRequestParent as an InputRequest
 * @param inputRequest VanityCodeChargeMapSubRequestParent to add as InputRequest
 *
 */
    public void addVanityCodeChargeMapInvElementInputRequest(VanityCodeChargeMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "VanityCodeChargeMap_InvElement_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on InvElementRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvElementRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvElementSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvElementSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addInvElementAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addInvElementAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addInvElementReservingAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Reserving_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addInvElementReservingAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Reserving_Account_Ref");
    }
/**
 *
 * Adds a CustomerIdEquipMapRequest sub request
 * @param subRequest CustomerIdEquipMapRequest
 *
 */
    public void addInvElementAssignedCustomerIdEquipMapSubRequest(CustomerIdEquipMapRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Assigned_CustomerIdEquipMap_Ref");
    }
/**
 *
 * Adds a CustomerIdEquipMapRequest sub request
 * @param subRequest CustomerIdEquipMapRequest
 *
 */
    public void addInvElementAssignedCustomerIdEquipMapSubRequest(CustomerIdEquipMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Assigned_CustomerIdEquipMap_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addInvElementItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addInvElementItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Item_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addInvElementNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addInvElementNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Nrc_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addInvElementOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "InvElement_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addInvElementOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addInvElementReservingOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Reserving_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addInvElementReservingOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Reserving_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedCiemRequest sub request
 * @param subRequest OrderedCiemRequest
 *
 */
    public void addInvElementAssignedOrderedCiemSubRequest(OrderedCiemRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Assigned_OrderedCiem_Ref");
    }
/**
 *
 * Adds a OrderedCiemRequest sub request
 * @param subRequest OrderedCiemRequest
 *
 */
    public void addInvElementAssignedOrderedCiemSubRequest(OrderedCiemSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Assigned_OrderedCiem_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addInvElementOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "InvElement_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addInvElementOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addInvElementOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "InvElement_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addInvElementOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addInvElementAssignedOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Assigned_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addInvElementAssignedOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Assigned_OrderedService_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addInvElementProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addInvElementProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Product_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addInvElementAssignedServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "InvElement_Assigned_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addInvElementAssignedServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_Assigned_Service_Ref");
    }
/**
 *
 * Adds a VanityCodeChargeMapRequest sub request
 * @param subRequest VanityCodeChargeMapRequest
 *
 */
    public void addInvElementVanityCodeChargeMapSubRequest(VanityCodeChargeMapRequest subRequest) {
      addSubRequest(subRequest, "InvElement_VanityCodeChargeMap_Ref");
    }
/**
 *
 * Adds a VanityCodeChargeMapRequest sub request
 * @param subRequest VanityCodeChargeMapRequest
 *
 */
    public void addInvElementVanityCodeChargeMapSubRequest(VanityCodeChargeMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "InvElement_VanityCodeChargeMap_Ref");
    }

/**
 *
 * Constructor for InvElementSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvElementSubRequestParent(String id, String method) {
    super(id, "InvElement", method);
  }
}
