/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapGetBulkUdtTemplateItem.java
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
 * Class used to create a HqgroupUsageRedirectMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HqgroupUsageRedirectMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectMapObjectKeyData HGURMGetIn;
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqgroupUsageRedirectMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectKeyData HGURMGetInIn) {
    super(id, context, "HqgroupUsageRedirectMapGet");
    HGURMGetIn = HGURMGetInIn;
  }

  public void translateToMap() {
    if (HGURMGetIn != null) {
      HGURMGetIn.resetFlags(true, true);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectKeyHelper.toMap(HGURMGetIn, new HashMap(), "HqGroupUsageRedirectMapObjectKeyData").get("HqGroupUsageRedirectMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the HqgroupUsageRedirectMap
 * @param HGURMGetInIn Value of the HGURMGetIn
 *
 */

  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectKeyData HGURMGetInIn) {
    HGURMGetIn = HGURMGetInIn;
  }

  public void translateFromMap() {
    HGURMGetIn = HqGroupUsageRedirectMapObjectKeyHelper.fromMap(inputMap, "HqgroupUsageRedirectMap");
  }

/**
 *
 * Gets the HqgroupUsageRedirectMap
 * @return Value of the HqgroupUsageRedirectMap
 *
 */

  public HqGroupUsageRedirectMapObjectKeyData getHqgroupUsageRedirectMap( ) {
    return HGURMGetIn;
  }

}
