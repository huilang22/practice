/*
 * Generated code DO NOT EDIT
 * Generated file: InterimBillCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InterimBillCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InterimBillCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InterimBillObjectData noOpIn;

/**
 *
 * Constructor to create a   InterimBillCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InterimBillCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillObjectData noOpInIn) {
    super(id, context, "InterimBillCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InterimBill", InterimBillObjectHelper.toMap(noOpIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }
/**
 *
 * Sets the  InterimBill
 * @param noOpInIn InterimBillObjectData to set
 *
 */
  public void setInterimBill(InterimBillObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InterimBill passed into the constructor
 * @return Simulated response
 *
 */
  public InterimBillObjectData getInterimBill() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InterimBillObjectHelper.fromMap(inputMap, "InterimBill");
  }
}
