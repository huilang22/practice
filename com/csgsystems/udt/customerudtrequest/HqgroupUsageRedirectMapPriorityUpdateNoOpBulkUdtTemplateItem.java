/*
 * Generated code DO NOT EDIT
 * Generated file: HqgroupUsageRedirectMapPriorityUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqgroupUsageRedirectMapPriorityUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqgroupUsageRedirectMapPriorityUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupUsageRedirectMapObjectData noOpIn;

/**
 *
 * Constructor to create a   HqgroupUsageRedirectMapPriorityUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqgroupUsageRedirectMapPriorityUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectMapObjectData noOpInIn) {
    super(id, context, "HqgroupUsageRedirectMapPriorityUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(noOpIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
/**
 *
 * Sets the  HqgroupUsageRedirectMap
 * @param noOpInIn HqGroupUsageRedirectMapObjectData to set
 *
 */
  public void setHqgroupUsageRedirectMap(HqGroupUsageRedirectMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqgroupUsageRedirectMap passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupUsageRedirectMapObjectData getHqgroupUsageRedirectMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupUsageRedirectMapObjectHelper.fromMap(inputMap, "HqgroupUsageRedirectMap");
  }
}
