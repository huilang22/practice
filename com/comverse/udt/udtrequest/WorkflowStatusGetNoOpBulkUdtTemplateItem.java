/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   WorkflowStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowStatusObjectData noOpInIn) {
    super(id, context, "WorkflowStatusGet");
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
