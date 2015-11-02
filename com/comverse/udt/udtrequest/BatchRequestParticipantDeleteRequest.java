/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDeleteRequest.java
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
 * Class used to create a BatchRequestParticipantDeleteRequest Udt Request
 *
 */

public class BatchRequestParticipantDeleteRequest extends BatchRequestParticipantSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantDeleteRequest
 * @param id Unique request name
 * @param batchRequestParticipantDeleteIn BatchRequestParticipantObjectBaseKeyData for BatchRequestParticipantDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipant")BatchRequestParticipantObjectBaseKeyData batchRequestParticipantDeleteIn) {
    super(id, "BatchRequestParticipantDelete");
    if (batchRequestParticipantDeleteIn != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseKeyHelper.toMap(batchRequestParticipantDeleteIn, new HashMap(), "BatchRequestParticipantObjectBaseKeyData").get("BatchRequestParticipantObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParticipantObjectBaseData that results from the BatchRequestParticipantDeleteRequest call
 * @return BatchRequestParticipantObjectBaseData resulting from udt call
 *
 */

  public BatchRequestParticipantObjectBaseData getOutput() {
    return BatchRequestParticipantObjectBaseHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
}
