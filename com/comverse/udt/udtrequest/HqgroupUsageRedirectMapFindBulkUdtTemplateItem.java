/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapFindBulkUdtTemplateItem.java
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
 * Class used to create a HqgroupUsageRedirectMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HqgroupUsageRedirectMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectMapObjectFilter HGURMFindIn;
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqgroupUsageRedirectMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectFilter HGURMFindInIn) {
    super(id, context, "HqgroupUsageRedirectMapFind");
    HGURMFindIn = HGURMFindInIn;
  }

  public void translateToMap() {
    if (HGURMFindIn != null) {
      Integer index =  HGURMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMFindIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }


/**
 *
 * Sets the HqgroupUsageRedirectMap
 * @param HGURMFindInIn Value of the HGURMFindIn
 *
 */

  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectFilter HGURMFindInIn) {
    HGURMFindIn = HGURMFindInIn;
  }

  public void translateFromMap() {
    HGURMFindIn = HqGroupUsageRedirectMapObjectHelper.fromMapFilter(inputMap, "HqgroupUsageRedirectMap");
  }

/**
 *
 * Gets the HqgroupUsageRedirectMap
 * @return Value of the HqgroupUsageRedirectMap
 *
 */

  public HqGroupUsageRedirectMapObjectFilter getHqgroupUsageRedirectMap( ) {
    return HGURMFindIn;
  }

}
