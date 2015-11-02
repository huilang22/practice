/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedCiemSetCurrentNoOpRequest.java
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
 * NoOp class used to simulate a OrderedCiemSetCurrentNoOpRequest Udt Request/Response
 *
 */
public class OrderedCiemSetCurrentNoOpRequest extends OrderedCiemSubRequestParent {
/**
 *
 * Constructor to create a   OrderedCiemSetCurrentNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedCiemSetCurrentNoOpRequest(String id, OrderedCiemSetCurrentOutputData noOpIn) {
    super(id, "OrderedCiemSetCurrentNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedCiemSetCurrentOutputData", OrderedCiemSetCurrentOutputHelper.toMap(noOpIn).get("OrderedCiemSetCurrentOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedCiemSetCurrentOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedCiemSetCurrentOutputData getOutput() {
    return OrderedCiemSetCurrentOutputHelper.fromMap(outputMap);
  }
}
