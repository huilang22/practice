/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentGetRequest.java
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
 * Class used to create a BatchRequestSegmentGetRequest Udt Request
 *
 */

public class BatchRequestSegmentGetRequest extends BatchRequestSegmentSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestSegmentGetRequest
 * @param id Unique request name
 * @param batchRequestSegmentGetIn BatchRequestSegmentObjectBaseKeyData for BatchRequestSegmentGetRequest
 *
 */
@JsonCreator
  public BatchRequestSegmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestSegment")BatchRequestSegmentObjectBaseKeyData batchRequestSegmentGetIn) {
    super(id, "BatchRequestSegmentGet");
    if (batchRequestSegmentGetIn != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseKeyHelper.toMap(batchRequestSegmentGetIn, new HashMap(), "BatchRequestSegmentObjectBaseKeyData").get("BatchRequestSegmentObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestSegmentObjectData that results from the BatchRequestSegmentGetRequest call
 * @return BatchRequestSegmentObjectData resulting from udt call
 *
 */

  public BatchRequestSegmentObjectData getOutput() {
    return BatchRequestSegmentObjectHelper.fromMap(outputMap, "BatchRequestSegment");
  }
}
