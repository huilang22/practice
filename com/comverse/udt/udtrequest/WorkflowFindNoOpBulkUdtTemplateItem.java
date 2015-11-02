/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowObjectDataList noOpIn;

/**
 *
 * Constructor to create a   WorkflowFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowObjectDataList noOpInIn) {
    super(id, context, "WorkflowFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = WorkflowObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Workflow", noOpIn);
      }
      addInput("Workflow", mapList);
    }
  }
/**
 *
 * Sets the  Workflow
 * @param noOpInIn WorkflowObjectDataList to set
 *
 */
  public void setWorkflow(WorkflowObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Workflow passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowObjectDataList getWorkflow() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WorkflowObjectHelper.fromMapList(inputMap, "WorkflowList");
  }
}
