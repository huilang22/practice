/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a PaymentTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentTypeObjectKeyData bmfGetIn;
/**
 *
 * Constructor to create a  PaymentTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentTypeObjectKeyData bmfGetInIn) {
    super(id, context, "PaymentTypeGet");
    bmfGetIn = bmfGetInIn;
  }

  public void translateToMap() {
    if (bmfGetIn != null) {
      bmfGetIn.resetFlags(true, true);
      addInput("PaymentType", PaymentTypeObjectKeyHelper.toMap(bmfGetIn, new HashMap(), "PaymentTypeObjectKeyData").get("PaymentTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the PaymentType
 * @param bmfGetInIn Value of the bmfGetIn
 *
 */

  public void setPaymentType(PaymentTypeObjectKeyData bmfGetInIn) {
    bmfGetIn = bmfGetInIn;
  }

  public void translateFromMap() {
    bmfGetIn = PaymentTypeObjectKeyHelper.fromMap(inputMap, "PaymentType");
  }

/**
 *
 * Gets the PaymentType
 * @return Value of the PaymentType
 *
 */

  public PaymentTypeObjectKeyData getPaymentType( ) {
    return bmfGetIn;
  }

}
