/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneDeleteNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a TimezoneDeleteNoOpRequest Udt Request/Response
 *
 */
public class TimezoneDeleteNoOpRequest extends TimezoneSubRequestParent {
/**
 *
 * Constructor to create a   TimezoneDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TimezoneDeleteNoOpRequest(String id, TimezoneObjectData noOpIn) {
    super(id, "TimezoneDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("Timezone", TimezoneObjectHelper.toMap(noOpIn, new HashMap(), "Timezone").get("Timezone"));
    }
  }
/**
 *
 * Retrieves the TimezoneObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TimezoneObjectData getOutput() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
}
