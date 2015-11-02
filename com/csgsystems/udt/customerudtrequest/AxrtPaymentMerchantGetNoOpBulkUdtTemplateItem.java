/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentMerchantGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AxrtPaymentMerchantGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AxrtPaymentMerchantGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AxrtPaymentMerchantObjectData noOpIn;

/**
 *
 * Constructor to create a   AxrtPaymentMerchantGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AxrtPaymentMerchantGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentMerchantObjectData noOpInIn) {
    super(id, context, "AxrtPaymentMerchantGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AxrtPaymentMerchant", AxrtPaymentMerchantObjectHelper.toMap(noOpIn, new HashMap(), "AxrtPaymentMerchant").get("AxrtPaymentMerchant"));
    }
  }
/**
 *
 * Sets the  AxrtPaymentMerchant
 * @param noOpInIn AxrtPaymentMerchantObjectData to set
 *
 */
  public void setAxrtPaymentMerchant(AxrtPaymentMerchantObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AxrtPaymentMerchant passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentMerchantObjectData getAxrtPaymentMerchant() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AxrtPaymentMerchantObjectHelper.fromMap(inputMap, "AxrtPaymentMerchant");
  }
}
