/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnitCrRateLimitGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrRateLimitGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrRateLimitsObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitCrRateLimitGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrRateLimitGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitsObjectData noOpInIn) {
    super(id, context, "UnitCrRateLimitGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }
/**
 *
 * Sets the  UnitCrRateLimit
 * @param noOpInIn UnitCrRateLimitsObjectData to set
 *
 */
  public void setUnitCrRateLimit(UnitCrRateLimitsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrRateLimit passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRateLimitsObjectData getUnitCrRateLimit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrRateLimitsObjectHelper.fromMap(inputMap, "UnitCrRateLimit");
  }
}
