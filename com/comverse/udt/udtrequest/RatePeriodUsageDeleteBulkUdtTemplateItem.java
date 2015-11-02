/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodUsageDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodUsageDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RatePeriodUsagesObjectKeyData RatePeriodUsagesDeleteIn;
/**
 *
 * Constructor to create a  RatePeriodUsageDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodUsageDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodUsagesObjectKeyData RatePeriodUsagesDeleteInIn) {
    super(id, context, "RatePeriodUsageDelete");
    RatePeriodUsagesDeleteIn = RatePeriodUsagesDeleteInIn;
  }

  public void translateToMap() {
    if (RatePeriodUsagesDeleteIn != null) {
      RatePeriodUsagesDeleteIn.resetFlags(true, true);
      addInput("RatePeriodUsage", RatePeriodUsagesObjectKeyHelper.toMap(RatePeriodUsagesDeleteIn, new HashMap(), "RatePeriodUsagesObjectKeyData").get("RatePeriodUsagesObjectKeyData"));
    }
  }


/**
 *
 * Sets the RatePeriodUsage
 * @param RatePeriodUsagesDeleteInIn Value of the RatePeriodUsagesDeleteIn
 *
 */

  public void setRatePeriodUsage(RatePeriodUsagesObjectKeyData RatePeriodUsagesDeleteInIn) {
    RatePeriodUsagesDeleteIn = RatePeriodUsagesDeleteInIn;
  }

  public void translateFromMap() {
    RatePeriodUsagesDeleteIn = RatePeriodUsagesObjectKeyHelper.fromMap(inputMap, "RatePeriodUsage");
  }

/**
 *
 * Gets the RatePeriodUsage
 * @return Value of the RatePeriodUsage
 *
 */

  public RatePeriodUsagesObjectKeyData getRatePeriodUsage( ) {
    return RatePeriodUsagesDeleteIn;
  }

}
