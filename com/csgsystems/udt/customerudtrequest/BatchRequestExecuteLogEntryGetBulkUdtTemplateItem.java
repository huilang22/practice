/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestExecuteLogEntryGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestExecuteLogEntryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestExecuteLogEntryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestExecuteLogEntryObjectKeyData batchRequestExecuteLogEntryGetIn;
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestExecuteLogEntryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestExecuteLogEntryObjectKeyData batchRequestExecuteLogEntryGetInIn) {
    super(id, context, "BatchRequestExecuteLogEntryGet");
    batchRequestExecuteLogEntryGetIn = batchRequestExecuteLogEntryGetInIn;
  }

  public void translateToMap() {
    if (batchRequestExecuteLogEntryGetIn != null) {
      batchRequestExecuteLogEntryGetIn.resetFlags(true, true);
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectKeyHelper.toMap(batchRequestExecuteLogEntryGetIn, new HashMap(), "BatchRequestExecuteLogEntryObjectKeyData").get("BatchRequestExecuteLogEntryObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestExecuteLogEntry
 * @param batchRequestExecuteLogEntryGetInIn Value of the batchRequestExecuteLogEntryGetIn
 *
 */

  public void setBatchRequestExecuteLogEntry(BatchRequestExecuteLogEntryObjectKeyData batchRequestExecuteLogEntryGetInIn) {
    batchRequestExecuteLogEntryGetIn = batchRequestExecuteLogEntryGetInIn;
  }

  public void translateFromMap() {
    batchRequestExecuteLogEntryGetIn = BatchRequestExecuteLogEntryObjectKeyHelper.fromMap(inputMap, "BatchRequestExecuteLogEntry");
  }

/**
 *
 * Gets the BatchRequestExecuteLogEntry
 * @return Value of the BatchRequestExecuteLogEntry
 *
 */

  public BatchRequestExecuteLogEntryObjectKeyData getBatchRequestExecuteLogEntry( ) {
    return batchRequestExecuteLogEntryGetIn;
  }

}
