/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageImpliedDecimalFindBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageImpliedDecimalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageImpliedDecimalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageImpliedDecimalObjectFilter RUIDFindIn;
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageImpliedDecimalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageImpliedDecimalObjectFilter RUIDFindInIn) {
    super(id, context, "RateUsageImpliedDecimalFind");
    RUIDFindIn = RUIDFindInIn;
  }

  public void translateToMap() {
    if (RUIDFindIn != null) {
      Integer index =  RUIDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(RUIDFindIn, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }


/**
 *
 * Sets the RateUsageImpliedDecimal
 * @param RUIDFindInIn Value of the RUIDFindIn
 *
 */

  public void setRateUsageImpliedDecimal(RateUsageImpliedDecimalObjectFilter RUIDFindInIn) {
    RUIDFindIn = RUIDFindInIn;
  }

  public void translateFromMap() {
    RUIDFindIn = RateUsageImpliedDecimalObjectHelper.fromMapFilter(inputMap, "RateUsageImpliedDecimal");
  }

/**
 *
 * Gets the RateUsageImpliedDecimal
 * @return Value of the RateUsageImpliedDecimal
 *
 */

  public RateUsageImpliedDecimalObjectFilter getRateUsageImpliedDecimal( ) {
    return RUIDFindIn;
  }

}
