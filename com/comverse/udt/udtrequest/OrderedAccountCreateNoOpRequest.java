/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountCreateNoOpRequest.java
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

import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderedAccountCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedAccountCreateNoOpRequest extends OrderedAccountSubRequestParent {
/**
 *
 * Constructor to create a   OrderedAccountCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedAccountCreateNoOpRequest(String id, OrderedAccountCreateOutputData noOpIn) {
    super(id, "OrderedAccountCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedAccountCreateOutputData", OrderedAccountCreateOutputHelper.toMap(noOpIn).get("OrderedAccountCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedAccountCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountCreateOutputData getOutput() {
    return OrderedAccountCreateOutputHelper.fromMap(outputMap);
  }
}
