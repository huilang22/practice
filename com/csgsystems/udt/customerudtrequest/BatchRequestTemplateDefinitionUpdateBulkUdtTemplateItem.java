/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTemplateDefinitionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectData batchRequestTemplateDefinitionUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectData batchRequestTemplateDefinitionUpdateInIn) {
    super(id, context, "BatchRequestTemplateDefinitionUpdate");
    batchRequestTemplateDefinitionUpdateIn = batchRequestTemplateDefinitionUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionUpdateIn != null) {
      batchRequestTemplateDefinitionUpdateIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(batchRequestTemplateDefinitionUpdateIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionUpdateInIn Value of the batchRequestTemplateDefinitionUpdateIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectData batchRequestTemplateDefinitionUpdateInIn) {
    batchRequestTemplateDefinitionUpdateIn = batchRequestTemplateDefinitionUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionUpdateIn = BatchRequestTemplateDefinitionObjectHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionUpdateIn;
  }

}
