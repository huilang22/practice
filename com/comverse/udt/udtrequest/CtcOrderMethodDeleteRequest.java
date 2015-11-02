/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodDeleteRequest.java
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
 * Class used to create a CtcOrderMethodDeleteRequest Udt Request
 *
 */

public class CtcOrderMethodDeleteRequest extends CtcOrderMethodSubRequestParent {
/**
 *
 * Constructor to create a  CtcOrderMethodDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcOrderMethodObjectKeyData for CtcOrderMethodDeleteRequest
 *
 */
@JsonCreator
  public CtcOrderMethodDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOrderMethod")CtcOrderMethodObjectKeyData DeleteIn) {
    super(id, "CtcOrderMethodDelete");
    if (DeleteIn != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOrderMethodObjectKeyData").get("CtcOrderMethodObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOrderMethodObjectData that results from the CtcOrderMethodDeleteRequest call
 * @return CtcOrderMethodObjectData resulting from udt call
 *
 */

  public CtcOrderMethodObjectData getOutput() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
}
