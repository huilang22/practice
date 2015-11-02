/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountThreshTierIdFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a DiscountThreshTierIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountThreshTierIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTTObjectFilter DTTFindIn;
/**
 *
 * Constructor to create a  DiscountThreshTierIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountThreshTierIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DTTObjectFilter DTTFindInIn) {
    super(id, context, "DiscountThreshTierIdFind");
    DTTFindIn = DTTFindInIn;
  }

  public void translateToMap() {
    if (DTTFindIn != null) {
      Integer index =  DTTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(DTTFindIn, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }


/**
 *
 * Sets the DiscountThreshTierId
 * @param DTTFindInIn Value of the DTTFindIn
 *
 */

  public void setDiscountThreshTierId(DTTObjectFilter DTTFindInIn) {
    DTTFindIn = DTTFindInIn;
  }

  public void translateFromMap() {
    DTTFindIn = DTTObjectHelper.fromMapFilter(inputMap, "DiscountThreshTierId");
  }

/**
 *
 * Gets the DiscountThreshTierId
 * @return Value of the DiscountThreshTierId
 *
 */

  public DTTObjectFilter getDiscountThreshTierId( ) {
    return DTTFindIn;
  }

}
