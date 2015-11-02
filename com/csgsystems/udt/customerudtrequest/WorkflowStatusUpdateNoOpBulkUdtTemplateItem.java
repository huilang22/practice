/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowStatusUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowStatusUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowStatusUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   WorkflowStatusUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowStatusUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowStatusObjectData noOpInIn) {
    super(id, context, "WorkflowStatusUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(noOpIn, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }
/**
 *
 * Sets the  WorkflowStatus
 * @param noOpInIn WorkflowStatusObjectData to set
 *
 */
  public void setWorkflowStatus(WorkflowStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the WorkflowStatus passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowStatusObjectData getWorkflowStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WorkflowStatusObjectHelper.fromMap(inputMap, "WorkflowStatus");
  }
}
