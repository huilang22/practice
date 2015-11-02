/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestErrorLogEntrySequenceNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestErrorLogEntrySequenceNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestErrorLogEntrySequenceNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestErrorLogEntryObjectBaseKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestErrorLogEntrySequenceNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestErrorLogEntrySequenceNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestErrorLogEntryObjectBaseKeyData noOpInIn) {
    super(id, context, "BatchRequestErrorLogEntrySequence");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
/**
 *
 * Sets the  BatchRequestErrorLogEntry
 * @param noOpInIn BatchRequestErrorLogEntryObjectBaseKeyData to set
 *
 */
  public void setBatchRequestErrorLogEntry(BatchRequestErrorLogEntryObjectBaseKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestErrorLogEntry passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestErrorLogEntryObjectBaseKeyData getBatchRequestErrorLogEntry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestErrorLogEntryObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestErrorLogEntry");
  }
}
