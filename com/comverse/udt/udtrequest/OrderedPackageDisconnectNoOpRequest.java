/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPackageDisconnectNoOpRequest.java
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
 * NoOp class used to simulate a OrderedPackageDisconnectNoOpRequest Udt Request/Response
 *
 */
public class OrderedPackageDisconnectNoOpRequest extends OrderedPackageSubRequestParent {
/**
 *
 * Constructor to create a   OrderedPackageDisconnectNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedPackageDisconnectNoOpRequest(String id, OrderedPackageDisconnectOutputData noOpIn) {
    super(id, "OrderedPackageDisconnectNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedPackageDisconnectOutputData", OrderedPackageDisconnectOutputHelper.toMap(noOpIn).get("OrderedPackageDisconnectOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedPackageDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedPackageDisconnectOutputData getOutput() {
    return OrderedPackageDisconnectOutputHelper.fromMap(outputMap);
  }
}
