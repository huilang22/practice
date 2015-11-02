/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowStatusObjectFilter WorkflowStatusFindIn;
/**
 *
 * Constructor to create a  WorkflowStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowStatusObjectFilter WorkflowStatusFindInIn) {
    super(id, context, "WorkflowStatusFind");
    WorkflowStatusFindIn = WorkflowStatusFindInIn;
  }

  public void translateToMap() {
    if (WorkflowStatusFindIn != null) {
      Integer index =  WorkflowStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(WorkflowStatusFindIn, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }


/**
 *
 * Sets the WorkflowStatus
 * @param WorkflowStatusFindInIn Value of the WorkflowStatusFindIn
 *
 */

  public void setWorkflowStatus(WorkflowStatusObjectFilter WorkflowStatusFindInIn) {
    WorkflowStatusFindIn = WorkflowStatusFindInIn;
  }

  public void translateFromMap() {
    WorkflowStatusFindIn = WorkflowStatusObjectHelper.fromMapFilter(inputMap, "WorkflowStatus");
  }

/**
 *
 * Gets the WorkflowStatus
 * @return Value of the WorkflowStatus
 *
 */

  public WorkflowStatusObjectFilter getWorkflowStatus( ) {
    return WorkflowStatusFindIn;
  }

}
