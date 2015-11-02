/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcEventDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcEventDeleteNoOpRequest extends CtcEventSubRequestParent {
/**
 *
 * Constructor to create a   CtcEventDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcEventDeleteNoOpRequest(String id, CtcEventObjectData noOpIn) {
    super(id, "CtcEventDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcEvent", CtcEventObjectHelper.toMap(noOpIn, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }
/**
 *
 * Retrieves the CtcEventObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcEventObjectData getOutput() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
}
