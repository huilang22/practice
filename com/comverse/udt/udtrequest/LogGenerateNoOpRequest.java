/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogGenerateNoOpRequest.java
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
 * NoOp class used to simulate a LogGenerateNoOpRequest Udt Request/Response
 *
 */
public class LogGenerateNoOpRequest extends LogSubRequestParent {
/**
 *
 * Constructor to create a   LogGenerateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LogGenerateNoOpRequest(String id, LogGenerateOutputData noOpIn) {
    super(id, "LogGenerateNoOpRequest");
    if (noOpIn != null) {
      addInput("LogGenerateOutputData", LogGenerateOutputHelper.toMap(noOpIn).get("LogGenerateOutputData"));
    }
  }
/**
 *
 * Retrieves the LogGenerateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public LogGenerateOutputData getOutput() {
    return LogGenerateOutputHelper.fromMap(outputMap);
  }
}
