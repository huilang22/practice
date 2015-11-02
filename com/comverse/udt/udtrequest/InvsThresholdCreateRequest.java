/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdCreateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsThresholdCreateRequest Udt Request
 *
 */

public class InvsThresholdCreateRequest extends InvsThresholdSubRequestParent {
/**
 *
 * Constructor to create a  InvsThresholdCreateRequest
 * @param id Unique request name
 * @param InvsThresholdCreateIn InvsThresholdObjectData for InvsThresholdCreateRequest
 *
 */
@JsonCreator
  public InvsThresholdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsThreshold")InvsThresholdObjectData InvsThresholdCreateIn) {
    super(id, "InvsThresholdCreate");
    if (InvsThresholdCreateIn != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(InvsThresholdCreateIn, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }

/**
 *
 * Retrieves the InvsThresholdObjectData that results from the InvsThresholdCreateRequest call
 * @return InvsThresholdObjectData resulting from udt call
 *
 */

  public InvsThresholdObjectData getOutput() {
    return InvsThresholdObjectHelper.fromMap(outputMap, "InvsThreshold");
  }
}
