/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceMoveNoOpRequest.java
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
 * NoOp class used to simulate a OrderedServiceMoveNoOpRequest Udt Request/Response
 *
 */
public class OrderedServiceMoveNoOpRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a   OrderedServiceMoveNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedServiceMoveNoOpRequest(String id, OrderedServiceMoveOutputData noOpIn) {
    super(id, "OrderedServiceMoveNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedServiceMoveOutputData", OrderedServiceMoveOutputHelper.toMap(noOpIn).get("OrderedServiceMoveOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedServiceMoveOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceMoveOutputData getOutput() {
    return OrderedServiceMoveOutputHelper.fromMap(outputMap);
  }
}
