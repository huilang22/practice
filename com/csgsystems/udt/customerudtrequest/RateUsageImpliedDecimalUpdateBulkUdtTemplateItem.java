/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageImpliedDecimalUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageImpliedDecimalUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageImpliedDecimalUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageImpliedDecimalObjectData RUIDUpdateIn;
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageImpliedDecimalUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageImpliedDecimalObjectData RUIDUpdateInIn) {
    super(id, context, "RateUsageImpliedDecimalUpdate");
    RUIDUpdateIn = RUIDUpdateInIn;
  }

  public void translateToMap() {
    if (RUIDUpdateIn != null) {
      RUIDUpdateIn.resetFlags(true, true);
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(RUIDUpdateIn, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }


/**
 *
 * Sets the RateUsageImpliedDecimal
 * @param RUIDUpdateInIn Value of the RUIDUpdateIn
 *
 */

  public void setRateUsageImpliedDecimal(RateUsageImpliedDecimalObjectData RUIDUpdateInIn) {
    RUIDUpdateIn = RUIDUpdateInIn;
  }

  public void translateFromMap() {
    RUIDUpdateIn = RateUsageImpliedDecimalObjectHelper.fromMap(inputMap, "RateUsageImpliedDecimal");
  }

/**
 *
 * Gets the RateUsageImpliedDecimal
 * @return Value of the RateUsageImpliedDecimal
 *
 */

  public RateUsageImpliedDecimalObjectData getRateUsageImpliedDecimal( ) {
    return RUIDUpdateIn;
  }

}
