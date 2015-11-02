/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentDistributionSummaryFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentDistributionSummaryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentDistributionSummaryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentDistributionObjectFilter payDistribSumFindIn;
/**
 *
 * Constructor to create a  PaymentDistributionSummaryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentDistributionSummaryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentDistributionObjectFilter payDistribSumFindInIn) {
    super(id, context, "PaymentDistributionSummaryFind");
    payDistribSumFindIn = payDistribSumFindInIn;
  }

  public void translateToMap() {
    if (payDistribSumFindIn != null) {
      Integer index =  payDistribSumFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribSumFindIn, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }


/**
 *
 * Sets the PaymentDistribution
 * @param payDistribSumFindInIn Value of the payDistribSumFindIn
 *
 */

  public void setPaymentDistribution(PaymentDistributionObjectFilter payDistribSumFindInIn) {
    payDistribSumFindIn = payDistribSumFindInIn;
  }

  public void translateFromMap() {
    payDistribSumFindIn = PaymentDistributionObjectHelper.fromMapFilter(inputMap, "PaymentDistribution");
  }

/**
 *
 * Gets the PaymentDistribution
 * @return Value of the PaymentDistribution
 *
 */

  public PaymentDistributionObjectFilter getPaymentDistribution( ) {
    return payDistribSumFindIn;
  }

}
