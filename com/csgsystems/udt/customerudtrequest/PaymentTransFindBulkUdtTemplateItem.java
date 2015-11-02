/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTransFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentTransFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentTransFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentTransObjectFilter PayTransFindIn;
/**
 *
 * Constructor to create a  PaymentTransFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentTransFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentTransObjectFilter PayTransFindInIn) {
    super(id, context, "PaymentTransFind");
    PayTransFindIn = PayTransFindInIn;
  }

  public void translateToMap() {
    if (PayTransFindIn != null) {
      Integer index =  PayTransFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(PayTransFindIn, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }


/**
 *
 * Sets the PaymentTrans
 * @param PayTransFindInIn Value of the PayTransFindIn
 *
 */

  public void setPaymentTrans(PaymentTransObjectFilter PayTransFindInIn) {
    PayTransFindIn = PayTransFindInIn;
  }

  public void translateFromMap() {
    PayTransFindIn = PaymentTransObjectHelper.fromMapFilter(inputMap, "PaymentTrans");
  }

/**
 *
 * Gets the PaymentTrans
 * @return Value of the PaymentTrans
 *
 */

  public PaymentTransObjectFilter getPaymentTrans( ) {
    return PayTransFindIn;
  }

}
