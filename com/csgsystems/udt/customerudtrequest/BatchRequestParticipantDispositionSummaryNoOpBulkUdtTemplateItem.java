/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDispositionSummaryNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParticipantDispositionSummaryNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParticipantDispositionSummaryNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParticipantDispositionSummaryOutputData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParticipantDispositionSummaryNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParticipantDispositionSummaryNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDispositionSummaryOutputData noOpInIn) {
    super(id, context, "BatchRequestParticipantDispositionSummary");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDispositionSummaryOutputData", BatchRequestParticipantDispositionSummaryOutputHelper.toMap(noOpIn).get("BatchRequestParticipantDispositionSummaryOutputData"));
    }
  }
/**
 *
 * Sets the  BatchRequestParticipantDispositionSummaryOutputData
 * @param noOpInIn BatchRequestParticipantDispositionSummaryOutputData to set
 *
 */
  public void setBatchRequestParticipantDispositionSummaryOutputData(BatchRequestParticipantDispositionSummaryOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParticipantDispositionSummaryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantDispositionSummaryOutputData getBatchRequestParticipantDispositionSummaryOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParticipantDispositionSummaryOutputHelper.fromMap(inputMap);
  }
}
