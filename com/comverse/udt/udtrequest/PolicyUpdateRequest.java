/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PolicyUpdateRequest Udt Request
 *
 */

public class PolicyUpdateRequest extends PolicySubRequestParent {
/**
 *
 * Constructor to create a  PolicyUpdateRequest
 * @param id Unique request name
 * @param PolicyUpdateIn PolicyObjectData for PolicyUpdateRequest
 *
 */
@JsonCreator
  public PolicyUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Policy")PolicyObjectData PolicyUpdateIn) {
    super(id, "PolicyUpdate");
    if (PolicyUpdateIn != null) {
      addInput("Policy", PolicyObjectHelper.toMap(PolicyUpdateIn, new HashMap(), "Policy").get("Policy"));
    }
  }

/**
 *
 * Retrieves the PolicyObjectData that results from the PolicyUpdateRequest call
 * @return PolicyObjectData resulting from udt call
 *
 */

  public PolicyObjectData getOutput() {
    return PolicyObjectHelper.fromMap(outputMap, "Policy");
  }
}
