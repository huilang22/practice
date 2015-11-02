/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestExecuteLogEntryCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestExecuteLogEntryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestExecuteLogEntryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestExecuteLogEntryObjectData batchRequestExecuteLogEntryCreateIn;
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestExecuteLogEntryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestExecuteLogEntryObjectData batchRequestExecuteLogEntryCreateInIn) {
    super(id, context, "BatchRequestExecuteLogEntryCreate");
    batchRequestExecuteLogEntryCreateIn = batchRequestExecuteLogEntryCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestExecuteLogEntryCreateIn != null) {
      batchRequestExecuteLogEntryCreateIn.resetFlags(true, true);
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(batchRequestExecuteLogEntryCreateIn, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }


/**
 *
 * Sets the BatchRequestExecuteLogEntry
 * @param batchRequestExecuteLogEntryCreateInIn Value of the batchRequestExecuteLogEntryCreateIn
 *
 */

  public void setBatchRequestExecuteLogEntry(BatchRequestExecuteLogEntryObjectData batchRequestExecuteLogEntryCreateInIn) {
    batchRequestExecuteLogEntryCreateIn = batchRequestExecuteLogEntryCreateInIn;
  }

  public void translateFromMap() {
    batchRequestExecuteLogEntryCreateIn = BatchRequestExecuteLogEntryObjectHelper.fromMap(inputMap, "BatchRequestExecuteLogEntry");
  }

/**
 *
 * Gets the BatchRequestExecuteLogEntry
 * @return Value of the BatchRequestExecuteLogEntry
 *
 */

  public BatchRequestExecuteLogEntryObjectData getBatchRequestExecuteLogEntry( ) {
    return batchRequestExecuteLogEntryCreateIn;
  }

}
