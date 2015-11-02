/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectFilter findIn;
/**
 *
 * Constructor to create a  PaymentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectFilter findInIn) {
    super(id, context, "PaymentFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Payment", PaymentObjectHelper.toMap(findIn, new HashMap(), "Payment").get("Payment"));
    }
  }


/**
 *
 * Sets the Payment
 * @param findInIn Value of the findIn
 *
 */

  public void setPayment(PaymentObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = PaymentObjectHelper.fromMapFilter(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectFilter getPayment( ) {
    return findIn;
  }

}
