/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentCreatePendingBulkUdtTemplateItem.java
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
 * Class used to create a PaymentCreatePendingBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentCreatePendingBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectData paypendingCreateIn1;
/**
 *
 * Constructor to create a  PaymentCreatePendingBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentCreatePendingBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData paypendingCreateIn1In) {
    super(id, context, "PaymentCreatePending");
    paypendingCreateIn1 = paypendingCreateIn1In;
  }

  public void translateToMap() {
    if (paypendingCreateIn1 != null) {
      paypendingCreateIn1.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(paypendingCreateIn1, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }


/**
 *
 * Sets the Payment
 * @param paypendingCreateIn1In Value of the paypendingCreateIn1
 *
 */

  public void setPayment(PaymentObjectData paypendingCreateIn1In) {
    paypendingCreateIn1 = paypendingCreateIn1In;
  }

  public void translateFromMap() {
    paypendingCreateIn1 = PaymentObjectHelper.fromMap(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectData getPayment( ) {
    return paypendingCreateIn1;
  }

}
