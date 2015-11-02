/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryCreateNoOpRequest.java
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
 * NoOp class used to simulate a BsdQueueAutoRetryCreateNoOpRequest Udt Request/Response
 *
 */
public class BsdQueueAutoRetryCreateNoOpRequest extends BsdQueueAutoRetrySubRequestParent {
/**
 *
 * Constructor to create a   BsdQueueAutoRetryCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdQueueAutoRetryCreateNoOpRequest(String id, BsdQueueAutoRetryObjectData noOpIn) {
    super(id, "BsdQueueAutoRetryCreateNoOpRequest");
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
