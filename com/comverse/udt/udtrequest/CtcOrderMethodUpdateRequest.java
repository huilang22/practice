/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodUpdateRequest.java
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
 * Class used to create a CtcOrderMethodUpdateRequest Udt Request
 *
 */

public class CtcOrderMethodUpdateRequest extends CtcOrderMethodSubRequestParent {
/**
 *
 * Constructor to create a  CtcOrderMethodUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcOrderMethodObjectData for CtcOrderMethodUpdateRequest
 *
 */
@JsonCreator
  public CtcOrderMethodUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOrderMethod")CtcOrderMethodObjectData UpdateIn) {
    super(id, "CtcOrderMethodUpdate");
    if (UpdateIn != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }

/**
 *
 * Retrieves the CtcOrderMethodObjectData that results from the CtcOrderMethodUpdateRequest call
 * @return CtcOrderMethodObjectData resulting from udt call
 *
 */

  public CtcOrderMethodObjectData getOutput() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
}
