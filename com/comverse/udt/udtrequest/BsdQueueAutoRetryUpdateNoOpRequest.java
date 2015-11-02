/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryUpdateNoOpRequest.java
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

import com.csgsystems.sfq.data.*;

/**
 *
 * NoOp class used to simulate a BsdQueueAutoRetryUpdateNoOpRequest Udt Request/Response
 *
 */
public class BsdQueueAutoRetryUpdateNoOpRequest extends BsdQueueAutoRetrySubRequestParent {
/**
 *
 * Constructor to create a   BsdQueueAutoRetryUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdQueueAutoRetryUpdateNoOpRequest(String id, BsdQueueAutoRetryObjectData noOpIn) {
    super(id, "BsdQueueAutoRetryUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(noOpIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }
/**
 *
 * Retrieves the BsdQueueAutoRetryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdQueueAutoRetryObjectData getOutput() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
}
