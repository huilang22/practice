/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageGetBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCUsageObjectKeyData RUGetIn;
/**
 *
 * Constructor to create a  RateCorridorUsageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RCUsageObjectKeyData RUGetInIn) {
    super(id, context, "RateCorridorUsageGet");
    RUGetIn = RUGetInIn;
  }

  public void translateToMap() {
    if (RUGetIn != null) {
      RUGetIn.resetFlags(true, true);
      addInput("RateCorridorUsage", RCUsageObjectKeyHelper.toMap(RUGetIn, new HashMap(), "RCUsageObjectKeyData").get("RCUsageObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateCorridorUsage
 * @param RUGetInIn Value of the RUGetIn
 *
 */

  public void setRateCorridorUsage(RCUsageObjectKeyData RUGetInIn) {
    RUGetIn = RUGetInIn;
  }

  public void translateFromMap() {
    RUGetIn = RCUsageObjectKeyHelper.fromMap(inputMap, "RateCorridorUsage");
  }

/**
 *
 * Gets the RateCorridorUsage
 * @return Value of the RateCorridorUsage
 *
 */

  public RCUsageObjectKeyData getRateCorridorUsage( ) {
    return RUGetIn;
  }

}
