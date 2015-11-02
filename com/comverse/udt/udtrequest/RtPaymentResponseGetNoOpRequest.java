/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RtPaymentResponseGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a RtPaymentResponseGetNoOpRequest Udt Request/Response
 *
 */
public class RtPaymentResponseGetNoOpRequest extends RtPaymentResponseSubRequestParent {
/**
 *
 * Constructor to create a   RtPaymentResponseGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RtPaymentResponseGetNoOpRequest(String id, RtPaymentResponseObjectData noOpIn) {
    super(id, "RtPaymentResponseGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(noOpIn, new HashMap(), "RtPaymentResponse").get("RtPaymentResponse"));
    }
  }
/**
 *
 * Retrieves the RtPaymentResponseObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RtPaymentResponseObjectData getOutput() {
    return RtPaymentResponseObjectHelper.fromMap(outputMap, "RtPaymentResponse");
  }
}
