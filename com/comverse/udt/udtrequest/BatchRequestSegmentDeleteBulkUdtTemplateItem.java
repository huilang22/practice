/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestSegmentDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestSegmentDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestSegmentObjectBaseKeyData batchRequestSegmentDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestSegmentDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestSegmentDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectBaseKeyData batchRequestSegmentDeleteInIn) {
    super(id, context, "BatchRequestSegmentDelete");
    batchRequestSegmentDeleteIn = batchRequestSegmentDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestSegmentDeleteIn != null) {
      batchRequestSegmentDeleteIn.resetFlags(true, true);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseKeyHelper.toMap(batchRequestSegmentDeleteIn, new HashMap(), "BatchRequestSegmentObjectBaseKeyData").get("BatchRequestSegmentObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestSegment
 * @param batchRequestSegmentDeleteInIn Value of the batchRequestSegmentDeleteIn
 *
 */

  public void setBatchRequestSegment(BatchRequestSegmentObjectBaseKeyData batchRequestSegmentDeleteInIn) {
    batchRequestSegmentDeleteIn = batchRequestSegmentDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestSegmentDeleteIn = BatchRequestSegmentObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestSegment");
  }

/**
 *
 * Gets the BatchRequestSegment
 * @return Value of the BatchRequestSegment
 *
 */

  public BatchRequestSegmentObjectBaseKeyData getBatchRequestSegment( ) {
    return batchRequestSegmentDeleteIn;
  }

}
