/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterGetRequest.java
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
 * Class used to create a InvsRateCenterGetRequest Udt Request
 *
 */

public class InvsRateCenterGetRequest extends InvsRateCenterSubRequestParent {
/**
 *
 * Constructor to create a  InvsRateCenterGetRequest
 * @param id Unique request name
 * @param InvsRateCenterGetIn InvsRateCenterObjectKeyData for InvsRateCenterGetRequest
 *
 */
@JsonCreator
  public InvsRateCenterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsRateCenter")InvsRateCenterObjectKeyData InvsRateCenterGetIn) {
    super(id, "InvsRateCenterGet");
    if (InvsRateCenterGetIn != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectKeyHelper.toMap(InvsRateCenterGetIn, new HashMap(), "InvsRateCenterObjectKeyData").get("InvsRateCenterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsRateCenterObjectData that results from the InvsRateCenterGetRequest call
 * @return InvsRateCenterObjectData resulting from udt call
 *
 */

  public InvsRateCenterObjectData getOutput() {
    return InvsRateCenterObjectHelper.fromMap(outputMap, "InvsRateCenter");
  }
}
