/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowStatusObjectKeyData WorkflowStatusGetIn;
/**
 *
 * Constructor to create a  WorkflowStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowStatusObjectKeyData WorkflowStatusGetInIn) {
    super(id, context, "WorkflowStatusGet");
    WorkflowStatusGetIn = WorkflowStatusGetInIn;
  }

  public void translateToMap() {
    if (WorkflowStatusGetIn != null) {
      WorkflowStatusGetIn.resetFlags(true, true);
      addInput("WorkflowStatus", WorkflowStatusObjectKeyHelper.toMap(WorkflowStatusGetIn, new HashMap(), "WorkflowStatusObjectKeyData").get("WorkflowStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the WorkflowStatus
 * @param WorkflowStatusGetInIn Value of the WorkflowStatusGetIn
 *
 */

  public void setWorkflowStatus(WorkflowStatusObjectKeyData WorkflowStatusGetInIn) {
    WorkflowStatusGetIn = WorkflowStatusGetInIn;
  }

  public void translateFromMap() {
    WorkflowStatusGetIn = WorkflowStatusObjectKeyHelper.fromMap(inputMap, "WorkflowStatus");
  }

/**
 *
 * Gets the WorkflowStatus
 * @return Value of the WorkflowStatus
 *
 */

  public WorkflowStatusObjectKeyData getWorkflowStatus( ) {
    return WorkflowStatusGetIn;
  }

}
