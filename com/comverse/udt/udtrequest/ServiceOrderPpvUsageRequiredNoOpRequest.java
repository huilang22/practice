/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderPpvUsageRequiredNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderPpvUsageRequiredNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderPpvUsageRequiredNoOpRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a   ServiceOrderPpvUsageRequiredNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderPpvUsageRequiredNoOpRequest(String id, Integer noOpIn) {
    super(id, "ServiceOrderPpvUsageRequiredNoOpRequest");
    if (noOpIn != null) {
      addInput("Result", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("Result");
  }
}
