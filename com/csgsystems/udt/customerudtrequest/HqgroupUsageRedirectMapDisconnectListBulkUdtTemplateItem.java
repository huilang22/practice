/*
 * Generated code DO NOT EDIT
 * Generated file: HqgroupUsageRedirectMapDisconnectListBulkUdtTemplateItem.java
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
 * Class used to create a HqgroupUsageRedirectMapDisconnectListBulkUdtTemplateItem Bulk Template
 *
 */

public class HqgroupUsageRedirectMapDisconnectListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectMapObjectData discIn;
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapDisconnectListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqgroupUsageRedirectMapDisconnectListBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectData discInIn) {
    super(id, context, "HqgroupUsageRedirectMapDisconnectList");
    discIn = discInIn;
  }

  public void translateToMap() {
    if (discIn != null) {
      discIn.resetFlags(true, true);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(discIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the HqgroupUsageRedirectMap
 * @param discInIn Value of the discIn
 *
 */

  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectData discInIn) {
    discIn = discInIn;
  }

  public void translateFromMap() {
    discIn = HqGroupUsageRedirectMapObjectHelper.fromMap(inputMap, "HqgroupUsageRedirectMap");
  }

/**
 *
 * Gets the HqgroupUsageRedirectMap
 * @return Value of the HqgroupUsageRedirectMap
 *
 */

  public HqGroupUsageRedirectMapObjectData getHqgroupUsageRedirectMap( ) {
    return discIn;
  }

}
