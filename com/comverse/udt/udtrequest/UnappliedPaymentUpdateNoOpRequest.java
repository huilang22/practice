/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UnappliedPaymentUpdateNoOpRequest Udt Request/Response
 *
 */
public class UnappliedPaymentUpdateNoOpRequest extends UnappliedPaymentSubRequestParent {
/**
 *
 * Constructor to create a   UnappliedPaymentUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnappliedPaymentUpdateNoOpRequest(String id, UnappliedPaymentObjectData noOpIn) {
    super(id, "UnappliedPaymentUpdateNoOpRequest");
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
