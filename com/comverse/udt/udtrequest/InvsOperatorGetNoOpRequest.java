/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsOperatorGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsOperatorGetNoOpRequest Udt Request/Response
 *
 */
public class InvsOperatorGetNoOpRequest extends InvsOperatorSubRequestParent {
/**
 *
 * Constructor to create a   InvsOperatorGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsOperatorGetNoOpRequest(String id, InvsOperatorObjectData noOpIn) {
    super(id, "InvsOperatorGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(noOpIn, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }
/**
 *
 * Retrieves the InvsOperatorObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsOperatorObjectData getOutput() {
    return InvsOperatorObjectHelper.fromMap(outputMap, "InvsOperator");
  }
}
