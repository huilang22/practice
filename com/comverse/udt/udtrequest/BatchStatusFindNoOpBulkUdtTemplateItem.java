/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchStatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchStatusObjectDataList noOpInIn) {
    super(id, context, "BatchStatusFind");
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
        mapArray[i] = BatchStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchStatus", noOpIn);
      }
      addInput("BatchStatus", mapList);
    }
  }
/**
 *
 * Sets the  BatchStatus
 * @param noOpInIn BatchStatusObjectDataList to set
 *
 */
  public void setBatchStatus(BatchStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchStatus passed into the constructor
 * @return Simulated response
 *
 */
  public BatchStatusObjectDataList getBatchStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchStatusObjectHelper.fromMapList(inputMap, "BatchStatusList");
  }
}
