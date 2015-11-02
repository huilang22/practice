/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInventorySubRequestParent.java
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
 * Abstract base class for all OrderedInventory related UdtSubRequestParents
 *
 */
public abstract class OrderedInventorySubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderedInventoryInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountReservedOrderedInventoryInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Reserved_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerIdEquipMapSubRequestParent as an InputRequest
 * @param inputRequest CustomerIdEquipMapSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerIdEquipMapOrderedInventoryInputRequest(CustomerIdEquipMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerIdEquipMap_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemOrderedInventoryInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcOrderedInventoryInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOrderedInventoryInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountReservedOrderedInventoryInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Reserved_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedCiemSubRequestParent as an InputRequest
 * @param inputRequest OrderedCiemSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedCiemOrderedInventoryInputRequest(OrderedCiemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedCiem_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcOrderedInventoryInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductOrderedInventoryInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceOrderedInventoryInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductOrderedInventoryInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderedInventoryInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_OrderedInventory_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  VanityCodeChargeMapSubRequestParent as an InputRequest
 * @param inputRequest VanityCodeChargeMapSubRequestParent to add as InputRequest
 *
 */
    public void addVanityCodeChargeMapOrderedInventoryInputRequest(VanityCodeChargeMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "VanityCodeChargeMap_OrderedInventory_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OrderedInventoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedInventoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedInventorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedInventorySubRequestParent selfRequest) {
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
    public void addOrderedInventoryReservingAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Reserving_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedInventoryReservingAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Reserving_Account_Ref");
    }
/**
 *
 * Adds a CustomerIdEquipMapRequest sub request
 * @param subRequest CustomerIdEquipMapRequest
 *
 */
    public void addOrderedInventoryAssignedCustomerIdEquipMapSubRequest(CustomerIdEquipMapRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Assigned_CustomerIdEquipMap_Ref");
    }
/**
 *
 * Adds a CustomerIdEquipMapRequest sub request
 * @param subRequest CustomerIdEquipMapRequest
 *
 */
    public void addOrderedInventoryAssignedCustomerIdEquipMapSubRequest(CustomerIdEquipMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Assigned_CustomerIdEquipMap_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedInventoryItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedInventoryItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Item_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedInventoryNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedInventoryNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Nrc_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedInventoryOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedInventoryOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedInventoryReservingOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Reserving_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedInventoryReservingOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Reserving_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedCiemRequest sub request
 * @param subRequest OrderedCiemRequest
 *
 */
    public void addOrderedInventoryAssignedOrderedCiemSubRequest(OrderedCiemRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Assigned_OrderedCiem_Ref");
    }
/**
 *
 * Adds a OrderedCiemRequest sub request
 * @param subRequest OrderedCiemRequest
 *
 */
    public void addOrderedInventoryAssignedOrderedCiemSubRequest(OrderedCiemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Assigned_OrderedCiem_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedInventoryOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedInventoryOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedInventoryOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedInventoryOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedInventoryAssignedOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Assigned_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedInventoryAssignedOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Assigned_OrderedService_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedInventoryProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedInventoryProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Product_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedInventoryAssignedServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Assigned_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedInventoryAssignedServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_Assigned_Service_Ref");
    }
/**
 *
 * Adds a VanityCodeChargeMapRequest sub request
 * @param subRequest VanityCodeChargeMapRequest
 *
 */
    public void addOrderedInventoryVanityCodeChargeMapSubRequest(VanityCodeChargeMapRequest subRequest) {
      addSubRequest(subRequest, "OrderedInventory_VanityCodeChargeMap_Ref");
    }
/**
 *
 * Adds a VanityCodeChargeMapRequest sub request
 * @param subRequest VanityCodeChargeMapRequest
 *
 */
    public void addOrderedInventoryVanityCodeChargeMapSubRequest(VanityCodeChargeMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedInventory_VanityCodeChargeMap_Ref");
    }

/**
 *
 * Constructor for OrderedInventorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedInventorySubRequestParent(String id, String method) {
    super(id, "OrderedInventory", method);
  }
}
