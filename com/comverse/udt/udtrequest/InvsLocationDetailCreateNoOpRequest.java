/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationDetailCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationDetailCreateNoOpRequest extends InvsLocationDetailSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationDetailCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationDetailCreateNoOpRequest(String id, InvsLocationDetailObjectData noOpIn) {
    super(id, "InvsLocationDetailCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }
/**
 *
 * Retrieves the InvsLocationDetailObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationDetailObjectData getOutput() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
}
