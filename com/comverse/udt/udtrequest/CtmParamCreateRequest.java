/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamCreateRequest.java
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
 * Class used to create a CtmParamCreateRequest Udt Request
 *
 */

public class CtmParamCreateRequest extends CtmParamSubRequestParent {
/**
 *
 * Constructor to create a  CtmParamCreateRequest
 * @param id Unique request name
 * @param CtmParamCreateIn CtmParamBaseObjectData for CtmParamCreateRequest
 *
 */
@JsonCreator
  public CtmParamCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmParam")CtmParamBaseObjectData CtmParamCreateIn) {
    super(id, "CtmParamCreate");
    if (CtmParamCreateIn != null) {
      addInput("CtmParam", CtmParamBaseObjectHelper.toMap(CtmParamCreateIn, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }

/**
 *
 * Retrieves the CtmParamObjectData that results from the CtmParamCreateRequest call
 * @return CtmParamObjectData resulting from udt call
 *
 */

  public CtmParamObjectData getOutput() {
    return CtmParamObjectHelper.fromMap(outputMap, "CtmParam");
  }
}
