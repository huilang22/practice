/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestSegmentUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestSegmentUpdateNoOpRequest extends BatchRequestSegmentSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestSegmentUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestSegmentUpdateNoOpRequest(String id, BatchRequestSegmentObjectBaseData noOpIn) {
    super(id, "BatchRequestSegmentUpdateNoOpRequest");
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
