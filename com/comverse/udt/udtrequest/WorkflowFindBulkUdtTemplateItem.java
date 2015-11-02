/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowFindBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowFindBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowObjectFilter WorkflowFindIn;
/**
 *
 * Constructor to create a  WorkflowFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowFindBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowObjectFilter WorkflowFindInIn) {
    super(id, context, "WorkflowFind");
    WorkflowFindIn = WorkflowFindInIn;
  }

  public void translateToMap() {
    if (WorkflowFindIn != null) {
      Integer index =  WorkflowFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Workflow", WorkflowObjectHelper.toMap(WorkflowFindIn, new HashMap(), "Workflow").get("Workflow"));
    }
  }


/**
 *
 * Sets the Workflow
 * @param WorkflowFindInIn Value of the WorkflowFindIn
 *
 */

  public void setWorkflow(WorkflowObjectFilter WorkflowFindInIn) {
    WorkflowFindIn = WorkflowFindInIn;
  }

  public void translateFromMap() {
    WorkflowFindIn = WorkflowObjectHelper.fromMapFilter(inputMap, "Workflow");
  }

/**
 *
 * Gets the Workflow
 * @return Value of the Workflow
 *
 */

  public WorkflowObjectFilter getWorkflow( ) {
    return WorkflowFindIn;
  }

}
