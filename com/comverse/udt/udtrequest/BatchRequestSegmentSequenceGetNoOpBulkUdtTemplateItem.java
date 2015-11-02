/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestSegmentSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestSegmentSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestSegmentObjectBaseKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestSegmentSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestSegmentSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestSegmentObjectBaseKeyData noOpInIn) {
    super(id, context, "BatchRequestSegmentSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
/**
 *
 * Sets the  BatchRequestSegment
 * @param noOpInIn BatchRequestSegmentObjectBaseKeyData to set
 *
 */
  public void setBatchRequestSegment(BatchRequestSegmentObjectBaseKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestSegment passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestSegmentObjectBaseKeyData getBatchRequestSegment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestSegmentObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestSegment");
  }
}
