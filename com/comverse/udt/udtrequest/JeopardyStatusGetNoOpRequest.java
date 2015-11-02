/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusGetNoOpRequest.java
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
 * NoOp class used to simulate a JeopardyStatusGetNoOpRequest Udt Request/Response
 *
 */
public class JeopardyStatusGetNoOpRequest extends JeopardyStatusSubRequestParent {
/**
 *
 * Constructor to create a   JeopardyStatusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public JeopardyStatusGetNoOpRequest(String id, JeopardyStatusObjectData noOpIn) {
    super(id, "JeopardyStatusGetNoOpRequest");
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
