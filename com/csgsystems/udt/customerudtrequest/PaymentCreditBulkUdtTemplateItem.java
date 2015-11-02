/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentCreditBulkUdtTemplateItem.java
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
 * Class used to create a PaymentCreditBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentCreditBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectData payCreditIn1;
  protected PaymentTransObjectData _payment_Trans;
/**
 *
 * Constructor to create a  PaymentCreditBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentCreditBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData payCreditIn1In, PaymentTransObjectData _payment_TransIn) {
    super(id, context, "PaymentCredit");
    payCreditIn1 = payCreditIn1In;
    _payment_Trans = _payment_TransIn;
  }

  public void translateToMap() {
    if (payCreditIn1 != null) {
      payCreditIn1.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(payCreditIn1, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
    if (_payment_Trans != null) {
      _payment_Trans.resetFlags(true, true);
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(_payment_Trans, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }


/**
 *
 * Sets the Payment
 * @param payCreditIn1In Value of the payCreditIn1
 *
 */

  public void setPayment(PaymentObjectData payCreditIn1In) {
    payCreditIn1 = payCreditIn1In;
  }

/**
 *
 * Sets the PaymentTrans
 * @param _payment_TransIn Value of the _payment_Trans
 *
 */

  public void setPaymentTrans(PaymentTransObjectData _payment_TransIn) {
    _payment_Trans = _payment_TransIn;
  }

  public void translateFromMap() {
    payCreditIn1 = PaymentObjectHelper.fromMap(inputMap, "Payment");
    _payment_Trans = PaymentTransObjectHelper.fromMap(inputMap, "PaymentTrans");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectData getPayment( ) {
    return payCreditIn1;
  }

/**
 *
 * Gets the PaymentTrans
 * @return Value of the PaymentTrans
 *
 */

  public PaymentTransObjectData getPaymentTrans( ) {
    return _payment_Trans;
  }

}
