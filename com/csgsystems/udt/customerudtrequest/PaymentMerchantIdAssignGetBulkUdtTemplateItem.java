/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdAssignGetBulkUdtTemplateItem.java
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
 * Class used to create a PaymentMerchantIdAssignGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentMerchantIdAssignGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn;
/**
 *
 * Constructor to create a  PaymentMerchantIdAssignGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentMerchantIdAssignGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetInIn) {
    super(id, context, "PaymentMerchantIdAssignGet");
    PaymentMerchantIdAssigngetIn = PaymentMerchantIdAssigngetInIn;
  }

  public void translateToMap() {
    if (PaymentMerchantIdAssigngetIn != null) {
      PaymentMerchantIdAssigngetIn.resetFlags(true, true);
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectKeyHelper.toMap(PaymentMerchantIdAssigngetIn, new HashMap(), "PaymentMerchantIdAssignObjectKeyData").get("PaymentMerchantIdAssignObjectKeyData"));
    }
  }


/**
 *
 * Sets the PaymentMerchantIdAssign
 * @param PaymentMerchantIdAssigngetInIn Value of the PaymentMerchantIdAssigngetIn
 *
 */

  public void setPaymentMerchantIdAssign(PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetInIn) {
    PaymentMerchantIdAssigngetIn = PaymentMerchantIdAssigngetInIn;
  }

  public void translateFromMap() {
    PaymentMerchantIdAssigngetIn = PaymentMerchantIdAssignObjectKeyHelper.fromMap(inputMap, "PaymentMerchantIdAssign");
  }

/**
 *
 * Gets the PaymentMerchantIdAssign
 * @return Value of the PaymentMerchantIdAssign
 *
 */

  public PaymentMerchantIdAssignObjectKeyData getPaymentMerchantIdAssign( ) {
    return PaymentMerchantIdAssigngetIn;
  }

}
