/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransCreateBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowTransCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowTransCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowTransObjectData WorkflowTransCreateIn;
/**
 *
 * Constructor to create a  WorkflowTransCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowTransCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowTransObjectData WorkflowTransCreateInIn) {
    super(id, context, "WorkflowTransCreate");
    WorkflowTransCreateIn = WorkflowTransCreateInIn;
  }

  public void translateToMap() {
    if (WorkflowTransCreateIn != null) {
      WorkflowTransCreateIn.resetFlags(true, true);
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(WorkflowTransCreateIn, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }


/**
 *
 * Sets the WorkflowTrans
 * @param WorkflowTransCreateInIn Value of the WorkflowTransCreateIn
 *
 */

  public void setWorkflowTrans(WorkflowTransObjectData WorkflowTransCreateInIn) {
    WorkflowTransCreateIn = WorkflowTransCreateInIn;
  }

  public void translateFromMap() {
    WorkflowTransCreateIn = WorkflowTransObjectHelper.fromMap(inputMap, "WorkflowTrans");
  }

/**
 *
 * Gets the WorkflowTrans
 * @return Value of the WorkflowTrans
 *
 */

  public WorkflowTransObjectData getWorkflowTrans( ) {
    return WorkflowTransCreateIn;
  }

}
