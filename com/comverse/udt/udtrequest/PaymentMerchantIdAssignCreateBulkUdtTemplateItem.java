/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignCreateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentMerchantIdAssignCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentMerchantIdAssignCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn;
/**
 *
 * Constructor to create a  PaymentMerchantIdAssignCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentMerchantIdAssignCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateInIn) {
    super(id, context, "PaymentMerchantIdAssignCreate");
    PaymentMerchantIdAssignCreateIn = PaymentMerchantIdAssignCreateInIn;
  }

  public void translateToMap() {
    if (PaymentMerchantIdAssignCreateIn != null) {
      PaymentMerchantIdAssignCreateIn.resetFlags(true, true);
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(PaymentMerchantIdAssignCreateIn, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }


/**
 *
 * Sets the PaymentMerchantIdAssign
 * @param PaymentMerchantIdAssignCreateInIn Value of the PaymentMerchantIdAssignCreateIn
 *
 */

  public void setPaymentMerchantIdAssign(PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateInIn) {
    PaymentMerchantIdAssignCreateIn = PaymentMerchantIdAssignCreateInIn;
  }

  public void translateFromMap() {
    PaymentMerchantIdAssignCreateIn = PaymentMerchantIdAssignObjectHelper.fromMap(inputMap, "PaymentMerchantIdAssign");
  }

/**
 *
 * Gets the PaymentMerchantIdAssign
 * @return Value of the PaymentMerchantIdAssign
 *
 */

  public PaymentMerchantIdAssignObjectData getPaymentMerchantIdAssign( ) {
    return PaymentMerchantIdAssignCreateIn;
  }

}
