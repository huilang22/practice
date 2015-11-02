/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDefinitionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDefinitionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDefinitionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDefinitionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionDeleteInIn) {
    super(id, context, "BatchRequestParticipantDefinitionDelete");
    batchRequestParticipantDefinitionDeleteIn = batchRequestParticipantDefinitionDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDefinitionDeleteIn != null) {
      batchRequestParticipantDefinitionDeleteIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionDeleteIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipantDefinition
 * @param batchRequestParticipantDefinitionDeleteInIn Value of the batchRequestParticipantDefinitionDeleteIn
 *
 */

  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionDeleteInIn) {
    batchRequestParticipantDefinitionDeleteIn = batchRequestParticipantDefinitionDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDefinitionDeleteIn = BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
  }

/**
 *
 * Gets the BatchRequestParticipantDefinition
 * @return Value of the BatchRequestParticipantDefinition
 *
 */

  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinition( ) {
    return batchRequestParticipantDefinitionDeleteIn;
  }

}
