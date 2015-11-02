/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedCiemSubRequestParent.java
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
 * Abstract base class for all OrderedCiem related UdtSubRequestParents
 *
 */
public abstract class OrderedCiemSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementAssignedOrderedCiemInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_Assigned_OrderedCiem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ItemSubRequestParent as an InputRequest
 * @param inputRequest ItemSubRequestParent to add as InputRequest
 *
 */
    public void addItemOrderedCiemInputRequest(ItemSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Item_OrderedCiem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryAssignedOrderedCiemInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_Assigned_OrderedCiem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedServiceSubRequestParent as an InputRequest
 * @param inputRequest OrderedServiceSubRequestParent to add as InputRequest
 *
 */
    public void addOrderedServiceOrderedCiemInputRequest(OrderedServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedService_OrderedCiem_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  ServiceSubRequestParent as an InputRequest
 * @param inputRequest ServiceSubRequestParent to add as InputRequest
 *
 */
    public void addServiceOrderedCiemInputRequest(ServiceSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Service_OrderedCiem_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on OrderedCiemRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedCiemRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OrderedCiemSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OrderedCiemSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedCiemInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "OrderedCiem_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addOrderedCiemInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedCiem_InvElement_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedCiemItemSubRequest(ItemRequest subRequest) {
      addSubRequest(subRequest, "OrderedCiem_Item_Ref");
    }
/**
 *
 * Adds a ItemRequest sub request
 * @param subRequest ItemRequest
 *
 */
    public void addOrderedCiemItemSubRequest(ItemSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedCiem_Item_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedCiemOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "OrderedCiem_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addOrderedCiemOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedCiem_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedCiemOrderedServiceSubRequest(OrderedServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedCiem_OrderedService_Ref");
    }
/**
 *
 * Adds a OrderedServiceRequest sub request
 * @param subRequest OrderedServiceRequest
 *
 */
    public void addOrderedCiemOrderedServiceSubRequest(OrderedServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedCiem_OrderedService_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedCiemServiceSubRequest(ServiceRequest subRequest) {
      addSubRequest(subRequest, "OrderedCiem_Service_Ref");
    }
/**
 *
 * Adds a ServiceRequest sub request
 * @param subRequest ServiceRequest
 *
 */
    public void addOrderedCiemServiceSubRequest(ServiceSubRequestParent subRequest) {
      addSubRequest(subRequest, "OrderedCiem_Service_Ref");
    }

/**
 *
 * Constructor for OrderedCiemSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OrderedCiemSubRequestParent(String id, String method) {
    super(id, "OrderedCiem", method);
  }
}
