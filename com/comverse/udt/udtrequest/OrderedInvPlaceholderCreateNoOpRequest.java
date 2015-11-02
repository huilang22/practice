/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInvPlaceholderCreateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedInvPlaceholderCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedInvPlaceholderCreateNoOpRequest extends OrderedInvPlaceholderSubRequestParent {
/**
 *
 * Constructor to create a   OrderedInvPlaceholderCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedInvPlaceholderCreateNoOpRequest(String id, OrderedInvPlaceholderCreateOutputData noOpIn) {
    super(id, "OrderedInvPlaceholderCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedInvPlaceholderCreateOutputData", OrderedInvPlaceholderCreateOutputHelper.toMap(noOpIn).get("OrderedInvPlaceholderCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedInvPlaceholderCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInvPlaceholderCreateOutputData getOutput() {
    return OrderedInvPlaceholderCreateOutputHelper.fromMap(outputMap);
  }
}
