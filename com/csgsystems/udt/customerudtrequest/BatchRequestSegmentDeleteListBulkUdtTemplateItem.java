/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSegmentDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSegmentDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSegmentDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestSegmentObjectBaseFilter batchRequestSegmentDeleteListIn;
/**
 *
 * Constructor to create a  BatchRequestSegmentDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSegmentDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectBaseFilter batchRequestSegmentDeleteListInIn) {
    super(id, context, "BatchRequestSegmentDeleteList");
    batchRequestSegmentDeleteListIn = batchRequestSegmentDeleteListInIn;
  }

  public void translateToMap() {
    if (batchRequestSegmentDeleteListIn != null) {
      Integer index =  batchRequestSegmentDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentDeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the BatchRequestSegment
 * @param batchRequestSegmentDeleteListInIn Value of the batchRequestSegmentDeleteListIn
 *
 */

  public void setBatchRequestSegment(BatchRequestSegmentObjectBaseFilter batchRequestSegmentDeleteListInIn) {
    batchRequestSegmentDeleteListIn = batchRequestSegmentDeleteListInIn;
  }

  public void translateFromMap() {
    batchRequestSegmentDeleteListIn = BatchRequestSegmentObjectBaseHelper.fromMapFilter(inputMap, "BatchRequestSegment");
  }

/**
 *
 * Gets the BatchRequestSegment
 * @return Value of the BatchRequestSegment
 *
 */

  public BatchRequestSegmentObjectBaseFilter getBatchRequestSegment( ) {
    return batchRequestSegmentDeleteListIn;
  }

}
