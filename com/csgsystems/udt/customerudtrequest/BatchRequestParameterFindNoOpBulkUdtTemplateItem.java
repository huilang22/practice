/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParameterFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParameterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParameterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParameterObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParameterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParameterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParameterObjectDataList noOpInIn) {
    super(id, context, "BatchRequestParameterFind");
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
        mapArray[i] = BatchRequestParameterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestParameter", noOpIn);
      }
      addInput("BatchRequestParameter", mapList);
    }
  }
/**
 *
 * Sets the  BatchRequestParameter
 * @param noOpInIn BatchRequestParameterObjectDataList to set
 *
 */
  public void setBatchRequestParameter(BatchRequestParameterObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParameterObjectDataList getBatchRequestParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParameterObjectHelper.fromMapList(inputMap, "BatchRequestParameterList");
  }
}
