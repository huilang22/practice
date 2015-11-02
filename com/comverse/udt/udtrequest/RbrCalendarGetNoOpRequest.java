/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a RbrCalendarGetNoOpRequest Udt Request/Response
 *
 */
public class RbrCalendarGetNoOpRequest extends RbrCalendarSubRequestParent {
/**
 *
 * Constructor to create a   RbrCalendarGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrCalendarGetNoOpRequest(String id, RbrCalendarObjectData noOpIn) {
    super(id, "RbrCalendarGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(noOpIn, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }
/**
 *
 * Retrieves the RbrCalendarObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrCalendarObjectData getOutput() {
    return RbrCalendarObjectHelper.fromMap(outputMap, "RbrCalendar");
  }
}
