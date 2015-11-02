/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CtcScheduleUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtcScheduleUpdateNoOpRequest extends CtcScheduleSubRequestParent {
/**
 *
 * Constructor to create a   CtcScheduleUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcScheduleUpdateNoOpRequest(String id, CtcScheduleObjectData noOpIn) {
    super(id, "CtcScheduleUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(noOpIn, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }
/**
 *
 * Retrieves the CtcScheduleObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcScheduleObjectData getOutput() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
}
