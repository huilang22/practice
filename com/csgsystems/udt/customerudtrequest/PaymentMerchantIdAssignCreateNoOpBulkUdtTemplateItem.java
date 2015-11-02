/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdAssignCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentMerchantIdAssignCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentMerchantIdAssignCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentMerchantIdAssignObjectData noOpIn;

/**
 *
 * Constructor to create a   PaymentMerchantIdAssignCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentMerchantIdAssignCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdAssignObjectData noOpInIn) {
    super(id, context, "PaymentMerchantIdAssignCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(noOpIn, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }
/**
 *
 * Sets the  PaymentMerchantIdAssign
 * @param noOpInIn PaymentMerchantIdAssignObjectData to set
 *
 */
  public void setPaymentMerchantIdAssign(PaymentMerchantIdAssignObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentMerchantIdAssign passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentMerchantIdAssignObjectData getPaymentMerchantIdAssign() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentMerchantIdAssignObjectHelper.fromMap(inputMap, "PaymentMerchantIdAssign");
  }
}
