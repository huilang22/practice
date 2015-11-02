/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectKeyData batchRequestGetIn;
/**
 *
 * Constructor to create a  BatchRequestGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectKeyData batchRequestGetInIn) {
    super(id, context, "BatchRequestGet");
    batchRequestGetIn = batchRequestGetInIn;
  }

  public void translateToMap() {
    if (batchRequestGetIn != null) {
      batchRequestGetIn.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestGetIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param batchRequestGetInIn Value of the batchRequestGetIn
 *
 */

  public void setBatchRequest(BatchRequestObjectKeyData batchRequestGetInIn) {
    batchRequestGetIn = batchRequestGetInIn;
  }

  public void translateFromMap() {
    batchRequestGetIn = BatchRequestObjectKeyHelper.fromMap(inputMap, "BatchRequest");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectKeyData getBatchRequest( ) {
    return batchRequestGetIn;
  }

}
