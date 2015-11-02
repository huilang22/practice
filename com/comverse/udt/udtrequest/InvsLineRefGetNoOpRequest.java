/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsLineRefGetNoOpRequest Udt Request/Response
 *
 */
public class InvsLineRefGetNoOpRequest extends InvsLineRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsLineRefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLineRefGetNoOpRequest(String id, InvsLineRefObjectData noOpIn) {
    super(id, "InvsLineRefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }
/**
 *
 * Retrieves the InvsLineRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineRefObjectData getOutput() {
    return InvsLineRefObjectHelper.fromMap(outputMap, "InvsLineRef");
  }
}
