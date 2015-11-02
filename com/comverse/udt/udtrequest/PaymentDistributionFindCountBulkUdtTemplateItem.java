/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionFindCountBulkUdtTemplateItem.java
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
 * Class used to create a PaymentDistributionFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentDistributionFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentDistributionObjectFilter payDistribFindCountIn;
/**
 *
 * Constructor to create a  PaymentDistributionFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentDistributionFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFindCountInIn) {
    super(id, context, "PaymentDistributionFindCount");
    payDistribFindCountIn = payDistribFindCountInIn;
  }

  public void translateToMap() {
    if (payDistribFindCountIn != null) {
      Integer index =  payDistribFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the PaymentDistribution
 * @param payDistribFindCountInIn Value of the payDistribFindCountIn
 *
 */

  public void setPaymentDistribution(PaymentDistributionObjectFilter payDistribFindCountInIn) {
    payDistribFindCountIn = payDistribFindCountInIn;
  }

  public void translateFromMap() {
    payDistribFindCountIn = PaymentDistributionObjectHelper.fromMapFilter(inputMap, "PaymentDistribution");
  }

/**
 *
 * Gets the PaymentDistribution
 * @return Value of the PaymentDistribution
 *
 */

  public PaymentDistributionObjectFilter getPaymentDistribution( ) {
    return payDistribFindCountIn;
  }

}
