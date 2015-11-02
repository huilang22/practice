/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeGroupObjectKeyData UTGGetIn;
/**
 *
 * Constructor to create a  UsageTypeGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeGroupObjectKeyData UTGGetInIn) {
    super(id, context, "UsageTypeGroupGet");
    UTGGetIn = UTGGetInIn;
  }

  public void translateToMap() {
    if (UTGGetIn != null) {
      UTGGetIn.resetFlags(true, true);
      addInput("UsageTypeGroup", UsageTypeGroupObjectKeyHelper.toMap(UTGGetIn, new HashMap(), "UsageTypeGroupObjectKeyData").get("UsageTypeGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageTypeGroup
 * @param UTGGetInIn Value of the UTGGetIn
 *
 */

  public void setUsageTypeGroup(UsageTypeGroupObjectKeyData UTGGetInIn) {
    UTGGetIn = UTGGetInIn;
  }

  public void translateFromMap() {
    UTGGetIn = UsageTypeGroupObjectKeyHelper.fromMap(inputMap, "UsageTypeGroup");
  }

/**
 *
 * Gets the UsageTypeGroup
 * @return Value of the UsageTypeGroup
 *
 */

  public UsageTypeGroupObjectKeyData getUsageTypeGroup( ) {
    return UTGGetIn;
  }

}
