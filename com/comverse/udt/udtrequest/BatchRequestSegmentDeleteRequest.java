/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentDeleteRequest.java
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
 * Class used to create a BatchRequestSegmentDeleteRequest Udt Request
 *
 */

public class BatchRequestSegmentDeleteRequest extends BatchRequestSegmentSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestSegmentDeleteRequest
 * @param id Unique request name
 * @param batchRequestSegmentDeleteIn BatchRequestSegmentObjectBaseKeyData for BatchRequestSegmentDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestSegmentDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestSegment")BatchRequestSegmentObjectBaseKeyData batchRequestSegmentDeleteIn) {
    super(id, "BatchRequestSegmentDelete");
    if (batchRequestSegmentDeleteIn != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseKeyHelper.toMap(batchRequestSegmentDeleteIn, new HashMap(), "BatchRequestSegmentObjectBaseKeyData").get("BatchRequestSegmentObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestSegmentObjectBaseData that results from the BatchRequestSegmentDeleteRequest call
 * @return BatchRequestSegmentObjectBaseData resulting from udt call
 *
 */

  public BatchRequestSegmentObjectBaseData getOutput() {
    return BatchRequestSegmentObjectBaseHelper.fromMap(outputMap, "BatchRequestSegment");
  }
}
