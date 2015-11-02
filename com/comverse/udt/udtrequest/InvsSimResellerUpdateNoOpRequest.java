/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimResellerUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsSimResellerUpdateNoOpRequest extends InvsSimResellerSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimResellerUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimResellerUpdateNoOpRequest(String id, InvsSimResellerObjectData noOpIn) {
    super(id, "InvsSimResellerUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }
/**
 *
 * Retrieves the InvsSimResellerObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimResellerObjectData getOutput() {
    return InvsSimResellerObjectHelper.fromMap(outputMap, "InvsSimReseller");
  }
}
