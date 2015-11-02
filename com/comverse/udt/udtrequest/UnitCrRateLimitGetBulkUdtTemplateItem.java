/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitGetBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRateLimitGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitsObjectKeyData UnitCrRateLimitsGetIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitsObjectKeyData UnitCrRateLimitsGetInIn) {
    super(id, context, "UnitCrRateLimitGet");
    UnitCrRateLimitsGetIn = UnitCrRateLimitsGetInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitsGetIn != null) {
      UnitCrRateLimitsGetIn.resetFlags(true, true);
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectKeyHelper.toMap(UnitCrRateLimitsGetIn, new HashMap(), "UnitCrRateLimitsObjectKeyData").get("UnitCrRateLimitsObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimit
 * @param UnitCrRateLimitsGetInIn Value of the UnitCrRateLimitsGetIn
 *
 */

  public void setUnitCrRateLimit(UnitCrRateLimitsObjectKeyData UnitCrRateLimitsGetInIn) {
    UnitCrRateLimitsGetIn = UnitCrRateLimitsGetInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitsGetIn = UnitCrRateLimitsObjectKeyHelper.fromMap(inputMap, "UnitCrRateLimit");
  }

/**
 *
 * Gets the UnitCrRateLimit
 * @return Value of the UnitCrRateLimit
 *
 */

  public UnitCrRateLimitsObjectKeyData getUnitCrRateLimit( ) {
    return UnitCrRateLimitsGetIn;
  }

}
