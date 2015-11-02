/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeGroupObjectData UTGCrIn;
/**
 *
 * Constructor to create a  UsageTypeGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeGroupObjectData UTGCrInIn) {
    super(id, context, "UsageTypeGroupCreate");
    UTGCrIn = UTGCrInIn;
  }

  public void translateToMap() {
    if (UTGCrIn != null) {
      UTGCrIn.resetFlags(true, true);
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(UTGCrIn, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }


/**
 *
 * Sets the UsageTypeGroup
 * @param UTGCrInIn Value of the UTGCrIn
 *
 */

  public void setUsageTypeGroup(UsageTypeGroupObjectData UTGCrInIn) {
    UTGCrIn = UTGCrInIn;
  }

  public void translateFromMap() {
    UTGCrIn = UsageTypeGroupObjectHelper.fromMap(inputMap, "UsageTypeGroup");
  }

/**
 *
 * Gets the UsageTypeGroup
 * @return Value of the UsageTypeGroup
 *
 */

  public UsageTypeGroupObjectData getUsageTypeGroup( ) {
    return UTGCrIn;
  }

}
