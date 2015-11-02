/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PaymentDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectKeyData payDeleteIn;
/**
 *
 * Constructor to create a  PaymentDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectKeyData payDeleteInIn) {
    super(id, context, "PaymentDelete");
    payDeleteIn = payDeleteInIn;
  }

  public void translateToMap() {
    if (payDeleteIn != null) {
      payDeleteIn.resetFlags(true, true);
      addInput("Payment", PaymentObjectKeyHelper.toMap(payDeleteIn, new HashMap(), "PaymentObjectKeyData").get("PaymentObjectKeyData"));
    }
  }


/**
 *
 * Sets the Payment
 * @param payDeleteInIn Value of the payDeleteIn
 *
 */

  public void setPayment(PaymentObjectKeyData payDeleteInIn) {
    payDeleteIn = payDeleteInIn;
  }

  public void translateFromMap() {
    payDeleteIn = PaymentObjectKeyHelper.fromMap(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectKeyData getPayment( ) {
    return payDeleteIn;
  }

}
