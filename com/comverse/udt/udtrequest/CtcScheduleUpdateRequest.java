/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleUpdateRequest.java
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
 * Class used to create a CtcScheduleUpdateRequest Udt Request
 *
 */

public class CtcScheduleUpdateRequest extends CtcScheduleSubRequestParent {
/**
 *
 * Constructor to create a  CtcScheduleUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcScheduleObjectData for CtcScheduleUpdateRequest
 *
 */
@JsonCreator
  public CtcScheduleUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcSchedule")CtcScheduleObjectData UpdateIn) {
    super(id, "CtcScheduleUpdate");
    if (UpdateIn != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(UpdateIn, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }

/**
 *
 * Retrieves the CtcScheduleObjectData that results from the CtcScheduleUpdateRequest call
 * @return CtcScheduleObjectData resulting from udt call
 *
 */

  public CtcScheduleObjectData getOutput() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
}
