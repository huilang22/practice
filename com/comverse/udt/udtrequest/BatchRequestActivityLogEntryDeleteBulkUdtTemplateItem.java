/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestActivityLogEntryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestActivityLogEntryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestActivityLogEntryObjectBaseKeyData batchRequestActivityLogEntryDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestActivityLogEntryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestActivityLogEntryObjectBaseKeyData batchRequestActivityLogEntryDeleteInIn) {
    super(id, context, "BatchRequestActivityLogEntryDelete");
    batchRequestActivityLogEntryDeleteIn = batchRequestActivityLogEntryDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestActivityLogEntryDeleteIn != null) {
      batchRequestActivityLogEntryDeleteIn.resetFlags(true, true);
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseKeyHelper.toMap(batchRequestActivityLogEntryDeleteIn, new HashMap(), "BatchRequestActivityLogEntryObjectBaseKeyData").get("BatchRequestActivityLogEntryObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestActivityLogEntry
 * @param batchRequestActivityLogEntryDeleteInIn Value of the batchRequestActivityLogEntryDeleteIn
 *
 */

  public void setBatchRequestActivityLogEntry(BatchRequestActivityLogEntryObjectBaseKeyData batchRequestActivityLogEntryDeleteInIn) {
    batchRequestActivityLogEntryDeleteIn = batchRequestActivityLogEntryDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestActivityLogEntryDeleteIn = BatchRequestActivityLogEntryObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestActivityLogEntry");
  }

/**
 *
 * Gets the BatchRequestActivityLogEntry
 * @return Value of the BatchRequestActivityLogEntry
 *
 */

  public BatchRequestActivityLogEntryObjectBaseKeyData getBatchRequestActivityLogEntry( ) {
    return batchRequestActivityLogEntryDeleteIn;
  }

}
