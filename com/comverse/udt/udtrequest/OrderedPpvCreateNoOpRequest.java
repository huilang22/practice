/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPpvCreateNoOpRequest.java
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
import com.csgsystems.ppv.data.*;

/**
 *
 * NoOp class used to simulate a OrderedPpvCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedPpvCreateNoOpRequest extends OrderedPpvSubRequestParent {
/**
 *
 * Constructor to create a   OrderedPpvCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedPpvCreateNoOpRequest(String id, OrderedPpvCreateOutputData noOpIn) {
    super(id, "OrderedPpvCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedPpvCreateOutputData", OrderedPpvCreateOutputHelper.toMap(noOpIn).get("OrderedPpvCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedPpvCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedPpvCreateOutputData getOutput() {
    return OrderedPpvCreateOutputHelper.fromMap(outputMap);
  }
}
