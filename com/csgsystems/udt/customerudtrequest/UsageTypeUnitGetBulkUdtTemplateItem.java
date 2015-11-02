/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeUnitGetBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeUnitGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeUnitGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeUnitObjectKeyData UsageTypeUnitGetIn;
/**
 *
 * Constructor to create a  UsageTypeUnitGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeUnitGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeUnitObjectKeyData UsageTypeUnitGetInIn) {
    super(id, context, "UsageTypeUnitGet");
    UsageTypeUnitGetIn = UsageTypeUnitGetInIn;
  }

  public void translateToMap() {
    if (UsageTypeUnitGetIn != null) {
      UsageTypeUnitGetIn.resetFlags(true, true);
      addInput("UsageTypeUnit", UsageTypeUnitObjectKeyHelper.toMap(UsageTypeUnitGetIn, new HashMap(), "UsageTypeUnitObjectKeyData").get("UsageTypeUnitObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageTypeUnit
 * @param UsageTypeUnitGetInIn Value of the UsageTypeUnitGetIn
 *
 */

  public void setUsageTypeUnit(UsageTypeUnitObjectKeyData UsageTypeUnitGetInIn) {
    UsageTypeUnitGetIn = UsageTypeUnitGetInIn;
  }

  public void translateFromMap() {
    UsageTypeUnitGetIn = UsageTypeUnitObjectKeyHelper.fromMap(inputMap, "UsageTypeUnit");
  }

/**
 *
 * Gets the UsageTypeUnit
 * @return Value of the UsageTypeUnit
 *
 */

  public UsageTypeUnitObjectKeyData getUsageTypeUnit( ) {
    return UsageTypeUnitGetIn;
  }

}
