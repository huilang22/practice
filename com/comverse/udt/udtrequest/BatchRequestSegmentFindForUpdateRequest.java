/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentFindForUpdateRequest.java
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
 * Class used to create a BatchRequestSegmentFindForUpdateRequest Udt Request
 *
 */

public class BatchRequestSegmentFindForUpdateRequest extends BatchRequestSegmentRequest {
/**
 *
 * Constructor to create a  BatchRequestSegmentFindForUpdateRequest
 * @param id Unique request name
 * @param batchRequestSegmentFindForUpdateIn BatchRequestSegmentObjectFilter for BatchRequestSegmentFindForUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestSegmentFindForUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestSegment")BatchRequestSegmentObjectFilter batchRequestSegmentFindForUpdateIn) {
    super(id, "BatchRequestSegmentFindForUpdate");
    if (batchRequestSegmentFindForUpdateIn != null) {
      Integer index =  batchRequestSegmentFindForUpdateIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectHelper.toMap(batchRequestSegmentFindForUpdateIn, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }

/**
 *
 * Retrieves the BatchRequestSegmentObjectDataList that results from the BatchRequestSegmentFindForUpdateRequest call
 * @return BatchRequestSegmentObjectDataList resulting from udt call
 *
 */

  public BatchRequestSegmentObjectDataList getOutput() {
    return BatchRequestSegmentObjectHelper.fromMapList(outputMap, "BatchRequestSegmentList");
  }
}
