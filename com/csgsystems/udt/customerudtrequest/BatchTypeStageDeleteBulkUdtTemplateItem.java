/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeStageDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeStageDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeStageDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeStageObjectKeyData batchTypeStageDeleteIn;
/**
 *
 * Constructor to create a  BatchTypeStageDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeStageDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeStageObjectKeyData batchTypeStageDeleteInIn) {
    super(id, context, "BatchTypeStageDelete");
    batchTypeStageDeleteIn = batchTypeStageDeleteInIn;
  }

  public void translateToMap() {
    if (batchTypeStageDeleteIn != null) {
      batchTypeStageDeleteIn.resetFlags(true, true);
      addInput("BatchTypeStage", BatchTypeStageObjectKeyHelper.toMap(batchTypeStageDeleteIn, new HashMap(), "BatchTypeStageObjectKeyData").get("BatchTypeStageObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchTypeStage
 * @param batchTypeStageDeleteInIn Value of the batchTypeStageDeleteIn
 *
 */

  public void setBatchTypeStage(BatchTypeStageObjectKeyData batchTypeStageDeleteInIn) {
    batchTypeStageDeleteIn = batchTypeStageDeleteInIn;
  }

  public void translateFromMap() {
    batchTypeStageDeleteIn = BatchTypeStageObjectKeyHelper.fromMap(inputMap, "BatchTypeStage");
  }

/**
 *
 * Gets the BatchTypeStage
 * @return Value of the BatchTypeStage
 *
 */

  public BatchTypeStageObjectKeyData getBatchTypeStage( ) {
    return batchTypeStageDeleteIn;
  }

}
