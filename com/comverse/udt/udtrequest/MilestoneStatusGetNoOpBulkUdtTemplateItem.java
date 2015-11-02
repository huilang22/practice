/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MilestoneStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   MilestoneStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneStatusObjectData noOpInIn) {
    super(id, context, "MilestoneStatusGet");
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
