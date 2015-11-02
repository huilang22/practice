/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityCreateRequest.java
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
 * Class used to create a InvSecurityCreateRequest Udt Request
 *
 */

public class InvSecurityCreateRequest extends InvSecuritySubRequestParent {
/**
 *
 * Constructor to create a  InvSecurityCreateRequest
 * @param id Unique request name
 * @param InvSecCreateIn InvSecurityObjectData for InvSecurityCreateRequest
 *
 */
@JsonCreator
  public InvSecurityCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSecurity")InvSecurityObjectData InvSecCreateIn) {
    super(id, "InvSecurityCreate");
    if (InvSecCreateIn != null) {
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(InvSecCreateIn, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }

/**
 *
 * Retrieves the InvSecurityObjectData that results from the InvSecurityCreateRequest call
 * @return InvSecurityObjectData resulting from udt call
 *
 */

  public InvSecurityObjectData getOutput() {
    return InvSecurityObjectHelper.fromMap(outputMap, "InvSecurity");
  }
}
