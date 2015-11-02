/*
 * Generated code DO NOT EDIT
 * Generated file: ValidMilestoneStatusCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ValidMilestoneStatusCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ValidMilestoneStatusCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ValidMilestoneStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   ValidMilestoneStatusCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ValidMilestoneStatusCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ValidMilestoneStatusObjectData noOpInIn) {
    super(id, context, "ValidMilestoneStatusCreate");
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
