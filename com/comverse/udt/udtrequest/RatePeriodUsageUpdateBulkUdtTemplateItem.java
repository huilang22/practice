/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RatePeriodUsageUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodUsageUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RatePeriodUsagesObjectData RatePeriodUsageUpdateIn;
/**
 *
 * Constructor to create a  RatePeriodUsageUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodUsageUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodUsagesObjectData RatePeriodUsageUpdateInIn) {
    super(id, context, "RatePeriodUsageUpdate");
    RatePeriodUsageUpdateIn = RatePeriodUsageUpdateInIn;
  }

  public void translateToMap() {
    if (RatePeriodUsageUpdateIn != null) {
      RatePeriodUsageUpdateIn.resetFlags(true, true);
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(RatePeriodUsageUpdateIn, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }


/**
 *
 * Sets the RatePeriodUsage
 * @param RatePeriodUsageUpdateInIn Value of the RatePeriodUsageUpdateIn
 *
 */

  public void setRatePeriodUsage(RatePeriodUsagesObjectData RatePeriodUsageUpdateInIn) {
    RatePeriodUsageUpdateIn = RatePeriodUsageUpdateInIn;
  }

  public void translateFromMap() {
    RatePeriodUsageUpdateIn = RatePeriodUsagesObjectHelper.fromMap(inputMap, "RatePeriodUsage");
  }

/**
 *
 * Gets the RatePeriodUsage
 * @return Value of the RatePeriodUsage
 *
 */

  public RatePeriodUsagesObjectData getRatePeriodUsage( ) {
    return RatePeriodUsageUpdateIn;
  }

}
