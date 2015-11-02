/*
 * Generated code DO NOT EDIT
 * Generated file: RefinancePlanGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RefinancePlanGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RefinancePlanGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RefinancePlanObjectData noOpIn;

/**
 *
 * Constructor to create a   RefinancePlanGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RefinancePlanGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RefinancePlanObjectData noOpInIn) {
    super(id, context, "RefinancePlanGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RefinancePlan", RefinancePlanObjectHelper.toMap(noOpIn, new HashMap(), "RefinancePlan").get("RefinancePlan"));
    }
  }
/**
 *
 * Sets the  RefinancePlan
 * @param noOpInIn RefinancePlanObjectData to set
 *
 */
  public void setRefinancePlan(RefinancePlanObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RefinancePlan passed into the constructor
 * @return Simulated response
 *
 */
  public RefinancePlanObjectData getRefinancePlan() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RefinancePlanObjectHelper.fromMap(inputMap, "RefinancePlan");
  }
}
