/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantFindCountRequest.java
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
 * Class used to create a BatchRequestParticipantFindCountRequest Udt Request
 *
 */

public class BatchRequestParticipantFindCountRequest extends BatchRequestParticipantRequest {
/**
 *
 * Constructor to create a  BatchRequestParticipantFindCountRequest
 * @param id Unique request name
 * @param batchRequestParticipantFindCountIn BatchRequestParticipantObjectFilter for BatchRequestParticipantFindCountRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipant")BatchRequestParticipantObjectFilter batchRequestParticipantFindCountIn) {
    super(id, "BatchRequestParticipantFindCount");
    if (batchRequestParticipantFindCountIn != null) {
      Integer index =  batchRequestParticipantFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(batchRequestParticipantFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the BatchRequestParticipantFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
