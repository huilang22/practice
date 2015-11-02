/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryUpdateRequest.java
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
 * Class used to create a BatchRequestErrorLogEntryUpdateRequest Udt Request
 *
 */

public class BatchRequestErrorLogEntryUpdateRequest extends BatchRequestErrorLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryUpdateRequest
 * @param id Unique request name
 * @param batchRequestErrorLogEntryUpdateIn BatchRequestErrorLogEntryObjectBaseData for BatchRequestErrorLogEntryUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestErrorLogEntryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestErrorLogEntry")BatchRequestErrorLogEntryObjectBaseData batchRequestErrorLogEntryUpdateIn) {
    super(id, "BatchRequestErrorLogEntryUpdate");
    if (batchRequestErrorLogEntryUpdateIn != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(batchRequestErrorLogEntryUpdateIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }

/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectBaseData that results from the BatchRequestErrorLogEntryUpdateRequest call
 * @return BatchRequestErrorLogEntryObjectBaseData resulting from udt call
 *
 */

  public BatchRequestErrorLogEntryObjectBaseData getOutput() {
    return BatchRequestErrorLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
}
