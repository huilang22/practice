/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceSuspendRequest.java
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
 * Class used to create a OrderedServiceSuspendRequest Udt Request
 *
 */

public class OrderedServiceSuspendRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a  OrderedServiceSuspendRequest
 * @param id Unique request name
 * @param osSuspendServiceIn ServiceObjectData for OrderedServiceSuspendRequest
 * @param osSuspendOrderIn OrderObjectData for OrderedServiceSuspendRequest
 * @param osSStatusReasonId Integer for OrderedServiceSuspendRequest
 * @param osSSuspendDt Date for OrderedServiceSuspendRequest
 * @param osSResumeDt Date for OrderedServiceSuspendRequest
 * @param osSAnnotation String for OrderedServiceSuspendRequest
 * @param osSVerboseResponse Boolean for OrderedServiceSuspendRequest
 *
 */
@JsonCreator
  public OrderedServiceSuspendRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectData osSuspendServiceIn, @JsonProperty("Order")OrderObjectData osSuspendOrderIn, @JsonProperty("StatusReasonId")Integer osSStatusReasonId, @JsonProperty("SuspendDt")Date osSSuspendDt, @JsonProperty("ResumeDt")Date osSResumeDt, @JsonProperty("Annotation")String osSAnnotation, @JsonProperty("VerboseResponse")Boolean osSVerboseResponse) {
    super(id, "OrderedServiceSuspend");
    if (osSuspendServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(osSuspendServiceIn, new HashMap(), "OrderedServiceSuspendOutputData").get("OrderedServiceSuspendOutputData"));
    }
    if (osSuspendOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(osSuspendOrderIn, new HashMap(), "OrderedServiceSuspendOutputData").get("OrderedServiceSuspendOutputData"));
    }
    if (osSStatusReasonId != null) {
      addInput("StatusReasonId", osSStatusReasonId);
    }
    if (osSSuspendDt != null) {
      addInput("SuspendDt", osSSuspendDt);
    }
    if (osSResumeDt != null) {
      addInput("ResumeDt", osSResumeDt);
    }
    if (osSAnnotation != null) {
      addInput("Annotation", osSAnnotation);
    }
    if (osSVerboseResponse != null) {
      addInput("VerboseResponse", osSVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedServiceSuspendOutputData that results from the OrderedServiceSuspendRequest call
 * @return OrderedServiceSuspendOutputData resulting from udt call
 *
 */

  public OrderedServiceSuspendOutputData getOutput() {
    return OrderedServiceSuspendOutputHelper.fromMap(outputMap);
  }
}
