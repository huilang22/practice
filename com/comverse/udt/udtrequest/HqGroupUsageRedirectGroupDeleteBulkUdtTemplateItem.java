/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupUsageRedirectGroupDeleteBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupUsageRedirectGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupUsageRedirectGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectGroupObjectData HqGroupUsageRedirectGroupDeleteIn;
/**
 *
 * Constructor to create a  HqGroupUsageRedirectGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupUsageRedirectGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectGroupObjectData HqGroupUsageRedirectGroupDeleteInIn) {
    super(id, context, "HqGroupUsageRedirectGroupDelete");
    HqGroupUsageRedirectGroupDeleteIn = HqGroupUsageRedirectGroupDeleteInIn;
  }

  public void translateToMap() {
    if (HqGroupUsageRedirectGroupDeleteIn != null) {
      HqGroupUsageRedirectGroupDeleteIn.resetFlags(true, true);
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(HqGroupUsageRedirectGroupDeleteIn, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }


/**
 *
 * Sets the HqGroupUsageRedirectGroup
 * @param HqGroupUsageRedirectGroupDeleteInIn Value of the HqGroupUsageRedirectGroupDeleteIn
 *
 */

  public void setHqGroupUsageRedirectGroup(HqGroupUsageRedirectGroupObjectData HqGroupUsageRedirectGroupDeleteInIn) {
    HqGroupUsageRedirectGroupDeleteIn = HqGroupUsageRedirectGroupDeleteInIn;
  }

  public void translateFromMap() {
    HqGroupUsageRedirectGroupDeleteIn = HqGroupUsageRedirectGroupObjectHelper.fromMap(inputMap, "HqGroupUsageRedirectGroup");
  }

/**
 *
 * Gets the HqGroupUsageRedirectGroup
 * @return Value of the HqGroupUsageRedirectGroup
 *
 */

  public HqGroupUsageRedirectGroupObjectData getHqGroupUsageRedirectGroup( ) {
    return HqGroupUsageRedirectGroupDeleteIn;
  }

}
