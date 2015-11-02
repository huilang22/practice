/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsExtDataMapGetNoOpRequest Udt Request/Response
 *
 */
public class InvsExtDataMapGetNoOpRequest extends InvsExtDataMapSubRequestParent {
/**
 *
 * Constructor to create a   InvsExtDataMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsExtDataMapGetNoOpRequest(String id, InvsExtDataMapObjectData noOpIn) {
    super(id, "InvsExtDataMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(noOpIn, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }
/**
 *
 * Retrieves the InvsExtDataMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsExtDataMapObjectData getOutput() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
}
