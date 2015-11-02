/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestExecuteLogEntryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestExecuteLogEntryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestExecuteLogEntryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestExecuteLogEntryObjectKeyData batchRequestExecuteLogEntryDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestExecuteLogEntryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestExecuteLogEntryObjectKeyData batchRequestExecuteLogEntryDeleteInIn) {
    super(id, context, "BatchRequestExecuteLogEntryDelete");
    batchRequestExecuteLogEntryDeleteIn = batchRequestExecuteLogEntryDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestExecuteLogEntryDeleteIn != null) {
      batchRequestExecuteLogEntryDeleteIn.resetFlags(true, true);
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectKeyHelper.toMap(batchRequestExecuteLogEntryDeleteIn, new HashMap(), "BatchRequestExecuteLogEntryObjectKeyData").get("BatchRequestExecuteLogEntryObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestExecuteLogEntry
 * @param batchRequestExecuteLogEntryDeleteInIn Value of the batchRequestExecuteLogEntryDeleteIn
 *
 */

  public void setBatchRequestExecuteLogEntry(BatchRequestExecuteLogEntryObjectKeyData batchRequestExecuteLogEntryDeleteInIn) {
    batchRequestExecuteLogEntryDeleteIn = batchRequestExecuteLogEntryDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestExecuteLogEntryDeleteIn = BatchRequestExecuteLogEntryObjectKeyHelper.fromMap(inputMap, "BatchRequestExecuteLogEntry");
  }

/**
 *
 * Gets the BatchRequestExecuteLogEntry
 * @return Value of the BatchRequestExecuteLogEntry
 *
 */

  public BatchRequestExecuteLogEntryObjectKeyData getBatchRequestExecuteLogEntry( ) {
    return batchRequestExecuteLogEntryDeleteIn;
  }

}
