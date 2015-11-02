/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusUpdateBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowStatusUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowStatusUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowStatusObjectData WorkflowStatusUpdateIn;
/**
 *
 * Constructor to create a  WorkflowStatusUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowStatusUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowStatusObjectData WorkflowStatusUpdateInIn) {
    super(id, context, "WorkflowStatusUpdate");
    WorkflowStatusUpdateIn = WorkflowStatusUpdateInIn;
  }

  public void translateToMap() {
    if (WorkflowStatusUpdateIn != null) {
      WorkflowStatusUpdateIn.resetFlags(true, true);
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(WorkflowStatusUpdateIn, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }


/**
 *
 * Sets the WorkflowStatus
 * @param WorkflowStatusUpdateInIn Value of the WorkflowStatusUpdateIn
 *
 */

  public void setWorkflowStatus(WorkflowStatusObjectData WorkflowStatusUpdateInIn) {
    WorkflowStatusUpdateIn = WorkflowStatusUpdateInIn;
  }

  public void translateFromMap() {
    WorkflowStatusUpdateIn = WorkflowStatusObjectHelper.fromMap(inputMap, "WorkflowStatus");
  }

/**
 *
 * Gets the WorkflowStatus
 * @return Value of the WorkflowStatus
 *
 */

  public WorkflowStatusObjectData getWorkflowStatus( ) {
    return WorkflowStatusUpdateIn;
  }

}
