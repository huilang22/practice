/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentGetNoOpRequest.java
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
 * NoOp class used to simulate a UnappliedPaymentGetNoOpRequest Udt Request/Response
 *
 */
public class UnappliedPaymentGetNoOpRequest extends UnappliedPaymentSubRequestParent {
/**
 *
 * Constructor to create a   UnappliedPaymentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnappliedPaymentGetNoOpRequest(String id, UnappliedPaymentObjectData noOpIn) {
    super(id, "UnappliedPaymentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(noOpIn, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }
/**
 *
 * Retrieves the UnappliedPaymentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UnappliedPaymentObjectData getOutput() {
    return UnappliedPaymentObjectHelper.fromMap(outputMap, "UnappliedPayment");
  }
}
