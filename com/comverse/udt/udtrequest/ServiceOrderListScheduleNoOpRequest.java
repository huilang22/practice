/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderListScheduleNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ServiceOrderListScheduleNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderListScheduleNoOpRequest extends ServiceOrderSubRequestParent {
/**
 *
 * Constructor to create a   ServiceOrderListScheduleNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderListScheduleNoOpRequest(String id, ServiceOrderListScheduleOutputData noOpIn) {
    super(id, "ServiceOrderListScheduleNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceOrderListScheduleOutputData", ServiceOrderListScheduleOutputHelper.toMap(noOpIn).get("ServiceOrderListScheduleOutputData"));
    }
  }
/**
 *
 * Retrieves the ServiceOrderListScheduleOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderListScheduleOutputData getOutput() {
    return ServiceOrderListScheduleOutputHelper.fromMap(outputMap);
  }
}
