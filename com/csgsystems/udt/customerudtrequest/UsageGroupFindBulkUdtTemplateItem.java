/*
 * Generated code DO NOT EDIT
 * Generated file: UsageGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a UsageGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageGroupObjectFilter ugFndIn;
/**
 *
 * Constructor to create a  UsageGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageGroupObjectFilter ugFndInIn) {
    super(id, context, "UsageGroupFind");
    ugFndIn = ugFndInIn;
  }

  public void translateToMap() {
    if (ugFndIn != null) {
      Integer index =  ugFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageGroup", UsageGroupObjectHelper.toMap(ugFndIn, new HashMap(), "UsageGroup").get("UsageGroup"));
    }
  }


/**
 *
 * Sets the UsageGroup
 * @param ugFndInIn Value of the ugFndIn
 *
 */

  public void setUsageGroup(UsageGroupObjectFilter ugFndInIn) {
    ugFndIn = ugFndInIn;
  }

  public void translateFromMap() {
    ugFndIn = UsageGroupObjectHelper.fromMapFilter(inputMap, "UsageGroup");
  }

/**
 *
 * Gets the UsageGroup
 * @return Value of the UsageGroup
 *
 */

  public UsageGroupObjectFilter getUsageGroup( ) {
    return ugFndIn;
  }

}
