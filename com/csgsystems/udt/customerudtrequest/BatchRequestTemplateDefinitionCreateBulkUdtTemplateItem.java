/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTemplateDefinitionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectData batchRequestTemplateDefinitionCreateIn;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectData batchRequestTemplateDefinitionCreateInIn) {
    super(id, context, "BatchRequestTemplateDefinitionCreate");
    batchRequestTemplateDefinitionCreateIn = batchRequestTemplateDefinitionCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionCreateIn != null) {
      batchRequestTemplateDefinitionCreateIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(batchRequestTemplateDefinitionCreateIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionCreateInIn Value of the batchRequestTemplateDefinitionCreateIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectData batchRequestTemplateDefinitionCreateInIn) {
    batchRequestTemplateDefinitionCreateIn = batchRequestTemplateDefinitionCreateInIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionCreateIn = BatchRequestTemplateDefinitionObjectHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionCreateIn;
  }

}
