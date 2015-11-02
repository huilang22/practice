/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentFindCountBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectFilter findCountIn;
/**
 *
 * Constructor to create a  AdjustmentFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectFilter findCountInIn) {
    super(id, context, "AdjustmentFindCount");
    findCountIn = findCountInIn;
  }

  public void translateToMap() {
    if (findCountIn != null) {
      Integer index =  findCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(findCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param findCountInIn Value of the findCountIn
 *
 */

  public void setAdjustment(AdjustmentObjectFilter findCountInIn) {
    findCountIn = findCountInIn;
  }

  public void translateFromMap() {
    findCountIn = AdjustmentObjectHelper.fromMapFilter(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectFilter getAdjustment( ) {
    return findCountIn;
  }

}
