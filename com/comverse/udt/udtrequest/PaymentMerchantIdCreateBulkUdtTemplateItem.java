/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a PaymentMerchantIdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentMerchantIdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentMerchantIdObjectData PaymentMerchantIdCreateIn;
/**
 *
 * Constructor to create a  PaymentMerchantIdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentMerchantIdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdObjectData PaymentMerchantIdCreateInIn) {
    super(id, context, "PaymentMerchantIdCreate");
    PaymentMerchantIdCreateIn = PaymentMerchantIdCreateInIn;
  }

  public void translateToMap() {
    if (PaymentMerchantIdCreateIn != null) {
      PaymentMerchantIdCreateIn.resetFlags(true, true);
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(PaymentMerchantIdCreateIn, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }


/**
 *
 * Sets the PaymentMerchantId
 * @param PaymentMerchantIdCreateInIn Value of the PaymentMerchantIdCreateIn
 *
 */

  public void setPaymentMerchantId(PaymentMerchantIdObjectData PaymentMerchantIdCreateInIn) {
    PaymentMerchantIdCreateIn = PaymentMerchantIdCreateInIn;
  }

  public void translateFromMap() {
    PaymentMerchantIdCreateIn = PaymentMerchantIdObjectHelper.fromMap(inputMap, "PaymentMerchantId");
  }

/**
 *
 * Gets the PaymentMerchantId
 * @return Value of the PaymentMerchantId
 *
 */

  public PaymentMerchantIdObjectData getPaymentMerchantId( ) {
    return PaymentMerchantIdCreateIn;
  }

}
