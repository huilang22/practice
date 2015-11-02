/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentNoBackoutFindCountBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentNoBackoutFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentNoBackoutFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectFilter nbfindCountIn;
/**
 *
 * Constructor to create a  AdjustmentNoBackoutFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentNoBackoutFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectFilter nbfindCountInIn) {
    super(id, context, "AdjustmentNoBackoutFindCount");
    nbfindCountIn = nbfindCountInIn;
  }

  public void translateToMap() {
    if (nbfindCountIn != null) {
      Integer index =  nbfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(nbfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param nbfindCountInIn Value of the nbfindCountIn
 *
 */

  public void setAdjustment(AdjustmentObjectFilter nbfindCountInIn) {
    nbfindCountIn = nbfindCountInIn;
  }

  public void translateFromMap() {
    nbfindCountIn = AdjustmentObjectHelper.fromMapFilter(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectFilter getAdjustment( ) {
    return nbfindCountIn;
  }

}
