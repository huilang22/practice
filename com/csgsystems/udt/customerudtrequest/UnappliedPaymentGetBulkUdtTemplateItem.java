/*
 * Generated code DO NOT EDIT
 * Generated file: UnappliedPaymentGetBulkUdtTemplateItem.java
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
 * Class used to create a UnappliedPaymentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UnappliedPaymentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnappliedPaymentObjectKeyData unappliedPaymentGetIn;
/**
 *
 * Constructor to create a  UnappliedPaymentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnappliedPaymentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UnappliedPaymentObjectKeyData unappliedPaymentGetInIn) {
    super(id, context, "UnappliedPaymentGet");
    unappliedPaymentGetIn = unappliedPaymentGetInIn;
  }

  public void translateToMap() {
    if (unappliedPaymentGetIn != null) {
      unappliedPaymentGetIn.resetFlags(true, true);
      addInput("UnappliedPayment", UnappliedPaymentObjectKeyHelper.toMap(unappliedPaymentGetIn, new HashMap(), "UnappliedPaymentObjectKeyData").get("UnappliedPaymentObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnappliedPayment
 * @param unappliedPaymentGetInIn Value of the unappliedPaymentGetIn
 *
 */

  public void setUnappliedPayment(UnappliedPaymentObjectKeyData unappliedPaymentGetInIn) {
    unappliedPaymentGetIn = unappliedPaymentGetInIn;
  }

  public void translateFromMap() {
    unappliedPaymentGetIn = UnappliedPaymentObjectKeyHelper.fromMap(inputMap, "UnappliedPayment");
  }

/**
 *
 * Gets the UnappliedPayment
 * @return Value of the UnappliedPayment
 *
 */

  public UnappliedPaymentObjectKeyData getUnappliedPayment( ) {
    return unappliedPaymentGetIn;
  }

}
