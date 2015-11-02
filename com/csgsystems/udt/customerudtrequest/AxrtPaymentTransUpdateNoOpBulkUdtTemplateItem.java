/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentTransUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AxrtPaymentTransUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AxrtPaymentTransUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AxrtPaymentTransObjectData noOpIn;

/**
 *
 * Constructor to create a   AxrtPaymentTransUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AxrtPaymentTransUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentTransObjectData noOpInIn) {
    super(id, context, "AxrtPaymentTransUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AxrtPaymentTrans", AxrtPaymentTransObjectHelper.toMap(noOpIn, new HashMap(), "AxrtPaymentTrans").get("AxrtPaymentTrans"));
    }
  }
/**
 *
 * Sets the  AxrtPaymentTrans
 * @param noOpInIn AxrtPaymentTransObjectData to set
 *
 */
  public void setAxrtPaymentTrans(AxrtPaymentTransObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AxrtPaymentTrans passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentTransObjectData getAxrtPaymentTrans() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AxrtPaymentTransObjectHelper.fromMap(inputMap, "AxrtPaymentTrans");
  }
}
