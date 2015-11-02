/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageObjectData RUUpdateIn;
/**
 *
 * Constructor to create a  RateUsageUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageObjectData RUUpdateInIn) {
    super(id, context, "RateUsageUpdate");
    RUUpdateIn = RUUpdateInIn;
  }

  public void translateToMap() {
    if (RUUpdateIn != null) {
      RUUpdateIn.resetFlags(true, true);
      addInput("RateUsage", RateUsageObjectHelper.toMap(RUUpdateIn, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }


/**
 *
 * Sets the RateUsage
 * @param RUUpdateInIn Value of the RUUpdateIn
 *
 */

  public void setRateUsage(RateUsageObjectData RUUpdateInIn) {
    RUUpdateIn = RUUpdateInIn;
  }

  public void translateFromMap() {
    RUUpdateIn = RateUsageObjectHelper.fromMap(inputMap, "RateUsage");
  }

/**
 *
 * Gets the RateUsage
 * @return Value of the RateUsage
 *
 */

  public RateUsageObjectData getRateUsage( ) {
    return RUUpdateIn;
  }

}
