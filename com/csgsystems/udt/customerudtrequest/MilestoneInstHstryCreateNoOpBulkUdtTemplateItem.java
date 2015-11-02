/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstHstryCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MilestoneInstHstryCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneInstHstryCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneInstHstryObjectData noOpIn;

/**
 *
 * Constructor to create a   MilestoneInstHstryCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneInstHstryCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstHstryObjectData noOpInIn) {
    super(id, context, "MilestoneInstHstryCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(noOpIn, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }
/**
 *
 * Sets the  MilestoneInstHstry
 * @param noOpInIn MilestoneInstHstryObjectData to set
 *
 */
  public void setMilestoneInstHstry(MilestoneInstHstryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MilestoneInstHstry passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstHstryObjectData getMilestoneInstHstry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneInstHstryObjectHelper.fromMap(inputMap, "MilestoneInstHstry");
  }
}
