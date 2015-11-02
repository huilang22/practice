/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a MilestoneStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class MilestoneStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MilestoneStatusObjectKeyData MilestoneStatusGetIn;
/**
 *
 * Constructor to create a  MilestoneStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MilestoneStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, MilestoneStatusObjectKeyData MilestoneStatusGetInIn) {
    super(id, context, "MilestoneStatusGet");
    MilestoneStatusGetIn = MilestoneStatusGetInIn;
  }

  public void translateToMap() {
    if (MilestoneStatusGetIn != null) {
      MilestoneStatusGetIn.resetFlags(true, true);
      addInput("MilestoneStatus", MilestoneStatusObjectKeyHelper.toMap(MilestoneStatusGetIn, new HashMap(), "MilestoneStatusObjectKeyData").get("MilestoneStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the MilestoneStatus
 * @param MilestoneStatusGetInIn Value of the MilestoneStatusGetIn
 *
 */

  public void setMilestoneStatus(MilestoneStatusObjectKeyData MilestoneStatusGetInIn) {
    MilestoneStatusGetIn = MilestoneStatusGetInIn;
  }

  public void translateFromMap() {
    MilestoneStatusGetIn = MilestoneStatusObjectKeyHelper.fromMap(inputMap, "MilestoneStatus");
  }

/**
 *
 * Gets the MilestoneStatus
 * @return Value of the MilestoneStatus
 *
 */

  public MilestoneStatusObjectKeyData getMilestoneStatus( ) {
    return MilestoneStatusGetIn;
  }

}
