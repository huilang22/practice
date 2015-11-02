/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysCreateNoOpRequest.java
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
 * NoOp class used to simulate a NonWorkDaysCreateNoOpRequest Udt Request/Response
 *
 */
public class NonWorkDaysCreateNoOpRequest extends NonWorkDaysSubRequestParent {
/**
 *
 * Constructor to create a   NonWorkDaysCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NonWorkDaysCreateNoOpRequest(String id, NonWorkDaysObjectData noOpIn) {
    super(id, "NonWorkDaysCreateNoOpRequest");
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
