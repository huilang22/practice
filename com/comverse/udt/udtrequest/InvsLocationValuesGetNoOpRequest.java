/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationValuesGetNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationValuesGetNoOpRequest extends InvsLocationValuesSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationValuesGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationValuesGetNoOpRequest(String id, InvsLocationValuesObjectData noOpIn) {
    super(id, "InvsLocationValuesGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }
/**
 *
 * Retrieves the InvsLocationValuesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationValuesObjectData getOutput() {
    return InvsLocationValuesObjectHelper.fromMap(outputMap, "InvsLocationValues");
  }
}
