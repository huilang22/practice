/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogFindRequest.java
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
 * Class used to create a LogFindRequest Udt Request
 *
 */

public class LogFindRequest extends LogRequest {
/**
 *
 * Constructor to create a  LogFindRequest
 * @param id Unique request name
 * @param log LogfileObjectData for LogFindRequest
 *
 */
@JsonCreator
  public LogFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Log")LogfileObjectData log) {
    super(id, "LogFind");
    if (log != null) {
      addInput("Log", LogfileObjectHelper.toMap(log, new HashMap(), "Log").get("Log"));
    }
  }

/**
 *
 * Retrieves the LogfileObjectDataList that results from the LogFindRequest call
 * @return LogfileObjectDataList resulting from udt call
 *
 */

  public LogfileObjectDataList getOutput() {
    return LogfileObjectHelper.fromMapList(outputMap, "LogList");
  }
}
