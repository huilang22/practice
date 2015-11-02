/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodDistinctGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatePeriodDistinctGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatePeriodDistinctGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RatePeriodDistinctObjectData noOpIn;

/**
 *
 * Constructor to create a   RatePeriodDistinctGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatePeriodDistinctGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodDistinctObjectData noOpInIn) {
    super(id, context, "RatePeriodDistinctGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectHelper.toMap(noOpIn, new HashMap(), "RatePeriodDistinct").get("RatePeriodDistinct"));
    }
  }
/**
 *
 * Sets the  RatePeriodDistinct
 * @param noOpInIn RatePeriodDistinctObjectData to set
 *
 */
  public void setRatePeriodDistinct(RatePeriodDistinctObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatePeriodDistinct passed into the constructor
 * @return Simulated response
 *
 */
  public RatePeriodDistinctObjectData getRatePeriodDistinct() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RatePeriodDistinctObjectHelper.fromMap(inputMap, "RatePeriodDistinct");
  }
}
