/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentCreateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchRequestSegmentCreateRequest Udt Request
 *
 */

public class BatchRequestSegmentCreateRequest extends BatchRequestSegmentSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestSegmentCreateRequest
 * @param id Unique request name
 * @param batchRequestSegmentCreateIn BatchRequestSegmentObjectBaseData for BatchRequestSegmentCreateRequest
 *
 */
@JsonCreator
  public BatchRequestSegmentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestSegment")BatchRequestSegmentObjectBaseData batchRequestSegmentCreateIn) {
    super(id, "BatchRequestSegmentCreate");
    if (batchRequestSegmentCreateIn != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentCreateIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }

/**
 *
 * Retrieves the BatchRequestSegmentObjectBaseData that results from the BatchRequestSegmentCreateRequest call
 * @return BatchRequestSegmentObjectBaseData resulting from udt call
 *
 */

  public BatchRequestSegmentObjectBaseData getOutput() {
    return BatchRequestSegmentObjectBaseHelper.fromMap(outputMap, "BatchRequestSegment");
  }
}
