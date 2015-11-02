/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceGetRequest.java
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
 * Class used to create a SecurityResourceGetRequest Udt Request
 *
 */

public class SecurityResourceGetRequest extends SecurityResourceSubRequestParent {
/**
 *
 * Constructor to create a  SecurityResourceGetRequest
 * @param id Unique request name
 * @param SECGetIn SecurityResourceObjectData for SecurityResourceGetRequest
 *
 */
@JsonCreator
  public SecurityResourceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityResource")SecurityResourceObjectData SECGetIn) {
    super(id, "SecurityResourceGet");
    if (SECGetIn != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(SECGetIn, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }

/**
 *
 * Retrieves the SecurityResourceObjectData that results from the SecurityResourceGetRequest call
 * @return SecurityResourceObjectData resulting from udt call
 *
 */

  public SecurityResourceObjectData getOutput() {
    return SecurityResourceObjectHelper.fromMap(outputMap, "SecurityResource");
  }
}
