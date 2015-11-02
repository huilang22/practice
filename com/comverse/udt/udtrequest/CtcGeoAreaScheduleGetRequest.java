/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleGetRequest.java
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
 * Class used to create a CtcGeoAreaScheduleGetRequest Udt Request
 *
 */

public class CtcGeoAreaScheduleGetRequest extends CtcGeoAreaScheduleSubRequestParent {
/**
 *
 * Constructor to create a  CtcGeoAreaScheduleGetRequest
 * @param id Unique request name
 * @param GetIn CtcGeoAreaScheduleObjectKeyData for CtcGeoAreaScheduleGetRequest
 *
 */
@JsonCreator
  public CtcGeoAreaScheduleGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcGeoAreaSchedule")CtcGeoAreaScheduleObjectKeyData GetIn) {
    super(id, "CtcGeoAreaScheduleGet");
    if (GetIn != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcGeoAreaScheduleObjectKeyData").get("CtcGeoAreaScheduleObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcGeoAreaScheduleObjectData that results from the CtcGeoAreaScheduleGetRequest call
 * @return CtcGeoAreaScheduleObjectData resulting from udt call
 *
 */

  public CtcGeoAreaScheduleObjectData getOutput() {
    return CtcGeoAreaScheduleObjectHelper.fromMap(outputMap, "CtcGeoAreaSchedule");
  }
}
