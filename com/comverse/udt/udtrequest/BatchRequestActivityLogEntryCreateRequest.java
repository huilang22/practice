/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryCreateRequest.java
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
 * Class used to create a BatchRequestActivityLogEntryCreateRequest Udt Request
 *
 */

public class BatchRequestActivityLogEntryCreateRequest extends BatchRequestActivityLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryCreateRequest
 * @param id Unique request name
 * @param batchRequestActivityLogEntryCreateIn BatchRequestActivityLogEntryObjectBaseData for BatchRequestActivityLogEntryCreateRequest
 *
 */
@JsonCreator
  public BatchRequestActivityLogEntryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestActivityLogEntry")BatchRequestActivityLogEntryObjectBaseData batchRequestActivityLogEntryCreateIn) {
    super(id, "BatchRequestActivityLogEntryCreate");
    if (batchRequestActivityLogEntryCreateIn != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseHelper.toMap(batchRequestActivityLogEntryCreateIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }

/**
 *
 * Retrieves the BatchRequestActivityLogEntryObjectBaseData that results from the BatchRequestActivityLogEntryCreateRequest call
 * @return BatchRequestActivityLogEntryObjectBaseData resulting from udt call
 *
 */

  public BatchRequestActivityLogEntryObjectBaseData getOutput() {
    return BatchRequestActivityLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
}
