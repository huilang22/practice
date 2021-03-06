/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestErrorLogEntryDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestErrorLogEntryDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestErrorLogEntryObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestErrorLogEntryDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestErrorLogEntryDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectBaseData noOpInIn) {
    super(id, context, "BatchRequestErrorLogEntryDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
/**
 *
 * Sets the  BatchRequestErrorLogEntry
 * @param noOpInIn BatchRequestErrorLogEntryObjectBaseData to set
 *
 */
  public void setBatchRequestErrorLogEntry(BatchRequestErrorLogEntryObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestErrorLogEntry passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestErrorLogEntryObjectBaseData getBatchRequestErrorLogEntry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestErrorLogEntryObjectBaseHelper.fromMap(inputMap, "BatchRequestErrorLogEntry");
  }
}
