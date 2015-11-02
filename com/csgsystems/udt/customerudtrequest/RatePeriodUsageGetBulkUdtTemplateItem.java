/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodUsageGetBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodUsageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodUsageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RatePeriodUsagesObjectKeyData RatePeriodUsagesGetIn;
/**
 *
 * Constructor to create a  RatePeriodUsageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodUsageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodUsagesObjectKeyData RatePeriodUsagesGetInIn) {
    super(id, context, "RatePeriodUsageGet");
    RatePeriodUsagesGetIn = RatePeriodUsagesGetInIn;
  }

  public void translateToMap() {
    if (RatePeriodUsagesGetIn != null) {
      RatePeriodUsagesGetIn.resetFlags(true, true);
      addInput("RatePeriodUsage", RatePeriodUsagesObjectKeyHelper.toMap(RatePeriodUsagesGetIn, new HashMap(), "RatePeriodUsagesObjectKeyData").get("RatePeriodUsagesObjectKeyData"));
    }
  }


/**
 *
 * Sets the RatePeriodUsage
 * @param RatePeriodUsagesGetInIn Value of the RatePeriodUsagesGetIn
 *
 */

  public void setRatePeriodUsage(RatePeriodUsagesObjectKeyData RatePeriodUsagesGetInIn) {
    RatePeriodUsagesGetIn = RatePeriodUsagesGetInIn;
  }

  public void translateFromMap() {
    RatePeriodUsagesGetIn = RatePeriodUsagesObjectKeyHelper.fromMap(inputMap, "RatePeriodUsage");
  }

/**
 *
 * Gets the RatePeriodUsage
 * @return Value of the RatePeriodUsage
 *
 */

  public RatePeriodUsagesObjectKeyData getRatePeriodUsage( ) {
    return RatePeriodUsagesGetIn;
  }

}
