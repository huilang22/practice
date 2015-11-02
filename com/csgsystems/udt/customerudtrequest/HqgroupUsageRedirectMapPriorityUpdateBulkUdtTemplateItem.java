/*
 * Generated code DO NOT EDIT
 * Generated file: HqgroupUsageRedirectMapPriorityUpdateBulkUdtTemplateItem.java
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
 * Class used to create a HqgroupUsageRedirectMapPriorityUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqgroupUsageRedirectMapPriorityUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn;
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapPriorityUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqgroupUsageRedirectMapPriorityUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMPrioUpdInIn) {
    super(id, context, "HqgroupUsageRedirectMapPriorityUpdate");
    HGURMPrioUpdIn = HGURMPrioUpdInIn;
  }

  public void translateToMap() {
    if (HGURMPrioUpdIn != null) {
      HGURMPrioUpdIn.resetFlags(true, true);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMPrioUpdIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }


/**
 *
 * Sets the HqgroupUsageRedirectMap
 * @param HGURMPrioUpdInIn Value of the HGURMPrioUpdIn
 *
 */

  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectData HGURMPrioUpdInIn) {
    HGURMPrioUpdIn = HGURMPrioUpdInIn;
  }

  public void translateFromMap() {
    HGURMPrioUpdIn = HqGroupUsageRedirectMapObjectHelper.fromMap(inputMap, "HqgroupUsageRedirectMap");
  }

/**
 *
 * Gets the HqgroupUsageRedirectMap
 * @return Value of the HqgroupUsageRedirectMap
 *
 */

  public HqGroupUsageRedirectMapObjectData getHqgroupUsageRedirectMap( ) {
    return HGURMPrioUpdIn;
  }

}
