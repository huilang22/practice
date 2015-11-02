/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLookupGetNoOpRequest.java
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
 * NoOp class used to simulate a OrderLookupGetNoOpRequest Udt Request/Response
 *
 */
public class OrderLookupGetNoOpRequest extends OrderLookupSubRequestParent {
/**
 *
 * Constructor to create a   OrderLookupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderLookupGetNoOpRequest(String id, OrderLookupObjectData noOpIn) {
    super(id, "OrderLookupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderLookup", OrderLookupObjectHelper.toMap(noOpIn, new HashMap(), "OrderLookup").get("OrderLookup"));
    }
  }
/**
 *
 * Retrieves the OrderLookupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderLookupObjectData getOutput() {
    return OrderLookupObjectHelper.fromMap(outputMap, "OrderLookup");
  }
}
