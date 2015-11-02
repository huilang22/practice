/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarCreateRequest.java
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
 * Class used to create a RbrCalendarCreateRequest Udt Request
 *
 */

public class RbrCalendarCreateRequest extends RbrCalendarSubRequestParent {
/**
 *
 * Constructor to create a  RbrCalendarCreateRequest
 * @param id Unique request name
 * @param RbrCalCrIn RbrCalendarObjectData for RbrCalendarCreateRequest
 *
 */
@JsonCreator
  public RbrCalendarCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrCalendar")RbrCalendarObjectData RbrCalCrIn) {
    super(id, "RbrCalendarCreate");
    if (RbrCalCrIn != null) {
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(RbrCalCrIn, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }

/**
 *
 * Retrieves the RbrCalendarObjectData that results from the RbrCalendarCreateRequest call
 * @return RbrCalendarObjectData resulting from udt call
 *
 */

  public RbrCalendarObjectData getOutput() {
    return RbrCalendarObjectHelper.fromMap(outputMap, "RbrCalendar");
  }
}
