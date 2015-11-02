/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowInstGetBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowInstGetBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowInstGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowInstObjectKeyData WorkflowInstGetIn;
/**
 *
 * Constructor to create a  WorkflowInstGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowInstGetBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowInstObjectKeyData WorkflowInstGetInIn) {
    super(id, context, "WorkflowInstGet");
    WorkflowInstGetIn = WorkflowInstGetInIn;
  }

  public void translateToMap() {
    if (WorkflowInstGetIn != null) {
      WorkflowInstGetIn.resetFlags(true, true);
      addInput("WorkflowInst", WorkflowInstObjectKeyHelper.toMap(WorkflowInstGetIn, new HashMap(), "WorkflowInstObjectKeyData").get("WorkflowInstObjectKeyData"));
    }
  }


/**
 *
 * Sets the WorkflowInst
 * @param WorkflowInstGetInIn Value of the WorkflowInstGetIn
 *
 */

  public void setWorkflowInst(WorkflowInstObjectKeyData WorkflowInstGetInIn) {
    WorkflowInstGetIn = WorkflowInstGetInIn;
  }

  public void translateFromMap() {
    WorkflowInstGetIn = WorkflowInstObjectKeyHelper.fromMap(inputMap, "WorkflowInst");
  }

/**
 *
 * Gets the WorkflowInst
 * @return Value of the WorkflowInst
 *
 */

  public WorkflowInstObjectKeyData getWorkflowInst( ) {
    return WorkflowInstGetIn;
  }

}
