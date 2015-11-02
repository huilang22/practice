/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterUpdateRequest.java
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
 * Class used to create a InvsRateCenterUpdateRequest Udt Request
 *
 */

public class InvsRateCenterUpdateRequest extends InvsRateCenterSubRequestParent {
/**
 *
 * Constructor to create a  InvsRateCenterUpdateRequest
 * @param id Unique request name
 * @param InvsRateCenterUpdateIn InvsRateCenterObjectData for InvsRateCenterUpdateRequest
 *
 */
@JsonCreator
  public InvsRateCenterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsRateCenter")InvsRateCenterObjectData InvsRateCenterUpdateIn) {
    super(id, "InvsRateCenterUpdate");
    if (InvsRateCenterUpdateIn != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(InvsRateCenterUpdateIn, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }

/**
 *
 * Retrieves the InvsRateCenterObjectData that results from the InvsRateCenterUpdateRequest call
 * @return InvsRateCenterObjectData resulting from udt call
 *
 */

  public InvsRateCenterObjectData getOutput() {
    return InvsRateCenterObjectHelper.fromMap(outputMap, "InvsRateCenter");
  }
}
