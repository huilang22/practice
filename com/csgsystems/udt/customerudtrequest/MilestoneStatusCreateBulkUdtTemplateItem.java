/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneStatusCreateBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneStatusCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneStatusCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneStatusObjectData MilestoneStatusCreateIn;
/**
 *
 * Constructor to create a  MilestoneStatusCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneStatusCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneStatusObjectData MilestoneStatusCreateInIn) {
    super(id, context, "MilestoneStatusCreate");
    MilestoneStatusCreateIn = MilestoneStatusCreateInIn;
  }

  public void translateToMap() {
    if (MilestoneStatusCreateIn != null) {
      MilestoneStatusCreateIn.resetFlags(true, true);
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(MilestoneStatusCreateIn, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }


/**
 *
 * Sets the MilestoneStatus
 * @param MilestoneStatusCreateInIn Value of the MilestoneStatusCreateIn
 *
 */

  public void setMilestoneStatus(MilestoneStatusObjectData MilestoneStatusCreateInIn) {
    MilestoneStatusCreateIn = MilestoneStatusCreateInIn;
  }

  public void translateFromMap() {
    MilestoneStatusCreateIn = MilestoneStatusObjectHelper.fromMap(inputMap, "MilestoneStatus");
  }

/**
 *
 * Gets the MilestoneStatus
 * @return Value of the MilestoneStatus
 *
 */

  public MilestoneStatusObjectData getMilestoneStatus( ) {
    return MilestoneStatusCreateIn;
  }

}
