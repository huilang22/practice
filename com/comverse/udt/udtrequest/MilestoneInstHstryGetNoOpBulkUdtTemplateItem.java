/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MilestoneInstHstryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MilestoneInstHstryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MilestoneInstHstryObjectData noOpIn;

/**
 *
 * Constructor to create a   MilestoneInstHstryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MilestoneInstHstryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstHstryObjectData noOpInIn) {
    super(id, context, "MilestoneInstHstryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(noOpIn, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }
/**
 *
 * Sets the  MilestoneInstHstry
 * @param noOpInIn MilestoneInstHstryObjectData to set
 *
 */
  public void setMilestoneInstHstry(MilestoneInstHstryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MilestoneInstHstry passed into the constructor
 * @return Simulated response
 *
 */
  public MilestoneInstHstryObjectData getMilestoneInstHstry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MilestoneInstHstryObjectHelper.fromMap(inputMap, "MilestoneInstHstry");
  }
}
