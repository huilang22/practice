/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapCancelBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqgroupUsageRedirectMapCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class HqgroupUsageRedirectMapCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectMapObjectData HGURMCancelIn;
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqgroupUsageRedirectMapCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMCancelInIn) {
    super(id, context, "HqgroupUsageRedirectMapCancel");
    HGURMCancelIn = HGURMCancelInIn;
  }

  public void translateToMap() {
    if (HGURMCancelIn != null) {
      HGURMCancelIn.resetFlags(true, true);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMCancelIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the HqgroupUsageRedirectMap
 * @param HGURMCancelInIn Value of the HGURMCancelIn
 *
 */

  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectData HGURMCancelInIn) {
    HGURMCancelIn = HGURMCancelInIn;
  }

  public void translateFromMap() {
    HGURMCancelIn = HqGroupUsageRedirectMapObjectHelper.fromMap(inputMap, "HqgroupUsageRedirectMap");
  }

/**
 *
 * Gets the HqgroupUsageRedirectMap
 * @return Value of the HqgroupUsageRedirectMap
 *
 */

  public HqGroupUsageRedirectMapObjectData getHqgroupUsageRedirectMap( ) {
    return HGURMCancelIn;
  }

}
