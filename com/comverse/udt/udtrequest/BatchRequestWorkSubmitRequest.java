/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestWorkSubmitRequest.java
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
 * Class used to create a BatchRequestWorkSubmitRequest Udt Request
 *
 */

public class BatchRequestWorkSubmitRequest extends BatchRequestRequest {
/**
 *
 * Constructor to create a  BatchRequestWorkSubmitRequest
 * @param id Unique request name
 * @param scheduled_date Date for BatchRequestWorkSubmitRequest
 *
 */
@JsonCreator
  public BatchRequestWorkSubmitRequest(@JsonProperty("RequestId") String id, @JsonProperty("ScheduledDate")Date scheduled_date) {
    super(id, "BatchRequestWorkSubmit");
    if (scheduled_date != null) {
      addInput("ScheduledDate", scheduled_date);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectDataList that results from the BatchRequestWorkSubmitRequest call
 * @return BatchRequestObjectDataList resulting from udt call
 *
 */

  public BatchRequestObjectDataList getOutput() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
}
