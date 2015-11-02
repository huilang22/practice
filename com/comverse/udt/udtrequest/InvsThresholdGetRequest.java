/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdGetRequest.java
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
 * Class used to create a InvsThresholdGetRequest Udt Request
 *
 */

public class InvsThresholdGetRequest extends InvsThresholdSubRequestParent {
/**
 *
 * Constructor to create a  InvsThresholdGetRequest
 * @param id Unique request name
 * @param InvsThresholdGetIn InvsThresholdObjectKeyData for InvsThresholdGetRequest
 *
 */
@JsonCreator
  public InvsThresholdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsThreshold")InvsThresholdObjectKeyData InvsThresholdGetIn) {
    super(id, "InvsThresholdGet");
    if (InvsThresholdGetIn != null) {
      addInput("InvsThreshold", InvsThresholdObjectKeyHelper.toMap(InvsThresholdGetIn, new HashMap(), "InvsThresholdObjectKeyData").get("InvsThresholdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsThresholdObjectData that results from the InvsThresholdGetRequest call
 * @return InvsThresholdObjectData resulting from udt call
 *
 */

  public InvsThresholdObjectData getOutput() {
    return InvsThresholdObjectHelper.fromMap(outputMap, "InvsThreshold");
  }
}
