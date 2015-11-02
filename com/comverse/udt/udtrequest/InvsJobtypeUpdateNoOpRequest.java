/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobtypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsJobtypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsJobtypeUpdateNoOpRequest extends InvsJobtypeSubRequestParent {
/**
 *
 * Constructor to create a   InvsJobtypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsJobtypeUpdateNoOpRequest(String id, InvsJobtypeObjectData noOpIn) {
    super(id, "InvsJobtypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsJobtype").get("InvsJobtype"));
    }
  }
/**
 *
 * Retrieves the InvsJobtypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobtypeObjectData getOutput() {
    return InvsJobtypeObjectHelper.fromMap(outputMap, "InvsJobtype");
  }
}
