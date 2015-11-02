/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdGetRequest.java
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
 * Class used to create a InvdThresholdGetRequest Udt Request
 *
 */

public class InvdThresholdGetRequest extends InvdThresholdSubRequestParent {
/**
 *
 * Constructor to create a  InvdThresholdGetRequest
 * @param id Unique request name
 * @param InvdThresholdGetIn InvdThresholdObjectKeyData for InvdThresholdGetRequest
 *
 */
@JsonCreator
  public InvdThresholdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdThreshold")InvdThresholdObjectKeyData InvdThresholdGetIn) {
    super(id, "InvdThresholdGet");
    if (InvdThresholdGetIn != null) {
      addInput("InvdThreshold", InvdThresholdObjectKeyHelper.toMap(InvdThresholdGetIn, new HashMap(), "InvdThresholdObjectKeyData").get("InvdThresholdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvdThresholdObjectData that results from the InvdThresholdGetRequest call
 * @return InvdThresholdObjectData resulting from udt call
 *
 */

  public InvdThresholdObjectData getOutput() {
    return InvdThresholdObjectHelper.fromMap(outputMap, "InvdThreshold");
  }
}
