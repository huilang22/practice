/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentObjectData noOpIn;

/**
 *
 * Constructor to create a   PaymentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData noOpInIn) {
    super(id, context, "PaymentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(noOpIn, new HashMap(), "Payment").get("Payment"));
    }
  }
/**
 *
 * Sets the  Payment
 * @param noOpInIn PaymentObjectData to set
 *
 */
  public void setPayment(PaymentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Payment passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentObjectData getPayment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentObjectHelper.fromMap(inputMap, "Payment");
  }
}
