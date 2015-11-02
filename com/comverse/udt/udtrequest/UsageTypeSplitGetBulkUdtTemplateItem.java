/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitGetBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeSplitGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeSplitGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeSplitObjectKeyData UsageTypeSplitGetIn;
/**
 *
 * Constructor to create a  UsageTypeSplitGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeSplitGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeSplitObjectKeyData UsageTypeSplitGetInIn) {
    super(id, context, "UsageTypeSplitGet");
    UsageTypeSplitGetIn = UsageTypeSplitGetInIn;
  }

  public void translateToMap() {
    if (UsageTypeSplitGetIn != null) {
      UsageTypeSplitGetIn.resetFlags(true, true);
      addInput("UsageTypeSplit", UsageTypeSplitObjectKeyHelper.toMap(UsageTypeSplitGetIn, new HashMap(), "UsageTypeSplitObjectKeyData").get("UsageTypeSplitObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageTypeSplit
 * @param UsageTypeSplitGetInIn Value of the UsageTypeSplitGetIn
 *
 */

  public void setUsageTypeSplit(UsageTypeSplitObjectKeyData UsageTypeSplitGetInIn) {
    UsageTypeSplitGetIn = UsageTypeSplitGetInIn;
  }

  public void translateFromMap() {
    UsageTypeSplitGetIn = UsageTypeSplitObjectKeyHelper.fromMap(inputMap, "UsageTypeSplit");
  }

/**
 *
 * Gets the UsageTypeSplit
 * @return Value of the UsageTypeSplit
 *
 */

  public UsageTypeSplitObjectKeyData getUsageTypeSplit( ) {
    return UsageTypeSplitGetIn;
  }

}
