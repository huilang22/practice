/*
 * Generated code DO NOT EDIT
 * Generated file: HqgroupUsageRedirectMapUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqgroupUsageRedirectMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqgroupUsageRedirectMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectMapObjectData HGURMUpdateIn;
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqgroupUsageRedirectMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMUpdateInIn) {
    super(id, context, "HqgroupUsageRedirectMapUpdate");
    HGURMUpdateIn = HGURMUpdateInIn;
  }

  public void translateToMap() {
    if (HGURMUpdateIn != null) {
      HGURMUpdateIn.resetFlags(true, true);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMUpdateIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }


/**
 *
 * Sets the HqgroupUsageRedirectMap
 * @param HGURMUpdateInIn Value of the HGURMUpdateIn
 *
 */

  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectData HGURMUpdateInIn) {
    HGURMUpdateIn = HGURMUpdateInIn;
  }

  public void translateFromMap() {
    HGURMUpdateIn = HqGroupUsageRedirectMapObjectHelper.fromMap(inputMap, "HqgroupUsageRedirectMap");
  }

/**
 *
 * Gets the HqgroupUsageRedirectMap
 * @return Value of the HqgroupUsageRedirectMap
 *
 */

  public HqGroupUsageRedirectMapObjectData getHqgroupUsageRedirectMap( ) {
    return HGURMUpdateIn;
  }

}
