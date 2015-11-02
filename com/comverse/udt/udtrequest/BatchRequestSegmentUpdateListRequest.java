/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentUpdateListRequest.java
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
 * Class used to create a BatchRequestSegmentUpdateListRequest Udt Request
 *
 */

public class BatchRequestSegmentUpdateListRequest extends BatchRequestSegmentRequest {
/**
 *
 * Constructor to create a  BatchRequestSegmentUpdateListRequest
 * @param id Unique request name
 * @param batchRequestSegmentUpdateListIn BatchRequestSegmentObjectBaseData for BatchRequestSegmentUpdateListRequest
 * @param batchRequestSegmentUpdateListFilter BatchRequestSegmentObjectBaseFilter for BatchRequestSegmentUpdateListRequest
 *
 */
@JsonCreator
  public BatchRequestSegmentUpdateListRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestSegment")BatchRequestSegmentObjectBaseData batchRequestSegmentUpdateListIn, @JsonProperty("BatchRequestSegmentUpdateListFilter")BatchRequestSegmentObjectBaseFilter batchRequestSegmentUpdateListFilter) {
    super(id, "BatchRequestSegmentUpdateList");
    if (batchRequestSegmentUpdateListIn != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentUpdateListIn, new HashMap(), "Void").get("Void"));
    }
    if (batchRequestSegmentUpdateListFilter != null) {
      Integer index =  batchRequestSegmentUpdateListFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestSegmentUpdateListFilter", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentUpdateListFilter, new HashMap(), "Void").get("Void"));
    }
  }

}
