/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcOrderMethodDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcOrderMethodDeleteNoOpRequest extends CtcOrderMethodSubRequestParent {
/**
 *
 * Constructor to create a   CtcOrderMethodDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOrderMethodDeleteNoOpRequest(String id, CtcOrderMethodObjectData noOpIn) {
    super(id, "CtcOrderMethodDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(noOpIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }
/**
 *
 * Retrieves the CtcOrderMethodObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOrderMethodObjectData getOutput() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
}
