/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowInstFindBulkUdtTemplateItem.java
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
 * Class used to create a WorkflowInstFindBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkflowInstFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkflowInstObjectFilter WorkflowInstFindIn;
/**
 *
 * Constructor to create a  WorkflowInstFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkflowInstFindBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowInstObjectFilter WorkflowInstFindInIn) {
    super(id, context, "WorkflowInstFind");
    WorkflowInstFindIn = WorkflowInstFindInIn;
  }

  public void translateToMap() {
    if (WorkflowInstFindIn != null) {
      Integer index =  WorkflowInstFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(WorkflowInstFindIn, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }


/**
 *
 * Sets the WorkflowInst
 * @param WorkflowInstFindInIn Value of the WorkflowInstFindIn
 *
 */

  public void setWorkflowInst(WorkflowInstObjectFilter WorkflowInstFindInIn) {
    WorkflowInstFindIn = WorkflowInstFindInIn;
  }

  public void translateFromMap() {
    WorkflowInstFindIn = WorkflowInstObjectHelper.fromMapFilter(inputMap, "WorkflowInst");
  }

/**
 *
 * Gets the WorkflowInst
 * @return Value of the WorkflowInst
 *
 */

  public WorkflowInstObjectFilter getWorkflowInst( ) {
    return WorkflowInstFindIn;
  }

}
