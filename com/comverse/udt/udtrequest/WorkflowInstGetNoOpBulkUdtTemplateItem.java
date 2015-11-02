/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowInstGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowInstGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowInstObjectData noOpIn;

/**
 *
 * Constructor to create a   WorkflowInstGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowInstGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowInstObjectData noOpInIn) {
    super(id, context, "WorkflowInstGet");
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
