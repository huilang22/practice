/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationCreateRequest.java
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
 * Class used to create a InvsLocationCreateRequest Udt Request
 *
 */

public class InvsLocationCreateRequest extends InvsLocationSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationCreateRequest
 * @param id Unique request name
 * @param InvsLocationCreateIn InvsLocationObjectData for InvsLocationCreateRequest
 *
 */
@JsonCreator
  public InvsLocationCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocation")InvsLocationObjectData InvsLocationCreateIn) {
    super(id, "InvsLocationCreate");
    if (InvsLocationCreateIn != null) {
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(InvsLocationCreateIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }

/**
 *
 * Retrieves the InvsLocationObjectData that results from the InvsLocationCreateRequest call
 * @return InvsLocationObjectData resulting from udt call
 *
 */

  public InvsLocationObjectData getOutput() {
    return InvsLocationObjectHelper.fromMap(outputMap, "InvsLocation");
  }
}
