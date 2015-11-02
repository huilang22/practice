/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderFindRequest.java
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
 * Class used to create a LogicalServiceOrderFindRequest Udt Request
 *
 */

public class LogicalServiceOrderFindRequest extends LogicalServiceOrderRequest {
/**
 *
 * Constructor to create a  LogicalServiceOrderFindRequest
 * @param id Unique request name
 * @param LogicalServiceOrderFindIn LogicalServiceOrderObjectFilter for LogicalServiceOrderFindRequest
 *
 */
@JsonCreator
  public LogicalServiceOrderFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("LogicalServiceOrder")LogicalServiceOrderObjectFilter LogicalServiceOrderFindIn) {
    super(id, "LogicalServiceOrderFind");
    if (LogicalServiceOrderFindIn != null) {
      Integer index =  LogicalServiceOrderFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectHelper.toMap(LogicalServiceOrderFindIn, new HashMap(), "LogicalServiceOrder").get("LogicalServiceOrder"));
    }
  }

/**
 *
 * Retrieves the LogicalServiceOrderObjectDataList that results from the LogicalServiceOrderFindRequest call
 * @return LogicalServiceOrderObjectDataList resulting from udt call
 *
 */

  public LogicalServiceOrderObjectDataList getOutput() {
    return LogicalServiceOrderObjectHelper.fromMapList(outputMap, "LogicalServiceOrderList");
  }
}
