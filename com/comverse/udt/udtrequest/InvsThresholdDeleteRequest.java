/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdDeleteRequest.java
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
 * Class used to create a InvsThresholdDeleteRequest Udt Request
 *
 */

public class InvsThresholdDeleteRequest extends InvsThresholdRequest {
/**
 *
 * Constructor to create a  InvsThresholdDeleteRequest
 * @param id Unique request name
 * @param InvsThresholdDeleteIn InvsThresholdObjectData for InvsThresholdDeleteRequest
 *
 */
@JsonCreator
  public InvsThresholdDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsThreshold")InvsThresholdObjectData InvsThresholdDeleteIn) {
    super(id, "InvsThresholdDelete");
    if (InvsThresholdDeleteIn != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(InvsThresholdDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
