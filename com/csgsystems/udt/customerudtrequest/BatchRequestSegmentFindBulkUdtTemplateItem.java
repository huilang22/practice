/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSegmentFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSegmentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSegmentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestSegmentObjectFilter batchRequestSegmentFindIn;
/**
 *
 * Constructor to create a  BatchRequestSegmentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSegmentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectFilter batchRequestSegmentFindInIn) {
    super(id, context, "BatchRequestSegmentFind");
    batchRequestSegmentFindIn = batchRequestSegmentFindInIn;
  }

  public void translateToMap() {
    if (batchRequestSegmentFindIn != null) {
      Integer index =  batchRequestSegmentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectHelper.toMap(batchRequestSegmentFindIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }


/**
 *
 * Sets the BatchRequestSegment
 * @param batchRequestSegmentFindInIn Value of the batchRequestSegmentFindIn
 *
 */

  public void setBatchRequestSegment(BatchRequestSegmentObjectFilter batchRequestSegmentFindInIn) {
    batchRequestSegmentFindIn = batchRequestSegmentFindInIn;
  }

  public void translateFromMap() {
    batchRequestSegmentFindIn = BatchRequestSegmentObjectHelper.fromMapFilter(inputMap, "BatchRequestSegment");
  }

/**
 *
 * Gets the BatchRequestSegment
 * @return Value of the BatchRequestSegment
 *
 */

  public BatchRequestSegmentObjectFilter getBatchRequestSegment( ) {
    return batchRequestSegmentFindIn;
  }

}
