/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageObjectData RUCrIn;
/**
 *
 * Constructor to create a  RateUsageCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageObjectData RUCrInIn) {
    super(id, context, "RateUsageCreate");
    RUCrIn = RUCrInIn;
  }

  public void translateToMap() {
    if (RUCrIn != null) {
      RUCrIn.resetFlags(true, true);
      addInput("RateUsage", RateUsageObjectHelper.toMap(RUCrIn, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }


/**
 *
 * Sets the RateUsage
 * @param RUCrInIn Value of the RUCrIn
 *
 */

  public void setRateUsage(RateUsageObjectData RUCrInIn) {
    RUCrIn = RUCrInIn;
  }

  public void translateFromMap() {
    RUCrIn = RateUsageObjectHelper.fromMap(inputMap, "RateUsage");
  }

/**
 *
 * Gets the RateUsage
 * @return Value of the RateUsage
 *
 */

  public RateUsageObjectData getRateUsage( ) {
    return RUCrIn;
  }

}
