/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceSubRequestParent.java
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
 * Abstract base class for all Service related UdtSubRequestParents
 *
 */
public abstract class ServiceSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  AccountSubRequestParent as an InputRequest
 * @param inputRequest AccountSubRequestParent to add as InputRequest
 *
 */
    public void addAccountServiceInputRequest(AccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Account_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ComponentSubRequestParent as an InputRequest
 * @param inputRequest ComponentSubRequestParent to add as InputRequest
 *
 */
    public void addComponentServiceInputRequest(ComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Component_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CorridorSubRequestParent as an InputRequest
 * @param inputRequest CorridorSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorServiceInputRequest(CorridorSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Corridor_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerContractSubRequestParent as an InputRequest
 * @param inputRequest CustomerContractSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerContractServiceInputRequest(CustomerContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerContract_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CustomerIdEquipMapSubRequestParent as an InputRequest
 * @param inputRequest CustomerIdEquipMapSubRequestParent to add as InputRequest
 *
 */
    public void addCustomerIdEquipMapServiceInputRequest(CustomerIdEquipMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CustomerIdEquipMap_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  EmfConfigurationSubRequestParent as an InputRequest
 * @param inputRequest EmfConfigurationSubRequestParent to add as InputRequest
 *
 */
    public void addEmfConfigurationServiceInputRequest(EmfConfigurationSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "EmfConfiguration_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementAssignedServiceInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_Assigned_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemServiceInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  NrcSubRequestParent as an InputRequest
 * @param inputRequest NrcSubRequestParent to add as InputRequest
 *
 */
    public void addNrcServiceInputRequest(NrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Nrc_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OpenItemIdMapSubRequestParent as an InputRequest
 * @param inputRequest OpenItemIdMapSubRequestParent to add as InputRequest
 *
 */
    public void addOpenItemIdMapServiceInputRequest(OpenItemIdMapSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OpenItemIdMap_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedAccountSubRequestParent as an InputRequest
 * @param inputRequest OrderedAccountSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedAccountServiceInputRequest(OrderedAccountSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedAccount_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedCiemSubRequestParent as an InputRequest
 * @param inputRequest OrderedCiemSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedCiemServiceInputRequest(OrderedCiemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedCiem_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedComponentSubRequestParent as an InputRequest
 * @param inputRequest OrderedComponentSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedComponentServiceInputRequest(OrderedComponentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedComponent_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedContractSubRequestParent as an InputRequest
 * @param inputRequest OrderedContractSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedContractServiceInputRequest(OrderedContractSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedContract_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryAssignedServiceInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_Assigned_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedNrcSubRequestParent as an InputRequest
 * @param inputRequest OrderedNrcSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedNrcServiceInputRequest(OrderedNrcSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedNrc_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedProductSubRequestParent as an InputRequest
 * @param inputRequest OrderedProductSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedProductServiceInputRequest(OrderedProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedProduct_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ProductSubRequestParent as an InputRequest
 * @param inputRequest ProductSubRequestParent to add as InputRequest
 *
 */
    public void addProductServiceInputRequest(ProductSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Product_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceOrderSubRequestParent as an InputRequest
 * @param inputRequest ServiceOrderSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderServiceInputRequest(ServiceOrderSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ServiceOrder_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceStatusSubRequestParent as an InputRequest
 * @param inputRequest ServiceStatusSubRequestParent to add as InputRequest
 *
 */
    public void addServiceStatusServiceInputRequest(ServiceStatusSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ServiceStatus_Service_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceZoneSubRequestParent as an InputRequest
 * @param inputRequest ServiceZoneSubRequestParent to add as InputRequest
 *
 */
    public void addServiceZoneServiceInputRequest(ServiceZoneSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "ServiceZone_Service_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on ServiceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addServiceAccountSubRequest(AccountRequest subRequest) {
      addSubRequest(subRequest, "Service_Account_Ref");
    }
/**
 *
 * Adds a AccountRequest sub request
 * @param subRequest AccountRequest
 *
 */
    public void addServiceAccountSubRequest(AccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_Account_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addServiceComponentSubRequest(ComponentRequest subRequest) {
      addSubRequest(subRequest, "Service_Component_Ref");
    }
/**
 *
 * Adds a ComponentRequest sub request
 * @param subRequest ComponentRequest
 *
 */
    public void addServiceComponentSubRequest(ComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_Component_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addServiceCorridorSubRequest(CorridorRequest subRequest) {
      addSubRequest(subRequest, "Service_Corridor_Ref");
    }
/**
 *
 * Adds a CorridorRequest sub request
 * @param subRequest CorridorRequest
 *
 */
    public void addServiceCorridorSubRequest(CorridorSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_Corridor_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addServiceCustomerContractSubRequest(CustomerContractRequest subRequest) {
      addSubRequest(subRequest, "Service_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerContractRequest sub request
 * @param subRequest CustomerContractRequest
 *
 */
    public void addServiceCustomerContractSubRequest(CustomerContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_CustomerContract_Ref");
    }
/**
 *
 * Adds a CustomerIdEquipMapRequest sub request
 * @param subRequest CustomerIdEquipMapRequest
 *
 */
    public void addServiceCustomerIdEquipMapSubRequest(CustomerIdEquipMapRequest subRequest) {
      addSubRequest(subRequest, "Service_CustomerIdEquipMap_Ref");
    }
/**
 *
 * Adds a CustomerIdEquipMapRequest sub request
 * @param subRequest CustomerIdEquipMapRequest
 *
 */
    public void addServiceCustomerIdEquipMapSubRequest(CustomerIdEquipMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_CustomerIdEquipMap_Ref");
    }
/**
 *
 * Adds a EmfConfigurationRequest sub request
 * @param subRequest EmfConfigurationRequest
 *
 */
    public void addServiceEmfConfigurationSubRequest(EmfConfigurationRequest subRequest) {
      addSubRequest(subRequest, "Service_EmfConfiguration_Ref");
    }
/**
 *
 * Adds a EmfConfigurationRequest sub request
 * @param subRequest EmfConfigurationRequest
 *
 */
    public void addServiceEmfConfigurationSubRequest(EmfConfigurationSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_EmfConfiguration_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addServiceInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "Service_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addServiceInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_InvElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addServiceItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "Service_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addServiceItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_Item_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addServiceNrcSubRequest(NrcRequest subRequest) {
      addSubRequest(subRequest, "Service_Nrc_Ref");
    }
/**
 *
 * Adds a NrcRequest sub request
 * @param subRequest NrcRequest
 *
 */
    public void addServiceNrcSubRequest(NrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_Nrc_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addServiceOpenItemIdMapSubRequest(OpenItemIdMapRequest subRequest) {
      addSubRequest(subRequest, "Service_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OpenItemIdMapRequest sub request
 * @param subRequest OpenItemIdMapRequest
 *
 */
    public void addServiceOpenItemIdMapSubRequest(OpenItemIdMapSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_OpenItemIdMap_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addServiceOrderedAccountSubRequest(OrderedAccountRequest subRequest) {
      addSubRequest(subRequest, "Service_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedAccountRequest sub request
 * @param subRequest OrderedAccountRequest
 *
 */
    public void addServiceOrderedAccountSubRequest(OrderedAccountSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_OrderedAccount_Ref");
    }
/**
 *
 * Adds a OrderedCiemRequest sub request
 * @param subRequest OrderedCiemRequest
 *
 */
    public void addServiceOrderedCiemSubRequest(OrderedCiemRequest subRequest) {
      addSubRequest(subRequest, "Service_OrderedCiem_Ref");
    }
/**
 *
 * Adds a OrderedCiemRequest sub request
 * @param subRequest OrderedCiemRequest
 *
 */
    public void addServiceOrderedCiemSubRequest(OrderedCiemSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_OrderedCiem_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addServiceOrderedComponentSubRequest(OrderedComponentRequest subRequest) {
      addSubRequest(subRequest, "Service_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedComponentRequest sub request
 * @param subRequest OrderedComponentRequest
 *
 */
    public void addServiceOrderedComponentSubRequest(OrderedComponentSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_OrderedComponent_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addServiceOrderedContractSubRequest(OrderedContractRequest subRequest) {
      addSubRequest(subRequest, "Service_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedContractRequest sub request
 * @param subRequest OrderedContractRequest
 *
 */
    public void addServiceOrderedContractSubRequest(OrderedContractSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_OrderedContract_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addServiceOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "Service_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addServiceOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addServiceOrderedNrcSubRequest(OrderedNrcRequest subRequest) {
      addSubRequest(subRequest, "Service_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedNrcRequest sub request
 * @param subRequest OrderedNrcRequest
 *
 */
    public void addServiceOrderedNrcSubRequest(OrderedNrcSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_OrderedNrc_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addServiceOrderedProductSubRequest(OrderedProductRequest subRequest) {
      addSubRequest(subRequest, "Service_OrderedProduct_Ref");
    }
/**
 *
 * Adds a OrderedProductRequest sub request
 * @param subRequest OrderedProductRequest
 *
 */
    public void addServiceOrderedProductSubRequest(OrderedProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_OrderedProduct_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addServiceProductSubRequest(ProductRequest subRequest) {
      addSubRequest(subRequest, "Service_Product_Ref");
    }
/**
 *
 * Adds a ProductRequest sub request
 * @param subRequest ProductRequest
 *
 */
    public void addServiceProductSubRequest(ProductSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_Product_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addServiceServiceOrderSubRequest(ServiceOrderRequest subRequest) {
      addSubRequest(subRequest, "Service_ServiceOrder_Ref");
    }
/**
 *
 * Adds a ServiceOrderRequest sub request
 * @param subRequest ServiceOrderRequest
 *
 */
    public void addServiceServiceOrderSubRequest(ServiceOrderSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_ServiceOrder_Ref");
    }
/**
 *
 * Adds a ServicePricingPlanRequest sub request
 * @param subRequest ServicePricingPlanRequest
 *
 */
    public void addServiceServicePricingPlanSubRequest(ServicePricingPlanRequest subRequest) {
      addSubRequest(subRequest, "Service_ServicePricingPlan_Ref");
    }
/**
 *
 * Adds a ServicePricingPlanRequest sub request
 * @param subRequest ServicePricingPlanRequest
 *
 */
    public void addServiceServicePricingPlanSubRequest(ServicePricingPlanSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_ServicePricingPlan_Ref");
    }
/**
 *
 * Adds a ServiceStatusRequest sub request
 * @param subRequest ServiceStatusRequest
 *
 */
    public void addServiceServiceStatusSubRequest(ServiceStatusRequest subRequest) {
      addSubRequest(subRequest, "Service_ServiceStatus_Ref");
    }
/**
 *
 * Adds a ServiceStatusRequest sub request
 * @param subRequest ServiceStatusRequest
 *
 */
    public void addServiceServiceStatusSubRequest(ServiceStatusSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_ServiceStatus_Ref");
    }
/**
 *
 * Adds a ServiceZoneRequest sub request
 * @param subRequest ServiceZoneRequest
 *
 */
    public void addServiceServiceZoneSubRequest(ServiceZoneRequest subRequest) {
      addSubRequest(subRequest, "Service_ServiceZone_Ref");
    }
/**
 *
 * Adds a ServiceZoneRequest sub request
 * @param subRequest ServiceZoneRequest
 *
 */
    public void addServiceServiceZoneSubRequest(ServiceZoneSubRequestParent subRequest) {
      addSubRequest(subRequest, "Service_ServiceZone_Ref");
    }

/**
 *
 * Constructor for ServiceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceSubRequestParent(String id, String method) {
    super(id, "Service", method);
  }
}
