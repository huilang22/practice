/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeUpdateNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcUrlTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtcUrlTypeUpdateNoOpRequest extends CtcUrlTypeSubRequestParent {
/**
 *
 * Constructor to create a   CtcUrlTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcUrlTypeUpdateNoOpRequest(String id, CtcUrlTypeObjectData noOpIn) {
    super(id, "CtcUrlTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }
/**
 *
 * Retrieves the CtcUrlTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcUrlTypeObjectData getOutput() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
}
