/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventCreateRequest.java
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
 * Class used to create a CtcEventCreateRequest Udt Request
 *
 */

public class CtcEventCreateRequest extends CtcEventSubRequestParent {
/**
 *
 * Constructor to create a  CtcEventCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcEventObjectData for CtcEventCreateRequest
 *
 */
@JsonCreator
  public CtcEventCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcEvent")CtcEventObjectData CreateIn) {
    super(id, "CtcEventCreate");
    if (CreateIn != null) {
      addInput("CtcEvent", CtcEventObjectHelper.toMap(CreateIn, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }

/**
 *
 * Retrieves the CtcEventObjectData that results from the CtcEventCreateRequest call
 * @return CtcEventObjectData resulting from udt call
 *
 */

  public CtcEventObjectData getOutput() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
}
