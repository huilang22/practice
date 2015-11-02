/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedCiemCreateRequest.java
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
 * Class used to create a OrderedCiemCreateRequest Udt Request
 *
 */

public class OrderedCiemCreateRequest extends OrderedCiemSubRequestParent {
/**
 *
 * Constructor to create a  OrderedCiemCreateRequest
 * @param id Unique request name
 * @param ociemIn CustomerIdEquipMapObjectData for OrderedCiemCreateRequest
 * @param ociemOrderIn OrderObjectData for OrderedCiemCreateRequest
 * @param ociemServiceOrderIn ServiceOrderObjectData for OrderedCiemCreateRequest
 * @param ociemFindExistingSOIn Boolean for OrderedCiemCreateRequest
 * @param ociemVerboseResponseIn Boolean for OrderedCiemCreateRequest
 *
 */
@JsonCreator
  public OrderedCiemCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectData ociemIn, @JsonProperty("Order")OrderObjectData ociemOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData ociemServiceOrderIn, @JsonProperty("FindExistingSO")Boolean ociemFindExistingSOIn, @JsonProperty("VerboseResponse")Boolean ociemVerboseResponseIn) {
    super(id, "OrderedCiemCreate");
    if (ociemIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(ociemIn, new HashMap(), "OrderedCiemCreateOutputData").get("OrderedCiemCreateOutputData"));
    }
    if (ociemOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(ociemOrderIn, new HashMap(), "OrderedCiemCreateOutputData").get("OrderedCiemCreateOutputData"));
    }
    if (ociemServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ociemServiceOrderIn, new HashMap(), "OrderedCiemCreateOutputData").get("OrderedCiemCreateOutputData"));
    }
    if (ociemFindExistingSOIn != null) {
      addInput("FindExistingSO", ociemFindExistingSOIn);
    }
    if (ociemVerboseResponseIn != null) {
      addInput("VerboseResponse", ociemVerboseResponseIn);
    }
  }

/**
 *
 * Retrieves the OrderedCiemCreateOutputData that results from the OrderedCiemCreateRequest call
 * @return OrderedCiemCreateOutputData resulting from udt call
 *
 */

  public OrderedCiemCreateOutputData getOutput() {
    return OrderedCiemCreateOutputHelper.fromMap(outputMap);
  }
}
