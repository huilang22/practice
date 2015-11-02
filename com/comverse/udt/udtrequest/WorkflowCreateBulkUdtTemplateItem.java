/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowCreateBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowObjectData WorkflowCreateIn;
/**
 *
 * Constructor to create a  WorkflowCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowObjectData WorkflowCreateInIn) {
    super(id, context, "WorkflowCreate");
    WorkflowCreateIn = WorkflowCreateInIn;
  }

  public void translateToMap() {
    if (WorkflowCreateIn != null) {
      WorkflowCreateIn.resetFlags(true, true);
      addInput("Workflow", WorkflowObjectHelper.toMap(WorkflowCreateIn, new HashMap(), "Workflow").get("Workflow"));
    }
  }


/**
 *
 * Sets the Workflow
 * @param WorkflowCreateInIn Value of the WorkflowCreateIn
 *
 */

  public void setWorkflow(WorkflowObjectData WorkflowCreateInIn) {
    WorkflowCreateIn = WorkflowCreateInIn;
  }

  public void translateFromMap() {
    WorkflowCreateIn = WorkflowObjectHelper.fromMap(inputMap, "Workflow");
  }

/**
 *
 * Gets the Workflow
 * @return Value of the Workflow
 *
 */

  public WorkflowObjectData getWorkflow( ) {
    return WorkflowCreateIn;
  }

}
