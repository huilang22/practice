/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a HqgroupUsageRedirectMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqgroupUsageRedirectMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectMapObjectData HGURMInsertIn;
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqgroupUsageRedirectMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMInsertInIn) {
    super(id, context, "HqgroupUsageRedirectMapCreate");
    HGURMInsertIn = HGURMInsertInIn;
  }

  public void translateToMap() {
    if (HGURMInsertIn != null) {
      HGURMInsertIn.resetFlags(true, true);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMInsertIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }


/**
 *
 * Sets the HqgroupUsageRedirectMap
 * @param HGURMInsertInIn Value of the HGURMInsertIn
 *
 */

  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectData HGURMInsertInIn) {
    HGURMInsertIn = HGURMInsertInIn;
  }

  public void translateFromMap() {
    HGURMInsertIn = HqGroupUsageRedirectMapObjectHelper.fromMap(inputMap, "HqgroupUsageRedirectMap");
  }

/**
 *
 * Gets the HqgroupUsageRedirectMap
 * @return Value of the HqgroupUsageRedirectMap
 *
 */

  public HqGroupUsageRedirectMapObjectData getHqgroupUsageRedirectMap( ) {
    return HGURMInsertIn;
  }

}
