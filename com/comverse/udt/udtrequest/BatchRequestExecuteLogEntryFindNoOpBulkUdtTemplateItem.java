/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestExecuteLogEntryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestExecuteLogEntryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestExecuteLogEntryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestExecuteLogEntryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchRequestExecuteLogEntryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestExecuteLogEntryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestExecuteLogEntryObjectDataList noOpInIn) {
    super(id, context, "BatchRequestExecuteLogEntryFind");
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
        mapArray[i] = BatchRequestExecuteLogEntryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestExecuteLogEntry", noOpIn);
      }
      addInput("BatchRequestExecuteLogEntry", mapList);
    }
  }
/**
 *
 * Sets the  BatchRequestExecuteLogEntry
 * @param noOpInIn BatchRequestExecuteLogEntryObjectDataList to set
 *
 */
  public void setBatchRequestExecuteLogEntry(BatchRequestExecuteLogEntryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestExecuteLogEntry passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestExecuteLogEntryObjectDataList getBatchRequestExecuteLogEntry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestExecuteLogEntryObjectHelper.fromMapList(inputMap, "BatchRequestExecuteLogEntryList");
  }
}
