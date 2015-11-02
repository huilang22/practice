/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractDisconnectNoOpRequest.java
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
 * NoOp class used to simulate a OrderedContractDisconnectNoOpRequest Udt Request/Response
 *
 */
public class OrderedContractDisconnectNoOpRequest extends OrderedContractSubRequestParent {
/**
 *
 * Constructor to create a   OrderedContractDisconnectNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedContractDisconnectNoOpRequest(String id, OrderedContractDisconnectOutputData noOpIn) {
    super(id, "OrderedContractDisconnectNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedContractDisconnectOutputData", OrderedContractDisconnectOutputHelper.toMap(noOpIn).get("OrderedContractDisconnectOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedContractDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedContractDisconnectOutputData getOutput() {
    return OrderedContractDisconnectOutputHelper.fromMap(outputMap);
  }
}
