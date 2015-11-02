/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectData adjUpdateIn;
/**
 *
 * Constructor to create a  AdjustmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectData adjUpdateInIn) {
    super(id, context, "AdjustmentUpdate");
    adjUpdateIn = adjUpdateInIn;
  }

  public void translateToMap() {
    if (adjUpdateIn != null) {
      adjUpdateIn.resetFlags(true, true);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjUpdateIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param adjUpdateInIn Value of the adjUpdateIn
 *
 */

  public void setAdjustment(AdjustmentObjectData adjUpdateInIn) {
    adjUpdateIn = adjUpdateInIn;
  }

  public void translateFromMap() {
    adjUpdateIn = AdjustmentObjectHelper.fromMap(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectData getAdjustment( ) {
    return adjUpdateIn;
  }

}
