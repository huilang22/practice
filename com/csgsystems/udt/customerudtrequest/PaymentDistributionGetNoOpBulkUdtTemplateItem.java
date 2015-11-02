/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentDistributionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentDistributionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentDistributionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentDistributionObjectData noOpIn;

/**
 *
 * Constructor to create a   PaymentDistributionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentDistributionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentDistributionObjectData noOpInIn) {
    super(id, context, "PaymentDistributionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(noOpIn, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }
/**
 *
 * Sets the  PaymentDistribution
 * @param noOpInIn PaymentDistributionObjectData to set
 *
 */
  public void setPaymentDistribution(PaymentDistributionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentDistribution passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentDistributionObjectData getPaymentDistribution() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentDistributionObjectHelper.fromMap(inputMap, "PaymentDistribution");
  }
}
