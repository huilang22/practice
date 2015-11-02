/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneGetBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneGetBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneObjectKeyData MilestoneGetIn;
/**
 *
 * Constructor to create a  MilestoneGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneGetBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneObjectKeyData MilestoneGetInIn) {
    super(id, context, "MilestoneGet");
    MilestoneGetIn = MilestoneGetInIn;
  }

  public void translateToMap() {
    if (MilestoneGetIn != null) {
      MilestoneGetIn.resetFlags(true, true);
      addInput("Milestone", MilestoneObjectKeyHelper.toMap(MilestoneGetIn, new HashMap(), "MilestoneObjectKeyData").get("MilestoneObjectKeyData"));
    }
  }


/**
 *
 * Sets the Milestone
 * @param MilestoneGetInIn Value of the MilestoneGetIn
 *
 */

  public void setMilestone(MilestoneObjectKeyData MilestoneGetInIn) {
    MilestoneGetIn = MilestoneGetInIn;
  }

  public void translateFromMap() {
    MilestoneGetIn = MilestoneObjectKeyHelper.fromMap(inputMap, "Milestone");
  }

/**
 *
 * Gets the Milestone
 * @return Value of the Milestone
 *
 */

  public MilestoneObjectKeyData getMilestone( ) {
    return MilestoneGetIn;
  }

}
