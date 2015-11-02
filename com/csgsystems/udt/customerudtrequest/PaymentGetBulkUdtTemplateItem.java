/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentGetBulkUdtTemplateItem.java
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
 * Class used to create a PaymentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectKeyData getIn;
/**
 *
 * Constructor to create a  PaymentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectKeyData getInIn) {
    super(id, context, "PaymentGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("Payment", PaymentObjectKeyHelper.toMap(getIn, new HashMap(), "PaymentObjectKeyData").get("PaymentObjectKeyData"));
    }
  }


/**
 *
 * Sets the Payment
 * @param getInIn Value of the getIn
 *
 */

  public void setPayment(PaymentObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = PaymentObjectKeyHelper.fromMap(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectKeyData getPayment( ) {
    return getIn;
  }

}
