/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDispositionSummaryRequest.java
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
 * Class used to create a BatchRequestParticipantDispositionSummaryRequest Udt Request
 *
 */

public class BatchRequestParticipantDispositionSummaryRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantDispositionSummaryRequest
 * @param id Unique request name
 * @param batchRequestParticipantDispositionSummaryIn BatchRequestObjectKeyData for BatchRequestParticipantDispositionSummaryRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDispositionSummaryRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestParticipantDispositionSummaryIn) {
    super(id, "BatchRequestParticipantDispositionSummary");
    if (batchRequestParticipantDispositionSummaryIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestParticipantDispositionSummaryIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantDispositionSummaryOutputData that results from the BatchRequestParticipantDispositionSummaryRequest call
 * @return BatchRequestParticipantDispositionSummaryOutputData resulting from udt call
 *
 */

  public BatchRequestParticipantDispositionSummaryOutputData getOutput() {
    return BatchRequestParticipantDispositionSummaryOutputHelper.fromMap(outputMap);
  }
}
