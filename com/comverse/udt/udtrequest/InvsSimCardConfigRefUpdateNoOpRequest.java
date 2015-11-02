/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimCardConfigRefUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsSimCardConfigRefUpdateNoOpRequest extends InvsSimCardConfigRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimCardConfigRefUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimCardConfigRefUpdateNoOpRequest(String id, InvsSimCardConfigRefObjectData noOpIn) {
    super(id, "InvsSimCardConfigRefUpdateNoOpRequest");
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
