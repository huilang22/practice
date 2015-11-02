/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentNoBackoutFindBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentNoBackoutFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentNoBackoutFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectFilter nbfindIn;
/**
 *
 * Constructor to create a  AdjustmentNoBackoutFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentNoBackoutFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectFilter nbfindInIn) {
    super(id, context, "AdjustmentNoBackoutFind");
    nbfindIn = nbfindInIn;
  }

  public void translateToMap() {
    if (nbfindIn != null) {
      Integer index =  nbfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(nbfindIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param nbfindInIn Value of the nbfindIn
 *
 */

  public void setAdjustment(AdjustmentObjectFilter nbfindInIn) {
    nbfindIn = nbfindInIn;
  }

  public void translateFromMap() {
    nbfindIn = AdjustmentObjectHelper.fromMapFilter(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectFilter getAdjustment( ) {
    return nbfindIn;
  }

}
