/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryCreateRequest.java
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
 * Class used to create a BatchRequestErrorLogEntryCreateRequest Udt Request
 *
 */

public class BatchRequestErrorLogEntryCreateRequest extends BatchRequestErrorLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryCreateRequest
 * @param id Unique request name
 * @param batchRequestErrorLogEntryCreateIn BatchRequestErrorLogEntryObjectBaseData for BatchRequestErrorLogEntryCreateRequest
 *
 */
@JsonCreator
  public BatchRequestErrorLogEntryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestErrorLogEntry")BatchRequestErrorLogEntryObjectBaseData batchRequestErrorLogEntryCreateIn) {
    super(id, "BatchRequestErrorLogEntryCreate");
    if (batchRequestErrorLogEntryCreateIn != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(batchRequestErrorLogEntryCreateIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }

/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectBaseData that results from the BatchRequestErrorLogEntryCreateRequest call
 * @return BatchRequestErrorLogEntryObjectBaseData resulting from udt call
 *
 */

  public BatchRequestErrorLogEntryObjectBaseData getOutput() {
    return BatchRequestErrorLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
}
