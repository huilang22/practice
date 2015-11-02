/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSegmentGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSegmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSegmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestSegmentObjectBaseKeyData batchRequestSegmentGetIn;
/**
 *
 * Constructor to create a  BatchRequestSegmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSegmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectBaseKeyData batchRequestSegmentGetInIn) {
    super(id, context, "BatchRequestSegmentGet");
    batchRequestSegmentGetIn = batchRequestSegmentGetInIn;
  }

  public void translateToMap() {
    if (batchRequestSegmentGetIn != null) {
      batchRequestSegmentGetIn.resetFlags(true, true);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseKeyHelper.toMap(batchRequestSegmentGetIn, new HashMap(), "BatchRequestSegmentObjectBaseKeyData").get("BatchRequestSegmentObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestSegment
 * @param batchRequestSegmentGetInIn Value of the batchRequestSegmentGetIn
 *
 */

  public void setBatchRequestSegment(BatchRequestSegmentObjectBaseKeyData batchRequestSegmentGetInIn) {
    batchRequestSegmentGetIn = batchRequestSegmentGetInIn;
  }

  public void translateFromMap() {
    batchRequestSegmentGetIn = BatchRequestSegmentObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestSegment");
  }

/**
 *
 * Gets the BatchRequestSegment
 * @return Value of the BatchRequestSegment
 *
 */

  public BatchRequestSegmentObjectBaseKeyData getBatchRequestSegment( ) {
    return batchRequestSegmentGetIn;
  }

}
