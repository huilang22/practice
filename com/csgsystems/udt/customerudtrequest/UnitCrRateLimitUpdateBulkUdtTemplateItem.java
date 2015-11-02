/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a UnitCrRateLimitUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitsObjectData UnitCrRateLimitUpdateIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitsObjectData UnitCrRateLimitUpdateInIn) {
    super(id, context, "UnitCrRateLimitUpdate");
    UnitCrRateLimitUpdateIn = UnitCrRateLimitUpdateInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitUpdateIn != null) {
      UnitCrRateLimitUpdateIn.resetFlags(true, true);
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(UnitCrRateLimitUpdateIn, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimit
 * @param UnitCrRateLimitUpdateInIn Value of the UnitCrRateLimitUpdateIn
 *
 */

  public void setUnitCrRateLimit(UnitCrRateLimitsObjectData UnitCrRateLimitUpdateInIn) {
    UnitCrRateLimitUpdateIn = UnitCrRateLimitUpdateInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitUpdateIn = UnitCrRateLimitsObjectHelper.fromMap(inputMap, "UnitCrRateLimit");
  }

/**
 *
 * Gets the UnitCrRateLimit
 * @return Value of the UnitCrRateLimit
 *
 */

  public UnitCrRateLimitsObjectData getUnitCrRateLimit( ) {
    return UnitCrRateLimitUpdateIn;
  }

}
