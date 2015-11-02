/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterFindRequest.java
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
 * Class used to create a BatchRequestNotifyParameterFindRequest Udt Request
 *
 */

public class BatchRequestNotifyParameterFindRequest extends BatchRequestNotifyParameterRequest {
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterFindRequest
 * @param id Unique request name
 * @param batchRequestNotifyParameterFindIn BatchRequestNotifyParameterObjectFilter for BatchRequestNotifyParameterFindRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyParameterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyParameter")BatchRequestNotifyParameterObjectFilter batchRequestNotifyParameterFindIn) {
    super(id, "BatchRequestNotifyParameterFind");
    if (batchRequestNotifyParameterFindIn != null) {
      Integer index =  batchRequestNotifyParameterFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(batchRequestNotifyParameterFindIn, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyParameterObjectDataList that results from the BatchRequestNotifyParameterFindRequest call
 * @return BatchRequestNotifyParameterObjectDataList resulting from udt call
 *
 */

  public BatchRequestNotifyParameterObjectDataList getOutput() {
    return BatchRequestNotifyParameterObjectHelper.fromMapList(outputMap, "BatchRequestNotifyParameterList");
  }
}
