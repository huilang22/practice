/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowGetBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowGetBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowObjectKeyData WorkflowGetIn;
/**
 *
 * Constructor to create a  WorkflowGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowGetBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowObjectKeyData WorkflowGetInIn) {
    super(id, context, "WorkflowGet");
    WorkflowGetIn = WorkflowGetInIn;
  }

  public void translateToMap() {
    if (WorkflowGetIn != null) {
      WorkflowGetIn.resetFlags(true, true);
      addInput("Workflow", WorkflowObjectKeyHelper.toMap(WorkflowGetIn, new HashMap(), "WorkflowObjectKeyData").get("WorkflowObjectKeyData"));
    }
  }


/**
 *
 * Sets the Workflow
 * @param WorkflowGetInIn Value of the WorkflowGetIn
 *
 */

  public void setWorkflow(WorkflowObjectKeyData WorkflowGetInIn) {
    WorkflowGetIn = WorkflowGetInIn;
  }

  public void translateFromMap() {
    WorkflowGetIn = WorkflowObjectKeyHelper.fromMap(inputMap, "Workflow");
  }

/**
 *
 * Gets the Workflow
 * @return Value of the Workflow
 *
 */

  public WorkflowObjectKeyData getWorkflow( ) {
    return WorkflowGetIn;
  }

}
