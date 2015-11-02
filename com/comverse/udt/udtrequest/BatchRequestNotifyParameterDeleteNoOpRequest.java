/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterDeleteNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestNotifyParameterDeleteNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestNotifyParameterDeleteNoOpRequest extends BatchRequestNotifyParameterSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestNotifyParameterDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestNotifyParameterDeleteNoOpRequest(String id, BatchRequestNotifyParameterObjectData noOpIn) {
    super(id, "BatchRequestNotifyParameterDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }
/**
 *
 * Retrieves the BatchRequestNotifyParameterObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyParameterObjectData getOutput() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
}
