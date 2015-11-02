/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneFindBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneFindBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneObjectFilter MilestoneFindIn;
/**
 *
 * Constructor to create a  MilestoneFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneFindBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneObjectFilter MilestoneFindInIn) {
    super(id, context, "MilestoneFind");
    MilestoneFindIn = MilestoneFindInIn;
  }

  public void translateToMap() {
    if (MilestoneFindIn != null) {
      Integer index =  MilestoneFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Milestone", MilestoneObjectHelper.toMap(MilestoneFindIn, new HashMap(), "Milestone").get("Milestone"));
    }
  }


/**
 *
 * Sets the Milestone
 * @param MilestoneFindInIn Value of the MilestoneFindIn
 *
 */

  public void setMilestone(MilestoneObjectFilter MilestoneFindInIn) {
    MilestoneFindIn = MilestoneFindInIn;
  }

  public void translateFromMap() {
    MilestoneFindIn = MilestoneObjectHelper.fromMapFilter(inputMap, "Milestone");
  }

/**
 *
 * Gets the Milestone
 * @return Value of the Milestone
 *
 */

  public MilestoneObjectFilter getMilestone( ) {
    return MilestoneFindIn;
  }

}
