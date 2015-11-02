/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestActivityLogEntryDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestActivityLogEntryDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestActivityLogEntryObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestActivityLogEntryDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestActivityLogEntryDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestActivityLogEntryObjectBaseData noOpInIn) {
    super(id, context, "BatchRequestActivityLogEntryDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }
/**
 *
 * Sets the  BatchRequestActivityLogEntry
 * @param noOpInIn BatchRequestActivityLogEntryObjectBaseData to set
 *
 */
  public void setBatchRequestActivityLogEntry(BatchRequestActivityLogEntryObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestActivityLogEntry passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestActivityLogEntryObjectBaseData getBatchRequestActivityLogEntry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestActivityLogEntryObjectBaseHelper.fromMap(inputMap, "BatchRequestActivityLogEntry");
  }
}
