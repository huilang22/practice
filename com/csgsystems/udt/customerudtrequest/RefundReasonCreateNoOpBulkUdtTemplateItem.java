/*
 * Generated code DO NOT EDIT
 * Generated file: RefundReasonCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RefundReasonCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RefundReasonCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RefundReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   RefundReasonCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RefundReasonCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundReasonObjectData noOpInIn) {
    super(id, context, "RefundReasonCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RefundReason", RefundReasonObjectHelper.toMap(noOpIn, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }
/**
 *
 * Sets the  RefundReason
 * @param noOpInIn RefundReasonObjectData to set
 *
 */
  public void setRefundReason(RefundReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RefundReason passed into the constructor
 * @return Simulated response
 *
 */
  public RefundReasonObjectData getRefundReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RefundReasonObjectHelper.fromMap(inputMap, "RefundReason");
  }
}
