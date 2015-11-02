/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneStatusCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a MilestoneStatusCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneStatusCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   MilestoneStatusCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneStatusCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneStatusObjectData noOpInIn) {
    super(id, context, "MilestoneStatusCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(noOpIn, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }
/**
 *
 * Sets the  MilestoneStatus
 * @param noOpInIn MilestoneStatusObjectData to set
 *
 */
  public void setMilestoneStatus(MilestoneStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MilestoneStatus passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneStatusObjectData getMilestoneStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneStatusObjectHelper.fromMap(inputMap, "MilestoneStatus");
  }
}
