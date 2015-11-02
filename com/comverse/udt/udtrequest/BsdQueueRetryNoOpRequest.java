/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueRetryNoOpRequest.java
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
 * NoOp class used to simulate a BsdQueueRetryNoOpRequest Udt Request/Response
 *
 */
public class BsdQueueRetryNoOpRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a   BsdQueueRetryNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdQueueRetryNoOpRequest(String id, BsdQueueObjectData noOpIn) {
    super(id, "BsdQueueRetryNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(noOpIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
/**
 *
 * Retrieves the BsdQueueObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdQueueObjectData getOutput() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
}
