/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowInstUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a WorkflowInstUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowInstUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowInstObjectData WorkflowInstUpdateIn;
/**
 *
 * Constructor to create a  WorkflowInstUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowInstUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowInstObjectData WorkflowInstUpdateInIn) {
    super(id, context, "WorkflowInstUpdate");
    WorkflowInstUpdateIn = WorkflowInstUpdateInIn;
  }

  public void translateToMap() {
    if (WorkflowInstUpdateIn != null) {
      WorkflowInstUpdateIn.resetFlags(true, true);
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(WorkflowInstUpdateIn, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }


/**
 *
 * Sets the WorkflowInst
 * @param WorkflowInstUpdateInIn Value of the WorkflowInstUpdateIn
 *
 */

  public void setWorkflowInst(WorkflowInstObjectData WorkflowInstUpdateInIn) {
    WorkflowInstUpdateIn = WorkflowInstUpdateInIn;
  }

  public void translateFromMap() {
    WorkflowInstUpdateIn = WorkflowInstObjectHelper.fromMap(inputMap, "WorkflowInst");
  }

/**
 *
 * Gets the WorkflowInst
 * @return Value of the WorkflowInst
 *
 */

  public WorkflowInstObjectData getWorkflowInst( ) {
    return WorkflowInstUpdateIn;
  }

}
