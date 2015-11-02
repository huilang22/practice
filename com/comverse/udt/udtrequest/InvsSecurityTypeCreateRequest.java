/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeCreateRequest.java
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
 * Class used to create a InvsSecurityTypeCreateRequest Udt Request
 *
 */

public class InvsSecurityTypeCreateRequest extends InvsSecurityTypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsSecurityTypeCreateRequest
 * @param id Unique request name
 * @param InvsSecurityTypeCreateIn InvsSecurityTypeObjectData for InvsSecurityTypeCreateRequest
 *
 */
@JsonCreator
  public InvsSecurityTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSecurityType")InvsSecurityTypeObjectData InvsSecurityTypeCreateIn) {
    super(id, "InvsSecurityTypeCreate");
    if (InvsSecurityTypeCreateIn != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(InvsSecurityTypeCreateIn, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }

/**
 *
 * Retrieves the InvsSecurityTypeObjectData that results from the InvsSecurityTypeCreateRequest call
 * @return InvsSecurityTypeObjectData resulting from udt call
 *
 */

  public InvsSecurityTypeObjectData getOutput() {
    return InvsSecurityTypeObjectHelper.fromMap(outputMap, "InvsSecurityType");
  }
}
