/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarGetRequest.java
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
 * Class used to create a RbrCalendarGetRequest Udt Request
 *
 */

public class RbrCalendarGetRequest extends RbrCalendarSubRequestParent {
/**
 *
 * Constructor to create a  RbrCalendarGetRequest
 * @param id Unique request name
 * @param RbrCalGetIn RbrCalendarObjectKeyData for RbrCalendarGetRequest
 *
 */
@JsonCreator
  public RbrCalendarGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrCalendar")RbrCalendarObjectKeyData RbrCalGetIn) {
    super(id, "RbrCalendarGet");
    if (RbrCalGetIn != null) {
      addInput("RbrCalendar", RbrCalendarObjectKeyHelper.toMap(RbrCalGetIn, new HashMap(), "RbrCalendarObjectKeyData").get("RbrCalendarObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrCalendarObjectData that results from the RbrCalendarGetRequest call
 * @return RbrCalendarObjectData resulting from udt call
 *
 */

  public RbrCalendarObjectData getOutput() {
    return RbrCalendarObjectHelper.fromMap(outputMap, "RbrCalendar");
  }
}
