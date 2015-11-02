/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneCreateBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneObjectData MilestoneCreateIn;
/**
 *
 * Constructor to create a  MilestoneCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneObjectData MilestoneCreateInIn) {
    super(id, context, "MilestoneCreate");
    MilestoneCreateIn = MilestoneCreateInIn;
  }

  public void translateToMap() {
    if (MilestoneCreateIn != null) {
      MilestoneCreateIn.resetFlags(true, true);
      addInput("Milestone", MilestoneObjectHelper.toMap(MilestoneCreateIn, new HashMap(), "Milestone").get("Milestone"));
    }
  }


/**
 *
 * Sets the Milestone
 * @param MilestoneCreateInIn Value of the MilestoneCreateIn
 *
 */

  public void setMilestone(MilestoneObjectData MilestoneCreateInIn) {
    MilestoneCreateIn = MilestoneCreateInIn;
  }

  public void translateFromMap() {
    MilestoneCreateIn = MilestoneObjectHelper.fromMap(inputMap, "Milestone");
  }

/**
 *
 * Gets the Milestone
 * @return Value of the Milestone
 *
 */

  public MilestoneObjectData getMilestone( ) {
    return MilestoneCreateIn;
  }

}
