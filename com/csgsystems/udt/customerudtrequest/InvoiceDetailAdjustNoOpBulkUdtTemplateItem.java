/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailAdjustNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoiceDetailAdjustNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceDetailAdjustNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentObjectData noOpIn;

/**
 *
 * Constructor to create a   InvoiceDetailAdjustNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceDetailAdjustNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectData noOpInIn) {
    super(id, context, "InvoiceDetailAdjust");
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
