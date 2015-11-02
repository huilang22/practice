/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestTemplateDefinitionUdtUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestTemplateDefinitionUdtUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionUdtUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtUpdateIn;
  protected BulkUdtTemplateRootRequest batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionUdtUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionUdtUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtUpdateInIn, BulkUdtTemplateRootRequest batchRequestTemplateDefinitionUdtUpdateInUdtTemplateDataIn) {
    super(id, context, "BatchRequestTemplateDefinitionUdtUpdate");
    batchRequestTemplateDefinitionUdtUpdateIn = batchRequestTemplateDefinitionUdtUpdateInIn;
    batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData = batchRequestTemplateDefinitionUdtUpdateInUdtTemplateDataIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionUdtUpdateIn != null) {
      batchRequestTemplateDefinitionUdtUpdateIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionUdtUpdateIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
    if (batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData != null) {
      addInput("BatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData", batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData);
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionUdtUpdateInIn Value of the batchRequestTemplateDefinitionUdtUpdateIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtUpdateInIn) {
    batchRequestTemplateDefinitionUdtUpdateIn = batchRequestTemplateDefinitionUdtUpdateInIn;
  }

/**
 *
 * Sets the BatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData
 * @param batchRequestTemplateDefinitionUdtUpdateInUdtTemplateDataIn Value of the batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData
 *
 */

  public void setBatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData(BulkUdtTemplateRootRequest batchRequestTemplateDefinitionUdtUpdateInUdtTemplateDataIn) {
    batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData = batchRequestTemplateDefinitionUdtUpdateInUdtTemplateDataIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionUdtUpdateIn = BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
    batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData = (BulkUdtTemplateRootRequest)inputMap.get("BatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionUdtUpdateIn;
  }

/**
 *
 * Gets the BatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData
 * @return Value of the BatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData
 *
 */

  public BulkUdtTemplateRootRequest getBatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData( ) {
    return batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData;
  }

}
