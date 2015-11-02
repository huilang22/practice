/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceGetRequest.java
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
 * Class used to create a PolicyInstanceGetRequest Udt Request
 *
 */

public class PolicyInstanceGetRequest extends PolicyInstanceSubRequestParent {
/**
 *
 * Constructor to create a  PolicyInstanceGetRequest
 * @param id Unique request name
 * @param piGetIn PolicyInstanceObjectKeyData for PolicyInstanceGetRequest
 *
 */
@JsonCreator
  public PolicyInstanceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PolicyInstance")PolicyInstanceObjectKeyData piGetIn) {
    super(id, "PolicyInstanceGet");
    if (piGetIn != null) {
      addInput("PolicyInstance", PolicyInstanceObjectKeyHelper.toMap(piGetIn, new HashMap(), "PolicyInstanceObjectKeyData").get("PolicyInstanceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PolicyInstanceObjectData that results from the PolicyInstanceGetRequest call
 * @return PolicyInstanceObjectData resulting from udt call
 *
 */

  public PolicyInstanceObjectData getOutput() {
    return PolicyInstanceObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
}
