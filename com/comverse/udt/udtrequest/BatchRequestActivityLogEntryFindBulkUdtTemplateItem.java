/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestActivityLogEntryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestActivityLogEntryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestActivityLogEntryObjectFilter batchRequestActivityLogEntryFindIn;
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestActivityLogEntryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestActivityLogEntryObjectFilter batchRequestActivityLogEntryFindInIn) {
    super(id, context, "BatchRequestActivityLogEntryFind");
    batchRequestActivityLogEntryFindIn = batchRequestActivityLogEntryFindInIn;
  }

  public void translateToMap() {
    if (batchRequestActivityLogEntryFindIn != null) {
      Integer index =  batchRequestActivityLogEntryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectHelper.toMap(batchRequestActivityLogEntryFindIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }


/**
 *
 * Sets the BatchRequestActivityLogEntry
 * @param batchRequestActivityLogEntryFindInIn Value of the batchRequestActivityLogEntryFindIn
 *
 */

  public void setBatchRequestActivityLogEntry(BatchRequestActivityLogEntryObjectFilter batchRequestActivityLogEntryFindInIn) {
    batchRequestActivityLogEntryFindIn = batchRequestActivityLogEntryFindInIn;
  }

  public void translateFromMap() {
    batchRequestActivityLogEntryFindIn = BatchRequestActivityLogEntryObjectHelper.fromMapFilter(inputMap, "BatchRequestActivityLogEntry");
  }

/**
 *
 * Gets the BatchRequestActivityLogEntry
 * @return Value of the BatchRequestActivityLogEntry
 *
 */

  public BatchRequestActivityLogEntryObjectFilter getBatchRequestActivityLogEntry( ) {
    return batchRequestActivityLogEntryFindIn;
  }

}
