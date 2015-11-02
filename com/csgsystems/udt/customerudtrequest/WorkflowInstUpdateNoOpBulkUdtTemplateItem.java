/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowInstUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowInstUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowInstUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowInstObjectData noOpIn;

/**
 *
 * Constructor to create a   WorkflowInstUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowInstUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowInstObjectData noOpInIn) {
    super(id, context, "WorkflowInstUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(noOpIn, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }
/**
 *
 * Sets the  WorkflowInst
 * @param noOpInIn WorkflowInstObjectData to set
 *
 */
  public void setWorkflowInst(WorkflowInstObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the WorkflowInst passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowInstObjectData getWorkflowInst() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WorkflowInstObjectHelper.fromMap(inputMap, "WorkflowInst");
  }
}
