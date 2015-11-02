/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractDisconnectChargeAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a CustomerContractDisconnectChargeAmountGetNoOpRequest Udt Request/Response
 *
 */
public class CustomerContractDisconnectChargeAmountGetNoOpRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a   CustomerContractDisconnectChargeAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerContractDisconnectChargeAmountGetNoOpRequest(String id, CustomerContractDisconnectChargeAmountGetOutputData noOpIn) {
    super(id, "CustomerContractDisconnectChargeAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CustomerContractDisconnectChargeAmountGetOutputData", CustomerContractDisconnectChargeAmountGetOutputHelper.toMap(noOpIn).get("CustomerContractDisconnectChargeAmountGetOutputData"));
    }
  }
/**
 *
 * Retrieves the CustomerContractDisconnectChargeAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractDisconnectChargeAmountGetOutputData getOutput() {
    return CustomerContractDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
}
