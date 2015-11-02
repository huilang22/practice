/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedNrcCreateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedNrcCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedNrcCreateNoOpRequest extends OrderedNrcSubRequestParent {
/**
 *
 * Constructor to create a   OrderedNrcCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedNrcCreateNoOpRequest(String id, OrderedNrcCreateOutputData noOpIn) {
    super(id, "OrderedNrcCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedNrcCreateOutputData", OrderedNrcCreateOutputHelper.toMap(noOpIn).get("OrderedNrcCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedNrcCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedNrcCreateOutputData getOutput() {
    return OrderedNrcCreateOutputHelper.fromMap(outputMap);
  }
}
