/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitDeleteBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRateLimitDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitsObjectKeyData UnitCrRateLimitsDeleteIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitsObjectKeyData UnitCrRateLimitsDeleteInIn) {
    super(id, context, "UnitCrRateLimitDelete");
    UnitCrRateLimitsDeleteIn = UnitCrRateLimitsDeleteInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitsDeleteIn != null) {
      UnitCrRateLimitsDeleteIn.resetFlags(true, true);
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectKeyHelper.toMap(UnitCrRateLimitsDeleteIn, new HashMap(), "UnitCrRateLimitsObjectKeyData").get("UnitCrRateLimitsObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimit
 * @param UnitCrRateLimitsDeleteInIn Value of the UnitCrRateLimitsDeleteIn
 *
 */

  public void setUnitCrRateLimit(UnitCrRateLimitsObjectKeyData UnitCrRateLimitsDeleteInIn) {
    UnitCrRateLimitsDeleteIn = UnitCrRateLimitsDeleteInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitsDeleteIn = UnitCrRateLimitsObjectKeyHelper.fromMap(inputMap, "UnitCrRateLimit");
  }

/**
 *
 * Gets the UnitCrRateLimit
 * @return Value of the UnitCrRateLimit
 *
 */

  public UnitCrRateLimitsObjectKeyData getUnitCrRateLimit( ) {
    return UnitCrRateLimitsDeleteIn;
  }

}
