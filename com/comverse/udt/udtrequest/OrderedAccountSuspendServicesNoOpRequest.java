/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountSuspendServicesNoOpRequest.java
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

import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderedAccountSuspendServicesNoOpRequest Udt Request/Response
 *
 */
public class OrderedAccountSuspendServicesNoOpRequest extends OrderedAccountSubRequestParent {
/**
 *
 * Constructor to create a   OrderedAccountSuspendServicesNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedAccountSuspendServicesNoOpRequest(String id, OrderedAccountSuspendServicesOutputData noOpIn) {
    super(id, "OrderedAccountSuspendServicesNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedAccountSuspendServicesOutputData", OrderedAccountSuspendServicesOutputHelper.toMap(noOpIn).get("OrderedAccountSuspendServicesOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedAccountSuspendServicesOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountSuspendServicesOutputData getOutput() {
    return OrderedAccountSuspendServicesOutputHelper.fromMap(outputMap);
  }
}
