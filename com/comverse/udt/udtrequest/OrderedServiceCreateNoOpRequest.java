/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceCreateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedServiceCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedServiceCreateNoOpRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a   OrderedServiceCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedServiceCreateNoOpRequest(String id, OrderedServiceCreateOutputData noOpIn) {
    super(id, "OrderedServiceCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedServiceCreateOutputData", OrderedServiceCreateOutputHelper.toMap(noOpIn).get("OrderedServiceCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedServiceCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceCreateOutputData getOutput() {
    return OrderedServiceCreateOutputHelper.fromMap(outputMap);
  }
}
