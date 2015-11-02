/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdjustmentReasonUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentReasonUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   AdjustmentReasonUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentReasonUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentReasonObjectData noOpInIn) {
    super(id, context, "AdjustmentReasonUpdate");
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
