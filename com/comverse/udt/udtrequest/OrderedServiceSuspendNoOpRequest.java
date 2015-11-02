/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceSuspendNoOpRequest.java
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
 * NoOp class used to simulate a OrderedServiceSuspendNoOpRequest Udt Request/Response
 *
 */
public class OrderedServiceSuspendNoOpRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a   OrderedServiceSuspendNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedServiceSuspendNoOpRequest(String id, OrderedServiceSuspendOutputData noOpIn) {
    super(id, "OrderedServiceSuspendNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedServiceSuspendOutputData", OrderedServiceSuspendOutputHelper.toMap(noOpIn).get("OrderedServiceSuspendOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedServiceSuspendOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceSuspendOutputData getOutput() {
    return OrderedServiceSuspendOutputHelper.fromMap(outputMap);
  }
}
