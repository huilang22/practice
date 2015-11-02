/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterFindRequest.java
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
 * Class used to create a BatchRequestParameterFindRequest Udt Request
 *
 */

public class BatchRequestParameterFindRequest extends BatchRequestParameterRequest {
/**
 *
 * Constructor to create a  BatchRequestParameterFindRequest
 * @param id Unique request name
 * @param batchRequestParameterFindIn BatchRequestParameterObjectFilter for BatchRequestParameterFindRequest
 *
 */
@JsonCreator
  public BatchRequestParameterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParameter")BatchRequestParameterObjectFilter batchRequestParameterFindIn) {
    super(id, "BatchRequestParameterFind");
    if (batchRequestParameterFindIn != null) {
      Integer index =  batchRequestParameterFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParameter", BatchRequestParameterObjectHelper.toMap(batchRequestParameterFindIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParameterObjectDataList that results from the BatchRequestParameterFindRequest call
 * @return BatchRequestParameterObjectDataList resulting from udt call
 *
 */

  public BatchRequestParameterObjectDataList getOutput() {
    return BatchRequestParameterObjectHelper.fromMapList(outputMap, "BatchRequestParameterList");
  }
}
