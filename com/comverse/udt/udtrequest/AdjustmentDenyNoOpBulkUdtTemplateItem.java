/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentDenyNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdjustmentDenyNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentDenyNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentObjectData noOpIn;

/**
 *
 * Constructor to create a   AdjustmentDenyNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentDenyNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectData noOpInIn) {
    super(id, context, "AdjustmentDeny");
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
