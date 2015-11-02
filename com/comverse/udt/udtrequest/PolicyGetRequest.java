/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyGetRequest.java
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
 * Class used to create a PolicyGetRequest Udt Request
 *
 */

public class PolicyGetRequest extends PolicySubRequestParent {
/**
 *
 * Constructor to create a  PolicyGetRequest
 * @param id Unique request name
 * @param PolicyGetIn PolicyObjectKeyData for PolicyGetRequest
 *
 */
@JsonCreator
  public PolicyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Policy")PolicyObjectKeyData PolicyGetIn) {
    super(id, "PolicyGet");
    if (PolicyGetIn != null) {
      addInput("Policy", PolicyObjectKeyHelper.toMap(PolicyGetIn, new HashMap(), "PolicyObjectKeyData").get("PolicyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PolicyObjectData that results from the PolicyGetRequest call
 * @return PolicyObjectData resulting from udt call
 *
 */

  public PolicyObjectData getOutput() {
    return PolicyObjectHelper.fromMap(outputMap, "Policy");
  }
}
