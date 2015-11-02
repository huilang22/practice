/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueSuspendNoOpRequest.java
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
 * NoOp class used to simulate a BsdQueueSuspendNoOpRequest Udt Request/Response
 *
 */
public class BsdQueueSuspendNoOpRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a   BsdQueueSuspendNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdQueueSuspendNoOpRequest(String id, BsdQueueObjectData noOpIn) {
    super(id, "BsdQueueSuspendNoOpRequest");
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
