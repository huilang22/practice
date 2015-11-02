/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedCiemSetCurrentRequest.java
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
 * Class used to create a OrderedCiemSetCurrentRequest Udt Request
 *
 */

public class OrderedCiemSetCurrentRequest extends OrderedCiemSubRequestParent {
/**
 *
 * Constructor to create a  OrderedCiemSetCurrentRequest
 * @param id Unique request name
 * @param ociemUIn CustomerIdEquipMapObjectData for OrderedCiemSetCurrentRequest
 * @param ociemUOrderIn OrderObjectData for OrderedCiemSetCurrentRequest
 * @param ociemUServiceOrderIn ServiceOrderObjectData for OrderedCiemSetCurrentRequest
 * @param EffectiveDt Date for OrderedCiemSetCurrentRequest
 * @param ociemUFindExistingSOIn Boolean for OrderedCiemSetCurrentRequest
 * @param ociemUVerboseResponseIn Boolean for OrderedCiemSetCurrentRequest
 *
 */
@JsonCreator
  public OrderedCiemSetCurrentRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectData ociemUIn, @JsonProperty("Order")OrderObjectData ociemUOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData ociemUServiceOrderIn, @JsonProperty("EffectiveDt")Date EffectiveDt, @JsonProperty("FindExistingSO")Boolean ociemUFindExistingSOIn, @JsonProperty("VerboseResponse")Boolean ociemUVerboseResponseIn) {
    super(id, "OrderedCiemSetCurrent");
    if (ociemUIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(ociemUIn, new HashMap(), "OrderedCiemSetCurrentOutputData").get("OrderedCiemSetCurrentOutputData"));
    }
    if (ociemUOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(ociemUOrderIn, new HashMap(), "OrderedCiemSetCurrentOutputData").get("OrderedCiemSetCurrentOutputData"));
    }
    if (ociemUServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ociemUServiceOrderIn, new HashMap(), "OrderedCiemSetCurrentOutputData").get("OrderedCiemSetCurrentOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (ociemUFindExistingSOIn != null) {
      addInput("FindExistingSO", ociemUFindExistingSOIn);
    }
    if (ociemUVerboseResponseIn != null) {
      addInput("VerboseResponse", ociemUVerboseResponseIn);
    }
  }

/**
 *
 * Retrieves the OrderedCiemSetCurrentOutputData that results from the OrderedCiemSetCurrentRequest call
 * @return OrderedCiemSetCurrentOutputData resulting from udt call
 *
 */

  public OrderedCiemSetCurrentOutputData getOutput() {
    return OrderedCiemSetCurrentOutputHelper.fromMap(outputMap);
  }
}
