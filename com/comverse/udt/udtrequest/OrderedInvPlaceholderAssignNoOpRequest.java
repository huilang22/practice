/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInvPlaceholderAssignNoOpRequest.java
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
 * NoOp class used to simulate a OrderedInvPlaceholderAssignNoOpRequest Udt Request/Response
 *
 */
public class OrderedInvPlaceholderAssignNoOpRequest extends OrderedInvPlaceholderSubRequestParent {
/**
 *
 * Constructor to create a   OrderedInvPlaceholderAssignNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedInvPlaceholderAssignNoOpRequest(String id, OrderedInvPlaceholderAssignOutputData noOpIn) {
    super(id, "OrderedInvPlaceholderAssignNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedInvPlaceholderAssignOutputData", OrderedInvPlaceholderAssignOutputHelper.toMap(noOpIn).get("OrderedInvPlaceholderAssignOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedInvPlaceholderAssignOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInvPlaceholderAssignOutputData getOutput() {
    return OrderedInvPlaceholderAssignOutputHelper.fromMap(outputMap);
  }
}
