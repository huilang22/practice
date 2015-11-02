/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestExecuteLogEntryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestExecuteLogEntryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestExecuteLogEntryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestExecuteLogEntryObjectData batchRequestExecuteLogEntryUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestExecuteLogEntryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestExecuteLogEntryObjectData batchRequestExecuteLogEntryUpdateInIn) {
    super(id, context, "BatchRequestExecuteLogEntryUpdate");
    batchRequestExecuteLogEntryUpdateIn = batchRequestExecuteLogEntryUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestExecuteLogEntryUpdateIn != null) {
      batchRequestExecuteLogEntryUpdateIn.resetFlags(true, true);
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(batchRequestExecuteLogEntryUpdateIn, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }


/**
 *
 * Sets the BatchRequestExecuteLogEntry
 * @param batchRequestExecuteLogEntryUpdateInIn Value of the batchRequestExecuteLogEntryUpdateIn
 *
 */

  public void setBatchRequestExecuteLogEntry(BatchRequestExecuteLogEntryObjectData batchRequestExecuteLogEntryUpdateInIn) {
    batchRequestExecuteLogEntryUpdateIn = batchRequestExecuteLogEntryUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestExecuteLogEntryUpdateIn = BatchRequestExecuteLogEntryObjectHelper.fromMap(inputMap, "BatchRequestExecuteLogEntry");
  }

/**
 *
 * Gets the BatchRequestExecuteLogEntry
 * @return Value of the BatchRequestExecuteLogEntry
 *
 */

  public BatchRequestExecuteLogEntryObjectData getBatchRequestExecuteLogEntry( ) {
    return batchRequestExecuteLogEntryUpdateIn;
  }

}
