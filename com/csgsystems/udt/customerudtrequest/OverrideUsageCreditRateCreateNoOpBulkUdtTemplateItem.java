/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideUsageCreditRateCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a OverrideUsageCreditRateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OverrideUsageCreditRateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RUCOverrideObjectData noOpIn;

/**
 *
 * Constructor to create a   OverrideUsageCreditRateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OverrideUsageCreditRateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCOverrideObjectData noOpInIn) {
    super(id, context, "OverrideUsageCreditRateCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(noOpIn, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }
/**
 *
 * Sets the  OverrideUsageCreditRate
 * @param noOpInIn RUCOverrideObjectData to set
 *
 */
  public void setOverrideUsageCreditRate(RUCOverrideObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OverrideUsageCreditRate passed into the constructor
 * @return Simulated response
 *
 */
  public RUCOverrideObjectData getOverrideUsageCreditRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RUCOverrideObjectHelper.fromMap(inputMap, "OverrideUsageCreditRate");
  }
}
