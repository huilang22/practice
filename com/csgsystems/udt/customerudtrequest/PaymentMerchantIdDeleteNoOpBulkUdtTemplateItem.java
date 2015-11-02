/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentMerchantIdDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentMerchantIdDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentMerchantIdObjectData noOpIn;

/**
 *
 * Constructor to create a   PaymentMerchantIdDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentMerchantIdDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdObjectData noOpInIn) {
    super(id, context, "PaymentMerchantIdDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(noOpIn, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }
/**
 *
 * Sets the  PaymentMerchantId
 * @param noOpInIn PaymentMerchantIdObjectData to set
 *
 */
  public void setPaymentMerchantId(PaymentMerchantIdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentMerchantId passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentMerchantIdObjectData getPaymentMerchantId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentMerchantIdObjectHelper.fromMap(inputMap, "PaymentMerchantId");
  }
}
