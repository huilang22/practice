/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowInstFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowInstFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowInstFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowInstObjectDataList noOpIn;

/**
 *
 * Constructor to create a   WorkflowInstFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowInstFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowInstObjectDataList noOpInIn) {
    super(id, context, "WorkflowInstFind");
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
        mapArray[i] = WorkflowInstObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("WorkflowInst", noOpIn);
      }
      addInput("WorkflowInst", mapList);
    }
  }
/**
 *
 * Sets the  WorkflowInst
 * @param noOpInIn WorkflowInstObjectDataList to set
 *
 */
  public void setWorkflowInst(WorkflowInstObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the WorkflowInst passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowInstObjectDataList getWorkflowInst() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WorkflowInstObjectHelper.fromMapList(inputMap, "WorkflowInstList");
  }
}
