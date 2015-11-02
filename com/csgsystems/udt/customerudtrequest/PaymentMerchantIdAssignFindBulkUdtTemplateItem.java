/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdAssignFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentMerchantIdAssignFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentMerchantIdAssignFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn;
/**
 *
 * Constructor to create a  PaymentMerchantIdAssignFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentMerchantIdAssignFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindInIn) {
    super(id, context, "PaymentMerchantIdAssignFind");
    PaymentMerchantIdAssignfindIn = PaymentMerchantIdAssignfindInIn;
  }

  public void translateToMap() {
    if (PaymentMerchantIdAssignfindIn != null) {
      Integer index =  PaymentMerchantIdAssignfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(PaymentMerchantIdAssignfindIn, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }


/**
 *
 * Sets the PaymentMerchantIdAssign
 * @param PaymentMerchantIdAssignfindInIn Value of the PaymentMerchantIdAssignfindIn
 *
 */

  public void setPaymentMerchantIdAssign(PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindInIn) {
    PaymentMerchantIdAssignfindIn = PaymentMerchantIdAssignfindInIn;
  }

  public void translateFromMap() {
    PaymentMerchantIdAssignfindIn = PaymentMerchantIdAssignObjectHelper.fromMapFilter(inputMap, "PaymentMerchantIdAssign");
  }

/**
 *
 * Gets the PaymentMerchantIdAssign
 * @return Value of the PaymentMerchantIdAssign
 *
 */

  public PaymentMerchantIdAssignObjectFilter getPaymentMerchantIdAssign( ) {
    return PaymentMerchantIdAssignfindIn;
  }

}
