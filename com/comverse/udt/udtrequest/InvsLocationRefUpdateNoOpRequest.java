/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRefUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationRefUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationRefUpdateNoOpRequest extends InvsLocationRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationRefUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationRefUpdateNoOpRequest(String id, InvsLocationRefObjectData noOpIn) {
    super(id, "InvsLocationRefUpdateNoOpRequest");
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
