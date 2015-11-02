/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentValidateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectData payValidateIn1;
/**
 *
 * Constructor to create a  PaymentValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData payValidateIn1In) {
    super(id, context, "PaymentValidate");
    payValidateIn1 = payValidateIn1In;
  }

  public void translateToMap() {
    if (payValidateIn1 != null) {
      payValidateIn1.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(payValidateIn1, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }


/**
 *
 * Sets the Payment
 * @param payValidateIn1In Value of the payValidateIn1
 *
 */

  public void setPayment(PaymentObjectData payValidateIn1In) {
    payValidateIn1 = payValidateIn1In;
  }

  public void translateFromMap() {
    payValidateIn1 = PaymentObjectHelper.fromMap(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectData getPayment( ) {
    return payValidateIn1;
  }

}
