/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestExecuteLogEntryDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestExecuteLogEntryDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestExecuteLogEntryDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestExecuteLogEntryObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestExecuteLogEntryDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestExecuteLogEntryDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestExecuteLogEntryObjectData noOpInIn) {
    super(id, context, "BatchRequestExecuteLogEntryDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }
/**
 *
 * Sets the  BatchRequestExecuteLogEntry
 * @param noOpInIn BatchRequestExecuteLogEntryObjectData to set
 *
 */
  public void setBatchRequestExecuteLogEntry(BatchRequestExecuteLogEntryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestExecuteLogEntry passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestExecuteLogEntryObjectData getBatchRequestExecuteLogEntry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestExecuteLogEntryObjectHelper.fromMap(inputMap, "BatchRequestExecuteLogEntry");
  }
}
