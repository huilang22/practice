/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentCancelBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a AdjustmentCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectData adjCancelIn;
/**
 *
 * Constructor to create a  AdjustmentCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectData adjCancelInIn) {
    super(id, context, "AdjustmentCancel");
    adjCancelIn = adjCancelInIn;
  }

  public void translateToMap() {
    if (adjCancelIn != null) {
      adjCancelIn.resetFlags(true, true);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjCancelIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param adjCancelInIn Value of the adjCancelIn
 *
 */

  public void setAdjustment(AdjustmentObjectData adjCancelInIn) {
    adjCancelIn = adjCancelInIn;
  }

  public void translateFromMap() {
    adjCancelIn = AdjustmentObjectHelper.fromMap(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectData getAdjustment( ) {
    return adjCancelIn;
  }

}
