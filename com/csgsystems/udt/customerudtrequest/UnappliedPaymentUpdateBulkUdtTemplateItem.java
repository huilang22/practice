/*
 * Generated code DO NOT EDIT
 * Generated file: UnappliedPaymentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UnappliedPaymentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnappliedPaymentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnappliedPaymentObjectData unappliedPaymentUpdateIn;
/**
 *
 * Constructor to create a  UnappliedPaymentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnappliedPaymentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnappliedPaymentObjectData unappliedPaymentUpdateInIn) {
    super(id, context, "UnappliedPaymentUpdate");
    unappliedPaymentUpdateIn = unappliedPaymentUpdateInIn;
  }

  public void translateToMap() {
    if (unappliedPaymentUpdateIn != null) {
      unappliedPaymentUpdateIn.resetFlags(true, true);
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(unappliedPaymentUpdateIn, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }


/**
 *
 * Sets the UnappliedPayment
 * @param unappliedPaymentUpdateInIn Value of the unappliedPaymentUpdateIn
 *
 */

  public void setUnappliedPayment(UnappliedPaymentObjectData unappliedPaymentUpdateInIn) {
    unappliedPaymentUpdateIn = unappliedPaymentUpdateInIn;
  }

  public void translateFromMap() {
    unappliedPaymentUpdateIn = UnappliedPaymentObjectHelper.fromMap(inputMap, "UnappliedPayment");
  }

/**
 *
 * Gets the UnappliedPayment
 * @return Value of the UnappliedPayment
 *
 */

  public UnappliedPaymentObjectData getUnappliedPayment( ) {
    return unappliedPaymentUpdateIn;
  }

}
