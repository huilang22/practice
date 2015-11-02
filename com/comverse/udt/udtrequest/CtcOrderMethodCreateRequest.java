/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodCreateRequest.java
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
 * Class used to create a CtcOrderMethodCreateRequest Udt Request
 *
 */

public class CtcOrderMethodCreateRequest extends CtcOrderMethodSubRequestParent {
/**
 *
 * Constructor to create a  CtcOrderMethodCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcOrderMethodObjectData for CtcOrderMethodCreateRequest
 *
 */
@JsonCreator
  public CtcOrderMethodCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOrderMethod")CtcOrderMethodObjectData CreateIn) {
    super(id, "CtcOrderMethodCreate");
    if (CreateIn != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(CreateIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }

/**
 *
 * Retrieves the CtcOrderMethodObjectData that results from the CtcOrderMethodCreateRequest call
 * @return CtcOrderMethodObjectData resulting from udt call
 *
 */

  public CtcOrderMethodObjectData getOutput() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
}
