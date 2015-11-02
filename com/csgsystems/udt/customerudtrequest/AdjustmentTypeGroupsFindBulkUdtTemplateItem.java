/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeGroupsFindBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentTypeGroupsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentTypeGroupsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentTypeGroupsObjectFilter AdjustmentTypeGroupsFindIn;
/**
 *
 * Constructor to create a  AdjustmentTypeGroupsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentTypeGroupsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeGroupsObjectFilter AdjustmentTypeGroupsFindInIn) {
    super(id, context, "AdjustmentTypeGroupsFind");
    AdjustmentTypeGroupsFindIn = AdjustmentTypeGroupsFindInIn;
  }

  public void translateToMap() {
    if (AdjustmentTypeGroupsFindIn != null) {
      Integer index =  AdjustmentTypeGroupsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(AdjustmentTypeGroupsFindIn, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }


/**
 *
 * Sets the AdjustmentTypeGroups
 * @param AdjustmentTypeGroupsFindInIn Value of the AdjustmentTypeGroupsFindIn
 *
 */

  public void setAdjustmentTypeGroups(AdjustmentTypeGroupsObjectFilter AdjustmentTypeGroupsFindInIn) {
    AdjustmentTypeGroupsFindIn = AdjustmentTypeGroupsFindInIn;
  }

  public void translateFromMap() {
    AdjustmentTypeGroupsFindIn = AdjustmentTypeGroupsObjectHelper.fromMapFilter(inputMap, "AdjustmentTypeGroups");
  }

/**
 *
 * Gets the AdjustmentTypeGroups
 * @return Value of the AdjustmentTypeGroups
 *
 */

  public AdjustmentTypeGroupsObjectFilter getAdjustmentTypeGroups( ) {
    return AdjustmentTypeGroupsFindIn;
  }

}
