/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeGetRequest.java
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
 * Class used to create a InvsSecurityTypeGetRequest Udt Request
 *
 */

public class InvsSecurityTypeGetRequest extends InvsSecurityTypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsSecurityTypeGetRequest
 * @param id Unique request name
 * @param InvsSecurityTypeGetIn InvsSecurityTypeObjectKeyData for InvsSecurityTypeGetRequest
 *
 */
@JsonCreator
  public InvsSecurityTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSecurityType")InvsSecurityTypeObjectKeyData InvsSecurityTypeGetIn) {
    super(id, "InvsSecurityTypeGet");
    if (InvsSecurityTypeGetIn != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectKeyHelper.toMap(InvsSecurityTypeGetIn, new HashMap(), "InvsSecurityTypeObjectKeyData").get("InvsSecurityTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSecurityTypeObjectData that results from the InvsSecurityTypeGetRequest call
 * @return InvsSecurityTypeObjectData resulting from udt call
 *
 */

  public InvsSecurityTypeObjectData getOutput() {
    return InvsSecurityTypeObjectHelper.fromMap(outputMap, "InvsSecurityType");
  }
}
