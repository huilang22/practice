/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeStageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeStageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeStageObjectKeyData batchTypeStageGetIn;
/**
 *
 * Constructor to create a  BatchTypeStageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeStageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeStageObjectKeyData batchTypeStageGetInIn) {
    super(id, context, "BatchTypeStageGet");
    batchTypeStageGetIn = batchTypeStageGetInIn;
  }

  public void translateToMap() {
    if (batchTypeStageGetIn != null) {
      batchTypeStageGetIn.resetFlags(true, true);
      addInput("BatchTypeStage", BatchTypeStageObjectKeyHelper.toMap(batchTypeStageGetIn, new HashMap(), "BatchTypeStageObjectKeyData").get("BatchTypeStageObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchTypeStage
 * @param batchTypeStageGetInIn Value of the batchTypeStageGetIn
 *
 */

  public void setBatchTypeStage(BatchTypeStageObjectKeyData batchTypeStageGetInIn) {
    batchTypeStageGetIn = batchTypeStageGetInIn;
  }

  public void translateFromMap() {
    batchTypeStageGetIn = BatchTypeStageObjectKeyHelper.fromMap(inputMap, "BatchTypeStage");
  }

/**
 *
 * Gets the BatchTypeStage
 * @return Value of the BatchTypeStage
 *
 */

  public BatchTypeStageObjectKeyData getBatchTypeStage( ) {
    return batchTypeStageGetIn;
  }

}
