/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusUpdateNoOpRequest.java
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
 * NoOp class used to simulate a JeopardyStatusUpdateNoOpRequest Udt Request/Response
 *
 */
public class JeopardyStatusUpdateNoOpRequest extends JeopardyStatusSubRequestParent {
/**
 *
 * Constructor to create a   JeopardyStatusUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public JeopardyStatusUpdateNoOpRequest(String id, JeopardyStatusObjectData noOpIn) {
    super(id, "JeopardyStatusUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(noOpIn, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }
/**
 *
 * Retrieves the JeopardyStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public JeopardyStatusObjectData getOutput() {
    return JeopardyStatusObjectHelper.fromMap(outputMap, "JeopardyStatus");
  }
}
