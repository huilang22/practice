/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentFindBulkUdtTemplateItem.java
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
 * Class used to create a UnappliedPaymentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnappliedPaymentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnappliedPaymentObjectFilter unappliedPaymentFindIn;
/**
 *
 * Constructor to create a  UnappliedPaymentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnappliedPaymentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnappliedPaymentObjectFilter unappliedPaymentFindInIn) {
    super(id, context, "UnappliedPaymentFind");
    unappliedPaymentFindIn = unappliedPaymentFindInIn;
  }

  public void translateToMap() {
    if (unappliedPaymentFindIn != null) {
      Integer index =  unappliedPaymentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(unappliedPaymentFindIn, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }


/**
 *
 * Sets the UnappliedPayment
 * @param unappliedPaymentFindInIn Value of the unappliedPaymentFindIn
 *
 */

  public void setUnappliedPayment(UnappliedPaymentObjectFilter unappliedPaymentFindInIn) {
    unappliedPaymentFindIn = unappliedPaymentFindInIn;
  }

  public void translateFromMap() {
    unappliedPaymentFindIn = UnappliedPaymentObjectHelper.fromMapFilter(inputMap, "UnappliedPayment");
  }

/**
 *
 * Gets the UnappliedPayment
 * @return Value of the UnappliedPayment
 *
 */

  public UnappliedPaymentObjectFilter getUnappliedPayment( ) {
    return unappliedPaymentFindIn;
  }

}
