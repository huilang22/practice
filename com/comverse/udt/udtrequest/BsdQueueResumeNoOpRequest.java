/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueResumeNoOpRequest.java
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
 * NoOp class used to simulate a BsdQueueResumeNoOpRequest Udt Request/Response
 *
 */
public class BsdQueueResumeNoOpRequest extends BsdQueueSubRequestParent {
/**
 *
 * Constructor to create a   BsdQueueResumeNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdQueueResumeNoOpRequest(String id, BsdQueueObjectData noOpIn) {
    super(id, "BsdQueueResumeNoOpRequest");
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
