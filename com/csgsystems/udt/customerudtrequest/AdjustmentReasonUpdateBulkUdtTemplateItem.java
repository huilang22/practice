/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentReasonObjectData ARUpdateIn;
/**
 *
 * Constructor to create a  AdjustmentReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentReasonObjectData ARUpdateInIn) {
    super(id, context, "AdjustmentReasonUpdate");
    ARUpdateIn = ARUpdateInIn;
  }

  public void translateToMap() {
    if (ARUpdateIn != null) {
      ARUpdateIn.resetFlags(true, true);
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(ARUpdateIn, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }


/**
 *
 * Sets the AdjustmentReason
 * @param ARUpdateInIn Value of the ARUpdateIn
 *
 */

  public void setAdjustmentReason(AdjustmentReasonObjectData ARUpdateInIn) {
    ARUpdateIn = ARUpdateInIn;
  }

  public void translateFromMap() {
    ARUpdateIn = AdjustmentReasonObjectHelper.fromMap(inputMap, "AdjustmentReason");
  }

/**
 *
 * Gets the AdjustmentReason
 * @return Value of the AdjustmentReason
 *
 */

  public AdjustmentReasonObjectData getAdjustmentReason( ) {
    return ARUpdateIn;
  }

}
