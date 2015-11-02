/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentNoBackoutFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentNoBackoutFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentNoBackoutFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectFilter nbfindIn;
/**
 *
 * Constructor to create a  PaymentNoBackoutFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentNoBackoutFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectFilter nbfindInIn) {
    super(id, context, "PaymentNoBackoutFind");
    nbfindIn = nbfindInIn;
  }

  public void translateToMap() {
    if (nbfindIn != null) {
      Integer index =  nbfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Payment", PaymentObjectHelper.toMap(nbfindIn, new HashMap(), "Payment").get("Payment"));
    }
  }


/**
 *
 * Sets the Payment
 * @param nbfindInIn Value of the nbfindIn
 *
 */

  public void setPayment(PaymentObjectFilter nbfindInIn) {
    nbfindIn = nbfindInIn;
  }

  public void translateFromMap() {
    nbfindIn = PaymentObjectHelper.fromMapFilter(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectFilter getPayment( ) {
    return nbfindIn;
  }

}
