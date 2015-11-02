/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentReasonGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdjustmentReasonGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentReasonGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   AdjustmentReasonGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentReasonGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentReasonObjectData noOpInIn) {
    super(id, context, "AdjustmentReasonGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(noOpIn, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }
/**
 *
 * Sets the  AdjustmentReason
 * @param noOpInIn AdjustmentReasonObjectData to set
 *
 */
  public void setAdjustmentReason(AdjustmentReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjustmentReason passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentReasonObjectData getAdjustmentReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentReasonObjectHelper.fromMap(inputMap, "AdjustmentReason");
  }
}
