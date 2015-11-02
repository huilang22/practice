/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransUpdateBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowTransUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowTransUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowTransObjectData WorkflowTransUpdateIn;
/**
 *
 * Constructor to create a  WorkflowTransUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowTransUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowTransObjectData WorkflowTransUpdateInIn) {
    super(id, context, "WorkflowTransUpdate");
    WorkflowTransUpdateIn = WorkflowTransUpdateInIn;
  }

  public void translateToMap() {
    if (WorkflowTransUpdateIn != null) {
      WorkflowTransUpdateIn.resetFlags(true, true);
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(WorkflowTransUpdateIn, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }


/**
 *
 * Sets the WorkflowTrans
 * @param WorkflowTransUpdateInIn Value of the WorkflowTransUpdateIn
 *
 */

  public void setWorkflowTrans(WorkflowTransObjectData WorkflowTransUpdateInIn) {
    WorkflowTransUpdateIn = WorkflowTransUpdateInIn;
  }

  public void translateFromMap() {
    WorkflowTransUpdateIn = WorkflowTransObjectHelper.fromMap(inputMap, "WorkflowTrans");
  }

/**
 *
 * Gets the WorkflowTrans
 * @return Value of the WorkflowTrans
 *
 */

  public WorkflowTransObjectData getWorkflowTrans( ) {
    return WorkflowTransUpdateIn;
  }

}
