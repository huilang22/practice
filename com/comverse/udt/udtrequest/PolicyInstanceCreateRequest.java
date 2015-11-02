/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceCreateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PolicyInstanceCreateRequest Udt Request
 *
 */

public class PolicyInstanceCreateRequest extends PolicyInstanceSubRequestParent {
/**
 *
 * Constructor to create a  PolicyInstanceCreateRequest
 * @param id Unique request name
 * @param piCreateIn PolicyInstanceObjectData for PolicyInstanceCreateRequest
 *
 */
@JsonCreator
  public PolicyInstanceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PolicyInstance")PolicyInstanceObjectData piCreateIn) {
    super(id, "PolicyInstanceCreate");
    if (piCreateIn != null) {
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(piCreateIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }

/**
 *
 * Retrieves the PolicyInstanceObjectData that results from the PolicyInstanceCreateRequest call
 * @return PolicyInstanceObjectData resulting from udt call
 *
 */

  public PolicyInstanceObjectData getOutput() {
    return PolicyInstanceObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
}
