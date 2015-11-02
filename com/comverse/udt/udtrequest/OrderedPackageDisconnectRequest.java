/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPackageDisconnectRequest.java
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
 * Class used to create a OrderedPackageDisconnectRequest Udt Request
 *
 */

public class OrderedPackageDisconnectRequest extends OrderedPackageSubRequestParent {
/**
 *
 * Constructor to create a  OrderedPackageDisconnectRequest
 * @param id Unique request name
 * @param opdPackageIn ProductPackageObjectData for OrderedPackageDisconnectRequest
 * @param opdOrderIn OrderObjectData for OrderedPackageDisconnectRequest
 * @param StatusReasonId Integer for OrderedPackageDisconnectRequest
 * @param InactiveDt Date for OrderedPackageDisconnectRequest
 * @param Annotation String for OrderedPackageDisconnectRequest
 * @param WaiveTerminationObligation Integer for OrderedPackageDisconnectRequest
 * @param WaiveUnmetObligation Integer for OrderedPackageDisconnectRequest
 * @param opdVerboseResponse Boolean for OrderedPackageDisconnectRequest
 *
 */
@JsonCreator
  public OrderedPackageDisconnectRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectData opdPackageIn, @JsonProperty("Order")OrderObjectData opdOrderIn, @JsonProperty("StatusReasonId")Integer StatusReasonId, @JsonProperty("InactiveDt")Date InactiveDt, @JsonProperty("Annotation")String Annotation, @JsonProperty("WaiveTerminationObligation")Integer WaiveTerminationObligation, @JsonProperty("WaiveUnmetObligation")Integer WaiveUnmetObligation, @JsonProperty("VerboseResponse")Boolean opdVerboseResponse) {
    super(id, "OrderedPackageDisconnect");
    if (opdPackageIn != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(opdPackageIn, new HashMap(), "OrderedPackageDisconnectOutputData").get("OrderedPackageDisconnectOutputData"));
    }
    if (opdOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(opdOrderIn, new HashMap(), "OrderedPackageDisconnectOutputData").get("OrderedPackageDisconnectOutputData"));
    }
    if (StatusReasonId != null) {
      addInput("StatusReasonId", StatusReasonId);
    }
    if (InactiveDt != null) {
      addInput("InactiveDt", InactiveDt);
    }
    if (Annotation != null) {
      addInput("Annotation", Annotation);
    }
    if (WaiveTerminationObligation != null) {
      addInput("WaiveTerminationObligation", WaiveTerminationObligation);
    }
    if (WaiveUnmetObligation != null) {
      addInput("WaiveUnmetObligation", WaiveUnmetObligation);
    }
    if (opdVerboseResponse != null) {
      addInput("VerboseResponse", opdVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedPackageDisconnectOutputData that results from the OrderedPackageDisconnectRequest call
 * @return OrderedPackageDisconnectOutputData resulting from udt call
 *
 */

  public OrderedPackageDisconnectOutputData getOutput() {
    return OrderedPackageDisconnectOutputHelper.fromMap(outputMap);
  }
}
