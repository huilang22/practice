/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSegmentUpdateListBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSegmentUpdateListBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSegmentUpdateListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestSegmentObjectBaseData batchRequestSegmentUpdateListIn;
  protected BatchRequestSegmentObjectBaseFilter batchRequestSegmentUpdateListFilter;
/**
 *
 * Constructor to create a  BatchRequestSegmentUpdateListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSegmentUpdateListBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectBaseData batchRequestSegmentUpdateListInIn, BatchRequestSegmentObjectBaseFilter batchRequestSegmentUpdateListFilterIn) {
    super(id, context, "BatchRequestSegmentUpdateList");
    batchRequestSegmentUpdateListIn = batchRequestSegmentUpdateListInIn;
    batchRequestSegmentUpdateListFilter = batchRequestSegmentUpdateListFilterIn;
  }

  public void translateToMap() {
    if (batchRequestSegmentUpdateListIn != null) {
      batchRequestSegmentUpdateListIn.resetFlags(true, true);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentUpdateListIn, new HashMap(), "Void").get("Void"));
    }
    if (batchRequestSegmentUpdateListFilter != null) {
      Integer index =  batchRequestSegmentUpdateListFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestSegmentUpdateListFilter", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentUpdateListFilter, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the BatchRequestSegment
 * @param batchRequestSegmentUpdateListInIn Value of the batchRequestSegmentUpdateListIn
 *
 */

  public void setBatchRequestSegment(BatchRequestSegmentObjectBaseData batchRequestSegmentUpdateListInIn) {
    batchRequestSegmentUpdateListIn = batchRequestSegmentUpdateListInIn;
  }

/**
 *
 * Sets the BatchRequestSegmentUpdateListFilter
 * @param batchRequestSegmentUpdateListFilterIn Value of the batchRequestSegmentUpdateListFilter
 *
 */

  public void setBatchRequestSegmentUpdateListFilter(BatchRequestSegmentObjectBaseFilter batchRequestSegmentUpdateListFilterIn) {
    batchRequestSegmentUpdateListFilter = batchRequestSegmentUpdateListFilterIn;
  }

  public void translateFromMap() {
    batchRequestSegmentUpdateListIn = BatchRequestSegmentObjectBaseHelper.fromMap(inputMap, "BatchRequestSegment");
    batchRequestSegmentUpdateListFilter = BatchRequestSegmentObjectBaseHelper.fromMapFilter(inputMap, "BatchRequestSegmentUpdateListFilter");
  }

/**
 *
 * Gets the BatchRequestSegment
 * @return Value of the BatchRequestSegment
 *
 */

  public BatchRequestSegmentObjectBaseData getBatchRequestSegment( ) {
    return batchRequestSegmentUpdateListIn;
  }

/**
 *
 * Gets the BatchRequestSegmentUpdateListFilter
 * @return Value of the BatchRequestSegmentUpdateListFilter
 *
 */

  public BatchRequestSegmentObjectBaseFilter getBatchRequestSegmentUpdateListFilter( ) {
    return batchRequestSegmentUpdateListFilter;
  }

}
