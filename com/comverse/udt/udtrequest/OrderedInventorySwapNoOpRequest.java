/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInventorySwapNoOpRequest.java
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

import com.csgsystems.iv.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderedInventorySwapNoOpRequest Udt Request/Response
 *
 */
public class OrderedInventorySwapNoOpRequest extends OrderedInventorySubRequestParent {
/**
 *
 * Constructor to create a   OrderedInventorySwapNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedInventorySwapNoOpRequest(String id, OrderedInventorySwapOutputData noOpIn) {
    super(id, "OrderedInventorySwapNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedInventorySwapOutputData", OrderedInventorySwapOutputHelper.toMap(noOpIn).get("OrderedInventorySwapOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedInventorySwapOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInventorySwapOutputData getOutput() {
    return OrderedInventorySwapOutputHelper.fromMap(outputMap);
  }
}
