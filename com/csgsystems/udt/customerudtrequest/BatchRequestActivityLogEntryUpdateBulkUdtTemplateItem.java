/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestActivityLogEntryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestActivityLogEntryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestActivityLogEntryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestActivityLogEntryObjectBaseData batchRequestActivityLogEntryUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestActivityLogEntryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestActivityLogEntryObjectBaseData batchRequestActivityLogEntryUpdateInIn) {
    super(id, context, "BatchRequestActivityLogEntryUpdate");
    batchRequestActivityLogEntryUpdateIn = batchRequestActivityLogEntryUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestActivityLogEntryUpdateIn != null) {
      batchRequestActivityLogEntryUpdateIn.resetFlags(true, true);
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseHelper.toMap(batchRequestActivityLogEntryUpdateIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }


/**
 *
 * Sets the BatchRequestActivityLogEntry
 * @param batchRequestActivityLogEntryUpdateInIn Value of the batchRequestActivityLogEntryUpdateIn
 *
 */

  public void setBatchRequestActivityLogEntry(BatchRequestActivityLogEntryObjectBaseData batchRequestActivityLogEntryUpdateInIn) {
    batchRequestActivityLogEntryUpdateIn = batchRequestActivityLogEntryUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestActivityLogEntryUpdateIn = BatchRequestActivityLogEntryObjectBaseHelper.fromMap(inputMap, "BatchRequestActivityLogEntry");
  }

/**
 *
 * Gets the BatchRequestActivityLogEntry
 * @return Value of the BatchRequestActivityLogEntry
 *
 */

  public BatchRequestActivityLogEntryObjectBaseData getBatchRequestActivityLogEntry( ) {
    return batchRequestActivityLogEntryUpdateIn;
  }

}
