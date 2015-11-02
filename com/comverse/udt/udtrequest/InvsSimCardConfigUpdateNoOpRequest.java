/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimCardConfigUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsSimCardConfigUpdateNoOpRequest extends InvsSimCardConfigSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimCardConfigUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimCardConfigUpdateNoOpRequest(String id, InvsSimCardConfigObjectData noOpIn) {
    super(id, "InvsSimCardConfigUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }
/**
 *
 * Retrieves the InvsSimCardConfigObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimCardConfigObjectData getOutput() {
    return InvsSimCardConfigObjectHelper.fromMap(outputMap, "InvsSimCardConfig");
  }
}
