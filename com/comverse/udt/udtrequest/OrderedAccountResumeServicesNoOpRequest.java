/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountResumeServicesNoOpRequest.java
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
 * NoOp class used to simulate a OrderedAccountResumeServicesNoOpRequest Udt Request/Response
 *
 */
public class OrderedAccountResumeServicesNoOpRequest extends OrderedAccountSubRequestParent {
/**
 *
 * Constructor to create a   OrderedAccountResumeServicesNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedAccountResumeServicesNoOpRequest(String id, OrderedAccountResumeServicesOutputData noOpIn) {
    super(id, "OrderedAccountResumeServicesNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedAccountResumeServicesOutputData", OrderedAccountResumeServicesOutputHelper.toMap(noOpIn).get("OrderedAccountResumeServicesOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedAccountResumeServicesOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountResumeServicesOutputData getOutput() {
    return OrderedAccountResumeServicesOutputHelper.fromMap(outputMap);
  }
}
