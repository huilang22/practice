/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageObjectKeyData RUDeleteIn;
/**
 *
 * Constructor to create a  RateUsageDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageObjectKeyData RUDeleteInIn) {
    super(id, context, "RateUsageDelete");
    RUDeleteIn = RUDeleteInIn;
  }

  public void translateToMap() {
    if (RUDeleteIn != null) {
      RUDeleteIn.resetFlags(true, true);
      addInput("RateUsage", RateUsageObjectKeyHelper.toMap(RUDeleteIn, new HashMap(), "RateUsageObjectKeyData").get("RateUsageObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateUsage
 * @param RUDeleteInIn Value of the RUDeleteIn
 *
 */

  public void setRateUsage(RateUsageObjectKeyData RUDeleteInIn) {
    RUDeleteIn = RUDeleteInIn;
  }

  public void translateFromMap() {
    RUDeleteIn = RateUsageObjectKeyHelper.fromMap(inputMap, "RateUsage");
  }

/**
 *
 * Gets the RateUsage
 * @return Value of the RateUsage
 *
 */

  public RateUsageObjectKeyData getRateUsage( ) {
    return RUDeleteIn;
  }

}
