/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentProfileGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentProfileGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentProfileGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentProfileObjectData noOpIn;

/**
 *
 * Constructor to create a   PaymentProfileGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentProfileGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentProfileObjectData noOpInIn) {
    super(id, context, "PaymentProfileGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(noOpIn, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }
/**
 *
 * Sets the  PaymentProfile
 * @param noOpInIn PaymentProfileObjectData to set
 *
 */
  public void setPaymentProfile(PaymentProfileObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentProfile passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentProfileObjectData getPaymentProfile() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentProfileObjectHelper.fromMap(inputMap, "PaymentProfile");
  }
}
