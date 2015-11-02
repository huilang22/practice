/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityGetRequest.java
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
 * Class used to create a InvSecurityGetRequest Udt Request
 *
 */

public class InvSecurityGetRequest extends InvSecuritySubRequestParent {
/**
 *
 * Constructor to create a  InvSecurityGetRequest
 * @param id Unique request name
 * @param InvSecurityGetIn InvSecurityObjectKeyData for InvSecurityGetRequest
 *
 */
@JsonCreator
  public InvSecurityGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSecurity")InvSecurityObjectKeyData InvSecurityGetIn) {
    super(id, "InvSecurityGet");
    if (InvSecurityGetIn != null) {
      addInput("InvSecurity", InvSecurityObjectKeyHelper.toMap(InvSecurityGetIn, new HashMap(), "InvSecurityObjectKeyData").get("InvSecurityObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvSecurityObjectData that results from the InvSecurityGetRequest call
 * @return InvSecurityObjectData resulting from udt call
 *
 */

  public InvSecurityObjectData getOutput() {
    return InvSecurityObjectHelper.fromMap(outputMap, "InvSecurity");
  }
}
