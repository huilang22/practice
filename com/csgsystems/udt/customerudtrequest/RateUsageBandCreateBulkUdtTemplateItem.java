/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageBandCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageBandCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageBandCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageBandObjectData RUCrIn;
/**
 *
 * Constructor to create a  RateUsageBandCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageBandCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageBandObjectData RUCrInIn) {
    super(id, context, "RateUsageBandCreate");
    RUCrIn = RUCrInIn;
  }

  public void translateToMap() {
    if (RUCrIn != null) {
      RUCrIn.resetFlags(true, true);
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(RUCrIn, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }


/**
 *
 * Sets the RateUsageBand
 * @param RUCrInIn Value of the RUCrIn
 *
 */

  public void setRateUsageBand(RateUsageBandObjectData RUCrInIn) {
    RUCrIn = RUCrInIn;
  }

  public void translateFromMap() {
    RUCrIn = RateUsageBandObjectHelper.fromMap(inputMap, "RateUsageBand");
  }

/**
 *
 * Gets the RateUsageBand
 * @return Value of the RateUsageBand
 *
 */

  public RateUsageBandObjectData getRateUsageBand( ) {
    return RUCrIn;
  }

}
