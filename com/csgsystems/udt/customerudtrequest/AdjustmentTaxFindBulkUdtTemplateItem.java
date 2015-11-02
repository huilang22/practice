/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTaxFindBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentTaxFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTaxFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentTaxObjectFilter ATFindIn;
/**
 *
 * Constructor to create a  AdjustmentTaxFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTaxFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTaxObjectFilter ATFindInIn) {
    super(id, context, "AdjustmentTaxFind");
    ATFindIn = ATFindInIn;
  }

  public void translateToMap() {
    if (ATFindIn != null) {
      Integer index =  ATFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjustmentTax", AdjustmentTaxObjectHelper.toMap(ATFindIn, new HashMap(), "AdjustmentTax").get("AdjustmentTax"));
    }
  }


/**
 *
 * Sets the AdjustmentTax
 * @param ATFindInIn Value of the ATFindIn
 *
 */

  public void setAdjustmentTax(AdjustmentTaxObjectFilter ATFindInIn) {
    ATFindIn = ATFindInIn;
  }

  public void translateFromMap() {
    ATFindIn = AdjustmentTaxObjectHelper.fromMapFilter(inputMap, "AdjustmentTax");
  }

/**
 *
 * Gets the AdjustmentTax
 * @return Value of the AdjustmentTax
 *
 */

  public AdjustmentTaxObjectFilter getAdjustmentTax( ) {
    return ATFindIn;
  }

}
