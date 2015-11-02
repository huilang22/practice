/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPackageCreateNoOpRequest.java
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
 * NoOp class used to simulate a OrderedPackageCreateNoOpRequest Udt Request/Response
 *
 */
public class OrderedPackageCreateNoOpRequest extends OrderedPackageSubRequestParent {
/**
 *
 * Constructor to create a   OrderedPackageCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedPackageCreateNoOpRequest(String id, OrderedPackageCreateOutputData noOpIn) {
    super(id, "OrderedPackageCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedPackageCreateOutputData", OrderedPackageCreateOutputHelper.toMap(noOpIn).get("OrderedPackageCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedPackageCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedPackageCreateOutputData getOutput() {
    return OrderedPackageCreateOutputHelper.fromMap(outputMap);
  }
}
