/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ValidMilestoneStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ValidMilestoneStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ValidMilestoneStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   ValidMilestoneStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ValidMilestoneStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ValidMilestoneStatusObjectData noOpInIn) {
    super(id, context, "ValidMilestoneStatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(noOpIn, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }
/**
 *
 * Sets the  ValidMilestoneStatus
 * @param noOpInIn ValidMilestoneStatusObjectData to set
 *
 */
  public void setValidMilestoneStatus(ValidMilestoneStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ValidMilestoneStatus passed into the constructor
 * @return Simulated response
 *
 */
  public ValidMilestoneStatusObjectData getValidMilestoneStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ValidMilestoneStatusObjectHelper.fromMap(inputMap, "ValidMilestoneStatus");
  }
}
