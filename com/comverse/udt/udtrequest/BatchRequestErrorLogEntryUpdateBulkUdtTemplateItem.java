/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestErrorLogEntryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestErrorLogEntryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestErrorLogEntryObjectBaseData batchRequestErrorLogEntryUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestErrorLogEntryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectBaseData batchRequestErrorLogEntryUpdateInIn) {
    super(id, context, "BatchRequestErrorLogEntryUpdate");
    batchRequestErrorLogEntryUpdateIn = batchRequestErrorLogEntryUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestErrorLogEntryUpdateIn != null) {
      batchRequestErrorLogEntryUpdateIn.resetFlags(true, true);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(batchRequestErrorLogEntryUpdateIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }


/**
 *
 * Sets the BatchRequestErrorLogEntry
 * @param batchRequestErrorLogEntryUpdateInIn Value of the batchRequestErrorLogEntryUpdateIn
 *
 */

  public void setBatchRequestErrorLogEntry(BatchRequestErrorLogEntryObjectBaseData batchRequestErrorLogEntryUpdateInIn) {
    batchRequestErrorLogEntryUpdateIn = batchRequestErrorLogEntryUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestErrorLogEntryUpdateIn = BatchRequestErrorLogEntryObjectBaseHelper.fromMap(inputMap, "BatchRequestErrorLogEntry");
  }

/**
 *
 * Gets the BatchRequestErrorLogEntry
 * @return Value of the BatchRequestErrorLogEntry
 *
 */

  public BatchRequestErrorLogEntryObjectBaseData getBatchRequestErrorLogEntry( ) {
    return batchRequestErrorLogEntryUpdateIn;
  }

}
