/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleCreateRequest.java
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
 * Class used to create a CtcGeoAreaScheduleCreateRequest Udt Request
 *
 */

public class CtcGeoAreaScheduleCreateRequest extends CtcGeoAreaScheduleSubRequestParent {
/**
 *
 * Constructor to create a  CtcGeoAreaScheduleCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcGeoAreaScheduleObjectData for CtcGeoAreaScheduleCreateRequest
 *
 */
@JsonCreator
  public CtcGeoAreaScheduleCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcGeoAreaSchedule")CtcGeoAreaScheduleObjectData CreateIn) {
    super(id, "CtcGeoAreaScheduleCreate");
    if (CreateIn != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(CreateIn, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }

/**
 *
 * Retrieves the CtcGeoAreaScheduleObjectData that results from the CtcGeoAreaScheduleCreateRequest call
 * @return CtcGeoAreaScheduleObjectData resulting from udt call
 *
 */

  public CtcGeoAreaScheduleObjectData getOutput() {
    return CtcGeoAreaScheduleObjectHelper.fromMap(outputMap, "CtcGeoAreaSchedule");
  }
}
