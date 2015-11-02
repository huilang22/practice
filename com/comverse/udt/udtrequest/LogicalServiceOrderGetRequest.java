/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a LogicalServiceOrderGetRequest Udt Request
 *
 */

public class LogicalServiceOrderGetRequest extends LogicalServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  LogicalServiceOrderGetRequest
 * @param id Unique request name
 * @param LogicalServiceOrderGetIn LogicalServiceOrderObjectKeyData for LogicalServiceOrderGetRequest
 *
 */
@JsonCreator
  public LogicalServiceOrderGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("LogicalServiceOrder")LogicalServiceOrderObjectKeyData LogicalServiceOrderGetIn) {
    super(id, "LogicalServiceOrderGet");
    if (LogicalServiceOrderGetIn != null) {
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectKeyHelper.toMap(LogicalServiceOrderGetIn, new HashMap(), "LogicalServiceOrderObjectKeyData").get("LogicalServiceOrderObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LogicalServiceOrderObjectData that results from the LogicalServiceOrderGetRequest call
 * @return LogicalServiceOrderObjectData resulting from udt call
 *
 */

  public LogicalServiceOrderObjectData getOutput() {
    return LogicalServiceOrderObjectHelper.fromMap(outputMap, "LogicalServiceOrder");
  }
}
