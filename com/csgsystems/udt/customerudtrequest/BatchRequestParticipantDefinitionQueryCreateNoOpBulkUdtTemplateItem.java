/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDefinitionQueryCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParticipantDefinitionQueryCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParticipantDefinitionQueryCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParticipantDefinitionObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParticipantDefinitionQueryCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParticipantDefinitionQueryCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectKeyData noOpInIn) {
    super(id, context, "BatchRequestParticipantDefinitionQueryCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
/**
 *
 * Sets the  BatchRequestParticipantDefinition
 * @param noOpInIn BatchRequestParticipantDefinitionObjectKeyData to set
 *
 */
  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParticipantDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
  }
}
