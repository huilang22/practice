/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeObjectKeyData batchTypeDeleteIn;
/**
 *
 * Constructor to create a  BatchTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeObjectKeyData batchTypeDeleteInIn) {
    super(id, context, "BatchTypeDelete");
    batchTypeDeleteIn = batchTypeDeleteInIn;
  }

  public void translateToMap() {
    if (batchTypeDeleteIn != null) {
      batchTypeDeleteIn.resetFlags(true, true);
      addInput("BatchType", BatchTypeObjectKeyHelper.toMap(batchTypeDeleteIn, new HashMap(), "BatchTypeObjectKeyData").get("BatchTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchType
 * @param batchTypeDeleteInIn Value of the batchTypeDeleteIn
 *
 */

  public void setBatchType(BatchTypeObjectKeyData batchTypeDeleteInIn) {
    batchTypeDeleteIn = batchTypeDeleteInIn;
  }

  public void translateFromMap() {
    batchTypeDeleteIn = BatchTypeObjectKeyHelper.fromMap(inputMap, "BatchType");
  }

/**
 *
 * Gets the BatchType
 * @return Value of the BatchType
 *
 */

  public BatchTypeObjectKeyData getBatchType( ) {
    return batchTypeDeleteIn;
  }

}
