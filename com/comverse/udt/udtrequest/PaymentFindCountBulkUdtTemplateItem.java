/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentFindCountBulkUdtTemplateItem.java
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
 * Class used to create a PaymentFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectFilter findCountIn;
/**
 *
 * Constructor to create a  PaymentFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectFilter findCountInIn) {
    super(id, context, "PaymentFindCount");
    findCountIn = findCountInIn;
  }

  public void translateToMap() {
    if (findCountIn != null) {
      Integer index =  findCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Payment", PaymentObjectHelper.toMap(findCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the Payment
 * @param findCountInIn Value of the findCountIn
 *
 */

  public void setPayment(PaymentObjectFilter findCountInIn) {
    findCountIn = findCountInIn;
  }

  public void translateFromMap() {
    findCountIn = PaymentObjectHelper.fromMapFilter(inputMap, "Payment");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectFilter getPayment( ) {
    return findCountIn;
  }

}
