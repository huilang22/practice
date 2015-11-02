/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleDeleteRequest.java
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
 * Class used to create a CtcGeoAreaScheduleDeleteRequest Udt Request
 *
 */

public class CtcGeoAreaScheduleDeleteRequest extends CtcGeoAreaScheduleSubRequestParent {
/**
 *
 * Constructor to create a  CtcGeoAreaScheduleDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcGeoAreaScheduleObjectKeyData for CtcGeoAreaScheduleDeleteRequest
 *
 */
@JsonCreator
  public CtcGeoAreaScheduleDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcGeoAreaSchedule")CtcGeoAreaScheduleObjectKeyData DeleteIn) {
    super(id, "CtcGeoAreaScheduleDelete");
    if (DeleteIn != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcGeoAreaScheduleObjectKeyData").get("CtcGeoAreaScheduleObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcGeoAreaScheduleObjectData that results from the CtcGeoAreaScheduleDeleteRequest call
 * @return CtcGeoAreaScheduleObjectData resulting from udt call
 *
 */

  public CtcGeoAreaScheduleObjectData getOutput() {
    return CtcGeoAreaScheduleObjectHelper.fromMap(outputMap, "CtcGeoAreaSchedule");
  }
}
