/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedNrcDeleteNoOpRequest.java
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
 * NoOp class used to simulate a OrderedNrcDeleteNoOpRequest Udt Request/Response
 *
 */
public class OrderedNrcDeleteNoOpRequest extends OrderedNrcSubRequestParent {
/**
 *
 * Constructor to create a   OrderedNrcDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedNrcDeleteNoOpRequest(String id, OrderedNrcDeleteOutputData noOpIn) {
    super(id, "OrderedNrcDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedNrcDeleteOutputData", OrderedNrcDeleteOutputHelper.toMap(noOpIn).get("OrderedNrcDeleteOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedNrcDeleteOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedNrcDeleteOutputData getOutput() {
    return OrderedNrcDeleteOutputHelper.fromMap(outputMap);
  }
}
