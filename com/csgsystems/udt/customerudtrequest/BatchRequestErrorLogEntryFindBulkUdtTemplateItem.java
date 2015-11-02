/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestErrorLogEntryFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestErrorLogEntryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestErrorLogEntryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestErrorLogEntryObjectFilter batchRequestErrorLogEntryFindIn;
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestErrorLogEntryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectFilter batchRequestErrorLogEntryFindInIn) {
    super(id, context, "BatchRequestErrorLogEntryFind");
    batchRequestErrorLogEntryFindIn = batchRequestErrorLogEntryFindInIn;
  }

  public void translateToMap() {
    if (batchRequestErrorLogEntryFindIn != null) {
      Integer index =  batchRequestErrorLogEntryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectHelper.toMap(batchRequestErrorLogEntryFindIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }


/**
 *
 * Sets the BatchRequestErrorLogEntry
 * @param batchRequestErrorLogEntryFindInIn Value of the batchRequestErrorLogEntryFindIn
 *
 */

  public void setBatchRequestErrorLogEntry(BatchRequestErrorLogEntryObjectFilter batchRequestErrorLogEntryFindInIn) {
    batchRequestErrorLogEntryFindIn = batchRequestErrorLogEntryFindInIn;
  }

  public void translateFromMap() {
    batchRequestErrorLogEntryFindIn = BatchRequestErrorLogEntryObjectHelper.fromMapFilter(inputMap, "BatchRequestErrorLogEntry");
  }

/**
 *
 * Gets the BatchRequestErrorLogEntry
 * @return Value of the BatchRequestErrorLogEntry
 *
 */

  public BatchRequestErrorLogEntryObjectFilter getBatchRequestErrorLogEntry( ) {
    return batchRequestErrorLogEntryFindIn;
  }

}
