/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageImpliedDecimalCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageImpliedDecimalCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageImpliedDecimalCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageImpliedDecimalObjectData RUIDCrIn;
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageImpliedDecimalCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageImpliedDecimalObjectData RUIDCrInIn) {
    super(id, context, "RateUsageImpliedDecimalCreate");
    RUIDCrIn = RUIDCrInIn;
  }

  public void translateToMap() {
    if (RUIDCrIn != null) {
      RUIDCrIn.resetFlags(true, true);
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(RUIDCrIn, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }


/**
 *
 * Sets the RateUsageImpliedDecimal
 * @param RUIDCrInIn Value of the RUIDCrIn
 *
 */

  public void setRateUsageImpliedDecimal(RateUsageImpliedDecimalObjectData RUIDCrInIn) {
    RUIDCrIn = RUIDCrInIn;
  }

  public void translateFromMap() {
    RUIDCrIn = RateUsageImpliedDecimalObjectHelper.fromMap(inputMap, "RateUsageImpliedDecimal");
  }

/**
 *
 * Gets the RateUsageImpliedDecimal
 * @return Value of the RateUsageImpliedDecimal
 *
 */

  public RateUsageImpliedDecimalObjectData getRateUsageImpliedDecimal( ) {
    return RUIDCrIn;
  }

}
