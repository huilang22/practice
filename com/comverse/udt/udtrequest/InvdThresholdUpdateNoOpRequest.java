/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdUpdateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvdThresholdUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvdThresholdUpdateNoOpRequest extends InvdThresholdSubRequestParent {
/**
 *
 * Constructor to create a   InvdThresholdUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdThresholdUpdateNoOpRequest(String id, InvdThresholdObjectData noOpIn) {
    super(id, "InvdThresholdUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(noOpIn, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }
/**
 *
 * Retrieves the InvdThresholdObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvdThresholdObjectData getOutput() {
    return InvdThresholdObjectHelper.fromMap(outputMap, "InvdThreshold");
  }
}
