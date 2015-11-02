/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestNotifyMessageSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestNotifyMessageSequenceGetNoOpRequest extends BatchRequestNotifyMessageSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestNotifyMessageSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestNotifyMessageSequenceGetNoOpRequest(String id, BatchRequestNotifyMessageObjectKeyData noOpIn) {
    super(id, "BatchRequestNotifyMessageSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }
/**
 *
 * Retrieves the BatchRequestNotifyMessageObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyMessageObjectKeyData getOutput() {
    return BatchRequestNotifyMessageObjectKeyHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
}
