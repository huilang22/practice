/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceTransferNoOpRequest.java
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
 * NoOp class used to simulate a OrderedServiceTransferNoOpRequest Udt Request/Response
 *
 */
public class OrderedServiceTransferNoOpRequest extends OrderedServiceSubRequestParent {
/**
 *
 * Constructor to create a   OrderedServiceTransferNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderedServiceTransferNoOpRequest(String id, OrderedServiceTransferOutputData noOpIn) {
    super(id, "OrderedServiceTransferNoOpRequest");
    if (noOpIn != null) {
      addInput("OrderedServiceTransferOutputData", OrderedServiceTransferOutputHelper.toMap(noOpIn).get("OrderedServiceTransferOutputData"));
    }
  }
/**
 *
 * Retrieves the OrderedServiceTransferOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceTransferOutputData getOutput() {
    return OrderedServiceTransferOutputHelper.fromMap(outputMap);
  }
}
