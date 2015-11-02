/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvokeRequest.java
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

import com.csgsystems.ai.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvokeRequest Udt Request
 *
 */

public class InvokeRequest extends AISubRequestParent {
/**
 *
 * Constructor to create a  InvokeRequest
 * @param id Unique request name
 * @param serviceName String for InvokeRequest
 * @param payload String for InvokeRequest
 *
 */
@JsonCreator
  public InvokeRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceName")String serviceName, @JsonProperty("Payload")String payload) {
    super(id, "Invoke");
    if (serviceName != null) {
      addInput("ServiceName", serviceName);
    }
    if (payload != null) {
      addInput("Payload", payload);
    }
  }

/**
 *
 * Retrieves the InvokeOutputData that results from the InvokeRequest call
 * @return InvokeOutputData resulting from udt call
 *
 */

  public InvokeOutputData getOutput() {
    return InvokeOutputHelper.fromMap(outputMap);
  }
}
