/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateUsageUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUsageUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUsageObjectData noOpIn;

/**
 *
 * Constructor to create a   RateUsageUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUsageUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageObjectData noOpInIn) {
    super(id, context, "RateUsageUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateUsage", RateUsageObjectHelper.toMap(noOpIn, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }
/**
 *
 * Sets the  RateUsage
 * @param noOpInIn RateUsageObjectData to set
 *
 */
  public void setRateUsage(RateUsageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUsage passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageObjectData getRateUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUsageObjectHelper.fromMap(inputMap, "RateUsage");
  }
}
