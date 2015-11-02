/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeStageFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeStageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeStageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeStageObjectFilter batchTypeStageFindIn;
/**
 *
 * Constructor to create a  BatchTypeStageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeStageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeStageObjectFilter batchTypeStageFindInIn) {
    super(id, context, "BatchTypeStageFind");
    batchTypeStageFindIn = batchTypeStageFindInIn;
  }

  public void translateToMap() {
    if (batchTypeStageFindIn != null) {
      Integer index =  batchTypeStageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(batchTypeStageFindIn, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }


/**
 *
 * Sets the BatchTypeStage
 * @param batchTypeStageFindInIn Value of the batchTypeStageFindIn
 *
 */

  public void setBatchTypeStage(BatchTypeStageObjectFilter batchTypeStageFindInIn) {
    batchTypeStageFindIn = batchTypeStageFindInIn;
  }

  public void translateFromMap() {
    batchTypeStageFindIn = BatchTypeStageObjectHelper.fromMapFilter(inputMap, "BatchTypeStage");
  }

/**
 *
 * Gets the BatchTypeStage
 * @return Value of the BatchTypeStage
 *
 */

  public BatchTypeStageObjectFilter getBatchTypeStage( ) {
    return batchTypeStageFindIn;
  }

}
