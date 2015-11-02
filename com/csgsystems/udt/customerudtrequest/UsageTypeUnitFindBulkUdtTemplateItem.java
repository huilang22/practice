/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeUnitFindBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeUnitFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeUnitFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeUnitObjectFilter UsageTypeUnitFindIn;
/**
 *
 * Constructor to create a  UsageTypeUnitFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeUnitFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeUnitObjectFilter UsageTypeUnitFindInIn) {
    super(id, context, "UsageTypeUnitFind");
    UsageTypeUnitFindIn = UsageTypeUnitFindInIn;
  }

  public void translateToMap() {
    if (UsageTypeUnitFindIn != null) {
      Integer index =  UsageTypeUnitFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitFindIn, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }


/**
 *
 * Sets the UsageTypeUnit
 * @param UsageTypeUnitFindInIn Value of the UsageTypeUnitFindIn
 *
 */

  public void setUsageTypeUnit(UsageTypeUnitObjectFilter UsageTypeUnitFindInIn) {
    UsageTypeUnitFindIn = UsageTypeUnitFindInIn;
  }

  public void translateFromMap() {
    UsageTypeUnitFindIn = UsageTypeUnitObjectHelper.fromMapFilter(inputMap, "UsageTypeUnit");
  }

/**
 *
 * Gets the UsageTypeUnit
 * @return Value of the UsageTypeUnit
 *
 */

  public UsageTypeUnitObjectFilter getUsageTypeUnit( ) {
    return UsageTypeUnitFindIn;
  }

}
