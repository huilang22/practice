/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapSubRequestParent.java
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
 * Abstract base class for all VanityCodeChargeMap related UdtSubRequestParents
 *
 */
public abstract class VanityCodeChargeMapSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  InvElementSubRequestParent as an InputRequest
 * @param inputRequest InvElementSubRequestParent to add as InputRequest
 *
 */
    public void addInvElementVanityCodeChargeMapInputRequest(InvElementSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "InvElement_VanityCodeChargeMap_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  OrderedInventorySubRequestParent as an InputRequest
 * @param inputRequest OrderedInventorySubRequestParent to add as InputRequest
 *
 */
    public void addOrderedInventoryVanityCodeChargeMapInputRequest(OrderedInventorySubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "OrderedInventory_VanityCodeChargeMap_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on VanityCodeChargeMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VanityCodeChargeMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on VanityCodeChargeMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VanityCodeChargeMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addVanityCodeChargeMapInvElementSubRequest(InvElementRequest subRequest) {
      addSubRequest(subRequest, "VanityCodeChargeMap_InvElement_Ref");
    }
/**
 *
 * Adds a InvElementRequest sub request
 * @param subRequest InvElementRequest
 *
 */
    public void addVanityCodeChargeMapInvElementSubRequest(InvElementSubRequestParent subRequest) {
      addSubRequest(subRequest, "VanityCodeChargeMap_InvElement_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addVanityCodeChargeMapOrderedInventorySubRequest(OrderedInventoryRequest subRequest) {
      addSubRequest(subRequest, "VanityCodeChargeMap_OrderedInventory_Ref");
    }
/**
 *
 * Adds a OrderedInventoryRequest sub request
 * @param subRequest OrderedInventoryRequest
 *
 */
    public void addVanityCodeChargeMapOrderedInventorySubRequest(OrderedInventorySubRequestParent subRequest) {
      addSubRequest(subRequest, "VanityCodeChargeMap_OrderedInventory_Ref");
    }

/**
 *
 * Constructor for VanityCodeChargeMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public VanityCodeChargeMapSubRequestParent(String id, String method) {
    super(id, "VanityCodeChargeMap", method);
  }
}
