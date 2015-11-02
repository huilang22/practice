/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTemplateDefinitionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionGetIn;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionGetInIn) {
    super(id, context, "BatchRequestTemplateDefinitionGet");
    batchRequestTemplateDefinitionGetIn = batchRequestTemplateDefinitionGetInIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionGetIn != null) {
      batchRequestTemplateDefinitionGetIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionGetIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionGetInIn Value of the batchRequestTemplateDefinitionGetIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionGetInIn) {
    batchRequestTemplateDefinitionGetIn = batchRequestTemplateDefinitionGetInIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionGetIn = BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionGetIn;
  }

}
