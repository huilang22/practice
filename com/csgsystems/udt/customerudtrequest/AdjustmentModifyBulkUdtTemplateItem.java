/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentModifyBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentModifyBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentModifyBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectData adjModifyIn;
/**
 *
 * Constructor to create a  AdjustmentModifyBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentModifyBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectData adjModifyInIn) {
    super(id, context, "AdjustmentModify");
    adjModifyIn = adjModifyInIn;
  }

  public void translateToMap() {
    if (adjModifyIn != null) {
      adjModifyIn.resetFlags(true, true);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjModifyIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param adjModifyInIn Value of the adjModifyIn
 *
 */

  public void setAdjustment(AdjustmentObjectData adjModifyInIn) {
    adjModifyIn = adjModifyInIn;
  }

  public void translateFromMap() {
    adjModifyIn = AdjustmentObjectHelper.fromMap(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectData getAdjustment( ) {
    return adjModifyIn;
  }

}
