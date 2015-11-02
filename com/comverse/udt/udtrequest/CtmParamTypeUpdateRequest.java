/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamTypeUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtmParamTypeUpdateRequest Udt Request
 *
 */

public class CtmParamTypeUpdateRequest extends CtmParamTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtmParamTypeUpdateRequest
 * @param id Unique request name
 * @param CtmParamTypeUpdateIn CtmParamTypeObjectData for CtmParamTypeUpdateRequest
 *
 */
@JsonCreator
  public CtmParamTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmParamType")CtmParamTypeObjectData CtmParamTypeUpdateIn) {
    super(id, "CtmParamTypeUpdate");
    if (CtmParamTypeUpdateIn != null) {
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(CtmParamTypeUpdateIn, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }

/**
 *
 * Retrieves the CtmParamTypeObjectData that results from the CtmParamTypeUpdateRequest call
 * @return CtmParamTypeObjectData resulting from udt call
 *
 */

  public CtmParamTypeObjectData getOutput() {
    return CtmParamTypeObjectHelper.fromMap(outputMap, "CtmParamType");
  }
}
