/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailDeleteNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationDetailDeleteNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationDetailDeleteNoOpRequest extends InvsLocationDetailSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationDetailDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationDetailDeleteNoOpRequest(String id, InvsLocationDetailObjectData noOpIn) {
    super(id, "InvsLocationDetailDeleteNoOpRequest");
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
