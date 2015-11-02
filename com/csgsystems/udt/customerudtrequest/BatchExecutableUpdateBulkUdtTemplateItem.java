/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableObjectData batchExecutableUpdateIn;
/**
 *
 * Constructor to create a  BatchExecutableUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableObjectData batchExecutableUpdateInIn) {
    super(id, context, "BatchExecutableUpdate");
    batchExecutableUpdateIn = batchExecutableUpdateInIn;
  }

  public void translateToMap() {
    if (batchExecutableUpdateIn != null) {
      batchExecutableUpdateIn.resetFlags(true, true);
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(batchExecutableUpdateIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }


/**
 *
 * Sets the BatchExecutable
 * @param batchExecutableUpdateInIn Value of the batchExecutableUpdateIn
 *
 */

  public void setBatchExecutable(BatchExecutableObjectData batchExecutableUpdateInIn) {
    batchExecutableUpdateIn = batchExecutableUpdateInIn;
  }

  public void translateFromMap() {
    batchExecutableUpdateIn = BatchExecutableObjectHelper.fromMap(inputMap, "BatchExecutable");
  }

/**
 *
 * Gets the BatchExecutable
 * @return Value of the BatchExecutable
 *
 */

  public BatchExecutableObjectData getBatchExecutable( ) {
    return batchExecutableUpdateIn;
  }

}
