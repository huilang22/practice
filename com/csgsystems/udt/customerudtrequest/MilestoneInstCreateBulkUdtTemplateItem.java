/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstCreateBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneInstCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstObjectData msiCrIn;
/**
 *
 * Constructor to create a  MilestoneInstCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstObjectData msiCrInIn) {
    super(id, context, "MilestoneInstCreate");
    msiCrIn = msiCrInIn;
  }

  public void translateToMap() {
    if (msiCrIn != null) {
      msiCrIn.resetFlags(true, true);
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(msiCrIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }


/**
 *
 * Sets the MilestoneInst
 * @param msiCrInIn Value of the msiCrIn
 *
 */

  public void setMilestoneInst(MilestoneInstObjectData msiCrInIn) {
    msiCrIn = msiCrInIn;
  }

  public void translateFromMap() {
    msiCrIn = MilestoneInstObjectHelper.fromMap(inputMap, "MilestoneInst");
  }

/**
 *
 * Gets the MilestoneInst
 * @return Value of the MilestoneInst
 *
 */

  public MilestoneInstObjectData getMilestoneInst( ) {
    return msiCrIn;
  }

}
