/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityCallRequest.java
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

import com.csgsystems.sec.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SecurityCallRequest Udt Request
 *
 */

public class SecurityCallRequest extends SecurityPortalSubRequestParent {
/**
 *
 * Constructor to create a  SecurityCallRequest
 * @param id Unique request name
 * @param SecurityPortalIn SecurityPortalObjectData for SecurityCallRequest
 *
 */
@JsonCreator
  public SecurityCallRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityPortal")SecurityPortalObjectData SecurityPortalIn) {
    super(id, "SecurityCall");
    if (SecurityPortalIn != null) {
      addInput("SecurityPortal", SecurityPortalObjectHelper.toMap(SecurityPortalIn, new HashMap(), "SecurityPortal").get("SecurityPortal"));
    }
  }

/**
 *
 * Retrieves the SecurityPortalObjectData that results from the SecurityCallRequest call
 * @return SecurityPortalObjectData resulting from udt call
 *
 */

  public SecurityPortalObjectData getOutput() {
    return SecurityPortalObjectHelper.fromMap(outputMap, "SecurityPortal");
  }
}
