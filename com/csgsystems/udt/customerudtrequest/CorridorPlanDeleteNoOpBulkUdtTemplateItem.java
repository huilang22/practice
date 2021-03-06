/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorPlanDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorPlanDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CPObjectData noOpIn;

/**
 *
 * Constructor to create a   CorridorPlanDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorPlanDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CPObjectData noOpInIn) {
    super(id, context, "CorridorPlanDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CorridorPlan", CPObjectHelper.toMap(noOpIn, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }
/**
 *
 * Sets the  CorridorPlan
 * @param noOpInIn CPObjectData to set
 *
 */
  public void setCorridorPlan(CPObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorPlan passed into the constructor
 * @return Simulated response
 *
 */
  public CPObjectData getCorridorPlan() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CPObjectHelper.fromMap(inputMap, "CorridorPlan");
  }
}
