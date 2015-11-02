/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderPreProcessRequest.java
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
 * Class used to create a LogicalServiceOrderPreProcessRequest Udt Request
 *
 */

public class LogicalServiceOrderPreProcessRequest extends LogicalServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  LogicalServiceOrderPreProcessRequest
 * @param id Unique request name
 * @param LSOPEOrderIn OrderObjectData for LogicalServiceOrderPreProcessRequest
 * @param LSOPEServiceOrderIn ServiceOrderObjectData[] for LogicalServiceOrderPreProcessRequest
 *
 */
@JsonCreator
  public LogicalServiceOrderPreProcessRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectData LSOPEOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData[] LSOPEServiceOrderIn) {
    super(id, "LogicalServiceOrderPreProcess");
    if (LSOPEOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(LSOPEOrderIn, new HashMap(), "LogicalServiceOrderPreProcessOutputData").get("LogicalServiceOrderPreProcessOutputData"));
    }
    if (LSOPEServiceOrderIn != null) {
      Object[] list = new Object[LSOPEServiceOrderIn.length];
      for (int i = 0; i < LSOPEServiceOrderIn.length; i++) {
        list[i] = ServiceOrderObjectHelper.getMap(LSOPEServiceOrderIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
      }
      addInput("ServiceOrderList", list);
    }
  }

/**
 *
 * Retrieves the LogicalServiceOrderPreProcessOutputData that results from the LogicalServiceOrderPreProcessRequest call
 * @return LogicalServiceOrderPreProcessOutputData resulting from udt call
 *
 */

  public LogicalServiceOrderPreProcessOutputData getOutput() {
    return LogicalServiceOrderPreProcessOutputHelper.fromMap(outputMap);
  }
}
