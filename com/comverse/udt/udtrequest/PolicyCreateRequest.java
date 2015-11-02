/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyCreateRequest.java
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
 * Class used to create a PolicyCreateRequest Udt Request
 *
 */

public class PolicyCreateRequest extends PolicySubRequestParent {
/**
 *
 * Constructor to create a  PolicyCreateRequest
 * @param id Unique request name
 * @param PolicyCreateIn PolicyObjectData for PolicyCreateRequest
 *
 */
@JsonCreator
  public PolicyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Policy")PolicyObjectData PolicyCreateIn) {
    super(id, "PolicyCreate");
    if (PolicyCreateIn != null) {
      addInput("Policy", PolicyObjectHelper.toMap(PolicyCreateIn, new HashMap(), "Policy").get("Policy"));
    }
  }

/**
 *
 * Retrieves the PolicyObjectData that results from the PolicyCreateRequest call
 * @return PolicyObjectData resulting from udt call
 *
 */

  public PolicyObjectData getOutput() {
    return PolicyObjectHelper.fromMap(outputMap, "Policy");
  }
}
