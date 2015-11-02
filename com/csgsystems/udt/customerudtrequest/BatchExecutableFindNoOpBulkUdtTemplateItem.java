/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchExecutableFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchExecutableFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchExecutableObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchExecutableFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchExecutableFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableObjectDataList noOpInIn) {
    super(id, context, "BatchExecutableFind");
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
        mapArray[i] = BatchExecutableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchExecutable", noOpIn);
      }
      addInput("BatchExecutable", mapList);
    }
  }
/**
 *
 * Sets the  BatchExecutable
 * @param noOpInIn BatchExecutableObjectDataList to set
 *
 */
  public void setBatchExecutable(BatchExecutableObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchExecutable passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableObjectDataList getBatchExecutable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchExecutableObjectHelper.fromMapList(inputMap, "BatchExecutableList");
  }
}
