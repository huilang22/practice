/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentAllocateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentAllocateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentAllocateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectData payAllocateIn;
/**
 *
 * Constructor to create a  PaymentAllocateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentAllocateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData payAllocateInIn) {
    super(id, context, "PaymentAllocate");
    payAllocateIn = payAllocateInIn;
  }

  public void translateToMap() {
    if (payAllocateIn != null) {
      payAllocateIn.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(payAllocateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the Payment
 * @param payAllocateInIn Value of the payAllocateIn
 *
 */

  public void setPayment(PaymentObjectData payAllocateInIn) {
    payAllocateIn = payAllocateInIn;
  }

  public void translateFromMap() {
    payAllocateIn = PaymentObjectHelper.fromMap(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectData getPayment( ) {
    return payAllocateIn;
  }

}
