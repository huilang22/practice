/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsLineValuesUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsLineValuesUpdateNoOpRequest extends InvsLineValuesSubRequestParent {
/**
 *
 * Constructor to create a   InvsLineValuesUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLineValuesUpdateNoOpRequest(String id, InvsLineValuesObjectData noOpIn) {
    super(id, "InvsLineValuesUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(noOpIn, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }
/**
 *
 * Retrieves the InvsLineValuesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineValuesObjectData getOutput() {
    return InvsLineValuesObjectHelper.fromMap(outputMap, "InvsLineValues");
  }
}
