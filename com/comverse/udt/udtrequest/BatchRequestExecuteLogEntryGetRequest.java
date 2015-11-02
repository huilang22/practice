/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestExecuteLogEntryGetRequest.java
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
 * Class used to create a BatchRequestExecuteLogEntryGetRequest Udt Request
 *
 */

public class BatchRequestExecuteLogEntryGetRequest extends BatchRequestExecuteLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryGetRequest
 * @param id Unique request name
 * @param batchRequestExecuteLogEntryGetIn BatchRequestExecuteLogEntryObjectKeyData for BatchRequestExecuteLogEntryGetRequest
 *
 */
@JsonCreator
  public BatchRequestExecuteLogEntryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestExecuteLogEntry")BatchRequestExecuteLogEntryObjectKeyData batchRequestExecuteLogEntryGetIn) {
    super(id, "BatchRequestExecuteLogEntryGet");
    if (batchRequestExecuteLogEntryGetIn != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectKeyHelper.toMap(batchRequestExecuteLogEntryGetIn, new HashMap(), "BatchRequestExecuteLogEntryObjectKeyData").get("BatchRequestExecuteLogEntryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestExecuteLogEntryObjectData that results from the BatchRequestExecuteLogEntryGetRequest call
 * @return BatchRequestExecuteLogEntryObjectData resulting from udt call
 *
 */

  public BatchRequestExecuteLogEntryObjectData getOutput() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
}
