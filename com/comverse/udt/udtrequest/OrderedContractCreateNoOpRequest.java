/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractCreateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedContractCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedContractCreateNoOpRequest extends OrderedContractSubRequestParent {
/**
 *
 * Constructor to create a   OrderedContractCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedContractCreateNoOpRequest(String id, OrderedContractCreateOutputData noOpIn) {
    super(id, "OrderedContractCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedContractCreateOutputData", OrderedContractCreateOutputHelper.toMap(noOpIn).get("OrderedContractCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedContractCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedContractCreateOutputData getOutput() {
    return OrderedContractCreateOutputHelper.fromMap(outputMap);
  }
}
