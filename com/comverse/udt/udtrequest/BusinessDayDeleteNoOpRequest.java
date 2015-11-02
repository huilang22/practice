/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BusinessDayDeleteNoOpRequest Udt Request/Response
 *
 */
public class BusinessDayDeleteNoOpRequest extends BusinessDaySubRequestParent {
/**
 *
 * Constructor to create a   BusinessDayDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BusinessDayDeleteNoOpRequest(String id, BusinessDayObjectData noOpIn) {
    super(id, "BusinessDayDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(noOpIn, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }
/**
 *
 * Retrieves the BusinessDayObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BusinessDayObjectData getOutput() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
}
