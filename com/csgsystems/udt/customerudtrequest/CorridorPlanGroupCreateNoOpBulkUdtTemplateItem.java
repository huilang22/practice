/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanGroupCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorPlanGroupCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorPlanGroupCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CPGObjectData noOpIn;

/**
 *
 * Constructor to create a   CorridorPlanGroupCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorPlanGroupCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CPGObjectData noOpInIn) {
    super(id, context, "CorridorPlanGroupCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(noOpIn, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }
/**
 *
 * Sets the  CorridorPlanGroup
 * @param noOpInIn CPGObjectData to set
 *
 */
  public void setCorridorPlanGroup(CPGObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorPlanGroup passed into the constructor
 * @return Simulated response
 *
 */
  public CPGObjectData getCorridorPlanGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CPGObjectHelper.fromMap(inputMap, "CorridorPlanGroup");
  }
}
