/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleFindRequest.java
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
 * Class used to create a CtcScheduleFindRequest Udt Request
 *
 */

public class CtcScheduleFindRequest extends CtcScheduleRequest {
/**
 *
 * Constructor to create a  CtcScheduleFindRequest
 * @param id Unique request name
 * @param FindIn CtcScheduleObjectFilter for CtcScheduleFindRequest
 *
 */
@JsonCreator
  public CtcScheduleFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcSchedule")CtcScheduleObjectFilter FindIn) {
    super(id, "CtcScheduleFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(FindIn, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }

/**
 *
 * Retrieves the CtcScheduleObjectDataList that results from the CtcScheduleFindRequest call
 * @return CtcScheduleObjectDataList resulting from udt call
 *
 */

  public CtcScheduleObjectDataList getOutput() {
    return CtcScheduleObjectHelper.fromMapList(outputMap, "CtcScheduleList");
  }
}
