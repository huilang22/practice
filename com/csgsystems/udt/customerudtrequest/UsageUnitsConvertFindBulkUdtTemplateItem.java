/*
 * Generated code DO NOT EDIT
 * Generated file: UsageUnitsConvertFindBulkUdtTemplateItem.java
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
 * Class used to create a UsageUnitsConvertFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageUnitsConvertFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageUnitsConvertObjectFilter UsageUnitsConvertFindIn;
/**
 *
 * Constructor to create a  UsageUnitsConvertFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageUnitsConvertFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageUnitsConvertObjectFilter UsageUnitsConvertFindInIn) {
    super(id, context, "UsageUnitsConvertFind");
    UsageUnitsConvertFindIn = UsageUnitsConvertFindInIn;
  }

  public void translateToMap() {
    if (UsageUnitsConvertFindIn != null) {
      Integer index =  UsageUnitsConvertFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertFindIn, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }


/**
 *
 * Sets the UsageUnitsConvert
 * @param UsageUnitsConvertFindInIn Value of the UsageUnitsConvertFindIn
 *
 */

  public void setUsageUnitsConvert(UsageUnitsConvertObjectFilter UsageUnitsConvertFindInIn) {
    UsageUnitsConvertFindIn = UsageUnitsConvertFindInIn;
  }

  public void translateFromMap() {
    UsageUnitsConvertFindIn = UsageUnitsConvertObjectHelper.fromMapFilter(inputMap, "UsageUnitsConvert");
  }

/**
 *
 * Gets the UsageUnitsConvert
 * @return Value of the UsageUnitsConvert
 *
 */

  public UsageUnitsConvertObjectFilter getUsageUnitsConvert( ) {
    return UsageUnitsConvertFindIn;
  }

}
