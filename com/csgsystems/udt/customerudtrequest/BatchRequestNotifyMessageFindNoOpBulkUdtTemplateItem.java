/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyMessageFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestNotifyMessageFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestNotifyMessageFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestNotifyMessageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchRequestNotifyMessageFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestNotifyMessageFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyMessageObjectDataList noOpInIn) {
    super(id, context, "BatchRequestNotifyMessageFind");
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
        mapArray[i] = BatchRequestNotifyMessageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestNotifyMessage", noOpIn);
      }
      addInput("BatchRequestNotifyMessage", mapList);
    }
  }
/**
 *
 * Sets the  BatchRequestNotifyMessage
 * @param noOpInIn BatchRequestNotifyMessageObjectDataList to set
 *
 */
  public void setBatchRequestNotifyMessage(BatchRequestNotifyMessageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestNotifyMessage passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyMessageObjectDataList getBatchRequestNotifyMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestNotifyMessageObjectHelper.fromMapList(inputMap, "BatchRequestNotifyMessageList");
  }
}
