/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkflowStatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   WorkflowStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowStatusObjectDataList noOpInIn) {
    super(id, context, "WorkflowStatusFind");
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
        mapArray[i] = WorkflowStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("WorkflowStatus", noOpIn);
      }
      addInput("WorkflowStatus", mapList);
    }
  }
/**
 *
 * Sets the  WorkflowStatus
 * @param noOpInIn WorkflowStatusObjectDataList to set
 *
 */
  public void setWorkflowStatus(WorkflowStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the WorkflowStatus passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowStatusObjectDataList getWorkflowStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WorkflowStatusObjectHelper.fromMapList(inputMap, "WorkflowStatusList");
  }
}
