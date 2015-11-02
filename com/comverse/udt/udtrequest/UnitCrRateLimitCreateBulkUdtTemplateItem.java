/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitCreateBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRateLimitCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitsObjectData UnitCrRateLimitCreateIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitsObjectData UnitCrRateLimitCreateInIn) {
    super(id, context, "UnitCrRateLimitCreate");
    UnitCrRateLimitCreateIn = UnitCrRateLimitCreateInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitCreateIn != null) {
      UnitCrRateLimitCreateIn.resetFlags(true, true);
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(UnitCrRateLimitCreateIn, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimit
 * @param UnitCrRateLimitCreateInIn Value of the UnitCrRateLimitCreateIn
 *
 */

  public void setUnitCrRateLimit(UnitCrRateLimitsObjectData UnitCrRateLimitCreateInIn) {
    UnitCrRateLimitCreateIn = UnitCrRateLimitCreateInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitCreateIn = UnitCrRateLimitsObjectHelper.fromMap(inputMap, "UnitCrRateLimit");
  }

/**
 *
 * Gets the UnitCrRateLimit
 * @return Value of the UnitCrRateLimit
 *
 */

  public UnitCrRateLimitsObjectData getUnitCrRateLimit( ) {
    return UnitCrRateLimitCreateIn;
  }

}
