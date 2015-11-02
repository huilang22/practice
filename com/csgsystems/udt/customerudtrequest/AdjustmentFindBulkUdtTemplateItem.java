/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentFindBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectFilter findIn;
/**
 *
 * Constructor to create a  AdjustmentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectFilter findInIn) {
    super(id, context, "AdjustmentFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(findIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param findInIn Value of the findIn
 *
 */

  public void setAdjustment(AdjustmentObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = AdjustmentObjectHelper.fromMapFilter(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectFilter getAdjustment( ) {
    return findIn;
  }

}
