/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamTypeCreateRequest.java
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
 * Class used to create a CtmParamTypeCreateRequest Udt Request
 *
 */

public class CtmParamTypeCreateRequest extends CtmParamTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtmParamTypeCreateRequest
 * @param id Unique request name
 * @param CtmParamTypeCreateIn CtmParamTypeObjectData for CtmParamTypeCreateRequest
 *
 */
@JsonCreator
  public CtmParamTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmParamType")CtmParamTypeObjectData CtmParamTypeCreateIn) {
    super(id, "CtmParamTypeCreate");
    if (CtmParamTypeCreateIn != null) {
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(CtmParamTypeCreateIn, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }

/**
 *
 * Retrieves the CtmParamTypeObjectData that results from the CtmParamTypeCreateRequest call
 * @return CtmParamTypeObjectData resulting from udt call
 *
 */

  public CtmParamTypeObjectData getOutput() {
    return CtmParamTypeObjectHelper.fromMap(outputMap, "CtmParamType");
  }
}
