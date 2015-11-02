/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeSplitFindBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeSplitFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeSplitFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeSplitObjectFilter UsageTypeSplitFindIn;
/**
 *
 * Constructor to create a  UsageTypeSplitFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeSplitFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeSplitObjectFilter UsageTypeSplitFindInIn) {
    super(id, context, "UsageTypeSplitFind");
    UsageTypeSplitFindIn = UsageTypeSplitFindInIn;
  }

  public void translateToMap() {
    if (UsageTypeSplitFindIn != null) {
      Integer index =  UsageTypeSplitFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitFindIn, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }


/**
 *
 * Sets the UsageTypeSplit
 * @param UsageTypeSplitFindInIn Value of the UsageTypeSplitFindIn
 *
 */

  public void setUsageTypeSplit(UsageTypeSplitObjectFilter UsageTypeSplitFindInIn) {
    UsageTypeSplitFindIn = UsageTypeSplitFindInIn;
  }

  public void translateFromMap() {
    UsageTypeSplitFindIn = UsageTypeSplitObjectHelper.fromMapFilter(inputMap, "UsageTypeSplit");
  }

/**
 *
 * Gets the UsageTypeSplit
 * @return Value of the UsageTypeSplit
 *
 */

  public UsageTypeSplitObjectFilter getUsageTypeSplit( ) {
    return UsageTypeSplitFindIn;
  }

}
