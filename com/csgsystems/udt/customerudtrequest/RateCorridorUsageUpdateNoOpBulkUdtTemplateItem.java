/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateCorridorUsageUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateCorridorUsageUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RCUsageObjectData noOpIn;

/**
 *
 * Constructor to create a   RateCorridorUsageUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateCorridorUsageUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RCUsageObjectData noOpInIn) {
    super(id, context, "RateCorridorUsageUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(noOpIn, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }
/**
 *
 * Sets the  RateCorridorUsage
 * @param noOpInIn RCUsageObjectData to set
 *
 */
  public void setRateCorridorUsage(RCUsageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateCorridorUsage passed into the constructor
 * @return Simulated response
 *
 */
  public RCUsageObjectData getRateCorridorUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RCUsageObjectHelper.fromMap(inputMap, "RateCorridorUsage");
  }
}
