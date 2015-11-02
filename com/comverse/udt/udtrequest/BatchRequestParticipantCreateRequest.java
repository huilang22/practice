/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantCreateRequest.java
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
 * Class used to create a BatchRequestParticipantCreateRequest Udt Request
 *
 */

public class BatchRequestParticipantCreateRequest extends BatchRequestParticipantSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantCreateRequest
 * @param id Unique request name
 * @param batchRequestParticipantCreateIn BatchRequestParticipantObjectBaseData for BatchRequestParticipantCreateRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipant")BatchRequestParticipantObjectBaseData batchRequestParticipantCreateIn) {
    super(id, "BatchRequestParticipantCreate");
    if (batchRequestParticipantCreateIn != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(batchRequestParticipantCreateIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantObjectBaseData that results from the BatchRequestParticipantCreateRequest call
 * @return BatchRequestParticipantObjectBaseData resulting from udt call
 *
 */

  public BatchRequestParticipantObjectBaseData getOutput() {
    return BatchRequestParticipantObjectBaseHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
}
