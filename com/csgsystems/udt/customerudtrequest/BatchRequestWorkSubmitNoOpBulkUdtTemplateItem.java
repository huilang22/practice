/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestWorkSubmitNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestWorkSubmitNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestWorkSubmitNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchRequestWorkSubmitNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestWorkSubmitNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectDataList noOpInIn) {
    super(id, context, "BatchRequestWorkSubmit");
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
        mapArray[i] = BatchRequestObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequest", noOpIn);
      }
      addInput("BatchRequest", mapList);
    }
  }
/**
 *
 * Sets the  BatchRequest
 * @param noOpInIn BatchRequestObjectDataList to set
 *
 */
  public void setBatchRequest(BatchRequestObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequest passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestObjectDataList getBatchRequest() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestObjectHelper.fromMapList(inputMap, "BatchRequestList");
  }
}
