/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentTypeObjectFilter atdFindIn;
/**
 *
 * Constructor to create a  AdjustmentTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeObjectFilter atdFindInIn) {
    super(id, context, "AdjustmentTypeFind");
    atdFindIn = atdFindInIn;
  }

  public void translateToMap() {
    if (atdFindIn != null) {
      Integer index =  atdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjustmentType", AdjustmentTypeObjectHelper.toMap(atdFindIn, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
  }


/**
 *
 * Sets the AdjustmentType
 * @param atdFindInIn Value of the atdFindIn
 *
 */

  public void setAdjustmentType(AdjustmentTypeObjectFilter atdFindInIn) {
    atdFindIn = atdFindInIn;
  }

  public void translateFromMap() {
    atdFindIn = AdjustmentTypeObjectHelper.fromMapFilter(inputMap, "AdjustmentType");
  }

/**
 *
 * Gets the AdjustmentType
 * @return Value of the AdjustmentType
 *
 */

  public AdjustmentTypeObjectFilter getAdjustmentType( ) {
    return atdFindIn;
  }

}
