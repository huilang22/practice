/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodGetRequest.java
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
 * Class used to create a CtcOrderMethodGetRequest Udt Request
 *
 */

public class CtcOrderMethodGetRequest extends CtcOrderMethodSubRequestParent {
/**
 *
 * Constructor to create a  CtcOrderMethodGetRequest
 * @param id Unique request name
 * @param GetIn CtcOrderMethodObjectKeyData for CtcOrderMethodGetRequest
 *
 */
@JsonCreator
  public CtcOrderMethodGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOrderMethod")CtcOrderMethodObjectKeyData GetIn) {
    super(id, "CtcOrderMethodGet");
    if (GetIn != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOrderMethodObjectKeyData").get("CtcOrderMethodObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOrderMethodObjectData that results from the CtcOrderMethodGetRequest call
 * @return CtcOrderMethodObjectData resulting from udt call
 *
 */

  public CtcOrderMethodObjectData getOutput() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
}
