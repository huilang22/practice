/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationUpdateRequest.java
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
 * Class used to create a InvsLocationUpdateRequest Udt Request
 *
 */

public class InvsLocationUpdateRequest extends InvsLocationSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationUpdateRequest
 * @param id Unique request name
 * @param InvsLocationUpdateIn InvsLocationObjectData for InvsLocationUpdateRequest
 *
 */
@JsonCreator
  public InvsLocationUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocation")InvsLocationObjectData InvsLocationUpdateIn) {
    super(id, "InvsLocationUpdate");
    if (InvsLocationUpdateIn != null) {
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(InvsLocationUpdateIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }

/**
 *
 * Retrieves the InvsLocationObjectData that results from the InvsLocationUpdateRequest call
 * @return InvsLocationObjectData resulting from udt call
 *
 */

  public InvsLocationObjectData getOutput() {
    return InvsLocationObjectHelper.fromMap(outputMap, "InvsLocation");
  }
}
