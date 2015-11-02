/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentDistributionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentDistributionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentDistributionObjectFilter payDistribFindIn;
/**
 *
 * Constructor to create a  PaymentDistributionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentDistributionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFindInIn) {
    super(id, context, "PaymentDistributionFind");
    payDistribFindIn = payDistribFindInIn;
  }

  public void translateToMap() {
    if (payDistribFindIn != null) {
      Integer index =  payDistribFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribFindIn, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }


/**
 *
 * Sets the PaymentDistribution
 * @param payDistribFindInIn Value of the payDistribFindIn
 *
 */

  public void setPaymentDistribution(PaymentDistributionObjectFilter payDistribFindInIn) {
    payDistribFindIn = payDistribFindInIn;
  }

  public void translateFromMap() {
    payDistribFindIn = PaymentDistributionObjectHelper.fromMapFilter(inputMap, "PaymentDistribution");
  }

/**
 *
 * Gets the PaymentDistribution
 * @return Value of the PaymentDistribution
 *
 */

  public PaymentDistributionObjectFilter getPaymentDistribution( ) {
    return payDistribFindIn;
  }

}
