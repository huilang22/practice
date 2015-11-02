/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableObjectKeyData batchExecutableGetIn;
/**
 *
 * Constructor to create a  BatchExecutableGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableObjectKeyData batchExecutableGetInIn) {
    super(id, context, "BatchExecutableGet");
    batchExecutableGetIn = batchExecutableGetInIn;
  }

  public void translateToMap() {
    if (batchExecutableGetIn != null) {
      batchExecutableGetIn.resetFlags(true, true);
      addInput("BatchExecutable", BatchExecutableObjectKeyHelper.toMap(batchExecutableGetIn, new HashMap(), "BatchExecutableObjectKeyData").get("BatchExecutableObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchExecutable
 * @param batchExecutableGetInIn Value of the batchExecutableGetIn
 *
 */

  public void setBatchExecutable(BatchExecutableObjectKeyData batchExecutableGetInIn) {
    batchExecutableGetIn = batchExecutableGetInIn;
  }

  public void translateFromMap() {
    batchExecutableGetIn = BatchExecutableObjectKeyHelper.fromMap(inputMap, "BatchExecutable");
  }

/**
 *
 * Gets the BatchExecutable
 * @return Value of the BatchExecutable
 *
 */

  public BatchExecutableObjectKeyData getBatchExecutable( ) {
    return batchExecutableGetIn;
  }

}
