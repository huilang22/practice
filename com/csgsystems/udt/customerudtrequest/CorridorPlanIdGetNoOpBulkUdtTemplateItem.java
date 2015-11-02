/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanIdGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorPlanIdGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorPlanIdGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CPIObjectData noOpIn;

/**
 *
 * Constructor to create a   CorridorPlanIdGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorPlanIdGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CPIObjectData noOpInIn) {
    super(id, context, "CorridorPlanIdGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CorridorPlanId", CPIObjectHelper.toMap(noOpIn, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }
/**
 *
 * Sets the  CorridorPlanId
 * @param noOpInIn CPIObjectData to set
 *
 */
  public void setCorridorPlanId(CPIObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorPlanId passed into the constructor
 * @return Simulated response
 *
 */
  public CPIObjectData getCorridorPlanId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CPIObjectHelper.fromMap(inputMap, "CorridorPlanId");
  }
}
