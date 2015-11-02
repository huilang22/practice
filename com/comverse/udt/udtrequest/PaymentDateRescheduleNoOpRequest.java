/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDateRescheduleNoOpRequest.java
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
 * NoOp class used to simulate a PaymentDateRescheduleNoOpRequest Udt Request/Response
 *
 */
public class PaymentDateRescheduleNoOpRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a   PaymentDateRescheduleNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PaymentDateRescheduleNoOpRequest(String id, InvoiceObjectData noOpIn) {
    super(id, "PaymentDateRescheduleNoOpRequest");
    if (noOpIn != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(noOpIn, new HashMap(), "Invoice").get("Invoice"));
    }
  }
/**
 *
 * Retrieves the InvoiceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceObjectData getOutput() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
}
