/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDefinitionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParticipantDefinitionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParticipantDefinitionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParticipantDefinitionObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParticipantDefinitionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParticipantDefinitionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectData noOpInIn) {
    super(id, context, "BatchRequestParticipantDefinitionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
/**
 *
 * Sets the  BatchRequestParticipantDefinition
 * @param noOpInIn BatchRequestParticipantDefinitionObjectData to set
 *
 */
  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParticipantDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantDefinitionObjectData getBatchRequestParticipantDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParticipantDefinitionObjectHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
  }
}
