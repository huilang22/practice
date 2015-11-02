/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchParticipantTypeGetRequest.java
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
 * Class used to create a BatchParticipantTypeGetRequest Udt Request
 *
 */

public class BatchParticipantTypeGetRequest extends BatchParticipantTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchParticipantTypeGetRequest
 * @param id Unique request name
 * @param batchParticipantTypeGetIn BatchParticipantTypeObjectKeyData for BatchParticipantTypeGetRequest
 *
 */
@JsonCreator
  public BatchParticipantTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchParticipantType")BatchParticipantTypeObjectKeyData batchParticipantTypeGetIn) {
    super(id, "BatchParticipantTypeGet");
    if (batchParticipantTypeGetIn != null) {
      addInput("BatchParticipantType", BatchParticipantTypeObjectKeyHelper.toMap(batchParticipantTypeGetIn, new HashMap(), "BatchParticipantTypeObjectKeyData").get("BatchParticipantTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchParticipantTypeObjectData that results from the BatchParticipantTypeGetRequest call
 * @return BatchParticipantTypeObjectData resulting from udt call
 *
 */

  public BatchParticipantTypeObjectData getOutput() {
    return BatchParticipantTypeObjectHelper.fromMap(outputMap, "BatchParticipantType");
  }
}
