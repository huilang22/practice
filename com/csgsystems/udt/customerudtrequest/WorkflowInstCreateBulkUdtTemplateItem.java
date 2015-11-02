/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowInstCreateBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowInstCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowInstCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowInstObjectData wfiCrIn;
/**
 *
 * Constructor to create a  WorkflowInstCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowInstCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowInstObjectData wfiCrInIn) {
    super(id, context, "WorkflowInstCreate");
    wfiCrIn = wfiCrInIn;
  }

  public void translateToMap() {
    if (wfiCrIn != null) {
      wfiCrIn.resetFlags(true, true);
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(wfiCrIn, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }


/**
 *
 * Sets the WorkflowInst
 * @param wfiCrInIn Value of the wfiCrIn
 *
 */

  public void setWorkflowInst(WorkflowInstObjectData wfiCrInIn) {
    wfiCrIn = wfiCrInIn;
  }

  public void translateFromMap() {
    wfiCrIn = WorkflowInstObjectHelper.fromMap(inputMap, "WorkflowInst");
  }

/**
 *
 * Gets the WorkflowInst
 * @return Value of the WorkflowInst
 *
 */

  public WorkflowInstObjectData getWorkflowInst( ) {
    return wfiCrIn;
  }

}
