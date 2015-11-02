/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodUsageFindBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodUsageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodUsageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RatePeriodUsagesObjectFilter RatePeriodUsagesFindIn;
/**
 *
 * Constructor to create a  RatePeriodUsageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodUsageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodUsagesObjectFilter RatePeriodUsagesFindInIn) {
    super(id, context, "RatePeriodUsageFind");
    RatePeriodUsagesFindIn = RatePeriodUsagesFindInIn;
  }

  public void translateToMap() {
    if (RatePeriodUsagesFindIn != null) {
      Integer index =  RatePeriodUsagesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(RatePeriodUsagesFindIn, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }


/**
 *
 * Sets the RatePeriodUsage
 * @param RatePeriodUsagesFindInIn Value of the RatePeriodUsagesFindIn
 *
 */

  public void setRatePeriodUsage(RatePeriodUsagesObjectFilter RatePeriodUsagesFindInIn) {
    RatePeriodUsagesFindIn = RatePeriodUsagesFindInIn;
  }

  public void translateFromMap() {
    RatePeriodUsagesFindIn = RatePeriodUsagesObjectHelper.fromMapFilter(inputMap, "RatePeriodUsage");
  }

/**
 *
 * Gets the RatePeriodUsage
 * @return Value of the RatePeriodUsage
 *
 */

  public RatePeriodUsagesObjectFilter getRatePeriodUsage( ) {
    return RatePeriodUsagesFindIn;
  }

}
