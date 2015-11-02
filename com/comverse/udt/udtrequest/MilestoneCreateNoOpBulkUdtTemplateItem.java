/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MilestoneCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneObjectData noOpIn;

/**
 *
 * Constructor to create a   MilestoneCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneObjectData noOpInIn) {
    super(id, context, "MilestoneCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Milestone", MilestoneObjectHelper.toMap(noOpIn, new HashMap(), "Milestone").get("Milestone"));
    }
  }
/**
 *
 * Sets the  Milestone
 * @param noOpInIn MilestoneObjectData to set
 *
 */
  public void setMilestone(MilestoneObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Milestone passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneObjectData getMilestone() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneObjectHelper.fromMap(inputMap, "Milestone");
  }
}
