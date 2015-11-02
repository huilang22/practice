/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodUsageCreateBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodUsageCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodUsageCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RatePeriodUsagesObjectData RatePeriodUsageCreateIn;
/**
 *
 * Constructor to create a  RatePeriodUsageCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodUsageCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodUsagesObjectData RatePeriodUsageCreateInIn) {
    super(id, context, "RatePeriodUsageCreate");
    RatePeriodUsageCreateIn = RatePeriodUsageCreateInIn;
  }

  public void translateToMap() {
    if (RatePeriodUsageCreateIn != null) {
      RatePeriodUsageCreateIn.resetFlags(true, true);
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(RatePeriodUsageCreateIn, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }


/**
 *
 * Sets the RatePeriodUsage
 * @param RatePeriodUsageCreateInIn Value of the RatePeriodUsageCreateIn
 *
 */

  public void setRatePeriodUsage(RatePeriodUsagesObjectData RatePeriodUsageCreateInIn) {
    RatePeriodUsageCreateIn = RatePeriodUsageCreateInIn;
  }

  public void translateFromMap() {
    RatePeriodUsageCreateIn = RatePeriodUsagesObjectHelper.fromMap(inputMap, "RatePeriodUsage");
  }

/**
 *
 * Gets the RatePeriodUsage
 * @return Value of the RatePeriodUsage
 *
 */

  public RatePeriodUsagesObjectData getRatePeriodUsage( ) {
    return RatePeriodUsageCreateIn;
  }

}
