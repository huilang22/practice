/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimePeriodCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrTimePeriodCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrTimePeriodCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrTimePeriodObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrTimePeriodCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrTimePeriodCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTimePeriodObjectData noOpInIn) {
    super(id, context, "RbrTimePeriodCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(noOpIn, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }
/**
 *
 * Sets the  RbrTimePeriod
 * @param noOpInIn RbrTimePeriodObjectData to set
 *
 */
  public void setRbrTimePeriod(RbrTimePeriodObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrTimePeriod passed into the constructor
 * @return Simulated response
 *
 */
  public RbrTimePeriodObjectData getRbrTimePeriod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrTimePeriodObjectHelper.fromMap(inputMap, "RbrTimePeriod");
  }
}
