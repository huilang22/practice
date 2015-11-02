/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamGetRequest.java
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
 * Class used to create a CtmParamGetRequest Udt Request
 *
 */

public class CtmParamGetRequest extends CtmParamSubRequestParent {
/**
 *
 * Constructor to create a  CtmParamGetRequest
 * @param id Unique request name
 * @param CtmParamGetIn CtmParamBaseObjectKeyData for CtmParamGetRequest
 *
 */
@JsonCreator
  public CtmParamGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmParam")CtmParamBaseObjectKeyData CtmParamGetIn) {
    super(id, "CtmParamGet");
    if (CtmParamGetIn != null) {
      addInput("CtmParam", CtmParamBaseObjectKeyHelper.toMap(CtmParamGetIn, new HashMap(), "CtmParamBaseObjectKeyData").get("CtmParamBaseObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtmParamObjectData that results from the CtmParamGetRequest call
 * @return CtmParamObjectData resulting from udt call
 *
 */

  public CtmParamObjectData getOutput() {
    return CtmParamObjectHelper.fromMap(outputMap, "CtmParam");
  }
}
