/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdjustmentUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentObjectData noOpIn;

/**
 *
 * Constructor to create a   AdjustmentUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectData noOpInIn) {
    super(id, context, "AdjustmentUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(noOpIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
/**
 *
 * Sets the  Adjustment
 * @param noOpInIn AdjustmentObjectData to set
 *
 */
  public void setAdjustment(AdjustmentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Adjustment passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentObjectData getAdjustment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentObjectHelper.fromMap(inputMap, "Adjustment");
  }
}
