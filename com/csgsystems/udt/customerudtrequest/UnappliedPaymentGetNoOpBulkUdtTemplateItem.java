/*
 * Generated code DO NOT EDIT
 * Generated file: UnappliedPaymentGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnappliedPaymentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnappliedPaymentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnappliedPaymentObjectData noOpIn;

/**
 *
 * Constructor to create a   UnappliedPaymentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnappliedPaymentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnappliedPaymentObjectData noOpInIn) {
    super(id, context, "UnappliedPaymentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(noOpIn, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }
/**
 *
 * Sets the  UnappliedPayment
 * @param noOpInIn UnappliedPaymentObjectData to set
 *
 */
  public void setUnappliedPayment(UnappliedPaymentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnappliedPayment passed into the constructor
 * @return Simulated response
 *
 */
  public UnappliedPaymentObjectData getUnappliedPayment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnappliedPaymentObjectHelper.fromMap(inputMap, "UnappliedPayment");
  }
}
