/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentReasonDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentReasonObjectKeyData ARDeleteIn;
/**
 *
 * Constructor to create a  AdjustmentReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentReasonObjectKeyData ARDeleteInIn) {
    super(id, context, "AdjustmentReasonDelete");
    ARDeleteIn = ARDeleteInIn;
  }

  public void translateToMap() {
    if (ARDeleteIn != null) {
      ARDeleteIn.resetFlags(true, true);
      addInput("AdjustmentReason", AdjustmentReasonObjectKeyHelper.toMap(ARDeleteIn, new HashMap(), "AdjustmentReasonObjectKeyData").get("AdjustmentReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdjustmentReason
 * @param ARDeleteInIn Value of the ARDeleteIn
 *
 */

  public void setAdjustmentReason(AdjustmentReasonObjectKeyData ARDeleteInIn) {
    ARDeleteIn = ARDeleteInIn;
  }

  public void translateFromMap() {
    ARDeleteIn = AdjustmentReasonObjectKeyHelper.fromMap(inputMap, "AdjustmentReason");
  }

/**
 *
 * Gets the AdjustmentReason
 * @return Value of the AdjustmentReason
 *
 */

  public AdjustmentReasonObjectKeyData getAdjustmentReason( ) {
    return ARDeleteIn;
  }

}
