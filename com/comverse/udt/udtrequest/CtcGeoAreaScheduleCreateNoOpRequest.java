/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleCreateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a CtcGeoAreaScheduleCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcGeoAreaScheduleCreateNoOpRequest extends CtcGeoAreaScheduleSubRequestParent {
/**
 *
 * Constructor to create a   CtcGeoAreaScheduleCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcGeoAreaScheduleCreateNoOpRequest(String id, CtcGeoAreaScheduleObjectData noOpIn) {
    super(id, "CtcGeoAreaScheduleCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(noOpIn, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }
/**
 *
 * Retrieves the CtcGeoAreaScheduleObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcGeoAreaScheduleObjectData getOutput() {
    return CtcGeoAreaScheduleObjectHelper.fromMap(outputMap, "CtcGeoAreaSchedule");
  }
}
