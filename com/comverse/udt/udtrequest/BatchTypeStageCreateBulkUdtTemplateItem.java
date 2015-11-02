/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeStageCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeStageCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeStageObjectData batchTypeStageCreateIn;
/**
 *
 * Constructor to create a  BatchTypeStageCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeStageCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeStageObjectData batchTypeStageCreateInIn) {
    super(id, context, "BatchTypeStageCreate");
    batchTypeStageCreateIn = batchTypeStageCreateInIn;
  }

  public void translateToMap() {
    if (batchTypeStageCreateIn != null) {
      batchTypeStageCreateIn.resetFlags(true, true);
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(batchTypeStageCreateIn, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }


/**
 *
 * Sets the BatchTypeStage
 * @param batchTypeStageCreateInIn Value of the batchTypeStageCreateIn
 *
 */

  public void setBatchTypeStage(BatchTypeStageObjectData batchTypeStageCreateInIn) {
    batchTypeStageCreateIn = batchTypeStageCreateInIn;
  }

  public void translateFromMap() {
    batchTypeStageCreateIn = BatchTypeStageObjectHelper.fromMap(inputMap, "BatchTypeStage");
  }

/**
 *
 * Gets the BatchTypeStage
 * @return Value of the BatchTypeStage
 *
 */

  public BatchTypeStageObjectData getBatchTypeStage( ) {
    return batchTypeStageCreateIn;
  }

}
