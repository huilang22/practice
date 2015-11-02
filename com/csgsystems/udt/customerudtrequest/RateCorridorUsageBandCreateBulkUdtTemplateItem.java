/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageBandCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageBandCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageBandCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUBOverrideObjectData RUBOCrIn;
/**
 *
 * Constructor to create a  RateCorridorUsageBandCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageBandCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RUBOverrideObjectData RUBOCrInIn) {
    super(id, context, "RateCorridorUsageBandCreate");
    RUBOCrIn = RUBOCrInIn;
  }

  public void translateToMap() {
    if (RUBOCrIn != null) {
      RUBOCrIn.resetFlags(true, true);
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(RUBOCrIn, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }


/**
 *
 * Sets the RateCorridorUsageBand
 * @param RUBOCrInIn Value of the RUBOCrIn
 *
 */

  public void setRateCorridorUsageBand(RUBOverrideObjectData RUBOCrInIn) {
    RUBOCrIn = RUBOCrInIn;
  }

  public void translateFromMap() {
    RUBOCrIn = RUBOverrideObjectHelper.fromMap(inputMap, "RateCorridorUsageBand");
  }

/**
 *
 * Gets the RateCorridorUsageBand
 * @return Value of the RateCorridorUsageBand
 *
 */

  public RUBOverrideObjectData getRateCorridorUsageBand( ) {
    return RUBOCrIn;
  }

}
