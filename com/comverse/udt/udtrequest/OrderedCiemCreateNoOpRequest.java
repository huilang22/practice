/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedCiemCreateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedCiemCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedCiemCreateNoOpRequest extends OrderedCiemSubRequestParent {
/**
 *
 * Constructor to create a   OrderedCiemCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedCiemCreateNoOpRequest(String id, OrderedCiemCreateOutputData noOpIn) {
    super(id, "OrderedCiemCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedCiemCreateOutputData", OrderedCiemCreateOutputHelper.toMap(noOpIn).get("OrderedCiemCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedCiemCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedCiemCreateOutputData getOutput() {
    return OrderedCiemCreateOutputHelper.fromMap(outputMap);
  }
}
