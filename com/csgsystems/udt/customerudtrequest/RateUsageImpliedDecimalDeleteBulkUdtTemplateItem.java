/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageImpliedDecimalDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageImpliedDecimalDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageImpliedDecimalDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageImpliedDecimalObjectKeyData RUIDDeleteIn;
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageImpliedDecimalDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageImpliedDecimalObjectKeyData RUIDDeleteInIn) {
    super(id, context, "RateUsageImpliedDecimalDelete");
    RUIDDeleteIn = RUIDDeleteInIn;
  }

  public void translateToMap() {
    if (RUIDDeleteIn != null) {
      RUIDDeleteIn.resetFlags(true, true);
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectKeyHelper.toMap(RUIDDeleteIn, new HashMap(), "RateUsageImpliedDecimalObjectKeyData").get("RateUsageImpliedDecimalObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateUsageImpliedDecimal
 * @param RUIDDeleteInIn Value of the RUIDDeleteIn
 *
 */

  public void setRateUsageImpliedDecimal(RateUsageImpliedDecimalObjectKeyData RUIDDeleteInIn) {
    RUIDDeleteIn = RUIDDeleteInIn;
  }

  public void translateFromMap() {
    RUIDDeleteIn = RateUsageImpliedDecimalObjectKeyHelper.fromMap(inputMap, "RateUsageImpliedDecimal");
  }

/**
 *
 * Gets the RateUsageImpliedDecimal
 * @return Value of the RateUsageImpliedDecimal
 *
 */

  public RateUsageImpliedDecimalObjectKeyData getRateUsageImpliedDecimal( ) {
    return RUIDDeleteIn;
  }

}
