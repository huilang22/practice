/*
 * Generated code DO NOT EDIT
 * Generated file: BatchStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchStatusObjectKeyData batchStatusGetIn;
/**
 *
 * Constructor to create a  BatchStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchStatusObjectKeyData batchStatusGetInIn) {
    super(id, context, "BatchStatusGet");
    batchStatusGetIn = batchStatusGetInIn;
  }

  public void translateToMap() {
    if (batchStatusGetIn != null) {
      batchStatusGetIn.resetFlags(true, true);
      addInput("BatchStatus", BatchStatusObjectKeyHelper.toMap(batchStatusGetIn, new HashMap(), "BatchStatusObjectKeyData").get("BatchStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchStatus
 * @param batchStatusGetInIn Value of the batchStatusGetIn
 *
 */

  public void setBatchStatus(BatchStatusObjectKeyData batchStatusGetInIn) {
    batchStatusGetIn = batchStatusGetInIn;
  }

  public void translateFromMap() {
    batchStatusGetIn = BatchStatusObjectKeyHelper.fromMap(inputMap, "BatchStatus");
  }

/**
 *
 * Gets the BatchStatus
 * @return Value of the BatchStatus
 *
 */

  public BatchStatusObjectKeyData getBatchStatus( ) {
    return batchStatusGetIn;
  }

}
