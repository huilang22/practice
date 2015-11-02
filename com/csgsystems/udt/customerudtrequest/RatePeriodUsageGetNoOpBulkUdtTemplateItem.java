/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodUsageGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatePeriodUsageGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatePeriodUsageGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RatePeriodUsagesObjectData noOpIn;

/**
 *
 * Constructor to create a   RatePeriodUsageGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatePeriodUsageGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodUsagesObjectData noOpInIn) {
    super(id, context, "RatePeriodUsageGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(noOpIn, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }
/**
 *
 * Sets the  RatePeriodUsage
 * @param noOpInIn RatePeriodUsagesObjectData to set
 *
 */
  public void setRatePeriodUsage(RatePeriodUsagesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatePeriodUsage passed into the constructor
 * @return Simulated response
 *
 */
  public RatePeriodUsagesObjectData getRatePeriodUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RatePeriodUsagesObjectHelper.fromMap(inputMap, "RatePeriodUsage");
  }
}
