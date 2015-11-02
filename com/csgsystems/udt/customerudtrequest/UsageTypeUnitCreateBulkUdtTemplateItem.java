/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeUnitCreateBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeUnitCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeUnitCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeUnitObjectData UsageTypeUnitCreateIn;
/**
 *
 * Constructor to create a  UsageTypeUnitCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeUnitCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeUnitObjectData UsageTypeUnitCreateInIn) {
    super(id, context, "UsageTypeUnitCreate");
    UsageTypeUnitCreateIn = UsageTypeUnitCreateInIn;
  }

  public void translateToMap() {
    if (UsageTypeUnitCreateIn != null) {
      UsageTypeUnitCreateIn.resetFlags(true, true);
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitCreateIn, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }


/**
 *
 * Sets the UsageTypeUnit
 * @param UsageTypeUnitCreateInIn Value of the UsageTypeUnitCreateIn
 *
 */

  public void setUsageTypeUnit(UsageTypeUnitObjectData UsageTypeUnitCreateInIn) {
    UsageTypeUnitCreateIn = UsageTypeUnitCreateInIn;
  }

  public void translateFromMap() {
    UsageTypeUnitCreateIn = UsageTypeUnitObjectHelper.fromMap(inputMap, "UsageTypeUnit");
  }

/**
 *
 * Gets the UsageTypeUnit
 * @return Value of the UsageTypeUnit
 *
 */

  public UsageTypeUnitObjectData getUsageTypeUnit( ) {
    return UsageTypeUnitCreateIn;
  }

}
