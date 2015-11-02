/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSegmentFindForUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSegmentFindForUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSegmentFindForUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestSegmentObjectFilter batchRequestSegmentFindForUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestSegmentFindForUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSegmentFindForUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectFilter batchRequestSegmentFindForUpdateInIn) {
    super(id, context, "BatchRequestSegmentFindForUpdate");
    batchRequestSegmentFindForUpdateIn = batchRequestSegmentFindForUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestSegmentFindForUpdateIn != null) {
      Integer index =  batchRequestSegmentFindForUpdateIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectHelper.toMap(batchRequestSegmentFindForUpdateIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }


/**
 *
 * Sets the BatchRequestSegment
 * @param batchRequestSegmentFindForUpdateInIn Value of the batchRequestSegmentFindForUpdateIn
 *
 */

  public void setBatchRequestSegment(BatchRequestSegmentObjectFilter batchRequestSegmentFindForUpdateInIn) {
    batchRequestSegmentFindForUpdateIn = batchRequestSegmentFindForUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestSegmentFindForUpdateIn = BatchRequestSegmentObjectHelper.fromMapFilter(inputMap, "BatchRequestSegment");
  }

/**
 *
 * Gets the BatchRequestSegment
 * @return Value of the BatchRequestSegment
 *
 */

  public BatchRequestSegmentObjectFilter getBatchRequestSegment( ) {
    return batchRequestSegmentFindForUpdateIn;
  }

}
