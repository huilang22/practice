/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSegmentCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSegmentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSegmentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestSegmentObjectBaseData batchRequestSegmentCreateIn;
/**
 *
 * Constructor to create a  BatchRequestSegmentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSegmentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectBaseData batchRequestSegmentCreateInIn) {
    super(id, context, "BatchRequestSegmentCreate");
    batchRequestSegmentCreateIn = batchRequestSegmentCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestSegmentCreateIn != null) {
      batchRequestSegmentCreateIn.resetFlags(true, true);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentCreateIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }


/**
 *
 * Sets the BatchRequestSegment
 * @param batchRequestSegmentCreateInIn Value of the batchRequestSegmentCreateIn
 *
 */

  public void setBatchRequestSegment(BatchRequestSegmentObjectBaseData batchRequestSegmentCreateInIn) {
    batchRequestSegmentCreateIn = batchRequestSegmentCreateInIn;
  }

  public void translateFromMap() {
    batchRequestSegmentCreateIn = BatchRequestSegmentObjectBaseHelper.fromMap(inputMap, "BatchRequestSegment");
  }

/**
 *
 * Gets the BatchRequestSegment
 * @return Value of the BatchRequestSegment
 *
 */

  public BatchRequestSegmentObjectBaseData getBatchRequestSegment( ) {
    return batchRequestSegmentCreateIn;
  }

}
