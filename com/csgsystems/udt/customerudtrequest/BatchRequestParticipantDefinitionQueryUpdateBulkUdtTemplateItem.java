/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDefinitionQueryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDefinitionQueryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDefinitionQueryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryUpdateIn;
  protected BulkParticipantQuery batchRequestParticipantDefinitionQueryUpdateInParticipantQuery;
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionQueryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDefinitionQueryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryUpdateInIn, BulkParticipantQuery batchRequestParticipantDefinitionQueryUpdateInParticipantQueryIn) {
    super(id, context, "BatchRequestParticipantDefinitionQueryUpdate");
    batchRequestParticipantDefinitionQueryUpdateIn = batchRequestParticipantDefinitionQueryUpdateInIn;
    batchRequestParticipantDefinitionQueryUpdateInParticipantQuery = batchRequestParticipantDefinitionQueryUpdateInParticipantQueryIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDefinitionQueryUpdateIn != null) {
      batchRequestParticipantDefinitionQueryUpdateIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionQueryUpdateIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
    if (batchRequestParticipantDefinitionQueryUpdateInParticipantQuery != null) {
      addInput("BatchRequestParticipantDefinitionQueryUpdateInParticipantQuery", batchRequestParticipantDefinitionQueryUpdateInParticipantQuery);
    }
  }


/**
 *
 * Sets the BatchRequestParticipantDefinition
 * @param batchRequestParticipantDefinitionQueryUpdateInIn Value of the batchRequestParticipantDefinitionQueryUpdateIn
 *
 */

  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryUpdateInIn) {
    batchRequestParticipantDefinitionQueryUpdateIn = batchRequestParticipantDefinitionQueryUpdateInIn;
  }

/**
 *
 * Sets the BatchRequestParticipantDefinitionQueryUpdateInParticipantQuery
 * @param batchRequestParticipantDefinitionQueryUpdateInParticipantQueryIn Value of the batchRequestParticipantDefinitionQueryUpdateInParticipantQuery
 *
 */

  public void setBatchRequestParticipantDefinitionQueryUpdateInParticipantQuery(BulkParticipantQuery batchRequestParticipantDefinitionQueryUpdateInParticipantQueryIn) {
    batchRequestParticipantDefinitionQueryUpdateInParticipantQuery = batchRequestParticipantDefinitionQueryUpdateInParticipantQueryIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDefinitionQueryUpdateIn = BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
    batchRequestParticipantDefinitionQueryUpdateInParticipantQuery = (BulkParticipantQuery)inputMap.get("BatchRequestParticipantDefinitionQueryUpdateInParticipantQuery");
  }

/**
 *
 * Gets the BatchRequestParticipantDefinition
 * @return Value of the BatchRequestParticipantDefinition
 *
 */

  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinition( ) {
    return batchRequestParticipantDefinitionQueryUpdateIn;
  }

/**
 *
 * Gets the BatchRequestParticipantDefinitionQueryUpdateInParticipantQuery
 * @return Value of the BatchRequestParticipantDefinitionQueryUpdateInParticipantQuery
 *
 */

  public BulkParticipantQuery getBatchRequestParticipantDefinitionQueryUpdateInParticipantQuery( ) {
    return batchRequestParticipantDefinitionQueryUpdateInParticipantQuery;
  }

}
