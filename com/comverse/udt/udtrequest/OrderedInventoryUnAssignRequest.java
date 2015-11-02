/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInventoryUnAssignRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.iv.data.*;
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderedInventoryUnAssignRequest Udt Request
 *
 */

public class OrderedInventoryUnAssignRequest extends OrderedInventorySubRequestParent {
/**
 *
 * Constructor to create a  OrderedInventoryUnAssignRequest
 * @param id Unique request name
 * @param oInvUInvElementIn InvElementObjData for OrderedInventoryUnAssignRequest
 * @param oInvUOrderIn OrderObjectData for OrderedInventoryUnAssignRequest
 * @param oInvUServiceOrderIn ServiceOrderObjectData for OrderedInventoryUnAssignRequest
 * @param oInvUEffectiveDt Date for OrderedInventoryUnAssignRequest
 * @param DisconnectReason Integer for OrderedInventoryUnAssignRequest
 * @param oInvUManageVanityCharges Boolean for OrderedInventoryUnAssignRequest
 * @param oInvUFindExistingSO Boolean for OrderedInventoryUnAssignRequest
 * @param oInvUVerboseResponse Boolean for OrderedInventoryUnAssignRequest
 *
 */
@JsonCreator
  public OrderedInventoryUnAssignRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData oInvUInvElementIn, @JsonProperty("Order")OrderObjectData oInvUOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData oInvUServiceOrderIn, @JsonProperty("EffectiveDt")Date oInvUEffectiveDt, @JsonProperty("DisconnectReason")Integer DisconnectReason, @JsonProperty("ManageVanityCharges")Boolean oInvUManageVanityCharges, @JsonProperty("FindExistingSO")Boolean oInvUFindExistingSO, @JsonProperty("VerboseResponse")Boolean oInvUVerboseResponse) {
    super(id, "OrderedInventoryUnAssign");
    if (oInvUInvElementIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(oInvUInvElementIn, new HashMap(), "OrderedInventoryUnAssignOutputData").get("OrderedInventoryUnAssignOutputData"));
    }
    if (oInvUOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oInvUOrderIn, new HashMap(), "OrderedInventoryUnAssignOutputData").get("OrderedInventoryUnAssignOutputData"));
    }
    if (oInvUServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oInvUServiceOrderIn, new HashMap(), "OrderedInventoryUnAssignOutputData").get("OrderedInventoryUnAssignOutputData"));
    }
    if (oInvUEffectiveDt != null) {
      addInput("EffectiveDt", oInvUEffectiveDt);
    }
    if (DisconnectReason != null) {
      addInput("DisconnectReason", DisconnectReason);
    }
    if (oInvUManageVanityCharges != null) {
      addInput("ManageVanityCharges", oInvUManageVanityCharges);
    }
    if (oInvUFindExistingSO != null) {
      addInput("FindExistingSO", oInvUFindExistingSO);
    }
    if (oInvUVerboseResponse != null) {
      addInput("VerboseResponse", oInvUVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedInventoryUnAssignOutputData that results from the OrderedInventoryUnAssignRequest call
 * @return OrderedInventoryUnAssignOutputData resulting from udt call
 *
 */

  public OrderedInventoryUnAssignOutputData getOutput() {
    return OrderedInventoryUnAssignOutputHelper.fromMap(outputMap);
  }
}
