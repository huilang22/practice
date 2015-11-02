/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceCreateRequest.java
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
 * Class used to create a SecurityResourceCreateRequest Udt Request
 *
 */

public class SecurityResourceCreateRequest extends SecurityResourceSubRequestParent {
/**
 *
 * Constructor to create a  SecurityResourceCreateRequest
 * @param id Unique request name
 * @param SECreateIn SecurityResourceObjectData for SecurityResourceCreateRequest
 *
 */
@JsonCreator
  public SecurityResourceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityResource")SecurityResourceObjectData SECreateIn) {
    super(id, "SecurityResourceCreate");
    if (SECreateIn != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(SECreateIn, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }

/**
 *
 * Retrieves the SecurityResourceObjectData that results from the SecurityResourceCreateRequest call
 * @return SecurityResourceObjectData resulting from udt call
 *
 */

  public SecurityResourceObjectData getOutput() {
    return SecurityResourceObjectHelper.fromMap(outputMap, "SecurityResource");
  }
}
