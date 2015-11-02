/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventGetNoOpRequest.java
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
 * NoOp class used to simulate a CtcEventGetNoOpRequest Udt Request/Response
 *
 */
public class CtcEventGetNoOpRequest extends CtcEventSubRequestParent {
/**
 *
 * Constructor to create a   CtcEventGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcEventGetNoOpRequest(String id, CtcEventObjectData noOpIn) {
    super(id, "CtcEventGetNoOpRequest");
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
