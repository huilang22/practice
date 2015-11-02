/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a BatchRequestErrorLogEntryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestErrorLogEntryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestErrorLogEntryObjectBaseKeyData batchRequestErrorLogEntryDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestErrorLogEntryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectBaseKeyData batchRequestErrorLogEntryDeleteInIn) {
    super(id, context, "BatchRequestErrorLogEntryDelete");
    batchRequestErrorLogEntryDeleteIn = batchRequestErrorLogEntryDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestErrorLogEntryDeleteIn != null) {
      batchRequestErrorLogEntryDeleteIn.resetFlags(true, true);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseKeyHelper.toMap(batchRequestErrorLogEntryDeleteIn, new HashMap(), "BatchRequestErrorLogEntryObjectBaseKeyData").get("BatchRequestErrorLogEntryObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestErrorLogEntry
 * @param batchRequestErrorLogEntryDeleteInIn Value of the batchRequestErrorLogEntryDeleteIn
 *
 */

  public void setBatchRequestErrorLogEntry(BatchRequestErrorLogEntryObjectBaseKeyData batchRequestErrorLogEntryDeleteInIn) {
    batchRequestErrorLogEntryDeleteIn = batchRequestErrorLogEntryDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestErrorLogEntryDeleteIn = BatchRequestErrorLogEntryObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestErrorLogEntry");
  }

/**
 *
 * Gets the BatchRequestErrorLogEntry
 * @return Value of the BatchRequestErrorLogEntry
 *
 */

  public BatchRequestErrorLogEntryObjectBaseKeyData getBatchRequestErrorLogEntry( ) {
    return batchRequestErrorLogEntryDeleteIn;
  }

}
