/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceSubRequestParent.java
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
 * Abstract base class for all OrderedService related UdtSubRequestParents
 *
 */
public abstract class OrderedServiceSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountOrderedServiceInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentSubRequestParent as an InputRequest
 * @param inputRequest ComponentSubRequestParent to add as InputRequest
 *
 */
    public void addComponentOrderedServiceInputRequest(ComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Component_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CorridorSubRequestParent as an InputRequest
 * @param inputRequest CorridorSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorOrderedServiceInputRequest(CorridorSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Corridor_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractOrderedServiceInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerIdEquipMapSubRequestParent as an InputRequest
 * @param inputRequest CustomerIdEquipMapSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerIdEquipMapOrderedServiceInputRequest(CustomerIdEquipMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerIdEquipMap_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  EmfConfigurationSubRequestParent as an InputRequest
 * @param inputRequest EmfConfigurationSubRequestParent to add as InputRequest
 *
 */
    public void addEmfConfigurationOrderedServiceInputRequest(EmfConfigurationSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "EmfConfiguration_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementAssignedOrderedServiceInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_Assigned_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemOrderedServiceInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcOrderedServiceInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OpenItemIdMapSubRequestParent as an InputRequest
 * @param inputRequest OpenItemIdMapSubRequestParent to add as InputRequest
 *
 */
    public void addOpenItemIdMapOrderedServiceInputRequest(OpenItemIdMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OpenItemIdMap_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountOrderedServiceInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedCiemSubRequestParent as an InputRequest
 * @param inputRequest OrderedCiemSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedCiemOrderedServiceInputRequest(OrderedCiemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedCiem_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedComponentSubRequestParent as an InputRequest
 * @param inputRequest OrderedComponentSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedComponentOrderedServiceInputRequest(OrderedComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedComponent_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractOrderedServiceInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryAssignedOrderedServiceInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_Assigned_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcOrderedServiceInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductOrderedServiceInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductOrderedServiceInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceOrderSubRequestParent as an InputRequest
 * @param inputRequest ServiceOrderSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderOrderedServiceInputRequest(ServiceOrderSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ServiceOrder_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceStatusSubRequestParent as an InputRequest
 * @param inputRequest ServiceStatusSubRequestParent to add as InputRequest
 *
 */
    public void addServiceStatusOrderedServiceInputRequest(ServiceStatusSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ServiceStatus_OrderedService_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceZoneSubRequestParent as an InputRequest
 * @param inputRequest ServiceZoneSubRequestParent to add as InputRequest
 *
 */
    public void addServiceZoneOrderedServiceInputRequest(ServiceZoneSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ServiceZone_OrderedService_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OrderedServiceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedServiceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedServiceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedServiceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedServiceAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addOrderedServiceAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_Account_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addOrderedServiceComponentSubRequest(ComponentRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_Component_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addOrderedServiceComponentSubRequest(ComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_Component_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addOrderedServiceCorridorSubRequest(CorridorRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_Corridor_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addOrderedServiceCorridorSubRequest(CorridorSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_Corridor_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOrderedServiceCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addOrderedServiceCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerIdEquipMapRequest sub request
 * @param subRequest CustomerIdEquipMapRequest
 *
 */
    public void addOrderedServiceCustomerIdEquipMapSubRequest(CustomerIdEquipMapRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_CustomerIdEquipMap_Ref");
    }
/**
 *
 * Adds a CustomerIdEquipMapRequest sub request
 * @param subRequest CustomerIdEquipMapRequest
 *
 */
    public void addOrderedServiceCustomerIdEquipMapSubRequest(CustomerIdEquipMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_CustomerIdEquipMap_Ref");
    }
/**
 *
 * Adds a EmfConfigurationRequest sub request
 * @param subRequest EmfConfigurationRequest
 *
 */
    public void addOrderedServiceEmfConfigurationSubRequest(EmfConfigurationRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_EmfConfiguration_Ref");
    }
/**
 *
 * Adds a EmfConfigurationRequest sub request
 * @param subRequest EmfConfigurationRequest
 *
 */
    public void addOrderedServiceEmfConfigurationSubRequest(EmfConfigurationSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_EmfConfiguration_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedServiceInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedServiceInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_InvElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedServiceItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedServiceItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_Item_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedServiceNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addOrderedServiceNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_Nrc_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addOrderedServiceOpenItemIdMapSubRequest(OpenItemIdMapRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addOrderedServiceOpenItemIdMapSubRequest(OpenItemIdMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedServiceOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addOrderedServiceOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedCiemRequest sub request
 * @param subRequest OrderedCiemRequest
 *
 */
    public void addOrderedServiceOrderedCiemSubRequest(OrderedCiemRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedCiem_Ref");
    }
/**
 *
 * Adds a OrderedCiemRequest sub request
 * @param subRequest OrderedCiemRequest
 *
 */
    public void addOrderedServiceOrderedCiemSubRequest(OrderedCiemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedCiem_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addOrderedServiceOrderedComponentSubRequest(OrderedComponentRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addOrderedServiceOrderedComponentSubRequest(OrderedComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOrderedServiceOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addOrderedServiceOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedServiceOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedServiceOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedServiceOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addOrderedServiceOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedServiceOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addOrderedServiceOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_OrderedProduct_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedServiceProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addOrderedServiceProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_Product_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addOrderedServiceServiceOrderSubRequest(ServiceOrderRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_ServiceOrder_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addOrderedServiceServiceOrderSubRequest(ServiceOrderSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_ServiceOrder_Ref");
    }
/**
 *
 * Adds a ServicePricingPlanRequest sub request
 * @param subRequest ServicePricingPlanRequest
 *
 */
    public void addOrderedServiceServicePricingPlanSubRequest(ServicePricingPlanRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_ServicePricingPlan_Ref");
    }
/**
 *
 * Adds a ServicePricingPlanRequest sub request
 * @param subRequest ServicePricingPlanRequest
 *
 */
    public void addOrderedServiceServicePricingPlanSubRequest(ServicePricingPlanSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_ServicePricingPlan_Ref");
    }
/**
 *
 * Adds a ServiceStatusRequest sub request
 * @param subRequest ServiceStatusRequest
 *
 */
    public void addOrderedServiceServiceStatusSubRequest(ServiceStatusRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_ServiceStatus_Ref");
    }
/**
 *
 * Adds a ServiceStatusRequest sub request
 * @param subRequest ServiceStatusRequest
 *
 */
    public void addOrderedServiceServiceStatusSubRequest(ServiceStatusSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_ServiceStatus_Ref");
    }
/**
 *
 * Adds a ServiceZoneRequest sub request
 * @param subRequest ServiceZoneRequest
 *
 */
    public void addOrderedServiceServiceZoneSubRequest(ServiceZoneRequest subRequest) {
      addSubRequest(subRequest, "OrderedService_ServiceZone_Ref");
    }
/**
 *
 * Adds a ServiceZoneRequest sub request
 * @param subRequest ServiceZoneRequest
 *
 */
    public void addOrderedServiceServiceZoneSubRequest(ServiceZoneSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedService_ServiceZone_Ref");
    }

/**
 *
 * Constructor for OrderedServiceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedServiceSubRequestParent(String id, String method) {
    super(id, "OrderedService", method);
  }
}
