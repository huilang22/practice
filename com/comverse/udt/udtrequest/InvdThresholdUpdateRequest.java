/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdUpdateRequest.java
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
 * Class used to create a InvdThresholdUpdateRequest Udt Request
 *
 */

public class InvdThresholdUpdateRequest extends InvdThresholdSubRequestParent {
/**
 *
 * Constructor to create a  InvdThresholdUpdateRequest
 * @param id Unique request name
 * @param InvdThresholdUpdateIn InvdThresholdObjectData for InvdThresholdUpdateRequest
 *
 */
@JsonCreator
  public InvdThresholdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdThreshold")InvdThresholdObjectData InvdThresholdUpdateIn) {
    super(id, "InvdThresholdUpdate");
    if (InvdThresholdUpdateIn != null) {
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(InvdThresholdUpdateIn, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }

/**
 *
 * Retrieves the InvdThresholdObjectData that results from the InvdThresholdUpdateRequest call
 * @return InvdThresholdObjectData resulting from udt call
 *
 */

  public InvdThresholdObjectData getOutput() {
    return InvdThresholdObjectHelper.fromMap(outputMap, "InvdThreshold");
  }
}
