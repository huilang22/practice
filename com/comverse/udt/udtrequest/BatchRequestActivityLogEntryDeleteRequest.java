/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryDeleteRequest.java
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
 * Class used to create a BatchRequestActivityLogEntryDeleteRequest Udt Request
 *
 */

public class BatchRequestActivityLogEntryDeleteRequest extends BatchRequestActivityLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryDeleteRequest
 * @param id Unique request name
 * @param batchRequestActivityLogEntryDeleteIn BatchRequestActivityLogEntryObjectBaseKeyData for BatchRequestActivityLogEntryDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestActivityLogEntryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestActivityLogEntry")BatchRequestActivityLogEntryObjectBaseKeyData batchRequestActivityLogEntryDeleteIn) {
    super(id, "BatchRequestActivityLogEntryDelete");
    if (batchRequestActivityLogEntryDeleteIn != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseKeyHelper.toMap(batchRequestActivityLogEntryDeleteIn, new HashMap(), "BatchRequestActivityLogEntryObjectBaseKeyData").get("BatchRequestActivityLogEntryObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestActivityLogEntryObjectBaseData that results from the BatchRequestActivityLogEntryDeleteRequest call
 * @return BatchRequestActivityLogEntryObjectBaseData resulting from udt call
 *
 */

  public BatchRequestActivityLogEntryObjectBaseData getOutput() {
    return BatchRequestActivityLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
}
