/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeUpdateRequest.java
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
 * Class used to create a InvsSecurityTypeUpdateRequest Udt Request
 *
 */

public class InvsSecurityTypeUpdateRequest extends InvsSecurityTypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsSecurityTypeUpdateRequest
 * @param id Unique request name
 * @param InvsSecurityTypeUpdateIn InvsSecurityTypeObjectData for InvsSecurityTypeUpdateRequest
 *
 */
@JsonCreator
  public InvsSecurityTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSecurityType")InvsSecurityTypeObjectData InvsSecurityTypeUpdateIn) {
    super(id, "InvsSecurityTypeUpdate");
    if (InvsSecurityTypeUpdateIn != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(InvsSecurityTypeUpdateIn, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }

/**
 *
 * Retrieves the InvsSecurityTypeObjectData that results from the InvsSecurityTypeUpdateRequest call
 * @return InvsSecurityTypeObjectData resulting from udt call
 *
 */

  public InvsSecurityTypeObjectData getOutput() {
    return InvsSecurityTypeObjectHelper.fromMap(outputMap, "InvsSecurityType");
  }
}
