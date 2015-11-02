/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestNotifyMessageUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestNotifyMessageUpdateNoOpRequest extends BatchRequestNotifyMessageSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestNotifyMessageUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestNotifyMessageUpdateNoOpRequest(String id, BatchRequestNotifyMessageObjectData noOpIn) {
    super(id, "BatchRequestNotifyMessageUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }
/**
 *
 * Retrieves the BatchRequestNotifyMessageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyMessageObjectData getOutput() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
}
