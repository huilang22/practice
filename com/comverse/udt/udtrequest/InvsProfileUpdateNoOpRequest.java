/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsProfileUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsProfileUpdateNoOpRequest extends InvsProfileSubRequestParent {
/**
 *
 * Constructor to create a   InvsProfileUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsProfileUpdateNoOpRequest(String id, InvsProfileObjectData noOpIn) {
    super(id, "InvsProfileUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(noOpIn, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }
/**
 *
 * Retrieves the InvsProfileObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsProfileObjectData getOutput() {
    return InvsProfileObjectHelper.fromMap(outputMap, "InvsProfile");
  }
}
