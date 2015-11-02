/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionUdtCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a BatchRequestTemplateDefinitionUdtCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestTemplateDefinitionUdtCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtCreateIn;
  protected BulkUdtTemplateRootRequest batchRequestTemplateDefinitionUdtCreateInUdtTemplateData;
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionUdtCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestTemplateDefinitionUdtCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtCreateInIn, BulkUdtTemplateRootRequest batchRequestTemplateDefinitionUdtCreateInUdtTemplateDataIn) {
    super(id, context, "BatchRequestTemplateDefinitionUdtCreate");
    batchRequestTemplateDefinitionUdtCreateIn = batchRequestTemplateDefinitionUdtCreateInIn;
    batchRequestTemplateDefinitionUdtCreateInUdtTemplateData = batchRequestTemplateDefinitionUdtCreateInUdtTemplateDataIn;
  }

  public void translateToMap() {
    if (batchRequestTemplateDefinitionUdtCreateIn != null) {
      batchRequestTemplateDefinitionUdtCreateIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionUdtCreateIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
    if (batchRequestTemplateDefinitionUdtCreateInUdtTemplateData != null) {
      addInput("BatchRequestTemplateDefinitionUdtCreateInUdtTemplateData", batchRequestTemplateDefinitionUdtCreateInUdtTemplateData);
    }
  }


/**
 *
 * Sets the BatchRequestTemplateDefinition
 * @param batchRequestTemplateDefinitionUdtCreateInIn Value of the batchRequestTemplateDefinitionUdtCreateIn
 *
 */

  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtCreateInIn) {
    batchRequestTemplateDefinitionUdtCreateIn = batchRequestTemplateDefinitionUdtCreateInIn;
  }

/**
 *
 * Sets the BatchRequestTemplateDefinitionUdtCreateInUdtTemplateData
 * @param batchRequestTemplateDefinitionUdtCreateInUdtTemplateDataIn Value of the batchRequestTemplateDefinitionUdtCreateInUdtTemplateData
 *
 */

  public void setBatchRequestTemplateDefinitionUdtCreateInUdtTemplateData(BulkUdtTemplateRootRequest batchRequestTemplateDefinitionUdtCreateInUdtTemplateDataIn) {
    batchRequestTemplateDefinitionUdtCreateInUdtTemplateData = batchRequestTemplateDefinitionUdtCreateInUdtTemplateDataIn;
  }

  public void translateFromMap() {
    batchRequestTemplateDefinitionUdtCreateIn = BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
    batchRequestTemplateDefinitionUdtCreateInUdtTemplateData = (BulkUdtTemplateRootRequest)inputMap.get("BatchRequestTemplateDefinitionUdtCreateInUdtTemplateData");
  }

/**
 *
 * Gets the BatchRequestTemplateDefinition
 * @return Value of the BatchRequestTemplateDefinition
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinition( ) {
    return batchRequestTemplateDefinitionUdtCreateIn;
  }

/**
 *
 * Gets the BatchRequestTemplateDefinitionUdtCreateInUdtTemplateData
 * @return Value of the BatchRequestTemplateDefinitionUdtCreateInUdtTemplateData
 *
 */

  public BulkUdtTemplateRootRequest getBatchRequestTemplateDefinitionUdtCreateInUdtTemplateData( ) {
    return batchRequestTemplateDefinitionUdtCreateInUdtTemplateData;
  }

}
