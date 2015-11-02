/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterCreateRequest.java
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
 * Class used to create a InvsRateCenterCreateRequest Udt Request
 *
 */

public class InvsRateCenterCreateRequest extends InvsRateCenterSubRequestParent {
/**
 *
 * Constructor to create a  InvsRateCenterCreateRequest
 * @param id Unique request name
 * @param InvsRateCenterCreateIn InvsRateCenterObjectData for InvsRateCenterCreateRequest
 *
 */
@JsonCreator
  public InvsRateCenterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsRateCenter")InvsRateCenterObjectData InvsRateCenterCreateIn) {
    super(id, "InvsRateCenterCreate");
    if (InvsRateCenterCreateIn != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(InvsRateCenterCreateIn, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }

/**
 *
 * Retrieves the InvsRateCenterObjectData that results from the InvsRateCenterCreateRequest call
 * @return InvsRateCenterObjectData resulting from udt call
 *
 */

  public InvsRateCenterObjectData getOutput() {
    return InvsRateCenterObjectHelper.fromMap(outputMap, "InvsRateCenter");
  }
}
