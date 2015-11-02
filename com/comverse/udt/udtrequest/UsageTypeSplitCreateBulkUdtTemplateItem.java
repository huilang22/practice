/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a UsageTypeSplitCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeSplitCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeSplitObjectData UsageTypeSplitCreateIn;
/**
 *
 * Constructor to create a  UsageTypeSplitCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeSplitCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeSplitObjectData UsageTypeSplitCreateInIn) {
    super(id, context, "UsageTypeSplitCreate");
    UsageTypeSplitCreateIn = UsageTypeSplitCreateInIn;
  }

  public void translateToMap() {
    if (UsageTypeSplitCreateIn != null) {
      UsageTypeSplitCreateIn.resetFlags(true, true);
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitCreateIn, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }


/**
 *
 * Sets the UsageTypeSplit
 * @param UsageTypeSplitCreateInIn Value of the UsageTypeSplitCreateIn
 *
 */

  public void setUsageTypeSplit(UsageTypeSplitObjectData UsageTypeSplitCreateInIn) {
    UsageTypeSplitCreateIn = UsageTypeSplitCreateInIn;
  }

  public void translateFromMap() {
    UsageTypeSplitCreateIn = UsageTypeSplitObjectHelper.fromMap(inputMap, "UsageTypeSplit");
  }

/**
 *
 * Gets the UsageTypeSplit
 * @return Value of the UsageTypeSplit
 *
 */

  public UsageTypeSplitObjectData getUsageTypeSplit( ) {
    return UsageTypeSplitCreateIn;
  }

}
