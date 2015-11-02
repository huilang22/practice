/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedProductCreateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedProductCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedProductCreateNoOpRequest extends OrderedProductSubRequestParent {
/**
 *
 * Constructor to create a   OrderedProductCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedProductCreateNoOpRequest(String id, OrderedProductCreateOutputData noOpIn) {
    super(id, "OrderedProductCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedProductCreateOutputData", OrderedProductCreateOutputHelper.toMap(noOpIn).get("OrderedProductCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedProductCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedProductCreateOutputData getOutput() {
    return OrderedProductCreateOutputHelper.fromMap(outputMap);
  }
}
