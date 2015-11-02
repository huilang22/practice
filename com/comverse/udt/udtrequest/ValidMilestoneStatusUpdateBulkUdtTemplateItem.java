/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ValidMilestoneStatusUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ValidMilestoneStatusUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ValidMilestoneStatusObjectData ValidMilestoneStatusUpdateIn;
/**
 *
 * Constructor to create a  ValidMilestoneStatusUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ValidMilestoneStatusUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ValidMilestoneStatusObjectData ValidMilestoneStatusUpdateInIn) {
    super(id, context, "ValidMilestoneStatusUpdate");
    ValidMilestoneStatusUpdateIn = ValidMilestoneStatusUpdateInIn;
  }

  public void translateToMap() {
    if (ValidMilestoneStatusUpdateIn != null) {
      ValidMilestoneStatusUpdateIn.resetFlags(true, true);
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(ValidMilestoneStatusUpdateIn, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }


/**
 *
 * Sets the ValidMilestoneStatus
 * @param ValidMilestoneStatusUpdateInIn Value of the ValidMilestoneStatusUpdateIn
 *
 */

  public void setValidMilestoneStatus(ValidMilestoneStatusObjectData ValidMilestoneStatusUpdateInIn) {
    ValidMilestoneStatusUpdateIn = ValidMilestoneStatusUpdateInIn;
  }

  public void translateFromMap() {
    ValidMilestoneStatusUpdateIn = ValidMilestoneStatusObjectHelper.fromMap(inputMap, "ValidMilestoneStatus");
  }

/**
 *
 * Gets the ValidMilestoneStatus
 * @return Value of the ValidMilestoneStatus
 *
 */

  public ValidMilestoneStatusObjectData getValidMilestoneStatus( ) {
    return ValidMilestoneStatusUpdateIn;
  }

}
