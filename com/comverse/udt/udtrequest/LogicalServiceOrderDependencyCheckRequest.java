/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderDependencyCheckRequest.java
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
 * Class used to create a LogicalServiceOrderDependencyCheckRequest Udt Request
 *
 */

public class LogicalServiceOrderDependencyCheckRequest extends LogicalServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  LogicalServiceOrderDependencyCheckRequest
 * @param id Unique request name
 * @param LSODCServiceOrderIn ServiceOrderObjectData for LogicalServiceOrderDependencyCheckRequest
 *
 */
@JsonCreator
  public LogicalServiceOrderDependencyCheckRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceOrder")ServiceOrderObjectData LSODCServiceOrderIn) {
    super(id, "LogicalServiceOrderDependencyCheck");
    if (LSODCServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(LSODCServiceOrderIn, new HashMap(), "LogicalServiceOrderDependencyCheckOutputData").get("LogicalServiceOrderDependencyCheckOutputData"));
    }
  }

/**
 *
 * Retrieves the LogicalServiceOrderDependencyCheckOutputData that results from the LogicalServiceOrderDependencyCheckRequest call
 * @return LogicalServiceOrderDependencyCheckOutputData resulting from udt call
 *
 */

  public LogicalServiceOrderDependencyCheckOutputData getOutput() {
    return LogicalServiceOrderDependencyCheckOutputHelper.fromMap(outputMap);
  }
}
