/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderFindCountNoOpRequest.java
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
 * NoOp class used to simulate a LogicalServiceOrderFindCountNoOpRequest Udt Request/Response
 *
 */
public class LogicalServiceOrderFindCountNoOpRequest extends LogicalServiceOrderRequest {
/**
 *
 * Constructor to create a   LogicalServiceOrderFindCountNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LogicalServiceOrderFindCountNoOpRequest(String id, Integer noOpIn) {
    super(id, "LogicalServiceOrderFindCountNoOpRequest");
    if (noOpIn != null) {
      addInput("LogicalServiceOrderCount", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("LogicalServiceOrderCount");
  }
}
