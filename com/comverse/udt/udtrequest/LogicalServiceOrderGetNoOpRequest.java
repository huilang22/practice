/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderGetNoOpRequest.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a LogicalServiceOrderGetNoOpRequest Udt Request/Response
 *
 */
public class LogicalServiceOrderGetNoOpRequest extends LogicalServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a   LogicalServiceOrderGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LogicalServiceOrderGetNoOpRequest(String id, LogicalServiceOrderObjectData noOpIn) {
    super(id, "LogicalServiceOrderGetNoOpRequest");
    if (noOpIn != null) {
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectHelper.toMap(noOpIn, new HashMap(), "LogicalServiceOrder").get("LogicalServiceOrder"));
    }
  }
/**
 *
 * Retrieves the LogicalServiceOrderObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public LogicalServiceOrderObjectData getOutput() {
    return LogicalServiceOrderObjectHelper.fromMap(outputMap, "LogicalServiceOrder");
  }
}
