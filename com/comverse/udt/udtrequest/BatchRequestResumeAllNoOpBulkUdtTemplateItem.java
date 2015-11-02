/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestResumeAllNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestResumeAllNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestResumeAllNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchRequestResumeAllNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestResumeAllNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectDataList noOpInIn) {
    super(id, context, "BatchRequestResumeAll");
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
