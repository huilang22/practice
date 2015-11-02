/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestActivityLogEntryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestActivityLogEntryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestActivityLogEntryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestActivityLogEntryObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestActivityLogEntryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestActivityLogEntryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestActivityLogEntryObjectData noOpInIn) {
    super(id, context, "BatchRequestActivityLogEntryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }
/**
 *
 * Sets the  BatchRequestActivityLogEntry
 * @param noOpInIn BatchRequestActivityLogEntryObjectData to set
 *
 */
  public void setBatchRequestActivityLogEntry(BatchRequestActivityLogEntryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestActivityLogEntry passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestActivityLogEntryObjectData getBatchRequestActivityLogEntry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestActivityLogEntryObjectHelper.fromMap(inputMap, "BatchRequestActivityLogEntry");
  }
}
