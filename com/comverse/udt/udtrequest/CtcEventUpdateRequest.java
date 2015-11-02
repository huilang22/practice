/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventUpdateRequest.java
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
 * Class used to create a CtcEventUpdateRequest Udt Request
 *
 */

public class CtcEventUpdateRequest extends CtcEventSubRequestParent {
/**
 *
 * Constructor to create a  CtcEventUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcEventObjectData for CtcEventUpdateRequest
 *
 */
@JsonCreator
  public CtcEventUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcEvent")CtcEventObjectData UpdateIn) {
    super(id, "CtcEventUpdate");
    if (UpdateIn != null) {
      addInput("CtcEvent", CtcEventObjectHelper.toMap(UpdateIn, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }

/**
 *
 * Retrieves the CtcEventObjectData that results from the CtcEventUpdateRequest call
 * @return CtcEventObjectData resulting from udt call
 *
 */

  public CtcEventObjectData getOutput() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
}
