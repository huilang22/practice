/*
 * Generated code DO NOT EDIT
 * Generated file: ValidMilestoneStatusCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a ValidMilestoneStatusCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ValidMilestoneStatusCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ValidMilestoneStatusObjectData ValidMilestoneStatusCreateIn;
/**
 *
 * Constructor to create a  ValidMilestoneStatusCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ValidMilestoneStatusCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ValidMilestoneStatusObjectData ValidMilestoneStatusCreateInIn) {
    super(id, context, "ValidMilestoneStatusCreate");
    ValidMilestoneStatusCreateIn = ValidMilestoneStatusCreateInIn;
  }

  public void translateToMap() {
    if (ValidMilestoneStatusCreateIn != null) {
      ValidMilestoneStatusCreateIn.resetFlags(true, true);
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(ValidMilestoneStatusCreateIn, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }


/**
 *
 * Sets the ValidMilestoneStatus
 * @param ValidMilestoneStatusCreateInIn Value of the ValidMilestoneStatusCreateIn
 *
 */

  public void setValidMilestoneStatus(ValidMilestoneStatusObjectData ValidMilestoneStatusCreateInIn) {
    ValidMilestoneStatusCreateIn = ValidMilestoneStatusCreateInIn;
  }

  public void translateFromMap() {
    ValidMilestoneStatusCreateIn = ValidMilestoneStatusObjectHelper.fromMap(inputMap, "ValidMilestoneStatus");
  }

/**
 *
 * Gets the ValidMilestoneStatus
 * @return Value of the ValidMilestoneStatus
 *
 */

  public ValidMilestoneStatusObjectData getValidMilestoneStatus( ) {
    return ValidMilestoneStatusCreateIn;
  }

}
