/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleFindRequest.java
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
 * Class used to create a CtcGeoAreaScheduleFindRequest Udt Request
 *
 */

public class CtcGeoAreaScheduleFindRequest extends CtcGeoAreaScheduleRequest {
/**
 *
 * Constructor to create a  CtcGeoAreaScheduleFindRequest
 * @param id Unique request name
 * @param FindIn CtcGeoAreaScheduleObjectFilter for CtcGeoAreaScheduleFindRequest
 *
 */
@JsonCreator
  public CtcGeoAreaScheduleFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcGeoAreaSchedule")CtcGeoAreaScheduleObjectFilter FindIn) {
    super(id, "CtcGeoAreaScheduleFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(FindIn, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }

/**
 *
 * Retrieves the CtcGeoAreaScheduleObjectDataList that results from the CtcGeoAreaScheduleFindRequest call
 * @return CtcGeoAreaScheduleObjectDataList resulting from udt call
 *
 */

  public CtcGeoAreaScheduleObjectDataList getOutput() {
    return CtcGeoAreaScheduleObjectHelper.fromMapList(outputMap, "CtcGeoAreaScheduleList");
  }
}
