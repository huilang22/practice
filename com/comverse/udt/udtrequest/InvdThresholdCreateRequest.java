/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdCreateRequest.java
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
 * Class used to create a InvdThresholdCreateRequest Udt Request
 *
 */

public class InvdThresholdCreateRequest extends InvdThresholdSubRequestParent {
/**
 *
 * Constructor to create a  InvdThresholdCreateRequest
 * @param id Unique request name
 * @param InvdThresholdCreateIn InvdThresholdObjectData for InvdThresholdCreateRequest
 *
 */
@JsonCreator
  public InvdThresholdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdThreshold")InvdThresholdObjectData InvdThresholdCreateIn) {
    super(id, "InvdThresholdCreate");
    if (InvdThresholdCreateIn != null) {
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(InvdThresholdCreateIn, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }

/**
 *
 * Retrieves the InvdThresholdObjectData that results from the InvdThresholdCreateRequest call
 * @return InvdThresholdObjectData resulting from udt call
 *
 */

  public InvdThresholdObjectData getOutput() {
    return InvdThresholdObjectHelper.fromMap(outputMap, "InvdThreshold");
  }
}
