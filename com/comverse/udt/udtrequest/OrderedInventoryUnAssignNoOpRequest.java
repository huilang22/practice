/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInventoryUnAssignNoOpRequest.java
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
 * NoOp class used to simulate a OrderedInventoryUnAssignNoOpRequest Udt Request/Response
 *
 */
public class OrderedInventoryUnAssignNoOpRequest extends OrderedInventorySubRequestParent {
/**
 *
 * Constructor to create a   OrderedInventoryUnAssignNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedInventoryUnAssignNoOpRequest(String id, OrderedInventoryUnAssignOutputData noOpIn) {
    super(id, "OrderedInventoryUnAssignNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedInventoryUnAssignOutputData", OrderedInventoryUnAssignOutputHelper.toMap(noOpIn).get("OrderedInventoryUnAssignOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedInventoryUnAssignOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInventoryUnAssignOutputData getOutput() {
    return OrderedInventoryUnAssignOutputHelper.fromMap(outputMap);
  }
}
