/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentMerchantIdAssignUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentMerchantIdAssignUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn;
/**
 *
 * Constructor to create a  PaymentMerchantIdAssignUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentMerchantIdAssignUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateInIn) {
    super(id, context, "PaymentMerchantIdAssignUpdate");
    PaymentMerchantIdAssignUpdateIn = PaymentMerchantIdAssignUpdateInIn;
  }

  public void translateToMap() {
    if (PaymentMerchantIdAssignUpdateIn != null) {
      PaymentMerchantIdAssignUpdateIn.resetFlags(true, true);
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(PaymentMerchantIdAssignUpdateIn, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }


/**
 *
 * Sets the PaymentMerchantIdAssign
 * @param PaymentMerchantIdAssignUpdateInIn Value of the PaymentMerchantIdAssignUpdateIn
 *
 */

  public void setPaymentMerchantIdAssign(PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateInIn) {
    PaymentMerchantIdAssignUpdateIn = PaymentMerchantIdAssignUpdateInIn;
  }

  public void translateFromMap() {
    PaymentMerchantIdAssignUpdateIn = PaymentMerchantIdAssignObjectHelper.fromMap(inputMap, "PaymentMerchantIdAssign");
  }

/**
 *
 * Gets the PaymentMerchantIdAssign
 * @return Value of the PaymentMerchantIdAssign
 *
 */

  public PaymentMerchantIdAssignObjectData getPaymentMerchantIdAssign( ) {
    return PaymentMerchantIdAssignUpdateIn;
  }

}
