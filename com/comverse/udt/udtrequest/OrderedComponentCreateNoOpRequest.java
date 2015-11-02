/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedComponentCreateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedComponentCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedComponentCreateNoOpRequest extends OrderedComponentSubRequestParent {
/**
 *
 * Constructor to create a   OrderedComponentCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedComponentCreateNoOpRequest(String id, OrderedComponentCreateOutputData noOpIn) {
    super(id, "OrderedComponentCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedComponentCreateOutputData", OrderedComponentCreateOutputHelper.toMap(noOpIn).get("OrderedComponentCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedComponentCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedComponentCreateOutputData getOutput() {
    return OrderedComponentCreateOutputHelper.fromMap(outputMap);
  }
}
