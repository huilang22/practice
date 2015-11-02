/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdUpdateRequest.java
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
 * Class used to create a InvsThresholdUpdateRequest Udt Request
 *
 */

public class InvsThresholdUpdateRequest extends InvsThresholdSubRequestParent {
/**
 *
 * Constructor to create a  InvsThresholdUpdateRequest
 * @param id Unique request name
 * @param InvsThresholdUpdateIn InvsThresholdObjectData for InvsThresholdUpdateRequest
 *
 */
@JsonCreator
  public InvsThresholdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsThreshold")InvsThresholdObjectData InvsThresholdUpdateIn) {
    super(id, "InvsThresholdUpdate");
    if (InvsThresholdUpdateIn != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(InvsThresholdUpdateIn, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }

/**
 *
 * Retrieves the InvsThresholdObjectData that results from the InvsThresholdUpdateRequest call
 * @return InvsThresholdObjectData resulting from udt call
 *
 */

  public InvsThresholdObjectData getOutput() {
    return InvsThresholdObjectHelper.fromMap(outputMap, "InvsThreshold");
  }
}
