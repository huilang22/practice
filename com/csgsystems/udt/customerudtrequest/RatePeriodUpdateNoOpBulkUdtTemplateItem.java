/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatePeriodUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatePeriodUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RPObjectData noOpIn;

/**
 *
 * Constructor to create a   RatePeriodUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatePeriodUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RPObjectData noOpInIn) {
    super(id, context, "RatePeriodUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RatePeriod", RPObjectHelper.toMap(noOpIn, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }
/**
 *
 * Sets the  RatePeriod
 * @param noOpInIn RPObjectData to set
 *
 */
  public void setRatePeriod(RPObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatePeriod passed into the constructor
 * @return Simulated response
 *
 */
  public RPObjectData getRatePeriod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RPObjectHelper.fromMap(inputMap, "RatePeriod");
  }
}
