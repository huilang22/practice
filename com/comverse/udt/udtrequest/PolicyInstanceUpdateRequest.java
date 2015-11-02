/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceUpdateRequest.java
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
 * Class used to create a PolicyInstanceUpdateRequest Udt Request
 *
 */

public class PolicyInstanceUpdateRequest extends PolicyInstanceSubRequestParent {
/**
 *
 * Constructor to create a  PolicyInstanceUpdateRequest
 * @param id Unique request name
 * @param piUpdateIn PolicyInstanceObjectData for PolicyInstanceUpdateRequest
 *
 */
@JsonCreator
  public PolicyInstanceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PolicyInstance")PolicyInstanceObjectData piUpdateIn) {
    super(id, "PolicyInstanceUpdate");
    if (piUpdateIn != null) {
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(piUpdateIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }

/**
 *
 * Retrieves the PolicyInstanceObjectData that results from the PolicyInstanceUpdateRequest call
 * @return PolicyInstanceObjectData resulting from udt call
 *
 */

  public PolicyInstanceObjectData getOutput() {
    return PolicyInstanceObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
}
