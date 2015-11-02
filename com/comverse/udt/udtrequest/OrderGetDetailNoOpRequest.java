/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderGetDetailNoOpRequest.java
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
 * NoOp class used to simulate a OrderGetDetailNoOpRequest Udt Request/Response
 *
 */
public class OrderGetDetailNoOpRequest extends OrderSubRequestParent {
/**
 *
 * Constructor to create a   OrderGetDetailNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderGetDetailNoOpRequest(String id, OrderGetDetailOutputData noOpIn) {
    super(id, "OrderGetDetailNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderGetDetailOutputData", OrderGetDetailOutputHelper.toMap(noOpIn).get("OrderGetDetailOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderGetDetailOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderGetDetailOutputData getOutput() {
    return OrderGetDetailOutputHelper.fromMap(outputMap);
  }
}
