/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogGenerateRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a LogGenerateRequest Udt Request
 *
 */

public class LogGenerateRequest extends LogSubRequestParent {
/**
 *
 * Constructor to create a  LogGenerateRequest
 * @param id Unique request name
 * @param log_criteria LogCriteriaObjectData for LogGenerateRequest
 *
 */
@JsonCreator
  public LogGenerateRequest(@JsonProperty("RequestId") String id, @JsonProperty("LogCriteria")LogCriteriaObjectData log_criteria) {
    super(id, "LogGenerate");
    if (log_criteria != null) {
      addInput("LogCriteria", LogCriteriaObjectHelper.toMap(log_criteria, new HashMap(), "LogGenerateOutputData").get("LogGenerateOutputData"));
    }
  }

/**
 *
 * Retrieves the LogGenerateOutputData that results from the LogGenerateRequest call
 * @return LogGenerateOutputData resulting from udt call
 *
 */

  public LogGenerateOutputData getOutput() {
    return LogGenerateOutputHelper.fromMap(outputMap);
  }
}
