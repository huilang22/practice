/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarCreateNoOpRequest.java
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
 * NoOp class used to simulate a RbrCalendarCreateNoOpRequest Udt Request/Response
 *
 */
public class RbrCalendarCreateNoOpRequest extends RbrCalendarSubRequestParent {
/**
 *
 * Constructor to create a   RbrCalendarCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrCalendarCreateNoOpRequest(String id, RbrCalendarObjectData noOpIn) {
    super(id, "RbrCalendarCreateNoOpRequest");
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
