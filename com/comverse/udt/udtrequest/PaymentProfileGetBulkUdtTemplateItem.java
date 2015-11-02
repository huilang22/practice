/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileGetBulkUdtTemplateItem.java
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
 * Class used to create a PaymentProfileGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentProfileGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentProfileObjectKeyData ppgIn;
/**
 *
 * Constructor to create a  PaymentProfileGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentProfileGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentProfileObjectKeyData ppgInIn) {
    super(id, context, "PaymentProfileGet");
    ppgIn = ppgInIn;
  }

  public void translateToMap() {
    if (ppgIn != null) {
      ppgIn.resetFlags(true, true);
      addInput("PaymentProfile", PaymentProfileObjectKeyHelper.toMap(ppgIn, new HashMap(), "PaymentProfileObjectKeyData").get("PaymentProfileObjectKeyData"));
    }
  }


/**
 *
 * Sets the PaymentProfile
 * @param ppgInIn Value of the ppgIn
 *
 */

  public void setPaymentProfile(PaymentProfileObjectKeyData ppgInIn) {
    ppgIn = ppgInIn;
  }

  public void translateFromMap() {
    ppgIn = PaymentProfileObjectKeyHelper.fromMap(inputMap, "PaymentProfile");
  }

/**
 *
 * Gets the PaymentProfile
 * @return Value of the PaymentProfile
 *
 */

  public PaymentProfileObjectKeyData getPaymentProfile( ) {
    return ppgIn;
  }

}
