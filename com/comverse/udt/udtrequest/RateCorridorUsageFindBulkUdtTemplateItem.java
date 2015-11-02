/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageFindBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCUsageObjectFilter RUFindIn;
/**
 *
 * Constructor to create a  RateCorridorUsageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RCUsageObjectFilter RUFindInIn) {
    super(id, context, "RateCorridorUsageFind");
    RUFindIn = RUFindInIn;
  }

  public void translateToMap() {
    if (RUFindIn != null) {
      Integer index =  RUFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(RUFindIn, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }


/**
 *
 * Sets the RateCorridorUsage
 * @param RUFindInIn Value of the RUFindIn
 *
 */

  public void setRateCorridorUsage(RCUsageObjectFilter RUFindInIn) {
    RUFindIn = RUFindInIn;
  }

  public void translateFromMap() {
    RUFindIn = RCUsageObjectHelper.fromMapFilter(inputMap, "RateCorridorUsage");
  }

/**
 *
 * Gets the RateCorridorUsage
 * @return Value of the RateCorridorUsage
 *
 */

  public RCUsageObjectFilter getRateCorridorUsage( ) {
    return RUFindIn;
  }

}
