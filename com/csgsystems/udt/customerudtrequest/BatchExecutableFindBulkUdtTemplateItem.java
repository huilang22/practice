/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableObjectFilter batchExecutableFindIn;
/**
 *
 * Constructor to create a  BatchExecutableFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableObjectFilter batchExecutableFindInIn) {
    super(id, context, "BatchExecutableFind");
    batchExecutableFindIn = batchExecutableFindInIn;
  }

  public void translateToMap() {
    if (batchExecutableFindIn != null) {
      Integer index =  batchExecutableFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(batchExecutableFindIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }


/**
 *
 * Sets the BatchExecutable
 * @param batchExecutableFindInIn Value of the batchExecutableFindIn
 *
 */

  public void setBatchExecutable(BatchExecutableObjectFilter batchExecutableFindInIn) {
    batchExecutableFindIn = batchExecutableFindInIn;
  }

  public void translateFromMap() {
    batchExecutableFindIn = BatchExecutableObjectHelper.fromMapFilter(inputMap, "BatchExecutable");
  }

/**
 *
 * Gets the BatchExecutable
 * @return Value of the BatchExecutable
 *
 */

  public BatchExecutableObjectFilter getBatchExecutable( ) {
    return batchExecutableFindIn;
  }

}
