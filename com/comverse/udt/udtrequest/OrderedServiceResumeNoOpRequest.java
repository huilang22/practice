/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceResumeNoOpRequest.java
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
 * NoOp class used to simulate a OrderedServiceResumeNoOpRequest Udt Request/Response
 *
 */
public class OrderedServiceResumeNoOpRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a   OrderedServiceResumeNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedServiceResumeNoOpRequest(String id, OrderedServiceResumeOutputData noOpIn) {
    super(id, "OrderedServiceResumeNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedServiceResumeOutputData", OrderedServiceResumeOutputHelper.toMap(noOpIn).get("OrderedServiceResumeOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedServiceResumeOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceResumeOutputData getOutput() {
    return OrderedServiceResumeOutputHelper.fromMap(outputMap);
  }
}
