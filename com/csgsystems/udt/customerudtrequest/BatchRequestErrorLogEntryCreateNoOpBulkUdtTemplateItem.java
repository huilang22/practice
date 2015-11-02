/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestErrorLogEntryCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestErrorLogEntryCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestErrorLogEntryCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestErrorLogEntryObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestErrorLogEntryCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestErrorLogEntryCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectBaseData noOpInIn) {
    super(id, context, "BatchRequestErrorLogEntryCreate");
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
