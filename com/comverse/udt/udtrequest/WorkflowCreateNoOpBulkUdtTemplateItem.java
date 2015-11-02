/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowObjectData noOpIn;

/**
 *
 * Constructor to create a   WorkflowCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowObjectData noOpInIn) {
    super(id, context, "WorkflowCreate");
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
