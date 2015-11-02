/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentMerchantIdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentMerchantIdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentMerchantIdObjectData PaymentMerchantIdUpdateIn;
/**
 *
 * Constructor to create a  PaymentMerchantIdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentMerchantIdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdObjectData PaymentMerchantIdUpdateInIn) {
    super(id, context, "PaymentMerchantIdUpdate");
    PaymentMerchantIdUpdateIn = PaymentMerchantIdUpdateInIn;
  }

  public void translateToMap() {
    if (PaymentMerchantIdUpdateIn != null) {
      PaymentMerchantIdUpdateIn.resetFlags(true, true);
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(PaymentMerchantIdUpdateIn, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }


/**
 *
 * Sets the PaymentMerchantId
 * @param PaymentMerchantIdUpdateInIn Value of the PaymentMerchantIdUpdateIn
 *
 */

  public void setPaymentMerchantId(PaymentMerchantIdObjectData PaymentMerchantIdUpdateInIn) {
    PaymentMerchantIdUpdateIn = PaymentMerchantIdUpdateInIn;
  }

  public void translateFromMap() {
    PaymentMerchantIdUpdateIn = PaymentMerchantIdObjectHelper.fromMap(inputMap, "PaymentMerchantId");
  }

/**
 *
 * Gets the PaymentMerchantId
 * @return Value of the PaymentMerchantId
 *
 */

  public PaymentMerchantIdObjectData getPaymentMerchantId( ) {
    return PaymentMerchantIdUpdateIn;
  }

}
