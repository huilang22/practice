/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestSegmentCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestSegmentCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestSegmentObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestSegmentCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestSegmentCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectBaseData noOpInIn) {
    super(id, context, "BatchRequestSegmentCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
/**
 *
 * Sets the  BatchRequestSegment
 * @param noOpInIn BatchRequestSegmentObjectBaseData to set
 *
 */
  public void setBatchRequestSegment(BatchRequestSegmentObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestSegment passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestSegmentObjectBaseData getBatchRequestSegment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestSegmentObjectBaseHelper.fromMap(inputMap, "BatchRequestSegment");
  }
}
