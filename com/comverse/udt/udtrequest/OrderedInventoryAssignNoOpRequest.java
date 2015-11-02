/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInventoryAssignNoOpRequest.java
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
 * NoOp class used to simulate a OrderedInventoryAssignNoOpRequest Udt Request/Response
 *
 */
public class OrderedInventoryAssignNoOpRequest extends OrderedInventorySubRequestParent {
/**
 *
 * Constructor to create a   OrderedInventoryAssignNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedInventoryAssignNoOpRequest(String id, OrderedInventoryAssignOutputData noOpIn) {
    super(id, "OrderedInventoryAssignNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedInventoryAssignOutputData", OrderedInventoryAssignOutputHelper.toMap(noOpIn).get("OrderedInventoryAssignOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedInventoryAssignOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInventoryAssignOutputData getOutput() {
    return OrderedInventoryAssignOutputHelper.fromMap(outputMap);
  }
}
