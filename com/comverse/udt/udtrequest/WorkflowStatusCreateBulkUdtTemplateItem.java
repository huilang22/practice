/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusCreateBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowStatusCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowStatusCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowStatusObjectData WorkflowStatusCreateIn;
/**
 *
 * Constructor to create a  WorkflowStatusCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowStatusCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowStatusObjectData WorkflowStatusCreateInIn) {
    super(id, context, "WorkflowStatusCreate");
    WorkflowStatusCreateIn = WorkflowStatusCreateInIn;
  }

  public void translateToMap() {
    if (WorkflowStatusCreateIn != null) {
      WorkflowStatusCreateIn.resetFlags(true, true);
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(WorkflowStatusCreateIn, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }


/**
 *
 * Sets the WorkflowStatus
 * @param WorkflowStatusCreateInIn Value of the WorkflowStatusCreateIn
 *
 */

  public void setWorkflowStatus(WorkflowStatusObjectData WorkflowStatusCreateInIn) {
    WorkflowStatusCreateIn = WorkflowStatusCreateInIn;
  }

  public void translateFromMap() {
    WorkflowStatusCreateIn = WorkflowStatusObjectHelper.fromMap(inputMap, "WorkflowStatus");
  }

/**
 *
 * Gets the WorkflowStatus
 * @return Value of the WorkflowStatus
 *
 */

  public WorkflowStatusObjectData getWorkflowStatus( ) {
    return WorkflowStatusCreateIn;
  }

}
