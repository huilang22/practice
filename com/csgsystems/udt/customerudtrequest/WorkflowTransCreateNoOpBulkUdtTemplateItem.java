/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowTransCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowTransCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowTransCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowTransObjectData noOpIn;

/**
 *
 * Constructor to create a   WorkflowTransCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowTransCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowTransObjectData noOpInIn) {
    super(id, context, "WorkflowTransCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(noOpIn, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }
/**
 *
 * Sets the  WorkflowTrans
 * @param noOpInIn WorkflowTransObjectData to set
 *
 */
  public void setWorkflowTrans(WorkflowTransObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the WorkflowTrans passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowTransObjectData getWorkflowTrans() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WorkflowTransObjectHelper.fromMap(inputMap, "WorkflowTrans");
  }
}
