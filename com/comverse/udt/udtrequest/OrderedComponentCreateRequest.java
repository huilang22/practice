/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedComponentCreateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderedComponentCreateRequest Udt Request
 *
 */

public class OrderedComponentCreateRequest extends OrderedComponentSubRequestParent {
/**
 *
 * Constructor to create a  OrderedComponentCreateRequest
 * @param id Unique request name
 * @param oCcComponentIn ComponentObjectData for OrderedComponentCreateRequest
 * @param oCcOrderIn OrderObjectData for OrderedComponentCreateRequest
 * @param oCcServiceOrderIn ServiceOrderObjectData for OrderedComponentCreateRequest
 * @param WaiveActivation Boolean for OrderedComponentCreateRequest
 * @param OwningAccountInternalId Integer for OrderedComponentCreateRequest
 * @param oCcFindExistingSO Boolean for OrderedComponentCreateRequest
 * @param oCcVerboseResponse Boolean for OrderedComponentCreateRequest
 * @param GroupId Integer for OrderedComponentCreateRequest
 * @param GroupIdServ Integer for OrderedComponentCreateRequest
 *
 */
@JsonCreator
  public OrderedComponentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectData oCcComponentIn, @JsonProperty("Order")OrderObjectData oCcOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData oCcServiceOrderIn, @JsonProperty("WaiveActivation")Boolean WaiveActivation, @JsonProperty("OwningAccountInternalId")Integer OwningAccountInternalId, @JsonProperty("FindExistingSO")Boolean oCcFindExistingSO, @JsonProperty("VerboseResponse")Boolean oCcVerboseResponse, @JsonProperty("GroupId")Integer GroupId, @JsonProperty("GroupIdServ")Integer GroupIdServ) {
    super(id, "OrderedComponentCreate");
    if (oCcComponentIn != null) {
      addInput("Component", ComponentObjectHelper.toMap(oCcComponentIn, new HashMap(), "OrderedComponentCreateOutputData").get("OrderedComponentCreateOutputData"));
    }
    if (oCcOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(oCcOrderIn, new HashMap(), "OrderedComponentCreateOutputData").get("OrderedComponentCreateOutputData"));
    }
    if (oCcServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oCcServiceOrderIn, new HashMap(), "OrderedComponentCreateOutputData").get("OrderedComponentCreateOutputData"));
    }
    if (WaiveActivation != null) {
      addInput("WaiveActivation", WaiveActivation);
    }
    if (OwningAccountInternalId != null) {
      addInput("OwningAccountInternalId", OwningAccountInternalId);
    }
    if (oCcFindExistingSO != null) {
      addInput("FindExistingSO", oCcFindExistingSO);
    }
    if (oCcVerboseResponse != null) {
      addInput("VerboseResponse", oCcVerboseResponse);
    }
    if (GroupId != null) {
      addInput("GroupId", GroupId);
    }
    if (GroupIdServ != null) {
      addInput("GroupIdServ", GroupIdServ);
    }
  }

/**
 *
 * Retrieves the OrderedComponentCreateOutputData that results from the OrderedComponentCreateRequest call
 * @return OrderedComponentCreateOutputData resulting from udt call
 *
 */

  public OrderedComponentCreateOutputData getOutput() {
    return OrderedComponentCreateOutputHelper.fromMap(outputMap);
  }
}
