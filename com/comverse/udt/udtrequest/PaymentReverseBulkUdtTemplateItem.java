/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentReverseBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a PaymentReverseBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentReverseBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectData payReverseIn;
/**
 *
 * Constructor to create a  PaymentReverseBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentReverseBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData payReverseInIn) {
    super(id, context, "PaymentReverse");
    payReverseIn = payReverseInIn;
  }

  public void translateToMap() {
    if (payReverseIn != null) {
      payReverseIn.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(payReverseIn, new HashMap(), "Payment").get("Payment"));
    }
  }


/**
 *
 * Sets the Payment
 * @param payReverseInIn Value of the payReverseIn
 *
 */

  public void setPayment(PaymentObjectData payReverseInIn) {
    payReverseIn = payReverseInIn;
  }

  public void translateFromMap() {
    payReverseIn = PaymentObjectHelper.fromMap(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectData getPayment( ) {
    return payReverseIn;
  }

}
