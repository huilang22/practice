/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysGetNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a NonWorkDaysGetNoOpRequest Udt Request/Response
 *
 */
public class NonWorkDaysGetNoOpRequest extends NonWorkDaysSubRequestParent {
/**
 *
 * Constructor to create a   NonWorkDaysGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NonWorkDaysGetNoOpRequest(String id, NonWorkDaysObjectData noOpIn) {
    super(id, "NonWorkDaysGetNoOpRequest");
    if (noOpIn != null) {
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(noOpIn, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }
/**
 *
 * Retrieves the NonWorkDaysObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NonWorkDaysObjectData getOutput() {
    return NonWorkDaysObjectHelper.fromMap(outputMap, "NonWorkDays");
  }
}
