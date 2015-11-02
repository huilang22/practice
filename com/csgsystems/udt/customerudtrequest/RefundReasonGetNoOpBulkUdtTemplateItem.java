/*
 * Generated code DO NOT EDIT
 * Generated file: RefundReasonGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RefundReasonGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RefundReasonGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RefundReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   RefundReasonGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RefundReasonGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundReasonObjectData noOpInIn) {
    super(id, context, "RefundReasonGet");
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
