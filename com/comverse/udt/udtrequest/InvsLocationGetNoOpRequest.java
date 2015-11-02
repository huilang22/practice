/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationGetNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationGetNoOpRequest extends InvsLocationSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationGetNoOpRequest(String id, InvsLocationObjectData noOpIn) {
    super(id, "InvsLocationGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }
/**
 *
 * Retrieves the InvsLocationObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationObjectData getOutput() {
    return InvsLocationObjectHelper.fromMap(outputMap, "InvsLocation");
  }
}
