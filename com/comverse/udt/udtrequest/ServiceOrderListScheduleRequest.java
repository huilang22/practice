/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderListScheduleRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceOrderListScheduleRequest Udt Request
 *
 */

public class ServiceOrderListScheduleRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a  ServiceOrderListScheduleRequest
 * @param id Unique request name
 * @param SOLSOrderIn OrderObjectData for ServiceOrderListScheduleRequest
 * @param ServiceOrderIn ServiceOrderObjectBaseData[] for ServiceOrderListScheduleRequest
 *
 */
@JsonCreator
  public ServiceOrderListScheduleRequest(@JsonProperty("RequestId") String id, @JsonProperty("Order")OrderObjectData SOLSOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectBaseData[] ServiceOrderIn) {
    super(id, "ServiceOrderListSchedule");
    if (SOLSOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(SOLSOrderIn, new HashMap(), "ServiceOrderListScheduleOutputData").get("ServiceOrderListScheduleOutputData"));
    }
    if (ServiceOrderIn != null) {
      Object[] list = new Object[ServiceOrderIn.length];
      for (int i = 0; i < ServiceOrderIn.length; i++) {
        list[i] = ServiceOrderObjectBaseHelper.getMap(ServiceOrderIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
      }
      addInput("ServiceOrderList", list);
    }
  }

/**
 *
 * Retrieves the ServiceOrderListScheduleOutputData that results from the ServiceOrderListScheduleRequest call
 * @return ServiceOrderListScheduleOutputData resulting from udt call
 *
 */

  public ServiceOrderListScheduleOutputData getOutput() {
    return ServiceOrderListScheduleOutputHelper.fromMap(outputMap);
  }
}
