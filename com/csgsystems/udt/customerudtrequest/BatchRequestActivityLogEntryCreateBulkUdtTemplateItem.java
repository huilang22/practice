/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestActivityLogEntryCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestActivityLogEntryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestActivityLogEntryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestActivityLogEntryObjectBaseData batchRequestActivityLogEntryCreateIn;
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestActivityLogEntryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestActivityLogEntryObjectBaseData batchRequestActivityLogEntryCreateInIn) {
    super(id, context, "BatchRequestActivityLogEntryCreate");
    batchRequestActivityLogEntryCreateIn = batchRequestActivityLogEntryCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestActivityLogEntryCreateIn != null) {
      batchRequestActivityLogEntryCreateIn.resetFlags(true, true);
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseHelper.toMap(batchRequestActivityLogEntryCreateIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }


/**
 *
 * Sets the BatchRequestActivityLogEntry
 * @param batchRequestActivityLogEntryCreateInIn Value of the batchRequestActivityLogEntryCreateIn
 *
 */

  public void setBatchRequestActivityLogEntry(BatchRequestActivityLogEntryObjectBaseData batchRequestActivityLogEntryCreateInIn) {
    batchRequestActivityLogEntryCreateIn = batchRequestActivityLogEntryCreateInIn;
  }

  public void translateFromMap() {
    batchRequestActivityLogEntryCreateIn = BatchRequestActivityLogEntryObjectBaseHelper.fromMap(inputMap, "BatchRequestActivityLogEntry");
  }

/**
 *
 * Gets the BatchRequestActivityLogEntry
 * @return Value of the BatchRequestActivityLogEntry
 *
 */

  public BatchRequestActivityLogEntryObjectBaseData getBatchRequestActivityLogEntry( ) {
    return batchRequestActivityLogEntryCreateIn;
  }

}
