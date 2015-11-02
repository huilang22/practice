/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarUpdateRequest.java
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
 * Class used to create a RbrCalendarUpdateRequest Udt Request
 *
 */

public class RbrCalendarUpdateRequest extends RbrCalendarSubRequestParent {
/**
 *
 * Constructor to create a  RbrCalendarUpdateRequest
 * @param id Unique request name
 * @param RbrCalUpdIn RbrCalendarObjectData for RbrCalendarUpdateRequest
 *
 */
@JsonCreator
  public RbrCalendarUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrCalendar")RbrCalendarObjectData RbrCalUpdIn) {
    super(id, "RbrCalendarUpdate");
    if (RbrCalUpdIn != null) {
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(RbrCalUpdIn, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }

/**
 *
 * Retrieves the RbrCalendarObjectData that results from the RbrCalendarUpdateRequest call
 * @return RbrCalendarObjectData resulting from udt call
 *
 */

  public RbrCalendarObjectData getOutput() {
    return RbrCalendarObjectHelper.fromMap(outputMap, "RbrCalendar");
  }
}
