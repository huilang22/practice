/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentDistributionSuspenseFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentDistributionSuspenseFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentDistributionSuspenseFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentDistributionObjectFilter payDistribFind2In;
/**
 *
 * Constructor to create a  PaymentDistributionSuspenseFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentDistributionSuspenseFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentDistributionObjectFilter payDistribFind2InIn) {
    super(id, context, "PaymentDistributionSuspenseFind");
    payDistribFind2In = payDistribFind2InIn;
  }

  public void translateToMap() {
    if (payDistribFind2In != null) {
      Integer index =  payDistribFind2In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribFind2In, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }


/**
 *
 * Sets the PaymentDistribution
 * @param payDistribFind2InIn Value of the payDistribFind2In
 *
 */

  public void setPaymentDistribution(PaymentDistributionObjectFilter payDistribFind2InIn) {
    payDistribFind2In = payDistribFind2InIn;
  }

  public void translateFromMap() {
    payDistribFind2In = PaymentDistributionObjectHelper.fromMapFilter(inputMap, "PaymentDistribution");
  }

/**
 *
 * Gets the PaymentDistribution
 * @return Value of the PaymentDistribution
 *
 */

  public PaymentDistributionObjectFilter getPaymentDistribution( ) {
    return payDistribFind2In;
  }

}
