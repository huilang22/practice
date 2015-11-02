/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionXmlGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTemplateDefinitionXmlGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionXmlGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlGetIn;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionXmlGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionXmlGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlGetInIn) {
    super(id, context, "BatchRequestTemplateDefinitionXmlGet");
    batchRequestTemplateDefinitionXmlGetIn = batchRequestTemplateDefinitionXmlGetInIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionXmlGetIn != null) {
      batchRequestTemplateDefinitionXmlGetIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionXmlGetIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionXmlGetInIn Value of the batchRequestTemplateDefinitionXmlGetIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlGetInIn) {
    batchRequestTemplateDefinitionXmlGetIn = batchRequestTemplateDefinitionXmlGetInIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionXmlGetIn = BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionXmlGetIn;
  }

}
