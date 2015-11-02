/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentMerchantGetBulkUdtTemplateItem.java
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
 * Class used to create a AxrtPaymentMerchantGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtPaymentMerchantGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtPaymentMerchantObjectKeyData AxrtPayMerchantIn;
/**
 *
 * Constructor to create a  AxrtPaymentMerchantGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtPaymentMerchantGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentMerchantObjectKeyData AxrtPayMerchantInIn) {
    super(id, context, "AxrtPaymentMerchantGet");
    AxrtPayMerchantIn = AxrtPayMerchantInIn;
  }

  public void translateToMap() {
    if (AxrtPayMerchantIn != null) {
      AxrtPayMerchantIn.resetFlags(true, true);
      addInput("AxrtPaymentMerchant", AxrtPaymentMerchantObjectKeyHelper.toMap(AxrtPayMerchantIn, new HashMap(), "AxrtPaymentMerchantObjectKeyData").get("AxrtPaymentMerchantObjectKeyData"));
    }
  }


/**
 *
 * Sets the AxrtPaymentMerchant
 * @param AxrtPayMerchantInIn Value of the AxrtPayMerchantIn
 *
 */

  public void setAxrtPaymentMerchant(AxrtPaymentMerchantObjectKeyData AxrtPayMerchantInIn) {
    AxrtPayMerchantIn = AxrtPayMerchantInIn;
  }

  public void translateFromMap() {
    AxrtPayMerchantIn = AxrtPaymentMerchantObjectKeyHelper.fromMap(inputMap, "AxrtPaymentMerchant");
  }

/**
 *
 * Gets the AxrtPaymentMerchant
 * @return Value of the AxrtPaymentMerchant
 *
 */

  public AxrtPaymentMerchantObjectKeyData getAxrtPaymentMerchant( ) {
    return AxrtPayMerchantIn;
  }

}
