/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestDeleteInIn) {
    super(id, context, "BatchRequestDelete");
    batchRequestDeleteIn = batchRequestDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestDeleteIn != null) {
      batchRequestDeleteIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestDeleteIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestDeleteInIn Value of the batchRequestDeleteIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestDeleteInIn) {
    batchRequestDeleteIn = batchRequestDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestDeleteIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestDeleteIn;
  }

}
