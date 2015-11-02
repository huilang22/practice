/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentCreateBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectData adjCreateIn;
/**
 *
 * Constructor to create a  AdjustmentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectData adjCreateInIn) {
    super(id, context, "AdjustmentCreate");
    adjCreateIn = adjCreateInIn;
  }

  public void translateToMap() {
    if (adjCreateIn != null) {
      adjCreateIn.resetFlags(true, true);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjCreateIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param adjCreateInIn Value of the adjCreateIn
 *
 */

  public void setAdjustment(AdjustmentObjectData adjCreateInIn) {
    adjCreateIn = adjCreateInIn;
  }

  public void translateFromMap() {
    adjCreateIn = AdjustmentObjectHelper.fromMap(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectData getAdjustment( ) {
    return adjCreateIn;
  }

}
