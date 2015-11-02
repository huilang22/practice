/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionSuspenseFindCountBulkUdtTemplateItem.java
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
 * Class used to create a PaymentDistributionSuspenseFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentDistributionSuspenseFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentDistributionObjectFilter payDistribFindCount2In;
/**
 *
 * Constructor to create a  PaymentDistributionSuspenseFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentDistributionSuspenseFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFindCount2InIn) {
    super(id, context, "PaymentDistributionSuspenseFindCount");
    payDistribFindCount2In = payDistribFindCount2InIn;
  }

  public void translateToMap() {
    if (payDistribFindCount2In != null) {
      Integer index =  payDistribFindCount2In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribFindCount2In, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the PaymentDistribution
 * @param payDistribFindCount2InIn Value of the payDistribFindCount2In
 *
 */

  public void setPaymentDistribution(PaymentDistributionObjectFilter payDistribFindCount2InIn) {
    payDistribFindCount2In = payDistribFindCount2InIn;
  }

  public void translateFromMap() {
    payDistribFindCount2In = PaymentDistributionObjectHelper.fromMapFilter(inputMap, "PaymentDistribution");
  }

/**
 *
 * Gets the PaymentDistribution
 * @return Value of the PaymentDistribution
 *
 */

  public PaymentDistributionObjectFilter getPaymentDistribution( ) {
    return payDistribFindCount2In;
  }

}
