/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryGetRequest.java
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
 * Class used to create a BatchRequestActivityLogEntryGetRequest Udt Request
 *
 */

public class BatchRequestActivityLogEntryGetRequest extends BatchRequestActivityLogEntrySubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryGetRequest
 * @param id Unique request name
 * @param batchRequestActivityLogEntryGetIn BatchRequestActivityLogEntryObjectBaseKeyData for BatchRequestActivityLogEntryGetRequest
 *
 */
@JsonCreator
  public BatchRequestActivityLogEntryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestActivityLogEntry")BatchRequestActivityLogEntryObjectBaseKeyData batchRequestActivityLogEntryGetIn) {
    super(id, "BatchRequestActivityLogEntryGet");
    if (batchRequestActivityLogEntryGetIn != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseKeyHelper.toMap(batchRequestActivityLogEntryGetIn, new HashMap(), "BatchRequestActivityLogEntryObjectBaseKeyData").get("BatchRequestActivityLogEntryObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestActivityLogEntryObjectData that results from the BatchRequestActivityLogEntryGetRequest call
 * @return BatchRequestActivityLogEntryObjectData resulting from udt call
 *
 */

  public BatchRequestActivityLogEntryObjectData getOutput() {
    return BatchRequestActivityLogEntryObjectHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
}
