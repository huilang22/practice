/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowObjectData noOpIn;

/**
 *
 * Constructor to create a   WorkflowGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowObjectData noOpInIn) {
    super(id, context, "WorkflowGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Workflow", WorkflowObjectHelper.toMap(noOpIn, new HashMap(), "Workflow").get("Workflow"));
    }
  }
/**
 *
 * Sets the  Workflow
 * @param noOpInIn WorkflowObjectData to set
 *
 */
  public void setWorkflow(WorkflowObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Workflow passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowObjectData getWorkflow() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WorkflowObjectHelper.fromMap(inputMap, "Workflow");
  }
}
