/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsThresholdCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsThresholdCreateNoOpRequest extends InvsThresholdSubRequestParent {
/**
 *
 * Constructor to create a   InvsThresholdCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsThresholdCreateNoOpRequest(String id, InvsThresholdObjectData noOpIn) {
    super(id, "InvsThresholdCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(noOpIn, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }
/**
 *
 * Retrieves the InvsThresholdObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsThresholdObjectData getOutput() {
    return InvsThresholdObjectHelper.fromMap(outputMap, "InvsThreshold");
  }
}
