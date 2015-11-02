/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarFindRequest.java
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
 * Class used to create a RbrCalendarFindRequest Udt Request
 *
 */

public class RbrCalendarFindRequest extends RbrCalendarRequest {
/**
 *
 * Constructor to create a  RbrCalendarFindRequest
 * @param id Unique request name
 * @param RbrCalFndIn RbrCalendarObjectFilter for RbrCalendarFindRequest
 *
 */
@JsonCreator
  public RbrCalendarFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrCalendar")RbrCalendarObjectFilter RbrCalFndIn) {
    super(id, "RbrCalendarFind");
    if (RbrCalFndIn != null) {
      Integer index =  RbrCalFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(RbrCalFndIn, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }

/**
 *
 * Retrieves the RbrCalendarObjectDataList that results from the RbrCalendarFindRequest call
 * @return RbrCalendarObjectDataList resulting from udt call
 *
 */

  public RbrCalendarObjectDataList getOutput() {
    return RbrCalendarObjectHelper.fromMapList(outputMap, "RbrCalendarList");
  }
}
