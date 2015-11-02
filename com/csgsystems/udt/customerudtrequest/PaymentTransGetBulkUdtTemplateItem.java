/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTransGetBulkUdtTemplateItem.java
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
 * Class used to create a PaymentTransGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentTransGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentTransObjectKeyData PayTransGetIn;
/**
 *
 * Constructor to create a  PaymentTransGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentTransGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentTransObjectKeyData PayTransGetInIn) {
    super(id, context, "PaymentTransGet");
    PayTransGetIn = PayTransGetInIn;
  }

  public void translateToMap() {
    if (PayTransGetIn != null) {
      PayTransGetIn.resetFlags(true, true);
      addInput("PaymentTrans", PaymentTransObjectKeyHelper.toMap(PayTransGetIn, new HashMap(), "PaymentTransObjectKeyData").get("PaymentTransObjectKeyData"));
    }
  }


/**
 *
 * Sets the PaymentTrans
 * @param PayTransGetInIn Value of the PayTransGetIn
 *
 */

  public void setPaymentTrans(PaymentTransObjectKeyData PayTransGetInIn) {
    PayTransGetIn = PayTransGetInIn;
  }

  public void translateFromMap() {
    PayTransGetIn = PaymentTransObjectKeyHelper.fromMap(inputMap, "PaymentTrans");
  }

/**
 *
 * Gets the PaymentTrans
 * @return Value of the PaymentTrans
 *
 */

  public PaymentTransObjectKeyData getPaymentTrans( ) {
    return PayTransGetIn;
  }

}
