/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentProfileFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentProfileFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentProfileObjectFilter ppfIn;
/**
 *
 * Constructor to create a  PaymentProfileFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentProfileFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentProfileObjectFilter ppfInIn) {
    super(id, context, "PaymentProfileFind");
    ppfIn = ppfInIn;
  }

  public void translateToMap() {
    if (ppfIn != null) {
      Integer index =  ppfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(ppfIn, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }


/**
 *
 * Sets the PaymentProfile
 * @param ppfInIn Value of the ppfIn
 *
 */

  public void setPaymentProfile(PaymentProfileObjectFilter ppfInIn) {
    ppfIn = ppfInIn;
  }

  public void translateFromMap() {
    ppfIn = PaymentProfileObjectHelper.fromMapFilter(inputMap, "PaymentProfile");
  }

/**
 *
 * Gets the PaymentProfile
 * @return Value of the PaymentProfile
 *
 */

  public PaymentProfileObjectFilter getPaymentProfile( ) {
    return ppfIn;
  }

}
