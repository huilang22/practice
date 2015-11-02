/*
 * Generated code DO NOT EDIT
 * Generated file: RefundDenyNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RefundDenyNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RefundDenyNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RefundObjectData noOpIn;

/**
 *
 * Constructor to create a   RefundDenyNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RefundDenyNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectData noOpInIn) {
    super(id, context, "RefundDeny");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Refund", RefundObjectHelper.toMap(noOpIn, new HashMap(), "Refund").get("Refund"));
    }
  }
/**
 *
 * Sets the  Refund
 * @param noOpInIn RefundObjectData to set
 *
 */
  public void setRefund(RefundObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Refund passed into the constructor
 * @return Simulated response
 *
 */
  public RefundObjectData getRefund() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RefundObjectHelper.fromMap(inputMap, "Refund");
  }
}
