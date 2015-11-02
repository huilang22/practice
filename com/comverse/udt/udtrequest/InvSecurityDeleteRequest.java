/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityDeleteRequest.java
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
 * Class used to create a InvSecurityDeleteRequest Udt Request
 *
 */

public class InvSecurityDeleteRequest extends InvSecurityRequest {
/**
 *
 * Constructor to create a  InvSecurityDeleteRequest
 * @param id Unique request name
 * @param InvSecurityDeleteIn InvSecurityObjectKeyData for InvSecurityDeleteRequest
 *
 */
@JsonCreator
  public InvSecurityDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSecurity")InvSecurityObjectKeyData InvSecurityDeleteIn) {
    super(id, "InvSecurityDelete");
    if (InvSecurityDeleteIn != null) {
      addInput("InvSecurity", InvSecurityObjectKeyHelper.toMap(InvSecurityDeleteIn, new HashMap(), "InvSecurityObjectKeyData").get("InvSecurityObjectKeyData"));
    }
  }

}
