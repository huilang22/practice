/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDefinitionRetrieveBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDefinitionRetrieveBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDefinitionRetrieveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionRetrieveIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionRetrieveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDefinitionRetrieveBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionRetrieveInIn) {
    super(id, context, "BatchRequestParticipantDefinitionRetrieve");
    batchRequestParticipantDefinitionRetrieveIn = batchRequestParticipantDefinitionRetrieveInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDefinitionRetrieveIn != null) {
      batchRequestParticipantDefinitionRetrieveIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionRetrieveIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipantDefinition
 * @param batchRequestParticipantDefinitionRetrieveInIn Value of the batchRequestParticipantDefinitionRetrieveIn
 *
 */

  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionRetrieveInIn) {
    batchRequestParticipantDefinitionRetrieveIn = batchRequestParticipantDefinitionRetrieveInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDefinitionRetrieveIn = BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
  }

/**
 *
 * Gets the BatchRequestParticipantDefinition
 * @return Value of the BatchRequestParticipantDefinition
 *
 */

  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinition( ) {
    return batchRequestParticipantDefinitionRetrieveIn;
  }

}
