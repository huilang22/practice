/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestSegmentDeleteListRequest.java
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
 * Class used to create a BatchRequestSegmentDeleteListRequest Udt Request
 *
 */

public class BatchRequestSegmentDeleteListRequest extends BatchRequestSegmentRequest {
/**
 *
 * Constructor to create a  BatchRequestSegmentDeleteListRequest
 * @param id Unique request name
 * @param batchRequestSegmentDeleteListIn BatchRequestSegmentObjectBaseFilter for BatchRequestSegmentDeleteListRequest
 *
 */
@JsonCreator
  public BatchRequestSegmentDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestSegment")BatchRequestSegmentObjectBaseFilter batchRequestSegmentDeleteListIn) {
    super(id, "BatchRequestSegmentDeleteList");
    if (batchRequestSegmentDeleteListIn != null) {
      Integer index =  batchRequestSegmentDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(batchRequestSegmentDeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }

}
