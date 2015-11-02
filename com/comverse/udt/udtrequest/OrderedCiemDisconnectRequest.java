/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedCiemDisconnectRequest.java
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
 * Class used to create a OrderedCiemDisconnectRequest Udt Request
 *
 */

public class OrderedCiemDisconnectRequest extends OrderedCiemSubRequestParent {
/**
 *
 * Constructor to create a  OrderedCiemDisconnectRequest
 * @param id Unique request name
 * @param ociemDiscIn CustomerIdEquipMapObjectData for OrderedCiemDisconnectRequest
 * @param ociemDiscOrderIn OrderObjectData for OrderedCiemDisconnectRequest
 * @param ociemDiscServiceOrderIn ServiceOrderObjectData for OrderedCiemDisconnectRequest
 * @param InactiveDt Date for OrderedCiemDisconnectRequest
 * @param ociemDiscFindExistingSOIn Boolean for OrderedCiemDisconnectRequest
 * @param ociemDiscVerboseResponseIn Boolean for OrderedCiemDisconnectRequest
 *
 */
@JsonCreator
  public OrderedCiemDisconnectRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectData ociemDiscIn, @JsonProperty("Order")OrderObjectData ociemDiscOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData ociemDiscServiceOrderIn, @JsonProperty("InactiveDt")Date InactiveDt, @JsonProperty("FindExistingSO")Boolean ociemDiscFindExistingSOIn, @JsonProperty("VerboseResponse")Boolean ociemDiscVerboseResponseIn) {
    super(id, "OrderedCiemDisconnect");
    if (ociemDiscIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(ociemDiscIn, new HashMap(), "OrderedCiemDisconnectOutputData").get("OrderedCiemDisconnectOutputData"));
    }
    if (ociemDiscOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(ociemDiscOrderIn, new HashMap(), "OrderedCiemDisconnectOutputData").get("OrderedCiemDisconnectOutputData"));
    }
    if (ociemDiscServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ociemDiscServiceOrderIn, new HashMap(), "OrderedCiemDisconnectOutputData").get("OrderedCiemDisconnectOutputData"));
    }
    if (InactiveDt != null) {
      addInput("InactiveDt", InactiveDt);
    }
    if (ociemDiscFindExistingSOIn != null) {
      addInput("FindExistingSO", ociemDiscFindExistingSOIn);
    }
    if (ociemDiscVerboseResponseIn != null) {
      addInput("VerboseResponse", ociemDiscVerboseResponseIn);
    }
  }

/**
 *
 * Retrieves the OrderedCiemDisconnectOutputData that results from the OrderedCiemDisconnectRequest call
 * @return OrderedCiemDisconnectOutputData resulting from udt call
 *
 */

  public OrderedCiemDisconnectOutputData getOutput() {
    return OrderedCiemDisconnectOutputHelper.fromMap(outputMap);
  }
}
