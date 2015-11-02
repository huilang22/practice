/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamUpdateRequest.java
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
 * Class used to create a CtmParamUpdateRequest Udt Request
 *
 */

public class CtmParamUpdateRequest extends CtmParamSubRequestParent {
/**
 *
 * Constructor to create a  CtmParamUpdateRequest
 * @param id Unique request name
 * @param CtmParamUpdateIn CtmParamBaseObjectData for CtmParamUpdateRequest
 *
 */
@JsonCreator
  public CtmParamUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmParam")CtmParamBaseObjectData CtmParamUpdateIn) {
    super(id, "CtmParamUpdate");
    if (CtmParamUpdateIn != null) {
      addInput("CtmParam", CtmParamBaseObjectHelper.toMap(CtmParamUpdateIn, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }

/**
 *
 * Retrieves the CtmParamObjectData that results from the CtmParamUpdateRequest call
 * @return CtmParamObjectData resulting from udt call
 *
 */

  public CtmParamObjectData getOutput() {
    return CtmParamObjectHelper.fromMap(outputMap, "CtmParam");
  }
}
