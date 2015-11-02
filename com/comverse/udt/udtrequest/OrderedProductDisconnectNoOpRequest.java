/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedProductDisconnectNoOpRequest.java
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
 * NoOp class used to simulate a OrderedProductDisconnectNoOpRequest Udt Request/Response
 *
 */
public class OrderedProductDisconnectNoOpRequest extends OrderedProductSubRequestParent {
/**
 *
 * Constructor to create a   OrderedProductDisconnectNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedProductDisconnectNoOpRequest(String id, OrderedProductDisconnectOutputData noOpIn) {
    super(id, "OrderedProductDisconnectNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedProductDisconnectOutputData", OrderedProductDisconnectOutputHelper.toMap(noOpIn).get("OrderedProductDisconnectOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedProductDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedProductDisconnectOutputData getOutput() {
    return OrderedProductDisconnectOutputHelper.fromMap(outputMap);
  }
}
