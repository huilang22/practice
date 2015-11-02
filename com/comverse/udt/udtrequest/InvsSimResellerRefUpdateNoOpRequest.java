/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimResellerRefUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsSimResellerRefUpdateNoOpRequest extends InvsSimResellerRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimResellerRefUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimResellerRefUpdateNoOpRequest(String id, InvsSimResellerRefObjectData noOpIn) {
    super(id, "InvsSimResellerRefUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }
/**
 *
 * Retrieves the InvsSimResellerRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimResellerRefObjectData getOutput() {
    return InvsSimResellerRefObjectHelper.fromMap(outputMap, "InvsSimResellerRef");
  }
}
