/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryGetRequest.java
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
 * Class used to create a BatchRequestErrorLogEntryGetRequest Udt Request
 *
 */

public class BatchRequestErrorLogEntryGetRequest extends BatchRequestErrorLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryGetRequest
 * @param id Unique request name
 * @param batchRequestErrorLogEntryGetIn BatchRequestErrorLogEntryObjectBaseKeyData for BatchRequestErrorLogEntryGetRequest
 *
 */
@JsonCreator
  public BatchRequestErrorLogEntryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestErrorLogEntry")BatchRequestErrorLogEntryObjectBaseKeyData batchRequestErrorLogEntryGetIn) {
    super(id, "BatchRequestErrorLogEntryGet");
    if (batchRequestErrorLogEntryGetIn != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseKeyHelper.toMap(batchRequestErrorLogEntryGetIn, new HashMap(), "BatchRequestErrorLogEntryObjectBaseKeyData").get("BatchRequestErrorLogEntryObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectData that results from the BatchRequestErrorLogEntryGetRequest call
 * @return BatchRequestErrorLogEntryObjectData resulting from udt call
 *
 */

  public BatchRequestErrorLogEntryObjectData getOutput() {
    return BatchRequestErrorLogEntryObjectHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
}
