/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRefGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationRefGetNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationRefGetNoOpRequest extends InvsLocationRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationRefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationRefGetNoOpRequest(String id, InvsLocationRefObjectData noOpIn) {
    super(id, "InvsLocationRefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }
/**
 *
 * Retrieves the InvsLocationRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationRefObjectData getOutput() {
    return InvsLocationRefObjectHelper.fromMap(outputMap, "InvsLocationRef");
  }
}
