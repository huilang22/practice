/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestActivityLogEntryGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestActivityLogEntryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestActivityLogEntryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestActivityLogEntryObjectBaseKeyData batchRequestActivityLogEntryGetIn;
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestActivityLogEntryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestActivityLogEntryObjectBaseKeyData batchRequestActivityLogEntryGetInIn) {
    super(id, context, "BatchRequestActivityLogEntryGet");
    batchRequestActivityLogEntryGetIn = batchRequestActivityLogEntryGetInIn;
  }

  public void translateToMap() {
    if (batchRequestActivityLogEntryGetIn != null) {
      batchRequestActivityLogEntryGetIn.resetFlags(true, true);
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseKeyHelper.toMap(batchRequestActivityLogEntryGetIn, new HashMap(), "BatchRequestActivityLogEntryObjectBaseKeyData").get("BatchRequestActivityLogEntryObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestActivityLogEntry
 * @param batchRequestActivityLogEntryGetInIn Value of the batchRequestActivityLogEntryGetIn
 *
 */

  public void setBatchRequestActivityLogEntry(BatchRequestActivityLogEntryObjectBaseKeyData batchRequestActivityLogEntryGetInIn) {
    batchRequestActivityLogEntryGetIn = batchRequestActivityLogEntryGetInIn;
  }

  public void translateFromMap() {
    batchRequestActivityLogEntryGetIn = BatchRequestActivityLogEntryObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestActivityLogEntry");
  }

/**
 *
 * Gets the BatchRequestActivityLogEntry
 * @return Value of the BatchRequestActivityLogEntry
 *
 */

  public BatchRequestActivityLogEntryObjectBaseKeyData getBatchRequestActivityLogEntry( ) {
    return batchRequestActivityLogEntryGetIn;
  }

}
