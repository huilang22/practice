/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInvPlaceholderAssignRequest.java
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
 * Class used to create a OrderedInvPlaceholderAssignRequest Udt Request
 *
 */

public class OrderedInvPlaceholderAssignRequest extends OrderedInvPlaceholderSubRequestParent {
/**
 *
 * Constructor to create a  OrderedInvPlaceholderAssignRequest
 * @param id Unique request name
 * @param oipaInvPlaceholderIn InvPlaceholderObjectData for OrderedInvPlaceholderAssignRequest
 * @param oipaInvElementIn InvElementObjData for OrderedInvPlaceholderAssignRequest
 * @param oipaServiceIn ServiceObjectData for OrderedInvPlaceholderAssignRequest
 * @param oipaOrderIn OrderObjectData for OrderedInvPlaceholderAssignRequest
 * @param oipaServiceOrderIn ServiceOrderObjectData for OrderedInvPlaceholderAssignRequest
 * @param oipaEffectiveDt Date for OrderedInvPlaceholderAssignRequest
 * @param oipaExternalIdType Integer for OrderedInvPlaceholderAssignRequest
 * @param oipaManageVanityCharges Boolean for OrderedInvPlaceholderAssignRequest
 * @param oipaFindExistingSO Boolean for OrderedInvPlaceholderAssignRequest
 * @param oipaVerboseResponse Boolean for OrderedInvPlaceholderAssignRequest
 *
 */
@JsonCreator
  public OrderedInvPlaceholderAssignRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvPlaceholder")InvPlaceholderObjectData oipaInvPlaceholderIn, @JsonProperty("InvElement")InvElementObjData oipaInvElementIn, @JsonProperty("Service")ServiceObjectData oipaServiceIn, @JsonProperty("Order")OrderObjectData oipaOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData oipaServiceOrderIn, @JsonProperty("EffectiveDt")Date oipaEffectiveDt, @JsonProperty("ExternalIdType")Integer oipaExternalIdType, @JsonProperty("ManageVanityCharges")Boolean oipaManageVanityCharges, @JsonProperty("FindExistingSO")Boolean oipaFindExistingSO, @JsonProperty("VerboseResponse")Boolean oipaVerboseResponse) {
    super(id, "OrderedInvPlaceholderAssign");
    if (oipaInvPlaceholderIn != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(oipaInvPlaceholderIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaInvElementIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(oipaInvElementIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(oipaServiceIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oipaOrderIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oipaServiceOrderIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaEffectiveDt != null) {
      addInput("EffectiveDt", oipaEffectiveDt);
    }
    if (oipaExternalIdType != null) {
      addInput("ExternalIdType", oipaExternalIdType);
    }
    if (oipaManageVanityCharges != null) {
      addInput("ManageVanityCharges", oipaManageVanityCharges);
    }
    if (oipaFindExistingSO != null) {
      addInput("FindExistingSO", oipaFindExistingSO);
    }
    if (oipaVerboseResponse != null) {
      addInput("VerboseResponse", oipaVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedInvPlaceholderAssignOutputData that results from the OrderedInvPlaceholderAssignRequest call
 * @return OrderedInvPlaceholderAssignOutputData resulting from udt call
 *
 */

  public OrderedInvPlaceholderAssignOutputData getOutput() {
    return OrderedInvPlaceholderAssignOutputHelper.fromMap(outputMap);
  }
}
