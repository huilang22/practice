/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestActivityLogEntryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestActivityLogEntryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestActivityLogEntryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestActivityLogEntryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchRequestActivityLogEntryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestActivityLogEntryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestActivityLogEntryObjectDataList noOpInIn) {
    super(id, context, "BatchRequestActivityLogEntryFind");
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
        mapArray[i] = BatchRequestActivityLogEntryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestActivityLogEntry", noOpIn);
      }
      addInput("BatchRequestActivityLogEntry", mapList);
    }
  }
/**
 *
 * Sets the  BatchRequestActivityLogEntry
 * @param noOpInIn BatchRequestActivityLogEntryObjectDataList to set
 *
 */
  public void setBatchRequestActivityLogEntry(BatchRequestActivityLogEntryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestActivityLogEntry passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestActivityLogEntryObjectDataList getBatchRequestActivityLogEntry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestActivityLogEntryObjectHelper.fromMapList(inputMap, "BatchRequestActivityLogEntryList");
  }
}
