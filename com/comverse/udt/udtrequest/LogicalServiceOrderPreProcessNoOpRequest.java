/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderPreProcessNoOpRequest.java
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
 * NoOp class used to simulate a LogicalServiceOrderPreProcessNoOpRequest Udt Request/Response
 *
 */
public class LogicalServiceOrderPreProcessNoOpRequest extends LogicalServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a   LogicalServiceOrderPreProcessNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LogicalServiceOrderPreProcessNoOpRequest(String id, LogicalServiceOrderPreProcessOutputData noOpIn) {
    super(id, "LogicalServiceOrderPreProcessNoOpRequest");
    if (noOpIn != null) {
      addInput("LogicalServiceOrderPreProcessOutputData", LogicalServiceOrderPreProcessOutputHelper.toMap(noOpIn).get("LogicalServiceOrderPreProcessOutputData"));
    }
  }
/**
 *
 * Retrieves the LogicalServiceOrderPreProcessOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public LogicalServiceOrderPreProcessOutputData getOutput() {
    return LogicalServiceOrderPreProcessOutputHelper.fromMap(outputMap);
  }
}
