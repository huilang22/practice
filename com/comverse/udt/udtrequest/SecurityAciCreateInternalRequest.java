/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityAciCreateInternalRequest.java
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
 * Class used to create a SecurityAciCreateInternalRequest Udt Request
 *
 */

public class SecurityAciCreateInternalRequest extends SecurityAciSubRequestParent {
/**
 *
 * Constructor to create a  SecurityAciCreateInternalRequest
 * @param id Unique request name
 * @param AciCreateIn SecurityAciObjectData for SecurityAciCreateInternalRequest
 * @param user_name String for SecurityAciCreateInternalRequest
 *
 */
@JsonCreator
  public SecurityAciCreateInternalRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityAci")SecurityAciObjectData AciCreateIn, @JsonProperty("UserName")String user_name) {
    super(id, "SecurityAciCreateInternal");
    if (AciCreateIn != null) {
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(AciCreateIn, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
    if (user_name != null) {
      addInput("UserName", user_name);
    }
  }

/**
 *
 * Retrieves the SecurityAciObjectData that results from the SecurityAciCreateInternalRequest call
 * @return SecurityAciObjectData resulting from udt call
 *
 */

  public SecurityAciObjectData getOutput() {
    return SecurityAciObjectHelper.fromMap(outputMap, "SecurityAci");
  }
}
