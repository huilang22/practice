/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a PaymentTypeGetNoOpRequest Udt Request/Response
 *
 */
public class PaymentTypeGetNoOpRequest extends PaymentTypeSubRequestParent {
/**
 *
 * Constructor to create a   PaymentTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentTypeGetNoOpRequest(String id, PaymentTypeObjectData noOpIn) {
    super(id, "PaymentTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("PaymentType", PaymentTypeObjectHelper.toMap(noOpIn, new HashMap(), "PaymentType").get("PaymentType"));
    }
  }
/**
 *
 * Retrieves the PaymentTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentTypeObjectData getOutput() {
    return PaymentTypeObjectHelper.fromMap(outputMap, "PaymentType");
  }
}
