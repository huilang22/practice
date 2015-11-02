/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderFindCountRequest.java
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
 * Class used to create a LogicalServiceOrderFindCountRequest Udt Request
 *
 */

public class LogicalServiceOrderFindCountRequest extends LogicalServiceOrderRequest {
/**
 *
 * Constructor to create a  LogicalServiceOrderFindCountRequest
 * @param id Unique request name
 * @param LogicalServiceOrderFindCountIn LogicalServiceOrderObjectFilter for LogicalServiceOrderFindCountRequest
 *
 */
@JsonCreator
  public LogicalServiceOrderFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("LogicalServiceOrder")LogicalServiceOrderObjectFilter LogicalServiceOrderFindCountIn) {
    super(id, "LogicalServiceOrderFindCount");
    if (LogicalServiceOrderFindCountIn != null) {
      Integer index =  LogicalServiceOrderFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectHelper.toMap(LogicalServiceOrderFindCountIn, new HashMap(), "LogicalServiceOrderCount").get("LogicalServiceOrderCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the LogicalServiceOrderFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("LogicalServiceOrderCount");
  }
}
