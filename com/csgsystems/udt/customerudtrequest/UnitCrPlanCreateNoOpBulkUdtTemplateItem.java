/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrPlanCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnitCrPlanCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrPlanCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrPlanObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitCrPlanCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrPlanCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrPlanObjectData noOpInIn) {
    super(id, context, "UnitCrPlanCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }
/**
 *
 * Sets the  UnitCrPlan
 * @param noOpInIn UnitCrPlanObjectData to set
 *
 */
  public void setUnitCrPlan(UnitCrPlanObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrPlan passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrPlanObjectData getUnitCrPlan() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrPlanObjectHelper.fromMap(inputMap, "UnitCrPlan");
  }
}
