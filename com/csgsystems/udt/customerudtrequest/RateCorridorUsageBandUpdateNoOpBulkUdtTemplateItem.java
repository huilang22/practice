/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageBandUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateCorridorUsageBandUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateCorridorUsageBandUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RUBOverrideObjectData noOpIn;

/**
 *
 * Constructor to create a   RateCorridorUsageBandUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateCorridorUsageBandUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RUBOverrideObjectData noOpInIn) {
    super(id, context, "RateCorridorUsageBandUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(noOpIn, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }
/**
 *
 * Sets the  RateCorridorUsageBand
 * @param noOpInIn RUBOverrideObjectData to set
 *
 */
  public void setRateCorridorUsageBand(RUBOverrideObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateCorridorUsageBand passed into the constructor
 * @return Simulated response
 *
 */
  public RUBOverrideObjectData getRateCorridorUsageBand() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RUBOverrideObjectHelper.fromMap(inputMap, "RateCorridorUsageBand");
  }
}
