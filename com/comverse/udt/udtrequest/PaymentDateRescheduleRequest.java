/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDateRescheduleRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PaymentDateRescheduleRequest Udt Request
 *
 */

public class PaymentDateRescheduleRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  PaymentDateRescheduleRequest
 * @param id Unique request name
 * @param InvoiceUpdateIn InvoiceObjectKeyData for PaymentDateRescheduleRequest
 * @param payment_due_date Date for PaymentDateRescheduleRequest
 *
 */
@JsonCreator
  public PaymentDateRescheduleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectKeyData InvoiceUpdateIn, @JsonProperty("PaymentDueDate")Date payment_due_date) {
    super(id, "PaymentDateReschedule");
    if (InvoiceUpdateIn != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceUpdateIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
    if (payment_due_date != null) {
      addInput("PaymentDueDate", payment_due_date);
    }
  }

/**
 *
 * Retrieves the InvoiceObjectData that results from the PaymentDateRescheduleRequest call
 * @return InvoiceObjectData resulting from udt call
 *
 */

  public InvoiceObjectData getOutput() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
}
