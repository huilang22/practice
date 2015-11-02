/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentFindRequest.java
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
 * Class used to create a BatchRequestSegmentFindRequest Udt Request
 *
 */

public class BatchRequestSegmentFindRequest extends BatchRequestSegmentRequest {
/**
 *
 * Constructor to create a  BatchRequestSegmentFindRequest
 * @param id Unique request name
 * @param batchRequestSegmentFindIn BatchRequestSegmentObjectFilter for BatchRequestSegmentFindRequest
 *
 */
@JsonCreator
  public BatchRequestSegmentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestSegment")BatchRequestSegmentObjectFilter batchRequestSegmentFindIn) {
    super(id, "BatchRequestSegmentFind");
    if (batchRequestSegmentFindIn != null) {
      Integer index =  batchRequestSegmentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectHelper.toMap(batchRequestSegmentFindIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }

/**
 *
 * Retrieves the BatchRequestSegmentObjectDataList that results from the BatchRequestSegmentFindRequest call
 * @return BatchRequestSegmentObjectDataList resulting from udt call
 *
 */

  public BatchRequestSegmentObjectDataList getOutput() {
    return BatchRequestSegmentObjectHelper.fromMapList(outputMap, "BatchRequestSegmentList");
  }
}
