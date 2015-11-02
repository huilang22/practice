/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AxrtPaymentUpdateNoOpRequest Udt Request/Response
 *
 */
public class AxrtPaymentUpdateNoOpRequest extends AxrtPaymentSubRequestParent {
/**
 *
 * Constructor to create a   AxrtPaymentUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AxrtPaymentUpdateNoOpRequest(String id, AxrtPaymentObjectData noOpIn) {
    super(id, "AxrtPaymentUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("AxrtPayment", AxrtPaymentObjectHelper.toMap(noOpIn, new HashMap(), "AxrtPayment").get("AxrtPayment"));
    }
  }
/**
 *
 * Retrieves the AxrtPaymentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentObjectData getOutput() {
    return AxrtPaymentObjectHelper.fromMap(outputMap, "AxrtPayment");
  }
}
