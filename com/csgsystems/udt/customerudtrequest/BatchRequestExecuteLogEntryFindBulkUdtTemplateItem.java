/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestExecuteLogEntryFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestExecuteLogEntryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestExecuteLogEntryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestExecuteLogEntryObjectFilter batchRequestExecuteLogEntryFindIn;
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestExecuteLogEntryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestExecuteLogEntryObjectFilter batchRequestExecuteLogEntryFindInIn) {
    super(id, context, "BatchRequestExecuteLogEntryFind");
    batchRequestExecuteLogEntryFindIn = batchRequestExecuteLogEntryFindInIn;
  }

  public void translateToMap() {
    if (batchRequestExecuteLogEntryFindIn != null) {
      Integer index =  batchRequestExecuteLogEntryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(batchRequestExecuteLogEntryFindIn, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }


/**
 *
 * Sets the BatchRequestExecuteLogEntry
 * @param batchRequestExecuteLogEntryFindInIn Value of the batchRequestExecuteLogEntryFindIn
 *
 */

  public void setBatchRequestExecuteLogEntry(BatchRequestExecuteLogEntryObjectFilter batchRequestExecuteLogEntryFindInIn) {
    batchRequestExecuteLogEntryFindIn = batchRequestExecuteLogEntryFindInIn;
  }

  public void translateFromMap() {
    batchRequestExecuteLogEntryFindIn = BatchRequestExecuteLogEntryObjectHelper.fromMapFilter(inputMap, "BatchRequestExecuteLogEntry");
  }

/**
 *
 * Gets the BatchRequestExecuteLogEntry
 * @return Value of the BatchRequestExecuteLogEntry
 *
 */

  public BatchRequestExecuteLogEntryObjectFilter getBatchRequestExecuteLogEntry( ) {
    return batchRequestExecuteLogEntryFindIn;
  }

}
