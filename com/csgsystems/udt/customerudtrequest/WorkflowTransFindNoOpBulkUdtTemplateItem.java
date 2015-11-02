/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowTransFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a WorkflowTransFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WorkflowTransFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WorkflowTransObjectDataList noOpIn;

/**
 *
 * Constructor to create a   WorkflowTransFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WorkflowTransFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkflowTransObjectDataList noOpInIn) {
    super(id, context, "WorkflowTransFind");
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
        mapArray[i] = WorkflowTransObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("WorkflowTrans", noOpIn);
      }
      addInput("WorkflowTrans", mapList);
    }
  }
/**
 *
 * Sets the  WorkflowTrans
 * @param noOpInIn WorkflowTransObjectDataList to set
 *
 */
  public void setWorkflowTrans(WorkflowTransObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the WorkflowTrans passed into the constructor
 * @return Simulated response
 *
 */
  public WorkflowTransObjectDataList getWorkflowTrans() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WorkflowTransObjectHelper.fromMapList(inputMap, "WorkflowTransList");
  }
}
