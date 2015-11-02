/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedCiemDisconnectNoOpRequest.java
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
 * NoOp class used to simulate a OrderedCiemDisconnectNoOpRequest Udt Request/Response
 *
 */
public class OrderedCiemDisconnectNoOpRequest extends OrderedCiemSubRequestParent {
/**
 *
 * Constructor to create a   OrderedCiemDisconnectNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedCiemDisconnectNoOpRequest(String id, OrderedCiemDisconnectOutputData noOpIn) {
    super(id, "OrderedCiemDisconnectNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedCiemDisconnectOutputData", OrderedCiemDisconnectOutputHelper.toMap(noOpIn).get("OrderedCiemDisconnectOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedCiemDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedCiemDisconnectOutputData getOutput() {
    return OrderedCiemDisconnectOutputHelper.fromMap(outputMap);
  }
}
