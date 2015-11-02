/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionUdtGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTemplateDefinitionUdtGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionUdtGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtGetIn;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionUdtGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionUdtGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtGetInIn) {
    super(id, context, "BatchRequestTemplateDefinitionUdtGet");
    batchRequestTemplateDefinitionUdtGetIn = batchRequestTemplateDefinitionUdtGetInIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionUdtGetIn != null) {
      batchRequestTemplateDefinitionUdtGetIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionUdtGetIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionUdtGetInIn Value of the batchRequestTemplateDefinitionUdtGetIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtGetInIn) {
    batchRequestTemplateDefinitionUdtGetIn = batchRequestTemplateDefinitionUdtGetInIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionUdtGetIn = BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionUdtGetIn;
  }

}
