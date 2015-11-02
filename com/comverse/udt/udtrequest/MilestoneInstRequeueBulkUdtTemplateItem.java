/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstRequeueBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneInstRequeueBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstRequeueBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstObjectData MilestoneInstRequeueIn;
/**
 *
 * Constructor to create a  MilestoneInstRequeueBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstRequeueBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstObjectData MilestoneInstRequeueInIn) {
    super(id, context, "MilestoneInstRequeue");
    MilestoneInstRequeueIn = MilestoneInstRequeueInIn;
  }

  public void translateToMap() {
    if (MilestoneInstRequeueIn != null) {
      MilestoneInstRequeueIn.resetFlags(true, true);
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(MilestoneInstRequeueIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }


/**
 *
 * Sets the MilestoneInst
 * @param MilestoneInstRequeueInIn Value of the MilestoneInstRequeueIn
 *
 */

  public void setMilestoneInst(MilestoneInstObjectData MilestoneInstRequeueInIn) {
    MilestoneInstRequeueIn = MilestoneInstRequeueInIn;
  }

  public void translateFromMap() {
    MilestoneInstRequeueIn = MilestoneInstObjectHelper.fromMap(inputMap, "MilestoneInst");
  }

/**
 *
 * Gets the MilestoneInst
 * @return Value of the MilestoneInst
 *
 */

  public MilestoneInstObjectData getMilestoneInst( ) {
    return MilestoneInstRequeueIn;
  }

}
