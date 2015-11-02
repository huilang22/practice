/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDefinitionQueryGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDefinitionQueryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDefinitionQueryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryGetIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionQueryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDefinitionQueryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryGetInIn) {
    super(id, context, "BatchRequestParticipantDefinitionQueryGet");
    batchRequestParticipantDefinitionQueryGetIn = batchRequestParticipantDefinitionQueryGetInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDefinitionQueryGetIn != null) {
      batchRequestParticipantDefinitionQueryGetIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionQueryGetIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipantDefinition
 * @param batchRequestParticipantDefinitionQueryGetInIn Value of the batchRequestParticipantDefinitionQueryGetIn
 *
 */

  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryGetInIn) {
    batchRequestParticipantDefinitionQueryGetIn = batchRequestParticipantDefinitionQueryGetInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDefinitionQueryGetIn = BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
  }

/**
 *
 * Gets the BatchRequestParticipantDefinition
 * @return Value of the BatchRequestParticipantDefinition
 *
 */

  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinition( ) {
    return batchRequestParticipantDefinitionQueryGetIn;
  }

}
