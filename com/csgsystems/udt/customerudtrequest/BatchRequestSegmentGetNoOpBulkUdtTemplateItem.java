/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSegmentGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestSegmentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestSegmentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestSegmentObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestSegmentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestSegmentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectData noOpInIn) {
    super(id, context, "BatchRequestSegmentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
/**
 *
 * Sets the  BatchRequestSegment
 * @param noOpInIn BatchRequestSegmentObjectData to set
 *
 */
  public void setBatchRequestSegment(BatchRequestSegmentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestSegment passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestSegmentObjectData getBatchRequestSegment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestSegmentObjectHelper.fromMap(inputMap, "BatchRequestSegment");
  }
}
