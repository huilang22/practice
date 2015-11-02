/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitFindBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRateLimitFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitsObjectFilter UnitCrRateLimitsFindIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitsObjectFilter UnitCrRateLimitsFindInIn) {
    super(id, context, "UnitCrRateLimitFind");
    UnitCrRateLimitsFindIn = UnitCrRateLimitsFindInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitsFindIn != null) {
      Integer index =  UnitCrRateLimitsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(UnitCrRateLimitsFindIn, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimit
 * @param UnitCrRateLimitsFindInIn Value of the UnitCrRateLimitsFindIn
 *
 */

  public void setUnitCrRateLimit(UnitCrRateLimitsObjectFilter UnitCrRateLimitsFindInIn) {
    UnitCrRateLimitsFindIn = UnitCrRateLimitsFindInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitsFindIn = UnitCrRateLimitsObjectHelper.fromMapFilter(inputMap, "UnitCrRateLimit");
  }

/**
 *
 * Gets the UnitCrRateLimit
 * @return Value of the UnitCrRateLimit
 *
 */

  public UnitCrRateLimitsObjectFilter getUnitCrRateLimit( ) {
    return UnitCrRateLimitsFindIn;
  }

}
