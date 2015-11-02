/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestSegmentGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestSegmentGetNoOpRequest extends BatchRequestSegmentSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestSegmentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestSegmentGetNoOpRequest(String id, BatchRequestSegmentObjectData noOpIn) {
    super(id, "BatchRequestSegmentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
/**
 *
 * Retrieves the BatchRequestSegmentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestSegmentObjectData getOutput() {
    return BatchRequestSegmentObjectHelper.fromMap(outputMap, "BatchRequestSegment");
  }
}
