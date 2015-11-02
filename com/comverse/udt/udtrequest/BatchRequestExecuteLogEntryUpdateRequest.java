/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestExecuteLogEntryUpdateRequest.java
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
 * Class used to create a BatchRequestExecuteLogEntryUpdateRequest Udt Request
 *
 */

public class BatchRequestExecuteLogEntryUpdateRequest extends BatchRequestExecuteLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryUpdateRequest
 * @param id Unique request name
 * @param batchRequestExecuteLogEntryUpdateIn BatchRequestExecuteLogEntryObjectData for BatchRequestExecuteLogEntryUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestExecuteLogEntryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestExecuteLogEntry")BatchRequestExecuteLogEntryObjectData batchRequestExecuteLogEntryUpdateIn) {
    super(id, "BatchRequestExecuteLogEntryUpdate");
    if (batchRequestExecuteLogEntryUpdateIn != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(batchRequestExecuteLogEntryUpdateIn, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }

/**
 *
 * Retrieves the BatchRequestExecuteLogEntryObjectData that results from the BatchRequestExecuteLogEntryUpdateRequest call
 * @return BatchRequestExecuteLogEntryObjectData resulting from udt call
 *
 */

  public BatchRequestExecuteLogEntryObjectData getOutput() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
}
