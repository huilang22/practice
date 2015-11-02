/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentValidateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentValidateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentValidateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentTransObjectData noOpIn;

/**
 *
 * Constructor to create a   PaymentValidateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentValidateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentTransObjectData noOpInIn) {
    super(id, context, "PaymentValidate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(noOpIn, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }
/**
 *
 * Sets the  PaymentTrans
 * @param noOpInIn PaymentTransObjectData to set
 *
 */
  public void setPaymentTrans(PaymentTransObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentTrans passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentTransObjectData getPaymentTrans() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentTransObjectHelper.fromMap(inputMap, "PaymentTrans");
  }
}
