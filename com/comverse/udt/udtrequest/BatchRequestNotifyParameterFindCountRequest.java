/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterFindCountRequest.java
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
 * Class used to create a BatchRequestNotifyParameterFindCountRequest Udt Request
 *
 */

public class BatchRequestNotifyParameterFindCountRequest extends BatchRequestNotifyParameterRequest {
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterFindCountRequest
 * @param id Unique request name
 * @param batchRequestNotifyParameterFindCountIn BatchRequestNotifyParameterObjectFilter for BatchRequestNotifyParameterFindCountRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyParameterFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyParameter")BatchRequestNotifyParameterObjectFilter batchRequestNotifyParameterFindCountIn) {
    super(id, "BatchRequestNotifyParameterFindCount");
    if (batchRequestNotifyParameterFindCountIn != null) {
      Integer index =  batchRequestNotifyParameterFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(batchRequestNotifyParameterFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the BatchRequestNotifyParameterFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
