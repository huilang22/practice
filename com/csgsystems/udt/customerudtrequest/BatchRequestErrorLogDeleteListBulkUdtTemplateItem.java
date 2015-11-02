/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestErrorLogDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestErrorLogDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestErrorLogDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestErrorLogEntryObjectBaseFilter batchRequestErrorLogEntryDeleteListIn;
/**
 *
 * Constructor to create a  BatchRequestErrorLogDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestErrorLogDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectBaseFilter batchRequestErrorLogEntryDeleteListInIn) {
    super(id, context, "BatchRequestErrorLogDeleteList");
    batchRequestErrorLogEntryDeleteListIn = batchRequestErrorLogEntryDeleteListInIn;
  }

  public void translateToMap() {
    if (batchRequestErrorLogEntryDeleteListIn != null) {
      Integer index =  batchRequestErrorLogEntryDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(batchRequestErrorLogEntryDeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the BatchRequestErrorLogEntry
 * @param batchRequestErrorLogEntryDeleteListInIn Value of the batchRequestErrorLogEntryDeleteListIn
 *
 */

  public void setBatchRequestErrorLogEntry(BatchRequestErrorLogEntryObjectBaseFilter batchRequestErrorLogEntryDeleteListInIn) {
    batchRequestErrorLogEntryDeleteListIn = batchRequestErrorLogEntryDeleteListInIn;
  }

  public void translateFromMap() {
    batchRequestErrorLogEntryDeleteListIn = BatchRequestErrorLogEntryObjectBaseHelper.fromMapFilter(inputMap, "BatchRequestErrorLogEntry");
  }

/**
 *
 * Gets the BatchRequestErrorLogEntry
 * @return Value of the BatchRequestErrorLogEntry
 *
 */

  public BatchRequestErrorLogEntryObjectBaseFilter getBatchRequestErrorLogEntry( ) {
    return batchRequestErrorLogEntryDeleteListIn;
  }

}
