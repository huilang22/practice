/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityUpdateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvSecurityUpdateRequest Udt Request
 *
 */

public class InvSecurityUpdateRequest extends InvSecuritySubRequestParent {
/**
 *
 * Constructor to create a  InvSecurityUpdateRequest
 * @param id Unique request name
 * @param InvSecurityUpdateIn InvSecurityObjectData for InvSecurityUpdateRequest
 *
 */
@JsonCreator
  public InvSecurityUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSecurity")InvSecurityObjectData InvSecurityUpdateIn) {
    super(id, "InvSecurityUpdate");
    if (InvSecurityUpdateIn != null) {
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(InvSecurityUpdateIn, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }

/**
 *
 * Retrieves the InvSecurityObjectData that results from the InvSecurityUpdateRequest call
 * @return InvSecurityObjectData resulting from udt call
 *
 */

  public InvSecurityObjectData getOutput() {
    return InvSecurityObjectHelper.fromMap(outputMap, "InvSecurity");
  }
}
