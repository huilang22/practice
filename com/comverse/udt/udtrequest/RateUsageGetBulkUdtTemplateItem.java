/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageGetBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageObjectKeyData RUGetIn;
/**
 *
 * Constructor to create a  RateUsageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageObjectKeyData RUGetInIn) {
    super(id, context, "RateUsageGet");
    RUGetIn = RUGetInIn;
  }

  public void translateToMap() {
    if (RUGetIn != null) {
      RUGetIn.resetFlags(true, true);
      addInput("RateUsage", RateUsageObjectKeyHelper.toMap(RUGetIn, new HashMap(), "RateUsageObjectKeyData").get("RateUsageObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateUsage
 * @param RUGetInIn Value of the RUGetIn
 *
 */

  public void setRateUsage(RateUsageObjectKeyData RUGetInIn) {
    RUGetIn = RUGetInIn;
  }

  public void translateFromMap() {
    RUGetIn = RateUsageObjectKeyHelper.fromMap(inputMap, "RateUsage");
  }

/**
 *
 * Gets the RateUsage
 * @return Value of the RateUsage
 *
 */

  public RateUsageObjectKeyData getRateUsage( ) {
    return RUGetIn;
  }

}
