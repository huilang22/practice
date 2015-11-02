/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PaymentProfileDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentProfileDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentProfileObjectKeyData ppdIn;
  protected Integer profile_status;
  protected Integer payment_protocol3;
/**
 *
 * Constructor to create a  PaymentProfileDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentProfileDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentProfileObjectKeyData ppdInIn, Integer profile_statusIn, Integer payment_protocol3In) {
    super(id, context, "PaymentProfileDelete");
    ppdIn = ppdInIn;
    profile_status = profile_statusIn;
    payment_protocol3 = payment_protocol3In;
  }

  public void translateToMap() {
    if (ppdIn != null) {
      ppdIn.resetFlags(true, true);
      addInput("PaymentProfile", PaymentProfileObjectKeyHelper.toMap(ppdIn, new HashMap(), "PaymentProfileObjectKeyData").get("PaymentProfileObjectKeyData"));
    }
    if (profile_status != null) {
      addInput("ProfileStatus", profile_status);
    }
    if (payment_protocol3 != null) {
      addInput("PaymentProtocol3", payment_protocol3);
    }
  }


/**
 *
 * Sets the PaymentProfile
 * @param ppdInIn Value of the ppdIn
 *
 */

  public void setPaymentProfile(PaymentProfileObjectKeyData ppdInIn) {
    ppdIn = ppdInIn;
  }

/**
 *
 * Sets the ProfileStatus
 * @param profile_statusIn Value of the profile_status
 *
 */

  public void setProfileStatus(Integer profile_statusIn) {
    profile_status = profile_statusIn;
  }

/**
 *
 * Sets the PaymentProtocol3
 * @param payment_protocol3In Value of the payment_protocol3
 *
 */

  public void setPaymentProtocol3(Integer payment_protocol3In) {
    payment_protocol3 = payment_protocol3In;
  }

  public void translateFromMap() {
    ppdIn = PaymentProfileObjectKeyHelper.fromMap(inputMap, "PaymentProfile");
    profile_status = (Integer)inputMap.get("ProfileStatus");
    payment_protocol3 = (Integer)inputMap.get("PaymentProtocol3");
  }

/**
 *
 * Gets the PaymentProfile
 * @return Value of the PaymentProfile
 *
 */

  public PaymentProfileObjectKeyData getPaymentProfile( ) {
    return ppdIn;
  }

/**
 *
 * Gets the ProfileStatus
 * @return Value of the ProfileStatus
 *
 */

  public Integer getProfileStatus( ) {
    return profile_status;
  }

/**
 *
 * Gets the PaymentProtocol3
 * @return Value of the PaymentProtocol3
 *
 */

  public Integer getPaymentProtocol3( ) {
    return payment_protocol3;
  }

}
