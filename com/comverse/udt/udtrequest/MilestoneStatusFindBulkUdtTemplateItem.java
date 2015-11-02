/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneStatusObjectFilter MilestoneStatusFindIn;
/**
 *
 * Constructor to create a  MilestoneStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneStatusObjectFilter MilestoneStatusFindInIn) {
    super(id, context, "MilestoneStatusFind");
    MilestoneStatusFindIn = MilestoneStatusFindInIn;
  }

  public void translateToMap() {
    if (MilestoneStatusFindIn != null) {
      Integer index =  MilestoneStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(MilestoneStatusFindIn, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }


/**
 *
 * Sets the MilestoneStatus
 * @param MilestoneStatusFindInIn Value of the MilestoneStatusFindIn
 *
 */

  public void setMilestoneStatus(MilestoneStatusObjectFilter MilestoneStatusFindInIn) {
    MilestoneStatusFindIn = MilestoneStatusFindInIn;
  }

  public void translateFromMap() {
    MilestoneStatusFindIn = MilestoneStatusObjectHelper.fromMapFilter(inputMap, "MilestoneStatus");
  }

/**
 *
 * Gets the MilestoneStatus
 * @return Value of the MilestoneStatus
 *
 */

  public MilestoneStatusObjectFilter getMilestoneStatus( ) {
    return MilestoneStatusFindIn;
  }

}
