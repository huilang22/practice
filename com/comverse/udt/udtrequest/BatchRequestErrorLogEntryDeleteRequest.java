/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryDeleteRequest.java
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
 * Class used to create a BatchRequestErrorLogEntryDeleteRequest Udt Request
 *
 */

public class BatchRequestErrorLogEntryDeleteRequest extends BatchRequestErrorLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryDeleteRequest
 * @param id Unique request name
 * @param batchRequestErrorLogEntryDeleteIn BatchRequestErrorLogEntryObjectBaseKeyData for BatchRequestErrorLogEntryDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestErrorLogEntryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestErrorLogEntry")BatchRequestErrorLogEntryObjectBaseKeyData batchRequestErrorLogEntryDeleteIn) {
    super(id, "BatchRequestErrorLogEntryDelete");
    if (batchRequestErrorLogEntryDeleteIn != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseKeyHelper.toMap(batchRequestErrorLogEntryDeleteIn, new HashMap(), "BatchRequestErrorLogEntryObjectBaseKeyData").get("BatchRequestErrorLogEntryObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectBaseData that results from the BatchRequestErrorLogEntryDeleteRequest call
 * @return BatchRequestErrorLogEntryObjectBaseData resulting from udt call
 *
 */

  public BatchRequestErrorLogEntryObjectBaseData getOutput() {
    return BatchRequestErrorLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
}
