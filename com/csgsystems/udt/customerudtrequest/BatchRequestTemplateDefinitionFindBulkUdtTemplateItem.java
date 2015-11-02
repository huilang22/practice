/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTemplateDefinitionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectFilter batchRequestTemplateDefinitionFindIn;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectFilter batchRequestTemplateDefinitionFindInIn) {
    super(id, context, "BatchRequestTemplateDefinitionFind");
    batchRequestTemplateDefinitionFindIn = batchRequestTemplateDefinitionFindInIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionFindIn != null) {
      Integer index =  batchRequestTemplateDefinitionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(batchRequestTemplateDefinitionFindIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionFindInIn Value of the batchRequestTemplateDefinitionFindIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectFilter batchRequestTemplateDefinitionFindInIn) {
    batchRequestTemplateDefinitionFindIn = batchRequestTemplateDefinitionFindInIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionFindIn = BatchRequestTemplateDefinitionObjectHelper.fromMapFilter(inputMap, "BatchRequestTemplateDefinition");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectFilter getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionFindIn;
  }

}
