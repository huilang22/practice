/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentCreateNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestSegmentCreateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestSegmentCreateNoOpRequest extends BatchRequestSegmentSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestSegmentCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestSegmentCreateNoOpRequest(String id, BatchRequestSegmentObjectBaseData noOpIn) {
    super(id, "BatchRequestSegmentCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
/**
 *
 * Retrieves the BatchRequestSegmentObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestSegmentObjectBaseData getOutput() {
    return BatchRequestSegmentObjectBaseHelper.fromMap(outputMap, "BatchRequestSegment");
  }
}
