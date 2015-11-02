/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MilestoneInstCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneInstCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneInstObjectData noOpIn;

/**
 *
 * Constructor to create a   MilestoneInstCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneInstCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstObjectData noOpInIn) {
    super(id, context, "MilestoneInstCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(noOpIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }
/**
 *
 * Sets the  MilestoneInst
 * @param noOpInIn MilestoneInstObjectData to set
 *
 */
  public void setMilestoneInst(MilestoneInstObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MilestoneInst passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstObjectData getMilestoneInst() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneInstObjectHelper.fromMap(inputMap, "MilestoneInst");
  }
}
