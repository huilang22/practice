/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInventorySwapRequest.java
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
 * Class used to create a OrderedInventorySwapRequest Udt Request
 *
 */

public class OrderedInventorySwapRequest extends OrderedInventorySubRequestParent {
/**
 *
 * Constructor to create a  OrderedInventorySwapRequest
 * @param id Unique request name
 * @param oInvSSwapInInvElementIn InvElementObjData for OrderedInventorySwapRequest
 * @param oInvSSwapOutInvElementIn InvElementObjData for OrderedInventorySwapRequest
 * @param oInvSServiceIn ServiceObjectData for OrderedInventorySwapRequest
 * @param oInvSOrderIn OrderObjectData for OrderedInventorySwapRequest
 * @param oInvSServiceOrderIn ServiceOrderObjectData for OrderedInventorySwapRequest
 * @param oInvSEffectiveDt Date for OrderedInventorySwapRequest
 * @param oInvSExternalIdType Integer for OrderedInventorySwapRequest
 * @param oInvSManageVanityCharges Boolean for OrderedInventorySwapRequest
 * @param SwapReason Integer for OrderedInventorySwapRequest
 * @param oInvSFindExistingSO Boolean for OrderedInventorySwapRequest
 * @param oInvSVerboseResponse Boolean for OrderedInventorySwapRequest
 *
 */
@JsonCreator
  public OrderedInventorySwapRequest(@JsonProperty("RequestId") String id, @JsonProperty("SwapInInvElement")InvElementObjData oInvSSwapInInvElementIn, @JsonProperty("SwapOutInvElement")InvElementObjData oInvSSwapOutInvElementIn, @JsonProperty("Service")ServiceObjectData oInvSServiceIn, @JsonProperty("Order")OrderObjectData oInvSOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData oInvSServiceOrderIn, @JsonProperty("EffectiveDt")Date oInvSEffectiveDt, @JsonProperty("ExternalIdType")Integer oInvSExternalIdType, @JsonProperty("ManageVanityCharges")Boolean oInvSManageVanityCharges, @JsonProperty("SwapReason")Integer SwapReason, @JsonProperty("FindExistingSO")Boolean oInvSFindExistingSO, @JsonProperty("VerboseResponse")Boolean oInvSVerboseResponse) {
    super(id, "OrderedInventorySwap");
    if (oInvSSwapInInvElementIn != null) {
      addInput("SwapInInvElement", InvElementObjHelper.toMap(oInvSSwapInInvElementIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSSwapOutInvElementIn != null) {
      addInput("SwapOutInvElement", InvElementObjHelper.toMap(oInvSSwapOutInvElementIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(oInvSServiceIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oInvSOrderIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oInvSServiceOrderIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSEffectiveDt != null) {
      addInput("EffectiveDt", oInvSEffectiveDt);
    }
    if (oInvSExternalIdType != null) {
      addInput("ExternalIdType", oInvSExternalIdType);
    }
    if (oInvSManageVanityCharges != null) {
      addInput("ManageVanityCharges", oInvSManageVanityCharges);
    }
    if (SwapReason != null) {
      addInput("SwapReason", SwapReason);
    }
    if (oInvSFindExistingSO != null) {
      addInput("FindExistingSO", oInvSFindExistingSO);
    }
    if (oInvSVerboseResponse != null) {
      addInput("VerboseResponse", oInvSVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedInventorySwapOutputData that results from the OrderedInventorySwapRequest call
 * @return OrderedInventorySwapOutputData resulting from udt call
 *
 */

  public OrderedInventorySwapOutputData getOutput() {
    return OrderedInventorySwapOutputHelper.fromMap(outputMap);
  }
}
