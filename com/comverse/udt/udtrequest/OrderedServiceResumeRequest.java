/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceResumeRequest.java
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
 * Class used to create a OrderedServiceResumeRequest Udt Request
 *
 */

public class OrderedServiceResumeRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a  OrderedServiceResumeRequest
 * @param id Unique request name
 * @param osResumeServiceIn ServiceObjectData for OrderedServiceResumeRequest
 * @param osResumeOrderIn OrderObjectData for OrderedServiceResumeRequest
 * @param osRStatusReasonId Integer for OrderedServiceResumeRequest
 * @param osRResumeDt Date for OrderedServiceResumeRequest
 * @param osRAnnotation String for OrderedServiceResumeRequest
 * @param osRVerboseResponse Boolean for OrderedServiceResumeRequest
 *
 */
@JsonCreator
  public OrderedServiceResumeRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectData osResumeServiceIn, @JsonProperty("Order")OrderObjectData osResumeOrderIn, @JsonProperty("StatusReasonId")Integer osRStatusReasonId, @JsonProperty("ResumeDt")Date osRResumeDt, @JsonProperty("Annotation")String osRAnnotation, @JsonProperty("VerboseResponse")Boolean osRVerboseResponse) {
    super(id, "OrderedServiceResume");
    if (osResumeServiceIn != null) {
      addInput("Service", ServiceObjectHelper.toMap(osResumeServiceIn, new HashMap(), "OrderedServiceResumeOutputData").get("OrderedServiceResumeOutputData"));
    }
    if (osResumeOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(osResumeOrderIn, new HashMap(), "OrderedServiceResumeOutputData").get("OrderedServiceResumeOutputData"));
    }
    if (osRStatusReasonId != null) {
      addInput("StatusReasonId", osRStatusReasonId);
    }
    if (osRResumeDt != null) {
      addInput("ResumeDt", osRResumeDt);
    }
    if (osRAnnotation != null) {
      addInput("Annotation", osRAnnotation);
    }
    if (osRVerboseResponse != null) {
      addInput("VerboseResponse", osRVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedServiceResumeOutputData that results from the OrderedServiceResumeRequest call
 * @return OrderedServiceResumeOutputData resulting from udt call
 *
 */

  public OrderedServiceResumeOutputData getOutput() {
    return OrderedServiceResumeOutputHelper.fromMap(outputMap);
  }
}
