/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceUpdateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedServiceUpdateNoOpRequest Udt Request/Response
 *
 */
public class OrderedServiceUpdateNoOpRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a   OrderedServiceUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedServiceUpdateNoOpRequest(String id, OrderedServiceUpdateOutputData noOpIn) {
    super(id, "OrderedServiceUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedServiceUpdateOutputData", OrderedServiceUpdateOutputHelper.toMap(noOpIn).get("OrderedServiceUpdateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedServiceUpdateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceUpdateOutputData getOutput() {
    return OrderedServiceUpdateOutputHelper.fromMap(outputMap);
  }
}
