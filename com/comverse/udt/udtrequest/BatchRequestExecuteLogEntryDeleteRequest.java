/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestExecuteLogEntryDeleteRequest.java
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
 * Class used to create a BatchRequestExecuteLogEntryDeleteRequest Udt Request
 *
 */

public class BatchRequestExecuteLogEntryDeleteRequest extends BatchRequestExecuteLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryDeleteRequest
 * @param id Unique request name
 * @param batchRequestExecuteLogEntryDeleteIn BatchRequestExecuteLogEntryObjectKeyData for BatchRequestExecuteLogEntryDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestExecuteLogEntryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestExecuteLogEntry")BatchRequestExecuteLogEntryObjectKeyData batchRequestExecuteLogEntryDeleteIn) {
    super(id, "BatchRequestExecuteLogEntryDelete");
    if (batchRequestExecuteLogEntryDeleteIn != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectKeyHelper.toMap(batchRequestExecuteLogEntryDeleteIn, new HashMap(), "BatchRequestExecuteLogEntryObjectKeyData").get("BatchRequestExecuteLogEntryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestExecuteLogEntryObjectData that results from the BatchRequestExecuteLogEntryDeleteRequest call
 * @return BatchRequestExecuteLogEntryObjectData resulting from udt call
 *
 */

  public BatchRequestExecuteLogEntryObjectData getOutput() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
}
