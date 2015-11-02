/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamTypeGetRequest.java
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
 * Class used to create a CtmParamTypeGetRequest Udt Request
 *
 */

public class CtmParamTypeGetRequest extends CtmParamTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtmParamTypeGetRequest
 * @param id Unique request name
 * @param CtmParamTypeGetIn CtmParamTypeObjectKeyData for CtmParamTypeGetRequest
 *
 */
@JsonCreator
  public CtmParamTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmParamType")CtmParamTypeObjectKeyData CtmParamTypeGetIn) {
    super(id, "CtmParamTypeGet");
    if (CtmParamTypeGetIn != null) {
      addInput("CtmParamType", CtmParamTypeObjectKeyHelper.toMap(CtmParamTypeGetIn, new HashMap(), "CtmParamTypeObjectKeyData").get("CtmParamTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtmParamTypeObjectData that results from the CtmParamTypeGetRequest call
 * @return CtmParamTypeObjectData resulting from udt call
 *
 */

  public CtmParamTypeObjectData getOutput() {
    return CtmParamTypeObjectHelper.fromMap(outputMap, "CtmParamType");
  }
}
