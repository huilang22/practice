/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogFileFindNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a LogFileFindNoOpRequest Udt Request/Response
 *
 */
public class LogFileFindNoOpRequest extends LogRequest {
/**
 *
 * Constructor to create a   LogFileFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LogFileFindNoOpRequest(String id, String[] noOpIn) {
    super(id, "LogFileFindNoOpRequest");
    if (noOpIn != null) {
      addInput("Line", noOpIn);
    }
  }
/**
 *
 * Retrieves the String[] passed into the constructor
 * @return Simulated response
 *
 */
  public String[] getOutput() {
    return  (String[])outputMap.get("Line");
  }
}
