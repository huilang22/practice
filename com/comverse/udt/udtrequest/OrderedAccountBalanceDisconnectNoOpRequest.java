/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountBalanceDisconnectNoOpRequest.java
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
 * NoOp class used to simulate a OrderedAccountBalanceDisconnectNoOpRequest Udt Request/Response
 *
 */
public class OrderedAccountBalanceDisconnectNoOpRequest extends OrderedAccountBalanceSubRequestParent {
/**
 *
 * Constructor to create a   OrderedAccountBalanceDisconnectNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedAccountBalanceDisconnectNoOpRequest(String id, OrderedAccountBalanceDisconnectOutputData noOpIn) {
    super(id, "OrderedAccountBalanceDisconnectNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedAccountBalanceDisconnectOutputData", OrderedAccountBalanceDisconnectOutputHelper.toMap(noOpIn).get("OrderedAccountBalanceDisconnectOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedAccountBalanceDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountBalanceDisconnectOutputData getOutput() {
    return OrderedAccountBalanceDisconnectOutputHelper.fromMap(outputMap);
  }
}
