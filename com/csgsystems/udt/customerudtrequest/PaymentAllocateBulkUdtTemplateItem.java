/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentAllocateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
