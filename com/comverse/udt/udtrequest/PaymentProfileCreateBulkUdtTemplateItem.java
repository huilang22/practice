/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileCreateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentProfileCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentProfileCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentProfileObjectData ppcIn;
  protected Integer payment_protocol;
/**
 *
 * Constructor to create a  PaymentProfileCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentProfileCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentProfileObjectData ppcInIn, Integer payment_protocolIn) {
    super(id, context, "PaymentProfileCreate");
    ppcIn = ppcInIn;
    payment_protocol = payment_protocolIn;
  }

  public void translateToMap() {
    if (ppcIn != null) {
      ppcIn.resetFlags(true, true);
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(ppcIn, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
    if (payment_protocol != null) {
      addInput("PaymentProtocol", payment_protocol);
    }
  }


/**
 *
 * Sets the PaymentProfile
 * @param ppcInIn Value of the ppcIn
 *
 */

  public void setPaymentProfile(PaymentProfileObjectData ppcInIn) {
    ppcIn = ppcInIn;
  }

/**
 *
 * Sets the PaymentProtocol
 * @param payment_protocolIn Value of the payment_protocol
 *
 */

  public void setPaymentProtocol(Integer payment_protocolIn) {
    payment_protocol = payment_protocolIn;
  }

  public void translateFromMap() {
    ppcIn = PaymentProfileObjectHelper.fromMap(inputMap, "PaymentProfile");
    payment_protocol = (Integer)inputMap.get("PaymentProtocol");
  }

/**
 *
 * Gets the PaymentProfile
 * @return Value of the PaymentProfile
 *
 */

  public PaymentProfileObjectData getPaymentProfile( ) {
    return ppcIn;
  }

/**
 *
 * Gets the PaymentProtocol
 * @return Value of the PaymentProtocol
 *
 */

  public Integer getPaymentProtocol( ) {
    return payment_protocol;
  }

}
