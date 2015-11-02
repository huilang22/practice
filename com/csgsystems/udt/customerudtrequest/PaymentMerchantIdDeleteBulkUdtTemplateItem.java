/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PaymentMerchantIdDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentMerchantIdDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteIn;
/**
 *
 * Constructor to create a  PaymentMerchantIdDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentMerchantIdDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteInIn) {
    super(id, context, "PaymentMerchantIdDelete");
    PaymentMerchantIdDeleteIn = PaymentMerchantIdDeleteInIn;
  }

  public void translateToMap() {
    if (PaymentMerchantIdDeleteIn != null) {
      PaymentMerchantIdDeleteIn.resetFlags(true, true);
      addInput("PaymentMerchantId", PaymentMerchantIdObjectKeyHelper.toMap(PaymentMerchantIdDeleteIn, new HashMap(), "PaymentMerchantIdObjectKeyData").get("PaymentMerchantIdObjectKeyData"));
    }
  }


/**
 *
 * Sets the PaymentMerchantId
 * @param PaymentMerchantIdDeleteInIn Value of the PaymentMerchantIdDeleteIn
 *
 */

  public void setPaymentMerchantId(PaymentMerchantIdObjectKeyData PaymentMerchantIdDeleteInIn) {
    PaymentMerchantIdDeleteIn = PaymentMerchantIdDeleteInIn;
  }

  public void translateFromMap() {
    PaymentMerchantIdDeleteIn = PaymentMerchantIdObjectKeyHelper.fromMap(inputMap, "PaymentMerchantId");
  }

/**
 *
 * Gets the PaymentMerchantId
 * @return Value of the PaymentMerchantId
 *
 */

  public PaymentMerchantIdObjectKeyData getPaymentMerchantId( ) {
    return PaymentMerchantIdDeleteIn;
  }

}
