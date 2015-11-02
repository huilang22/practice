/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AxrtPaymentUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AxrtPaymentUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AxrtPaymentObjectData noOpIn;

/**
 *
 * Constructor to create a   AxrtPaymentUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AxrtPaymentUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentObjectData noOpInIn) {
    super(id, context, "AxrtPaymentUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AxrtPayment", AxrtPaymentObjectHelper.toMap(noOpIn, new HashMap(), "AxrtPayment").get("AxrtPayment"));
    }
  }
/**
 *
 * Sets the  AxrtPayment
 * @param noOpInIn AxrtPaymentObjectData to set
 *
 */
  public void setAxrtPayment(AxrtPaymentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AxrtPayment passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentObjectData getAxrtPayment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AxrtPaymentObjectHelper.fromMap(inputMap, "AxrtPayment");
  }
}
