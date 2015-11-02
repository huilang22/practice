/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapSubRequestParent.java
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
 * Abstract base class for all CustomerIdEquipMap related UdtSubRequestParents
 *
 */
public abstract class CustomerIdEquipMapSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementAssignedCustomerIdEquipMapInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_Assigned_CustomerIdEquipMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemCustomerIdEquipMapInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_CustomerIdEquipMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryAssignedCustomerIdEquipMapInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_Assigned_CustomerIdEquipMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceCustomerIdEquipMapInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_CustomerIdEquipMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceCustomerIdEquipMapInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_CustomerIdEquipMap_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on CustomerIdEquipMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerIdEquipMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CustomerIdEquipMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CustomerIdEquipMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addCustomerIdEquipMapInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addCustomerIdEquipMapInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_InvElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addCustomerIdEquipMapItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addCustomerIdEquipMapItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_Item_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addCustomerIdEquipMapOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addCustomerIdEquipMapOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addCustomerIdEquipMapOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addCustomerIdEquipMapOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_OrderedService_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addCustomerIdEquipMapServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addCustomerIdEquipMapServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "CustomerIdEquipMap_Service_Ref");
    }

/**
 *
 * Constructor for CustomerIdEquipMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CustomerIdEquipMapSubRequestParent(String id, String method) {
    super(id, "CustomerIdEquipMap", method);
  }
}
