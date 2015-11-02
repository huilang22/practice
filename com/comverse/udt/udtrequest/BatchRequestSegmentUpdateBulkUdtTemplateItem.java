/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSegmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSegmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestSegmentObjectBaseData batchRequestSegmentUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestSegmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSegmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectBaseData batchRequestSegmentUpdateInIn) {
    super(id, context, "BatchRequestSegmentUpdate");
    batchRequestSegmentUpdateIn = batchRequestSegmentUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestSegmentUpdateIn != null) {
      batchRequestSegmentUpdateIn.resetFlags(true, true);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentUpdateIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }


/**
 *
 * Sets the BatchRequestSegment
 * @param batchRequestSegmentUpdateInIn Value of the batchRequestSegmentUpdateIn
 *
 */

  public void setBatchRequestSegment(BatchRequestSegmentObjectBaseData batchRequestSegmentUpdateInIn) {
    batchRequestSegmentUpdateIn = batchRequestSegmentUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestSegmentUpdateIn = BatchRequestSegmentObjectBaseHelper.fromMap(inputMap, "BatchRequestSegment");
  }

/**
 *
 * Gets the BatchRequestSegment
 * @return Value of the BatchRequestSegment
 *
 */

  public BatchRequestSegmentObjectBaseData getBatchRequestSegment( ) {
    return batchRequestSegmentUpdateIn;
  }

}
