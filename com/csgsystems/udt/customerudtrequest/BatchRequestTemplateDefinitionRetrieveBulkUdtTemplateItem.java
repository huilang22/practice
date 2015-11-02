/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionRetrieveBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTemplateDefinitionRetrieveBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionRetrieveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionRetrieveIn;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionRetrieveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionRetrieveBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionRetrieveInIn) {
    super(id, context, "BatchRequestTemplateDefinitionRetrieve");
    batchRequestTemplateDefinitionRetrieveIn = batchRequestTemplateDefinitionRetrieveInIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionRetrieveIn != null) {
      batchRequestTemplateDefinitionRetrieveIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionRetrieveIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionRetrieveInIn Value of the batchRequestTemplateDefinitionRetrieveIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionRetrieveInIn) {
    batchRequestTemplateDefinitionRetrieveIn = batchRequestTemplateDefinitionRetrieveInIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionRetrieveIn = BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionRetrieveIn;
  }

}
