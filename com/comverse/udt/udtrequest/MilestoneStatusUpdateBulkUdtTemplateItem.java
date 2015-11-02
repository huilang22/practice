/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusUpdateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
