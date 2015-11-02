/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedProductUpdateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedProductUpdateNoOpRequest Udt Request/Response
 *
 */
public class OrderedProductUpdateNoOpRequest extends OrderedProductSubRequestParent {
/**
 *
 * Constructor to create a   OrderedProductUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedProductUpdateNoOpRequest(String id, OrderedProductUpdateOutputData noOpIn) {
    super(id, "OrderedProductUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedProductUpdateOutputData", OrderedProductUpdateOutputHelper.toMap(noOpIn).get("OrderedProductUpdateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedProductUpdateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedProductUpdateOutputData getOutput() {
    return OrderedProductUpdateOutputHelper.fromMap(outputMap);
  }
}
