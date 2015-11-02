/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedNrcUpdateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedNrcUpdateNoOpRequest Udt Request/Response
 *
 */
public class OrderedNrcUpdateNoOpRequest extends OrderedNrcSubRequestParent {
/**
 *
 * Constructor to create a   OrderedNrcUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedNrcUpdateNoOpRequest(String id, OrderedNrcUpdateOutputData noOpIn) {
    super(id, "OrderedNrcUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedNrcUpdateOutputData", OrderedNrcUpdateOutputHelper.toMap(noOpIn).get("OrderedNrcUpdateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedNrcUpdateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedNrcUpdateOutputData getOutput() {
    return OrderedNrcUpdateOutputHelper.fromMap(outputMap);
  }
}
