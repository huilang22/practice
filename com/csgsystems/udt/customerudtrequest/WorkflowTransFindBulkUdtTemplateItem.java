/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowTransFindBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowTransFindBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowTransFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowTransObjectFilter WorkflowTransFindIn;
/**
 *
 * Constructor to create a  WorkflowTransFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowTransFindBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowTransObjectFilter WorkflowTransFindInIn) {
    super(id, context, "WorkflowTransFind");
    WorkflowTransFindIn = WorkflowTransFindInIn;
  }

  public void translateToMap() {
    if (WorkflowTransFindIn != null) {
      Integer index =  WorkflowTransFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(WorkflowTransFindIn, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }


/**
 *
 * Sets the WorkflowTrans
 * @param WorkflowTransFindInIn Value of the WorkflowTransFindIn
 *
 */

  public void setWorkflowTrans(WorkflowTransObjectFilter WorkflowTransFindInIn) {
    WorkflowTransFindIn = WorkflowTransFindInIn;
  }

  public void translateFromMap() {
    WorkflowTransFindIn = WorkflowTransObjectHelper.fromMapFilter(inputMap, "WorkflowTrans");
  }

/**
 *
 * Gets the WorkflowTrans
 * @return Value of the WorkflowTrans
 *
 */

  public WorkflowTransObjectFilter getWorkflowTrans( ) {
    return WorkflowTransFindIn;
  }

}
