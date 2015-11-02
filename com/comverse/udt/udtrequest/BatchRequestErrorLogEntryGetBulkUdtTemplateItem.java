/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestErrorLogEntryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestErrorLogEntryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestErrorLogEntryObjectBaseKeyData batchRequestErrorLogEntryGetIn;
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestErrorLogEntryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectBaseKeyData batchRequestErrorLogEntryGetInIn) {
    super(id, context, "BatchRequestErrorLogEntryGet");
    batchRequestErrorLogEntryGetIn = batchRequestErrorLogEntryGetInIn;
  }

  public void translateToMap() {
    if (batchRequestErrorLogEntryGetIn != null) {
      batchRequestErrorLogEntryGetIn.resetFlags(true, true);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseKeyHelper.toMap(batchRequestErrorLogEntryGetIn, new HashMap(), "BatchRequestErrorLogEntryObjectBaseKeyData").get("BatchRequestErrorLogEntryObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestErrorLogEntry
 * @param batchRequestErrorLogEntryGetInIn Value of the batchRequestErrorLogEntryGetIn
 *
 */

  public void setBatchRequestErrorLogEntry(BatchRequestErrorLogEntryObjectBaseKeyData batchRequestErrorLogEntryGetInIn) {
    batchRequestErrorLogEntryGetIn = batchRequestErrorLogEntryGetInIn;
  }

  public void translateFromMap() {
    batchRequestErrorLogEntryGetIn = BatchRequestErrorLogEntryObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestErrorLogEntry");
  }

/**
 *
 * Gets the BatchRequestErrorLogEntry
 * @return Value of the BatchRequestErrorLogEntry
 *
 */

  public BatchRequestErrorLogEntryObjectBaseKeyData getBatchRequestErrorLogEntry( ) {
    return batchRequestErrorLogEntryGetIn;
  }

}
