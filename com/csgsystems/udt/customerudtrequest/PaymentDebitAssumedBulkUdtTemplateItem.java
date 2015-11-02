/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentDebitAssumedBulkUdtTemplateItem.java
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
 * Class used to create a PaymentDebitAssumedBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentDebitAssumedBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectData payDebitAssumedIn1;
/**
 *
 * Constructor to create a  PaymentDebitAssumedBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentDebitAssumedBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData payDebitAssumedIn1In) {
    super(id, context, "PaymentDebitAssumed");
    payDebitAssumedIn1 = payDebitAssumedIn1In;
  }

  public void translateToMap() {
    if (payDebitAssumedIn1 != null) {
      payDebitAssumedIn1.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(payDebitAssumedIn1, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }


/**
 *
 * Sets the Payment
 * @param payDebitAssumedIn1In Value of the payDebitAssumedIn1
 *
 */

  public void setPayment(PaymentObjectData payDebitAssumedIn1In) {
    payDebitAssumedIn1 = payDebitAssumedIn1In;
  }

  public void translateFromMap() {
    payDebitAssumedIn1 = PaymentObjectHelper.fromMap(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectData getPayment( ) {
    return payDebitAssumedIn1;
  }

}
