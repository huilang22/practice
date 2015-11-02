/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageBandGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateUsageBandGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUsageBandGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUsageBandObjectData noOpIn;

/**
 *
 * Constructor to create a   RateUsageBandGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUsageBandGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageBandObjectData noOpInIn) {
    super(id, context, "RateUsageBandGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(noOpIn, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }
/**
 *
 * Sets the  RateUsageBand
 * @param noOpInIn RateUsageBandObjectData to set
 *
 */
  public void setRateUsageBand(RateUsageBandObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUsageBand passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageBandObjectData getRateUsageBand() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUsageBandObjectHelper.fromMap(inputMap, "RateUsageBand");
  }
}
