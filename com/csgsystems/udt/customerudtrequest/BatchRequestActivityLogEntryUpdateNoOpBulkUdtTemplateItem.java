/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestActivityLogEntryUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestActivityLogEntryUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestActivityLogEntryUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestActivityLogEntryObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestActivityLogEntryUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestActivityLogEntryUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestActivityLogEntryObjectBaseData noOpInIn) {
    super(id, context, "BatchRequestActivityLogEntryUpdate");
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
