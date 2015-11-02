/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsRateCenterCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsRateCenterCreateNoOpRequest extends InvsRateCenterSubRequestParent {
/**
 *
 * Constructor to create a   InvsRateCenterCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsRateCenterCreateNoOpRequest(String id, InvsRateCenterObjectData noOpIn) {
    super(id, "InvsRateCenterCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(noOpIn, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }
/**
 *
 * Retrieves the InvsRateCenterObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsRateCenterObjectData getOutput() {
    return InvsRateCenterObjectHelper.fromMap(outputMap, "InvsRateCenter");
  }
}
