/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityUserGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SecurityUserGetRequest Udt Request
 *
 */

public class SecurityUserGetRequest extends SecurityUserSubRequestParent {
/**
 *
 * Constructor to create a  SecurityUserGetRequest
 * @param id Unique request name
 * @param SecurityUserGetIn SecurityUserObjectKeyData for SecurityUserGetRequest
 *
 */
@JsonCreator
  public SecurityUserGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityUser")SecurityUserObjectKeyData SecurityUserGetIn) {
    super(id, "SecurityUserGet");
    if (SecurityUserGetIn != null) {
      addInput("SecurityUser", SecurityUserObjectKeyHelper.toMap(SecurityUserGetIn, new HashMap(), "SecurityUserObjectKeyData").get("SecurityUserObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SecurityUserObjectData that results from the SecurityUserGetRequest call
 * @return SecurityUserObjectData resulting from udt call
 *
 */

  public SecurityUserObjectData getOutput() {
    return SecurityUserObjectHelper.fromMap(outputMap, "SecurityUser");
  }
}
