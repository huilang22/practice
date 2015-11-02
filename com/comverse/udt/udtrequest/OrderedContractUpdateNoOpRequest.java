/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractUpdateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedContractUpdateNoOpRequest Udt Request/Response
 *
 */
public class OrderedContractUpdateNoOpRequest extends OrderedContractSubRequestParent {
/**
 *
 * Constructor to create a   OrderedContractUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedContractUpdateNoOpRequest(String id, OrderedContractUpdateOutputData noOpIn) {
    super(id, "OrderedContractUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedContractUpdateOutputData", OrderedContractUpdateOutputHelper.toMap(noOpIn).get("OrderedContractUpdateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedContractUpdateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedContractUpdateOutputData getOutput() {
    return OrderedContractUpdateOutputHelper.fromMap(outputMap);
  }
}
