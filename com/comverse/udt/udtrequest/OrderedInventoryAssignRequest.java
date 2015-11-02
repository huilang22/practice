/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInventoryAssignRequest.java
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
 * Class used to create a OrderedInventoryAssignRequest Udt Request
 *
 */

public class OrderedInventoryAssignRequest extends OrderedInventorySubRequestParent {
/**
 *
 * Constructor to create a  OrderedInventoryAssignRequest
 * @param id Unique request name
 * @param oInvAInvElementIn InvElementObjData for OrderedInventoryAssignRequest
 * @param oInvAServiceIn ServiceObjectData for OrderedInventoryAssignRequest
 * @param oInvAOrderIn OrderObjectData for OrderedInventoryAssignRequest
 * @param oInvAServiceOrderIn ServiceOrderObjectData for OrderedInventoryAssignRequest
 * @param oInvAInvPlaceholderIn InvPlaceholderObjectData for OrderedInventoryAssignRequest
 * @param oInvAEffectiveDt Date for OrderedInventoryAssignRequest
 * @param oInvAExternalIdType Integer for OrderedInventoryAssignRequest
 * @param oInvAManageVanityCharges Boolean for OrderedInventoryAssignRequest
 * @param oInvAFindExistingSO Boolean for OrderedInventoryAssignRequest
 * @param oInvAVerboseResponse Boolean for OrderedInventoryAssignRequest
 *
 */
@JsonCreator
  public OrderedInventoryAssignRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData oInvAInvElementIn, @JsonProperty("Service")ServiceObjectData oInvAServiceIn, @JsonProperty("Order")OrderObjectData oInvAOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData oInvAServiceOrderIn, @JsonProperty("InvPlaceholder")InvPlaceholderObjectData oInvAInvPlaceholderIn, @JsonProperty("EffectiveDt")Date oInvAEffectiveDt, @JsonProperty("ExternalIdType")Integer oInvAExternalIdType, @JsonProperty("ManageVanityCharges")Boolean oInvAManageVanityCharges, @JsonProperty("FindExistingSO")Boolean oInvAFindExistingSO, @JsonProperty("VerboseResponse")Boolean oInvAVerboseResponse) {
    super(id, "OrderedInventoryAssign");
    if (oInvAInvElementIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(oInvAInvElementIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(oInvAServiceIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oInvAOrderIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oInvAServiceOrderIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAInvPlaceholderIn != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(oInvAInvPlaceholderIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAEffectiveDt != null) {
      addInput("EffectiveDt", oInvAEffectiveDt);
    }
    if (oInvAExternalIdType != null) {
      addInput("ExternalIdType", oInvAExternalIdType);
    }
    if (oInvAManageVanityCharges != null) {
      addInput("ManageVanityCharges", oInvAManageVanityCharges);
    }
    if (oInvAFindExistingSO != null) {
      addInput("FindExistingSO", oInvAFindExistingSO);
    }
    if (oInvAVerboseResponse != null) {
      addInput("VerboseResponse", oInvAVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedInventoryAssignOutputData that results from the OrderedInventoryAssignRequest call
 * @return OrderedInventoryAssignOutputData resulting from udt call
 *
 */

  public OrderedInventoryAssignOutputData getOutput() {
    return OrderedInventoryAssignOutputHelper.fromMap(outputMap);
  }
}
