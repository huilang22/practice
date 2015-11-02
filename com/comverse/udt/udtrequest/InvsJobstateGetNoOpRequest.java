/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstateGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsJobstateGetNoOpRequest Udt Request/Response
 *
 */
public class InvsJobstateGetNoOpRequest extends InvsJobstateSubRequestParent {
/**
 *
 * Constructor to create a   InvsJobstateGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsJobstateGetNoOpRequest(String id, InvsJobstateObjectData noOpIn) {
    super(id, "InvsJobstateGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsJobstate", InvsJobstateObjectHelper.toMap(noOpIn, new HashMap(), "InvsJobstate").get("InvsJobstate"));
    }
  }
/**
 *
 * Retrieves the InvsJobstateObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobstateObjectData getOutput() {
    return InvsJobstateObjectHelper.fromMap(outputMap, "InvsJobstate");
  }
}
