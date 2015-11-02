/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowTransGetBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowTransGetBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowTransGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowTransObjectKeyData WorkflowTransGetIn;
/**
 *
 * Constructor to create a  WorkflowTransGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowTransGetBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowTransObjectKeyData WorkflowTransGetInIn) {
    super(id, context, "WorkflowTransGet");
    WorkflowTransGetIn = WorkflowTransGetInIn;
  }

  public void translateToMap() {
    if (WorkflowTransGetIn != null) {
      WorkflowTransGetIn.resetFlags(true, true);
      addInput("WorkflowTrans", WorkflowTransObjectKeyHelper.toMap(WorkflowTransGetIn, new HashMap(), "WorkflowTransObjectKeyData").get("WorkflowTransObjectKeyData"));
    }
  }


/**
 *
 * Sets the WorkflowTrans
 * @param WorkflowTransGetInIn Value of the WorkflowTransGetIn
 *
 */

  public void setWorkflowTrans(WorkflowTransObjectKeyData WorkflowTransGetInIn) {
    WorkflowTransGetIn = WorkflowTransGetInIn;
  }

  public void translateFromMap() {
    WorkflowTransGetIn = WorkflowTransObjectKeyHelper.fromMap(inputMap, "WorkflowTrans");
  }

/**
 *
 * Gets the WorkflowTrans
 * @return Value of the WorkflowTrans
 *
 */

  public WorkflowTransObjectKeyData getWorkflowTrans( ) {
    return WorkflowTransGetIn;
  }

}
