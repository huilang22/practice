/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsLineValuesGetNoOpRequest Udt Request/Response
 *
 */
public class InvsLineValuesGetNoOpRequest extends InvsLineValuesSubRequestParent {
/**
 *
 * Constructor to create a   InvsLineValuesGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLineValuesGetNoOpRequest(String id, InvsLineValuesObjectData noOpIn) {
    super(id, "InvsLineValuesGetNoOpRequest");
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
