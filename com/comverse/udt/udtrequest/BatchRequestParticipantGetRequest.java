/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantGetRequest.java
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
 * Class used to create a BatchRequestParticipantGetRequest Udt Request
 *
 */

public class BatchRequestParticipantGetRequest extends BatchRequestParticipantSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantGetRequest
 * @param id Unique request name
 * @param batchRequestParticipantGetIn BatchRequestParticipantObjectBaseKeyData for BatchRequestParticipantGetRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipant")BatchRequestParticipantObjectBaseKeyData batchRequestParticipantGetIn) {
    super(id, "BatchRequestParticipantGet");
    if (batchRequestParticipantGetIn != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseKeyHelper.toMap(batchRequestParticipantGetIn, new HashMap(), "BatchRequestParticipantObjectBaseKeyData").get("BatchRequestParticipantObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantObjectData that results from the BatchRequestParticipantGetRequest call
 * @return BatchRequestParticipantObjectData resulting from udt call
 *
 */

  public BatchRequestParticipantObjectData getOutput() {
    return BatchRequestParticipantObjectHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
}
