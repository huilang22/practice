/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCUsageObjectData RUUpdateIn;
/**
 *
 * Constructor to create a  RateCorridorUsageUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RCUsageObjectData RUUpdateInIn) {
    super(id, context, "RateCorridorUsageUpdate");
    RUUpdateIn = RUUpdateInIn;
  }

  public void translateToMap() {
    if (RUUpdateIn != null) {
      RUUpdateIn.resetFlags(true, true);
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(RUUpdateIn, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }


/**
 *
 * Sets the RateCorridorUsage
 * @param RUUpdateInIn Value of the RUUpdateIn
 *
 */

  public void setRateCorridorUsage(RCUsageObjectData RUUpdateInIn) {
    RUUpdateIn = RUUpdateInIn;
  }

  public void translateFromMap() {
    RUUpdateIn = RCUsageObjectHelper.fromMap(inputMap, "RateCorridorUsage");
  }

/**
 *
 * Gets the RateCorridorUsage
 * @return Value of the RateCorridorUsage
 *
 */

  public RCUsageObjectData getRateCorridorUsage( ) {
    return RUUpdateIn;
  }

}
