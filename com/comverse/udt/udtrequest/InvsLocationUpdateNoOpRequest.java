/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationUpdateNoOpRequest extends InvsLocationSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationUpdateNoOpRequest(String id, InvsLocationObjectData noOpIn) {
    super(id, "InvsLocationUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }
/**
 *
 * Retrieves the InvsLocationObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationObjectData getOutput() {
    return InvsLocationObjectHelper.fromMap(outputMap, "InvsLocation");
  }
}
