/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeGetRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcUrlTypeGetRequest Udt Request
 *
 */

public class CtcUrlTypeGetRequest extends CtcUrlTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcUrlTypeGetRequest
 * @param id Unique request name
 * @param GetIn CtcUrlTypeObjectKeyData for CtcUrlTypeGetRequest
 *
 */
@JsonCreator
  public CtcUrlTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcUrlType")CtcUrlTypeObjectKeyData GetIn) {
    super(id, "CtcUrlTypeGet");
    if (GetIn != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcUrlTypeObjectKeyData").get("CtcUrlTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcUrlTypeObjectData that results from the CtcUrlTypeGetRequest call
 * @return CtcUrlTypeObjectData resulting from udt call
 *
 */

  public CtcUrlTypeObjectData getOutput() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
}
