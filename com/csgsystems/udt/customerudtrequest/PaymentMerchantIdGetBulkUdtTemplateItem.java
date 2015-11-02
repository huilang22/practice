/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdGetBulkUdtTemplateItem.java
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
 * Class used to create a PaymentMerchantIdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentMerchantIdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentMerchantIdObjectKeyData PaymentMerchantIdgetIn;
/**
 *
 * Constructor to create a  PaymentMerchantIdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentMerchantIdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdObjectKeyData PaymentMerchantIdgetInIn) {
    super(id, context, "PaymentMerchantIdGet");
    PaymentMerchantIdgetIn = PaymentMerchantIdgetInIn;
  }

  public void translateToMap() {
    if (PaymentMerchantIdgetIn != null) {
      PaymentMerchantIdgetIn.resetFlags(true, true);
      addInput("PaymentMerchantId", PaymentMerchantIdObjectKeyHelper.toMap(PaymentMerchantIdgetIn, new HashMap(), "PaymentMerchantIdObjectKeyData").get("PaymentMerchantIdObjectKeyData"));
    }
  }


/**
 *
 * Sets the PaymentMerchantId
 * @param PaymentMerchantIdgetInIn Value of the PaymentMerchantIdgetIn
 *
 */

  public void setPaymentMerchantId(PaymentMerchantIdObjectKeyData PaymentMerchantIdgetInIn) {
    PaymentMerchantIdgetIn = PaymentMerchantIdgetInIn;
  }

  public void translateFromMap() {
    PaymentMerchantIdgetIn = PaymentMerchantIdObjectKeyHelper.fromMap(inputMap, "PaymentMerchantId");
  }

/**
 *
 * Gets the PaymentMerchantId
 * @return Value of the PaymentMerchantId
 *
 */

  public PaymentMerchantIdObjectKeyData getPaymentMerchantId( ) {
    return PaymentMerchantIdgetIn;
  }

}
