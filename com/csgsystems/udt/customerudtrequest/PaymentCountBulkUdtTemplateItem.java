/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentCountBulkUdtTemplateItem.java
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
 * Class used to create a PaymentCountBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectData payCountIn;
/**
 *
 * Constructor to create a  PaymentCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentCountBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData payCountInIn) {
    super(id, context, "PaymentCount");
    payCountIn = payCountInIn;
  }

  public void translateToMap() {
    if (payCountIn != null) {
      payCountIn.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(payCountIn, new HashMap(), "NsfCount").get("NsfCount"));
    }
  }


/**
 *
 * Sets the Payment
 * @param payCountInIn Value of the payCountIn
 *
 */

  public void setPayment(PaymentObjectData payCountInIn) {
    payCountIn = payCountInIn;
  }

  public void translateFromMap() {
    payCountIn = PaymentObjectHelper.fromMap(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectData getPayment( ) {
    return payCountIn;
  }

}
