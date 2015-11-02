/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderDependencyCheckNoOpRequest.java
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
 * NoOp class used to simulate a LogicalServiceOrderDependencyCheckNoOpRequest Udt Request/Response
 *
 */
public class LogicalServiceOrderDependencyCheckNoOpRequest extends LogicalServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a   LogicalServiceOrderDependencyCheckNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LogicalServiceOrderDependencyCheckNoOpRequest(String id, LogicalServiceOrderDependencyCheckOutputData noOpIn) {
    super(id, "LogicalServiceOrderDependencyCheckNoOpRequest");
    if (noOpIn != null) {
      addInput("LogicalServiceOrderDependencyCheckOutputData", LogicalServiceOrderDependencyCheckOutputHelper.toMap(noOpIn).get("LogicalServiceOrderDependencyCheckOutputData"));
    }
  }
/**
 *
 * Retrieves the LogicalServiceOrderDependencyCheckOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public LogicalServiceOrderDependencyCheckOutputData getOutput() {
    return LogicalServiceOrderDependencyCheckOutputHelper.fromMap(outputMap);
  }
}
