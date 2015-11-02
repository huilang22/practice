/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowUpdateBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowObjectData WorkflowUpdateIn;
/**
 *
 * Constructor to create a  WorkflowUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowObjectData WorkflowUpdateInIn) {
    super(id, context, "WorkflowUpdate");
    WorkflowUpdateIn = WorkflowUpdateInIn;
  }

  public void translateToMap() {
    if (WorkflowUpdateIn != null) {
      WorkflowUpdateIn.resetFlags(true, true);
      addInput("Workflow", WorkflowObjectHelper.toMap(WorkflowUpdateIn, new HashMap(), "Workflow").get("Workflow"));
    }
  }


/**
 *
 * Sets the Workflow
 * @param WorkflowUpdateInIn Value of the WorkflowUpdateIn
 *
 */

  public void setWorkflow(WorkflowObjectData WorkflowUpdateInIn) {
    WorkflowUpdateIn = WorkflowUpdateInIn;
  }

  public void translateFromMap() {
    WorkflowUpdateIn = WorkflowObjectHelper.fromMap(inputMap, "Workflow");
  }

/**
 *
 * Gets the Workflow
 * @return Value of the Workflow
 *
 */

  public WorkflowObjectData getWorkflow( ) {
    return WorkflowUpdateIn;
  }

}
