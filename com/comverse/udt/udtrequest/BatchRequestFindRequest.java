/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestFindRequest.java
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
 * Class used to create a BatchRequestFindRequest Udt Request
 *
 */

public class BatchRequestFindRequest extends BatchRequestRequest {
/**
 *
 * Constructor to create a  BatchRequestFindRequest
 * @param id Unique request name
 * @param batchRequestFindIn BatchRequestObjectFilter for BatchRequestFindRequest
 *
 */
@JsonCreator
  public BatchRequestFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectFilter batchRequestFindIn) {
    super(id, "BatchRequestFind");
    if (batchRequestFindIn != null) {
      Integer index =  batchRequestFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(batchRequestFindIn, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectDataList that results from the BatchRequestFindRequest call
 * @return BatchRequestObjectDataList resulting from udt call
 *
 */

  public BatchRequestObjectDataList getOutput() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
}
