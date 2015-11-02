/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountDisconnectNoOpRequest.java
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

import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderedAccountDisconnectNoOpRequest Udt Request/Response
 *
 */
public class OrderedAccountDisconnectNoOpRequest extends OrderedAccountSubRequestParent {
/**
 *
 * Constructor to create a   OrderedAccountDisconnectNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedAccountDisconnectNoOpRequest(String id, OrderedAccountDisconnectOutputData noOpIn) {
    super(id, "OrderedAccountDisconnectNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedAccountDisconnectOutputData", OrderedAccountDisconnectOutputHelper.toMap(noOpIn).get("OrderedAccountDisconnectOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedAccountDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountDisconnectOutputData getOutput() {
    return OrderedAccountDisconnectOutputHelper.fromMap(outputMap);
  }
}
