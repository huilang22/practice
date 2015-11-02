/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstModifyBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneInstModifyBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneInstModifyBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneInstObjectData MilestoneInstModifyIn;
/**
 *
 * Constructor to create a  MilestoneInstModifyBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneInstModifyBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneInstObjectData MilestoneInstModifyInIn) {
    super(id, context, "MilestoneInstModify");
    MilestoneInstModifyIn = MilestoneInstModifyInIn;
  }

  public void translateToMap() {
    if (MilestoneInstModifyIn != null) {
      MilestoneInstModifyIn.resetFlags(true, true);
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(MilestoneInstModifyIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }


/**
 *
 * Sets the MilestoneInst
 * @param MilestoneInstModifyInIn Value of the MilestoneInstModifyIn
 *
 */

  public void setMilestoneInst(MilestoneInstObjectData MilestoneInstModifyInIn) {
    MilestoneInstModifyIn = MilestoneInstModifyInIn;
  }

  public void translateFromMap() {
    MilestoneInstModifyIn = MilestoneInstObjectHelper.fromMap(inputMap, "MilestoneInst");
  }

/**
 *
 * Gets the MilestoneInst
 * @return Value of the MilestoneInst
 *
 */

  public MilestoneInstObjectData getMilestoneInst( ) {
    return MilestoneInstModifyIn;
  }

}
