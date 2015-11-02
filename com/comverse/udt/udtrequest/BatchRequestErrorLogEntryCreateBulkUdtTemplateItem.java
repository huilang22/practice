/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestErrorLogEntryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestErrorLogEntryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestErrorLogEntryObjectBaseData batchRequestErrorLogEntryCreateIn;
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestErrorLogEntryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectBaseData batchRequestErrorLogEntryCreateInIn) {
    super(id, context, "BatchRequestErrorLogEntryCreate");
    batchRequestErrorLogEntryCreateIn = batchRequestErrorLogEntryCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestErrorLogEntryCreateIn != null) {
      batchRequestErrorLogEntryCreateIn.resetFlags(true, true);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(batchRequestErrorLogEntryCreateIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }


/**
 *
 * Sets the BatchRequestErrorLogEntry
 * @param batchRequestErrorLogEntryCreateInIn Value of the batchRequestErrorLogEntryCreateIn
 *
 */

  public void setBatchRequestErrorLogEntry(BatchRequestErrorLogEntryObjectBaseData batchRequestErrorLogEntryCreateInIn) {
    batchRequestErrorLogEntryCreateIn = batchRequestErrorLogEntryCreateInIn;
  }

  public void translateFromMap() {
    batchRequestErrorLogEntryCreateIn = BatchRequestErrorLogEntryObjectBaseHelper.fromMap(inputMap, "BatchRequestErrorLogEntry");
  }

/**
 *
 * Gets the BatchRequestErrorLogEntry
 * @return Value of the BatchRequestErrorLogEntry
 *
 */

  public BatchRequestErrorLogEntryObjectBaseData getBatchRequestErrorLogEntry( ) {
    return batchRequestErrorLogEntryCreateIn;
  }

}
