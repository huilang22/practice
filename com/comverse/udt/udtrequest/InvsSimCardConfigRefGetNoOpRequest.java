/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimCardConfigRefGetNoOpRequest Udt Request/Response
 *
 */
public class InvsSimCardConfigRefGetNoOpRequest extends InvsSimCardConfigRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimCardConfigRefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimCardConfigRefGetNoOpRequest(String id, InvsSimCardConfigRefObjectData noOpIn) {
    super(id, "InvsSimCardConfigRefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }
/**
 *
 * Retrieves the InvsSimCardConfigRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimCardConfigRefObjectData getOutput() {
    return InvsSimCardConfigRefObjectHelper.fromMap(outputMap, "InvsSimCardConfigRef");
  }
}
