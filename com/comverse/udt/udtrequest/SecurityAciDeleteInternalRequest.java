/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityAciDeleteInternalRequest.java
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
 * Class used to create a SecurityAciDeleteInternalRequest Udt Request
 *
 */

public class SecurityAciDeleteInternalRequest extends SecurityAciSubRequestParent {
/**
 *
 * Constructor to create a  SecurityAciDeleteInternalRequest
 * @param id Unique request name
 * @param AciDeleteIn SecurityAciObjectData for SecurityAciDeleteInternalRequest
 *
 */
@JsonCreator
  public SecurityAciDeleteInternalRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityAci")SecurityAciObjectData AciDeleteIn) {
    super(id, "SecurityAciDeleteInternal");
    if (AciDeleteIn != null) {
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(AciDeleteIn, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
  }

/**
 *
 * Retrieves the SecurityAciObjectData that results from the SecurityAciDeleteInternalRequest call
 * @return SecurityAciObjectData resulting from udt call
 *
 */

  public SecurityAciObjectData getOutput() {
    return SecurityAciObjectHelper.fromMap(outputMap, "SecurityAci");
  }
}
