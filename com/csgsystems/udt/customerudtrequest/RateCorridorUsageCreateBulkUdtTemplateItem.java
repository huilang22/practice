/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RateCorridorUsageCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCUsageObjectData RUCrIn;
/**
 *
 * Constructor to create a  RateCorridorUsageCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RCUsageObjectData RUCrInIn) {
    super(id, context, "RateCorridorUsageCreate");
    RUCrIn = RUCrInIn;
  }

  public void translateToMap() {
    if (RUCrIn != null) {
      RUCrIn.resetFlags(true, true);
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(RUCrIn, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }


/**
 *
 * Sets the RateCorridorUsage
 * @param RUCrInIn Value of the RUCrIn
 *
 */

  public void setRateCorridorUsage(RCUsageObjectData RUCrInIn) {
    RUCrIn = RUCrInIn;
  }

  public void translateFromMap() {
    RUCrIn = RCUsageObjectHelper.fromMap(inputMap, "RateCorridorUsage");
  }

/**
 *
 * Gets the RateCorridorUsage
 * @return Value of the RateCorridorUsage
 *
 */

  public RCUsageObjectData getRateCorridorUsage( ) {
    return RUCrIn;
  }

}
