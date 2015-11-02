/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableEnvironmentalVariableFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchExecutableEnvironmentalVariableFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchExecutableEnvironmentalVariableFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchExecutableEnvironmentalVariableObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchExecutableEnvironmentalVariableFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchExecutableEnvironmentalVariableFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableEnvironmentalVariableObjectDataList noOpInIn) {
    super(id, context, "BatchExecutableEnvironmentalVariableFind");
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
        mapArray[i] = BatchExecutableEnvironmentalVariableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchExecutableEnvironmentalVariable", noOpIn);
      }
      addInput("BatchExecutableEnvironmentalVariable", mapList);
    }
  }
/**
 *
 * Sets the  BatchExecutableEnvironmentalVariable
 * @param noOpInIn BatchExecutableEnvironmentalVariableObjectDataList to set
 *
 */
  public void setBatchExecutableEnvironmentalVariable(BatchExecutableEnvironmentalVariableObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchExecutableEnvironmentalVariable passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableEnvironmentalVariableObjectDataList getBatchExecutableEnvironmentalVariable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchExecutableEnvironmentalVariableObjectHelper.fromMapList(inputMap, "BatchExecutableEnvironmentalVariableList");
  }
}
