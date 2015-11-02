/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentUpdateRequest.java
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
 * Class used to create a BatchRequestSegmentUpdateRequest Udt Request
 *
 */

public class BatchRequestSegmentUpdateRequest extends BatchRequestSegmentSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestSegmentUpdateRequest
 * @param id Unique request name
 * @param batchRequestSegmentUpdateIn BatchRequestSegmentObjectBaseData for BatchRequestSegmentUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestSegmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestSegment")BatchRequestSegmentObjectBaseData batchRequestSegmentUpdateIn) {
    super(id, "BatchRequestSegmentUpdate");
    if (batchRequestSegmentUpdateIn != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentUpdateIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }

/**
 *
 * Retrieves the BatchRequestSegmentObjectBaseData that results from the BatchRequestSegmentUpdateRequest call
 * @return BatchRequestSegmentObjectBaseData resulting from udt call
 *
 */

  public BatchRequestSegmentObjectBaseData getOutput() {
    return BatchRequestSegmentObjectBaseHelper.fromMap(outputMap, "BatchRequestSegment");
  }
}
