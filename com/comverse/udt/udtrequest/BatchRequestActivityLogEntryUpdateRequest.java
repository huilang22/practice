/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryUpdateRequest.java
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
 * Class used to create a BatchRequestActivityLogEntryUpdateRequest Udt Request
 *
 */

public class BatchRequestActivityLogEntryUpdateRequest extends BatchRequestActivityLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryUpdateRequest
 * @param id Unique request name
 * @param batchRequestActivityLogEntryUpdateIn BatchRequestActivityLogEntryObjectBaseData for BatchRequestActivityLogEntryUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestActivityLogEntryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestActivityLogEntry")BatchRequestActivityLogEntryObjectBaseData batchRequestActivityLogEntryUpdateIn) {
    super(id, "BatchRequestActivityLogEntryUpdate");
    if (batchRequestActivityLogEntryUpdateIn != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseHelper.toMap(batchRequestActivityLogEntryUpdateIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }

/**
 *
 * Retrieves the BatchRequestActivityLogEntryObjectBaseData that results from the BatchRequestActivityLogEntryUpdateRequest call
 * @return BatchRequestActivityLogEntryObjectBaseData resulting from udt call
 *
 */

  public BatchRequestActivityLogEntryObjectBaseData getOutput() {
    return BatchRequestActivityLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
}
