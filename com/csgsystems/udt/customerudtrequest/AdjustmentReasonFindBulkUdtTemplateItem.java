/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentReasonObjectFilter ARFindIn;
/**
 *
 * Constructor to create a  AdjustmentReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentReasonObjectFilter ARFindInIn) {
    super(id, context, "AdjustmentReasonFind");
    ARFindIn = ARFindInIn;
  }

  public void translateToMap() {
    if (ARFindIn != null) {
      Integer index =  ARFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(ARFindIn, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }


/**
 *
 * Sets the AdjustmentReason
 * @param ARFindInIn Value of the ARFindIn
 *
 */

  public void setAdjustmentReason(AdjustmentReasonObjectFilter ARFindInIn) {
    ARFindIn = ARFindInIn;
  }

  public void translateFromMap() {
    ARFindIn = AdjustmentReasonObjectHelper.fromMapFilter(inputMap, "AdjustmentReason");
  }

/**
 *
 * Gets the AdjustmentReason
 * @return Value of the AdjustmentReason
 *
 */

  public AdjustmentReasonObjectFilter getAdjustmentReason( ) {
    return ARFindIn;
  }

}
