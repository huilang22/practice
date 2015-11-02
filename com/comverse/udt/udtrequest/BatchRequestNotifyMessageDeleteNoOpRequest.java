/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestNotifyMessageDeleteNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestNotifyMessageDeleteNoOpRequest extends BatchRequestNotifyMessageSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestNotifyMessageDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestNotifyMessageDeleteNoOpRequest(String id, BatchRequestNotifyMessageObjectData noOpIn) {
    super(id, "BatchRequestNotifyMessageDeleteNoOpRequest");
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
