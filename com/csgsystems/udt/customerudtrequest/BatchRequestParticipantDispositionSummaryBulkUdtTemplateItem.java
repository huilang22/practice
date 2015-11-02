/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDispositionSummaryBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDispositionSummaryBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDispositionSummaryBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestParticipantDispositionSummaryIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDispositionSummaryBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDispositionSummaryBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestParticipantDispositionSummaryInIn) {
    super(id, context, "BatchRequestParticipantDispositionSummary");
    batchRequestParticipantDispositionSummaryIn = batchRequestParticipantDispositionSummaryInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDispositionSummaryIn != null) {
      batchRequestParticipantDispositionSummaryIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestParticipantDispositionSummaryIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestParticipantDispositionSummaryInIn Value of the batchRequestParticipantDispositionSummaryIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestParticipantDispositionSummaryInIn) {
    batchRequestParticipantDispositionSummaryIn = batchRequestParticipantDispositionSummaryInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDispositionSummaryIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestParticipantDispositionSummaryIn;
  }

}
