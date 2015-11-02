/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimResellerRefGetNoOpRequest Udt Request/Response
 *
 */
public class InvsSimResellerRefGetNoOpRequest extends InvsSimResellerRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimResellerRefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimResellerRefGetNoOpRequest(String id, InvsSimResellerRefObjectData noOpIn) {
    super(id, "InvsSimResellerRefGetNoOpRequest");
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
