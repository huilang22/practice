/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentMerchantIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentMerchantIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentMerchantIdObjectFilter PaymentMerchantIdfindIn;
/**
 *
 * Constructor to create a  PaymentMerchantIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentMerchantIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdObjectFilter PaymentMerchantIdfindInIn) {
    super(id, context, "PaymentMerchantIdFind");
    PaymentMerchantIdfindIn = PaymentMerchantIdfindInIn;
  }

  public void translateToMap() {
    if (PaymentMerchantIdfindIn != null) {
      Integer index =  PaymentMerchantIdfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(PaymentMerchantIdfindIn, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }


/**
 *
 * Sets the PaymentMerchantId
 * @param PaymentMerchantIdfindInIn Value of the PaymentMerchantIdfindIn
 *
 */

  public void setPaymentMerchantId(PaymentMerchantIdObjectFilter PaymentMerchantIdfindInIn) {
    PaymentMerchantIdfindIn = PaymentMerchantIdfindInIn;
  }

  public void translateFromMap() {
    PaymentMerchantIdfindIn = PaymentMerchantIdObjectHelper.fromMapFilter(inputMap, "PaymentMerchantId");
  }

/**
 *
 * Gets the PaymentMerchantId
 * @return Value of the PaymentMerchantId
 *
 */

  public PaymentMerchantIdObjectFilter getPaymentMerchantId( ) {
    return PaymentMerchantIdfindIn;
  }

}
