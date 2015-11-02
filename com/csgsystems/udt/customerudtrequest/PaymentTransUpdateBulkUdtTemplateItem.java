/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTransUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentTransUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentTransUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentTransObjectData PayTransUpdateIn;
/**
 *
 * Constructor to create a  PaymentTransUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentTransUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentTransObjectData PayTransUpdateInIn) {
    super(id, context, "PaymentTransUpdate");
    PayTransUpdateIn = PayTransUpdateInIn;
  }

  public void translateToMap() {
    if (PayTransUpdateIn != null) {
      PayTransUpdateIn.resetFlags(true, true);
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(PayTransUpdateIn, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }


/**
 *
 * Sets the PaymentTrans
 * @param PayTransUpdateInIn Value of the PayTransUpdateIn
 *
 */

  public void setPaymentTrans(PaymentTransObjectData PayTransUpdateInIn) {
    PayTransUpdateIn = PayTransUpdateInIn;
  }

  public void translateFromMap() {
    PayTransUpdateIn = PaymentTransObjectHelper.fromMap(inputMap, "PaymentTrans");
  }

/**
 *
 * Gets the PaymentTrans
 * @return Value of the PaymentTrans
 *
 */

  public PaymentTransObjectData getPaymentTrans( ) {
    return PayTransUpdateIn;
  }

}
