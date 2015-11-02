/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentReasonObjectData ARCreateIn;
/**
 *
 * Constructor to create a  AdjustmentReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentReasonObjectData ARCreateInIn) {
    super(id, context, "AdjustmentReasonCreate");
    ARCreateIn = ARCreateInIn;
  }

  public void translateToMap() {
    if (ARCreateIn != null) {
      ARCreateIn.resetFlags(true, true);
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(ARCreateIn, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }


/**
 *
 * Sets the AdjustmentReason
 * @param ARCreateInIn Value of the ARCreateIn
 *
 */

  public void setAdjustmentReason(AdjustmentReasonObjectData ARCreateInIn) {
    ARCreateIn = ARCreateInIn;
  }

  public void translateFromMap() {
    ARCreateIn = AdjustmentReasonObjectHelper.fromMap(inputMap, "AdjustmentReason");
  }

/**
 *
 * Gets the AdjustmentReason
 * @return Value of the AdjustmentReason
 *
 */

  public AdjustmentReasonObjectData getAdjustmentReason( ) {
    return ARCreateIn;
  }

}
