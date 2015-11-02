/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableObjectKeyData batchExecutableDeleteIn;
/**
 *
 * Constructor to create a  BatchExecutableDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableObjectKeyData batchExecutableDeleteInIn) {
    super(id, context, "BatchExecutableDelete");
    batchExecutableDeleteIn = batchExecutableDeleteInIn;
  }

  public void translateToMap() {
    if (batchExecutableDeleteIn != null) {
      batchExecutableDeleteIn.resetFlags(true, true);
      addInput("BatchExecutable", BatchExecutableObjectKeyHelper.toMap(batchExecutableDeleteIn, new HashMap(), "BatchExecutableObjectKeyData").get("BatchExecutableObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchExecutable
 * @param batchExecutableDeleteInIn Value of the batchExecutableDeleteIn
 *
 */

  public void setBatchExecutable(BatchExecutableObjectKeyData batchExecutableDeleteInIn) {
    batchExecutableDeleteIn = batchExecutableDeleteInIn;
  }

  public void translateFromMap() {
    batchExecutableDeleteIn = BatchExecutableObjectKeyHelper.fromMap(inputMap, "BatchExecutable");
  }

/**
 *
 * Gets the BatchExecutable
 * @return Value of the BatchExecutable
 *
 */

  public BatchExecutableObjectKeyData getBatchExecutable( ) {
    return batchExecutableDeleteIn;
  }

}
