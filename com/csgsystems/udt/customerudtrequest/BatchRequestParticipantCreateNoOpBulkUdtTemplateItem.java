/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParticipantCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParticipantCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParticipantObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParticipantCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParticipantCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectBaseData noOpInIn) {
    super(id, context, "BatchRequestParticipantCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
/**
 *
 * Sets the  BatchRequestParticipant
 * @param noOpInIn BatchRequestParticipantObjectBaseData to set
 *
 */
  public void setBatchRequestParticipant(BatchRequestParticipantObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParticipant passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantObjectBaseData getBatchRequestParticipant() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParticipantObjectBaseHelper.fromMap(inputMap, "BatchRequestParticipant");
  }
}
