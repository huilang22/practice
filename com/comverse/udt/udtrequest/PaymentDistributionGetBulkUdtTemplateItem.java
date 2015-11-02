/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionGetBulkUdtTemplateItem.java
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
 * Class used to create a PaymentDistributionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentDistributionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentDistributionObjectKeyData payDistribGetIn;
/**
 *
 * Constructor to create a  PaymentDistributionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentDistributionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentDistributionObjectKeyData payDistribGetInIn) {
    super(id, context, "PaymentDistributionGet");
    payDistribGetIn = payDistribGetInIn;
  }

  public void translateToMap() {
    if (payDistribGetIn != null) {
      payDistribGetIn.resetFlags(true, true);
      addInput("PaymentDistribution", PaymentDistributionObjectKeyHelper.toMap(payDistribGetIn, new HashMap(), "PaymentDistributionObjectKeyData").get("PaymentDistributionObjectKeyData"));
    }
  }


/**
 *
 * Sets the PaymentDistribution
 * @param payDistribGetInIn Value of the payDistribGetIn
 *
 */

  public void setPaymentDistribution(PaymentDistributionObjectKeyData payDistribGetInIn) {
    payDistribGetIn = payDistribGetInIn;
  }

  public void translateFromMap() {
    payDistribGetIn = PaymentDistributionObjectKeyHelper.fromMap(inputMap, "PaymentDistribution");
  }

/**
 *
 * Gets the PaymentDistribution
 * @return Value of the PaymentDistribution
 *
 */

  public PaymentDistributionObjectKeyData getPaymentDistribution( ) {
    return payDistribGetIn;
  }

}
