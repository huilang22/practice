/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneStatusUpdateBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneStatusUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneStatusUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneStatusObjectData MilestoneStatusUpdateIn;
/**
 *
 * Constructor to create a  MilestoneStatusUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneStatusUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneStatusObjectData MilestoneStatusUpdateInIn) {
    super(id, context, "MilestoneStatusUpdate");
    MilestoneStatusUpdateIn = MilestoneStatusUpdateInIn;
  }

  public void translateToMap() {
    if (MilestoneStatusUpdateIn != null) {
      MilestoneStatusUpdateIn.resetFlags(true, true);
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(MilestoneStatusUpdateIn, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }


/**
 *
 * Sets the MilestoneStatus
 * @param MilestoneStatusUpdateInIn Value of the MilestoneStatusUpdateIn
 *
 */

  public void setMilestoneStatus(MilestoneStatusObjectData MilestoneStatusUpdateInIn) {
    MilestoneStatusUpdateIn = MilestoneStatusUpdateInIn;
  }

  public void translateFromMap() {
    MilestoneStatusUpdateIn = MilestoneStatusObjectHelper.fromMap(inputMap, "MilestoneStatus");
  }

/**
 *
 * Gets the MilestoneStatus
 * @return Value of the MilestoneStatus
 *
 */

  public MilestoneStatusObjectData getMilestoneStatus( ) {
    return MilestoneStatusUpdateIn;
  }

}
