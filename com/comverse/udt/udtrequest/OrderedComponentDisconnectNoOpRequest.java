/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedComponentDisconnectNoOpRequest.java
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
 * NoOp class used to simulate a OrderedComponentDisconnectNoOpRequest Udt Request/Response
 *
 */
public class OrderedComponentDisconnectNoOpRequest extends OrderedComponentSubRequestParent {
/**
 *
 * Constructor to create a   OrderedComponentDisconnectNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedComponentDisconnectNoOpRequest(String id, OrderedComponentDisconnectOutputData noOpIn) {
    super(id, "OrderedComponentDisconnectNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedComponentDisconnectOutputData", OrderedComponentDisconnectOutputHelper.toMap(noOpIn).get("OrderedComponentDisconnectOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedComponentDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedComponentDisconnectOutputData getOutput() {
    return OrderedComponentDisconnectOutputHelper.fromMap(outputMap);
  }
}
