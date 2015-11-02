/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentProfileUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentProfileUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentProfileUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentProfileObjectData ppuIn;
  protected Integer payment_protocol2;
/**
 *
 * Constructor to create a  PaymentProfileUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentProfileUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentProfileObjectData ppuInIn, Integer payment_protocol2In) {
    super(id, context, "PaymentProfileUpdate");
    ppuIn = ppuInIn;
    payment_protocol2 = payment_protocol2In;
  }

  public void translateToMap() {
    if (ppuIn != null) {
      ppuIn.resetFlags(true, true);
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(ppuIn, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
    if (payment_protocol2 != null) {
      addInput("PaymentProtocol2", payment_protocol2);
    }
  }


/**
 *
 * Sets the PaymentProfile
 * @param ppuInIn Value of the ppuIn
 *
 */

  public void setPaymentProfile(PaymentProfileObjectData ppuInIn) {
    ppuIn = ppuInIn;
  }

/**
 *
 * Sets the PaymentProtocol2
 * @param payment_protocol2In Value of the payment_protocol2
 *
 */

  public void setPaymentProtocol2(Integer payment_protocol2In) {
    payment_protocol2 = payment_protocol2In;
  }

  public void translateFromMap() {
    ppuIn = PaymentProfileObjectHelper.fromMap(inputMap, "PaymentProfile");
    payment_protocol2 = (Integer)inputMap.get("PaymentProtocol2");
  }

/**
 *
 * Gets the PaymentProfile
 * @return Value of the PaymentProfile
 *
 */

  public PaymentProfileObjectData getPaymentProfile( ) {
    return ppuIn;
  }

/**
 *
 * Gets the PaymentProtocol2
 * @return Value of the PaymentProtocol2
 *
 */

  public Integer getPaymentProtocol2( ) {
    return payment_protocol2;
  }

}
