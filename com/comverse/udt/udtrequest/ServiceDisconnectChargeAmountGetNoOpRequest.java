/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceDisconnectChargeAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a ServiceDisconnectChargeAmountGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceDisconnectChargeAmountGetNoOpRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a   ServiceDisconnectChargeAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceDisconnectChargeAmountGetNoOpRequest(String id, ServiceDisconnectChargeAmountGetOutputData noOpIn) {
    super(id, "ServiceDisconnectChargeAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceDisconnectChargeAmountGetOutputData", ServiceDisconnectChargeAmountGetOutputHelper.toMap(noOpIn).get("ServiceDisconnectChargeAmountGetOutputData"));
    }
  }
/**
 *
 * Retrieves the ServiceDisconnectChargeAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceDisconnectChargeAmountGetOutputData getOutput() {
    return ServiceDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
}
