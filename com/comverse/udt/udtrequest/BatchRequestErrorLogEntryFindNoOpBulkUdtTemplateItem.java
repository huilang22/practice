/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestErrorLogEntryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestErrorLogEntryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestErrorLogEntryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchRequestErrorLogEntryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestErrorLogEntryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectDataList noOpInIn) {
    super(id, context, "BatchRequestErrorLogEntryFind");
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
        mapArray[i] = BatchRequestErrorLogEntryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestErrorLogEntry", noOpIn);
      }
      addInput("BatchRequestErrorLogEntry", mapList);
    }
  }
/**
 *
 * Sets the  BatchRequestErrorLogEntry
 * @param noOpInIn BatchRequestErrorLogEntryObjectDataList to set
 *
 */
  public void setBatchRequestErrorLogEntry(BatchRequestErrorLogEntryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestErrorLogEntry passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestErrorLogEntryObjectDataList getBatchRequestErrorLogEntry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestErrorLogEntryObjectHelper.fromMapList(inputMap, "BatchRequestErrorLogEntryList");
  }
}
