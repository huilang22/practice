/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceDisconnectRequest.java
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
 * Class used to create a OrderedServiceDisconnectRequest Udt Request
 *
 */

public class OrderedServiceDisconnectRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a  OrderedServiceDisconnectRequest
 * @param id Unique request name
 * @param osDiscServiceIn ServiceObjectData for OrderedServiceDisconnectRequest
 * @param osDiscOrderIn OrderObjectData for OrderedServiceDisconnectRequest
 * @param StatusReasonId Integer for OrderedServiceDisconnectRequest
 * @param InactiveDt Date for OrderedServiceDisconnectRequest
 * @param Annotation String for OrderedServiceDisconnectRequest
 * @param WaiveInstallmentNrc Integer for OrderedServiceDisconnectRequest
 * @param WaiveUnbilledNrc Integer for OrderedServiceDisconnectRequest
 * @param WaiveTerminationObligation Integer for OrderedServiceDisconnectRequest
 * @param WaiveUnmetObligation Integer for OrderedServiceDisconnectRequest
 * @param WaiveRefinanceNrc Integer for OrderedServiceDisconnectRequest
 * @param osDiscVerboseResponse Boolean for OrderedServiceDisconnectRequest
 *
 */
@JsonCreator
  public OrderedServiceDisconnectRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectData osDiscServiceIn, @JsonProperty("Order")OrderObjectData osDiscOrderIn, @JsonProperty("StatusReasonId")Integer StatusReasonId, @JsonProperty("InactiveDt")Date InactiveDt, @JsonProperty("Annotation")String Annotation, @JsonProperty("WaiveInstallmentNrc")Integer WaiveInstallmentNrc, @JsonProperty("WaiveUnbilledNrc")Integer WaiveUnbilledNrc, @JsonProperty("WaiveTerminationObligation")Integer WaiveTerminationObligation, @JsonProperty("WaiveUnmetObligation")Integer WaiveUnmetObligation, @JsonProperty("WaiveRefinanceNrc")Integer WaiveRefinanceNrc, @JsonProperty("VerboseResponse")Boolean osDiscVerboseResponse) {
    super(id, "OrderedServiceDisconnect");
    if (osDiscServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(osDiscServiceIn, new HashMap(), "OrderedServiceDisconnectOutputData").get("OrderedServiceDisconnectOutputData"));
    }
    if (osDiscOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(osDiscOrderIn, new HashMap(), "OrderedServiceDisconnectOutputData").get("OrderedServiceDisconnectOutputData"));
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
    if (WaiveInstallmentNrc != null) {
      addInput("WaiveInstallmentNrc", WaiveInstallmentNrc);
    }
    if (WaiveUnbilledNrc != null) {
      addInput("WaiveUnbilledNrc", WaiveUnbilledNrc);
    }
    if (WaiveTerminationObligation != null) {
      addInput("WaiveTerminationObligation", WaiveTerminationObligation);
    }
    if (WaiveUnmetObligation != null) {
      addInput("WaiveUnmetObligation", WaiveUnmetObligation);
    }
    if (WaiveRefinanceNrc != null) {
      addInput("WaiveRefinanceNrc", WaiveRefinanceNrc);
    }
    if (osDiscVerboseResponse != null) {
      addInput("VerboseResponse", osDiscVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedServiceDisconnectOutputData that results from the OrderedServiceDisconnectRequest call
 * @return OrderedServiceDisconnectOutputData resulting from udt call
 *
 */

  public OrderedServiceDisconnectOutputData getOutput() {
    return OrderedServiceDisconnectOutputHelper.fromMap(outputMap);
  }
}
