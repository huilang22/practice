/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceDisconnectNoOpRequest.java
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
 * NoOp class used to simulate a OrderedServiceDisconnectNoOpRequest Udt Request/Response
 *
 */
public class OrderedServiceDisconnectNoOpRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a   OrderedServiceDisconnectNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedServiceDisconnectNoOpRequest(String id, OrderedServiceDisconnectOutputData noOpIn) {
    super(id, "OrderedServiceDisconnectNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedServiceDisconnectOutputData", OrderedServiceDisconnectOutputHelper.toMap(noOpIn).get("OrderedServiceDisconnectOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedServiceDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceDisconnectOutputData getOutput() {
    return OrderedServiceDisconnectOutputHelper.fromMap(outputMap);
  }
}
