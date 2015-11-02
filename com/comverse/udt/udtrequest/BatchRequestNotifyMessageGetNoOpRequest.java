/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestNotifyMessageGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestNotifyMessageGetNoOpRequest extends BatchRequestNotifyMessageSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestNotifyMessageGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestNotifyMessageGetNoOpRequest(String id, BatchRequestNotifyMessageObjectData noOpIn) {
    super(id, "BatchRequestNotifyMessageGetNoOpRequest");
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
