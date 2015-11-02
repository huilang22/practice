/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowTransUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowTransUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowTransObjectData noOpIn;

/**
 *
 * Constructor to create a   WorkflowTransUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowTransUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowTransObjectData noOpInIn) {
    super(id, context, "WorkflowTransUpdate");
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
