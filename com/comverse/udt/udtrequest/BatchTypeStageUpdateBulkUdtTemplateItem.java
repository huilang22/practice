/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeStageUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeStageUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeStageObjectData batchTypeStageUpdateIn;
/**
 *
 * Constructor to create a  BatchTypeStageUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeStageUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeStageObjectData batchTypeStageUpdateInIn) {
    super(id, context, "BatchTypeStageUpdate");
    batchTypeStageUpdateIn = batchTypeStageUpdateInIn;
  }

  public void translateToMap() {
    if (batchTypeStageUpdateIn != null) {
      batchTypeStageUpdateIn.resetFlags(true, true);
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(batchTypeStageUpdateIn, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }


/**
 *
 * Sets the BatchTypeStage
 * @param batchTypeStageUpdateInIn Value of the batchTypeStageUpdateIn
 *
 */

  public void setBatchTypeStage(BatchTypeStageObjectData batchTypeStageUpdateInIn) {
    batchTypeStageUpdateIn = batchTypeStageUpdateInIn;
  }

  public void translateFromMap() {
    batchTypeStageUpdateIn = BatchTypeStageObjectHelper.fromMap(inputMap, "BatchTypeStage");
  }

/**
 *
 * Gets the BatchTypeStage
 * @return Value of the BatchTypeStage
 *
 */

  public BatchTypeStageObjectData getBatchTypeStage( ) {
    return batchTypeStageUpdateIn;
  }

}
