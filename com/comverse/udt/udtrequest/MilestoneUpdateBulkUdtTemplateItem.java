/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneUpdateBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneObjectData MilestoneUpdateIn;
/**
 *
 * Constructor to create a  MilestoneUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneObjectData MilestoneUpdateInIn) {
    super(id, context, "MilestoneUpdate");
    MilestoneUpdateIn = MilestoneUpdateInIn;
  }

  public void translateToMap() {
    if (MilestoneUpdateIn != null) {
      MilestoneUpdateIn.resetFlags(true, true);
      addInput("Milestone", MilestoneObjectHelper.toMap(MilestoneUpdateIn, new HashMap(), "Milestone").get("Milestone"));
    }
  }


/**
 *
 * Sets the Milestone
 * @param MilestoneUpdateInIn Value of the MilestoneUpdateIn
 *
 */

  public void setMilestone(MilestoneObjectData MilestoneUpdateInIn) {
    MilestoneUpdateIn = MilestoneUpdateInIn;
  }

  public void translateFromMap() {
    MilestoneUpdateIn = MilestoneObjectHelper.fromMap(inputMap, "Milestone");
  }

/**
 *
 * Gets the Milestone
 * @return Value of the Milestone
 *
 */

  public MilestoneObjectData getMilestone( ) {
    return MilestoneUpdateIn;
  }

}
