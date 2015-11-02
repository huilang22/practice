/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a UsageGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageGroupObjectKeyData ugGetIn;
/**
 *
 * Constructor to create a  UsageGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageGroupObjectKeyData ugGetInIn) {
    super(id, context, "UsageGroupGet");
    ugGetIn = ugGetInIn;
  }

  public void translateToMap() {
    if (ugGetIn != null) {
      ugGetIn.resetFlags(true, true);
      addInput("UsageGroup", UsageGroupObjectKeyHelper.toMap(ugGetIn, new HashMap(), "UsageGroupObjectKeyData").get("UsageGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageGroup
 * @param ugGetInIn Value of the ugGetIn
 *
 */

  public void setUsageGroup(UsageGroupObjectKeyData ugGetInIn) {
    ugGetIn = ugGetInIn;
  }

  public void translateFromMap() {
    ugGetIn = UsageGroupObjectKeyHelper.fromMap(inputMap, "UsageGroup");
  }

/**
 *
 * Gets the UsageGroup
 * @return Value of the UsageGroup
 *
 */

  public UsageGroupObjectKeyData getUsageGroup( ) {
    return ugGetIn;
  }

}
