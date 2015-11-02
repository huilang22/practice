/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestSegmentSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestSegmentSequenceGetNoOpRequest extends BatchRequestSegmentSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestSegmentSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestSegmentSequenceGetNoOpRequest(String id, BatchRequestSegmentObjectBaseKeyData noOpIn) {
    super(id, "BatchRequestSegmentSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
/**
 *
 * Retrieves the BatchRequestSegmentObjectBaseKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestSegmentObjectBaseKeyData getOutput() {
    return BatchRequestSegmentObjectBaseKeyHelper.fromMap(outputMap, "BatchRequestSegment");
  }
}
