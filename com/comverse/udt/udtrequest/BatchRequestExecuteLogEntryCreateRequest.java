/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestExecuteLogEntryCreateRequest.java
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
 * Class used to create a BatchRequestExecuteLogEntryCreateRequest Udt Request
 *
 */

public class BatchRequestExecuteLogEntryCreateRequest extends BatchRequestExecuteLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryCreateRequest
 * @param id Unique request name
 * @param batchRequestExecuteLogEntryCreateIn BatchRequestExecuteLogEntryObjectData for BatchRequestExecuteLogEntryCreateRequest
 *
 */
@JsonCreator
  public BatchRequestExecuteLogEntryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestExecuteLogEntry")BatchRequestExecuteLogEntryObjectData batchRequestExecuteLogEntryCreateIn) {
    super(id, "BatchRequestExecuteLogEntryCreate");
    if (batchRequestExecuteLogEntryCreateIn != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(batchRequestExecuteLogEntryCreateIn, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }

/**
 *
 * Retrieves the BatchRequestExecuteLogEntryObjectData that results from the BatchRequestExecuteLogEntryCreateRequest call
 * @return BatchRequestExecuteLogEntryObjectData resulting from udt call
 *
 */

  public BatchRequestExecuteLogEntryObjectData getOutput() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
}
