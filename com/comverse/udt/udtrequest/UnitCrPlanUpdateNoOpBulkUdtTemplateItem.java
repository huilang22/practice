/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanUpdateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a UnitCrPlanUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrPlanUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrPlanObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitCrPlanUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrPlanUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrPlanObjectData noOpInIn) {
    super(id, context, "UnitCrPlanUpdate");
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
