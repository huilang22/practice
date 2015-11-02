/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MilestoneInstUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneInstUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneInstObjectData noOpIn;

/**
 *
 * Constructor to create a   MilestoneInstUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneInstUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstObjectData noOpInIn) {
    super(id, context, "MilestoneInstUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(noOpIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }
/**
 *
 * Sets the  MilestoneInst
 * @param noOpInIn MilestoneInstObjectData to set
 *
 */
  public void setMilestoneInst(MilestoneInstObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MilestoneInst passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstObjectData getMilestoneInst() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneInstObjectHelper.fromMap(inputMap, "MilestoneInst");
  }
}
